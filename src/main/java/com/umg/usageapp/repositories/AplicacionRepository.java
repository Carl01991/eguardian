package com.umg.usageapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umg.usageapp.models.Aplicacion;

public interface AplicacionRepository extends JpaRepository<Aplicacion,Integer> {

}
