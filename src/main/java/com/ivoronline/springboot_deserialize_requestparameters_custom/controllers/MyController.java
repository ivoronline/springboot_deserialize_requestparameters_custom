package com.ivoronline.springboot_deserialize_requestparameters_custom.controllers;

import com.ivoronline.springboot_deserialize_requestparameters_custom.dto.PersonDTO;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyController {

  //================================================================
  // ADD PERSON
  //================================================================
  @RequestMapping("AddPerson")
  String addPerson(PersonDTO personDTO) {
    return personDTO.name + " is " + personDTO.height + " meters high";
  }

}
