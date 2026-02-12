package tn.esprit.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/mic2/job")
    public class JobRestAPI {
        @GetMapping("/hello")
        public String sayhello(){
            return "Hello microservice 2 de job";
        }

    }

