package com.umg.usageapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.usageapp.models.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {
	

}
