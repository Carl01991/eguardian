package com.umg.usageapp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umg.usageapp.models.Evento;

@RestController
@RequestMapping(value = "/evento")
public class EventoController {
	
    @PostMapping(value = "/registro")
    public String perfil(@RequestParam int idEmpresa ,@RequestBody Evento evento){


		return "SUCCESS";

    	
    }

    
    
    
    
}
