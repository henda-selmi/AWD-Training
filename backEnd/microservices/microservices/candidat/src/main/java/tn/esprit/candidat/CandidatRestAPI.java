package tn.esprit.candidat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic1/candidat")
public class CandidatRestAPI {
    @GetMapping("/hello")
    public String sayhello(){
        return "Hello World microservice de condidat";
    }

}
