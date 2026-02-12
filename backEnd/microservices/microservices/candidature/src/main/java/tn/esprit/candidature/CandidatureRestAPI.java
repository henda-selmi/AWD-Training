package tn.esprit.candidature;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
    @RestController
    @RequestMapping("/mic3/candidature")
    public class CandidatureRestAPI {
        @GetMapping("/hello")
        public String sayhello(){
            return "Hello microservice 3 de candidature";
        }

    }

