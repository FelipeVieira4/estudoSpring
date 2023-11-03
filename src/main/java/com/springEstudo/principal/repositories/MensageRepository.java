package com.springEstudo.principal.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springEstudo.principal.models.MensageTable;

@Repository
public interface MensageRepository extends JpaRepository<MensageTable,Integer>{}
