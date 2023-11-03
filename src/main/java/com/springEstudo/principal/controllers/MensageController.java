package com.springEstudo.principal.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springEstudo.principal.dtos.MensageRecordDto;
import com.springEstudo.principal.models.MensageTable;
import com.springEstudo.principal.repositories.MensageRepository;
import jakarta.validation.Valid;

@RestController
public class MensageController {
 
  @Autowired
  MensageRepository mensageRepository;

  @PostMapping("/save")
  public ResponseEntity<MensageTable> saveMensage(@RequestBody @Valid MensageRecordDto mensageDto){
    
    var mensageModel = new MensageTable();

    BeanUtils.copyProperties(mensageDto, mensageModel);

    return ResponseEntity.status(HttpStatus.CREATED).body(mensageRepository.save(mensageModel));
  }

}
