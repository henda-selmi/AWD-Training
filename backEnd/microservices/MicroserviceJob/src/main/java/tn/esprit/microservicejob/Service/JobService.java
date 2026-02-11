package tn.esprit.microservicejob.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.microservicejob.Job;
import tn.esprit.microservicejob.Repository.JobRepository;

import java.util.List;

@Service
    public class JobService implements IJobService {

        @Autowired
        private JobRepository jobRepository;

        @Override
        public List<Job> recupererTousLesJobs() {
            return jobRepository.findAll();
        }

        @Override
        public Job trouverParId(Long id) {
            return jobRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Job avec l'ID " + id + " introuvable"));
        }

        @Override
        public Job trouverParNom(String nom) {
            return jobRepository.findByNom(nom)
                    .orElseThrow(() -> new RuntimeException("Job " + nom + " introuvable"));
        }

        @Override
        public Job modifierEtatPoste(Long id, boolean estDisponible) {
            Job job = trouverParId(id);
            job.setEtat(estDisponible); // Met à jour l'état (true/false)
            return jobRepository.save(job);
        }
    }

