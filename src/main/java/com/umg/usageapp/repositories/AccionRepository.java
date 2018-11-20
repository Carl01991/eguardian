package com.umg.usageapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umg.usageapp.models.Accion;

public interface AccionRepository extends JpaRepository<Accion,Integer> {

}
