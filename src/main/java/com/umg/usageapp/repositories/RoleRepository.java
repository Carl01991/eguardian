package com.umg.usageapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.umg.usageapp.models.CatalogoPuestos;
import com.umg.usageapp.models.Empresa;
import com.umg.usageapp.models.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {


	
}
