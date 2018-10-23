package com.umg.usageapp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umg.usageapp.models.Empresa;
import com.umg.usageapp.models.Usuarios;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresaController {
	
    @PostMapping(value = "/perfil")
    public String perfil(@RequestParam int idUsuario ,@RequestParam String nombre , 
    		@RequestParam String apellido, @RequestParam int idpuesto,@RequestParam int iddepto ,@RequestParam String telefono){


		return "SUCCESS";

    	
    }

}
