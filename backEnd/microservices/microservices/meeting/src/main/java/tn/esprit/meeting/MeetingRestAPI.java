package tn.esprit.meeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
    @RestController
    @RequestMapping("/mic5/meeting")
    public class MeetingRestAPI {
        @GetMapping("/hello")
        public String sayhello(){
            return "Hello microservice 5 de meeting";
        }

    }


