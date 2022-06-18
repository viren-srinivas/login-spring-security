package com.voting.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/voter")
    public String voter(){
        return "This is Voter Page";
    }

    @GetMapping("/admin")
    public String admin(){
        return "This is Admin Page";
    }
    
    @GetMapping("/host")
    public String Host(){
        return "This is Host Page";
    }
}