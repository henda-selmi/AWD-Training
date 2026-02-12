package tn.esprit.notification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/mic4/notification")
    public class NotificationRestAPI {
        @GetMapping("/hello")
        public String sayhello(){
            return "Hello microservice 4 de notification";
        }

    }

