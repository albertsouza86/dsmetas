package com.albertsouza.dsmetas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.albertsouza.dsmetas.entities.Sale;
import com.albertsouza.dsmetas.repositories.SalesRepository;
@Service
public class SalesService {

	@Autowired
	private SalesRepository repository;
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
