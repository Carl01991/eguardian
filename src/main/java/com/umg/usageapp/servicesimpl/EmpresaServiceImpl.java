package com.umg.usageapp.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umg.usageapp.models.Empresa;
import com.umg.usageapp.repositories.EmpresaRepository;
import com.umg.usageapp.services.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {
	
	@Autowired
	EmpresaRepository empresaRepository;

	@Override
	public Empresa findById(Integer id) {
		Empresa empresa = empresaRepository.getOne(id);
		return empresa;
	}

	@Override
	public Empresa findUseradmin(Integer idEmpresa) {

		return null;
	}

	@Override
	public Empresa createEmpresa(Empresa empresa) {
		return 		empresaRepository.save(empresa);
	}

	@Override
	public Empresa updateEmpresa(Empresa empresa) {
		Empresa empresaold = empresaRepository.getOne(empresa.getId());
		empresaold = empresa;
		return empresa;
	}

}
