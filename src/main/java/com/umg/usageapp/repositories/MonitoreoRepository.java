package com.umg.usageapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg.usageapp.models.Monitoreo;

@Repository
public interface MonitoreoRepository extends JpaRepository<Monitoreo,Integer> {

}
