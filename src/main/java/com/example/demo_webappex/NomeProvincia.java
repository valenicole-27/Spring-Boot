package com.example.demo_webappex;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NomeProvincia {
    @RequestMapping (method = RequestMethod.GET, path="/ciao")
    public String ciao (@RequestParam (required = true)String nome, @RequestParam (required = true)String provincia){
return "Ciao " + nome + ","+" "+ "come va il tempo in " + provincia +"?";
    }

}
