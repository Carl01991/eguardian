package com.umg.usageapp.services;

import org.springframework.stereotype.Service;

import com.umg.usageapp.models.Empresa;

public interface EmpresaService {
	
	Empresa getEmpresaById(Integer id);
	String findByName(String name);
	Empresa findUseradmin(Integer idEmpresa);
	Empresa createEmpresa(Empresa empresa);
	Empresa updateEmpresa(Empresa empresa);
	
}
