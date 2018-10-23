package com.umg.usageapp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.usageapp.models.Empresa;
import com.umg.usageapp.models.Usuarios;

@RestController
@RequestMapping(value = "/registro")
public class Register {

    @PostMapping(value = "/empresa")
    public String createUser(@RequestBody Empresa empresa,@RequestBody Usuarios usuarios){


		return "SUCCESS";

    	
    }
    

	
	
	
}
