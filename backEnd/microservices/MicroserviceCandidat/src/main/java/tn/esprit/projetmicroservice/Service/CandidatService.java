package tn.esprit.projetmicroservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projetmicroservice.Candidat;
import tn.esprit.projetmicroservice.Repository.CandidatRepository;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepository candidateRepository;

    public Candidat updateCandidat(int id, Candidat newCandidat) {
        if (candidateRepository.findById(id).isPresent()) {
            Candidat existingCandidat = candidateRepository.findById(id).get();
            existingCandidat.setNom(newCandidat.getNom());
            existingCandidat.setPrenom(newCandidat.getPrenom());
            existingCandidat.setEmail(newCandidat.getEmail());
            return candidateRepository.save(existingCandidat);
        } else
            return null;
    }

    public String deleteCandidat(int id) {
        if (candidateRepository.findById(id).isPresent()) {
            candidateRepository.deleteById(id);
            return "candidat supprimé";
        } else
            return "candidat non supprimé";

    }

    public Candidat addCandidat(Candidat candidat) {
        return candidateRepository.save(candidat);
    }

}
