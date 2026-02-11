package tn.esprit.microservicejob.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.microservicejob.Job;
import tn.esprit.microservicejob.Repository.JobRepository;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobRepository jobRepository;
    @GetMapping
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id) {
        return jobRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @GetMapping("/search")
    public ResponseEntity<Job> getJobByNom(@RequestParam String nom) {
        return jobRepository.findByNom(nom)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // 3. Modification de l'état de poste
    @PutMapping("/{id}/etat")
    public ResponseEntity<Job> updateEtat(@PathVariable Long id, @RequestParam boolean disponible) {
        return jobRepository.findById(id).map(job -> {
            job.setEtat(disponible);
            return ResponseEntity.ok(jobRepository.save(job));
        }).orElse(ResponseEntity.notFound().build());
    }
}