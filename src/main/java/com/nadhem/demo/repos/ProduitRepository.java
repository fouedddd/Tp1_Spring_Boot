package com.nadhem.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadhem.demo.entities.Produit;

public interface ProduitRepository  extends JpaRepository<Produit, Long>  {

}
