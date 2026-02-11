package tn.esprit.microservicejob.Service;

import tn.esprit.microservicejob.Job;

import java.util.List;

public interface IJobService {
    List<Job> recupererTousLesJobs();

    Job trouverParId(Long id);

    Job trouverParNom(String nom);

    Job modifierEtatPoste(Long id, boolean estDisponible);
}
