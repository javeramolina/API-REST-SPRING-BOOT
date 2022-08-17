package com.example.demo.controllers;

import com.example.demo.services.OperacionesImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controllers {

    private OperacionesImpl operaciones;

    public Controllers(OperacionesImpl operaciones){
        this.operaciones = operaciones;
    }

    @GetMapping("/")
    public Map<String,String> home (){
        return new HashMap<>(){{put("message","Hello units tests");}};
    }


    @GetMapping("/factorial")
    public Map<String, String> calcular (@RequestParam int numero){
        return new HashMap<>(){{put("message","resultado: "+operaciones.factorial(numero));}};
    }
}
