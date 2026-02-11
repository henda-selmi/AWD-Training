package tn.esprit.projetmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.esprit.projetmicroservice.Repository.CandidatRepository;

@SpringBootApplication
public class ProjetMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetMicroserviceApplication.class, args);
    }
@Autowired
private CandidatRepository Repository;
    @Bean
    ApplicationRunner init() {
        return (args)  -> {
            //save
            Repository.save(new Candidat ("Mariam", "ch", "ma@esprit.tn"));
            Repository.save(new Candidat ("Sarra", "ab", "sa@esprit.tn"));
            Repository.save(new Candidat ("Mohamed", "ba", "mo@esprit.tn"));
            Repository.save(new Candidat ("Maroua", "dh", "maroua@esprit.tn"));

            // fetch
            Repository.findAll().forEach(System.out::println);




        };
    }
}
