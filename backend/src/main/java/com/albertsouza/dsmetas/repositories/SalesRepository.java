package com.albertsouza.dsmetas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.albertsouza.dsmetas.entities.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long>{

}
