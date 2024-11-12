package com.example.introductiontospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class welcomeController {

    @GetMapping("/name")
    public String name(){
        return "my name is arwa";
    }

    @GetMapping("/age")
    public int age(){
        return 22;
    }
    @GetMapping("/check/status")
    public String check(){
        return "Everything okay";
    }
    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList<String> allNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("arwa");
        names.add("abthal");
        names.add("remas");

        return names;
    }


}
