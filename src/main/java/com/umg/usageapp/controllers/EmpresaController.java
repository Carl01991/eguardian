package com.umg.usageapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umg.usageapp.models.Empresa;
import com.umg.usageapp.models.Usuarios;
import com.umg.usageapp.services.EmpresaService;
//import com.umg.usageapp.util.Mailer;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;
	
//	@Autowired
//	Mailer mailer;
	
	
    @PostMapping(value = "/create")
    public String create(@RequestBody Empresa empresa){
    	
    	String response = null;

    	try {
        	empresaService.createEmpresa(empresa);
        	response = "SUCCESS";
		} catch (Exception e) {
        	response = "ERROR";
		}
    	
		return response ;

    	
    }

}
