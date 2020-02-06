package com.leandro.it.loginproyectspring;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

    @RequestMapping(value = "/user")
    public ResponseEntity<Persona> getPersona() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Tu-Vieja",
                "En-Tanga");
        return new ResponseEntity<> (new Persona("Pepe", 1), headers, HttpStatus.ACCEPTED);
    }

}

