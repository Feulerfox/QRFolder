package com.business.verce.vercia.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerceRepo extends JpaRepository<Verce,Integer> {



}
