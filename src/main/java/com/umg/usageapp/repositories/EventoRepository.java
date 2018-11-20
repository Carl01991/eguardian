package com.umg.usageapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.usageapp.models.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento,Integer> {

}
