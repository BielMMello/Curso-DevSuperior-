package com.mello.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mello.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long>{

}
