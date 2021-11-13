package com.ivoronline.springboot_deserialize_requestparameters_custom.dto;

public class PersonDTO {

  //PROPERTIES
  public String name;
  public Float  height;        //"1,67" => 1.67

  //SETTERS (Setter Names are HTTP Request Parameters)
  public void setFirstName(String reqName) {
    this.name = reqName;
  }

  public void setHeight(String reqHeight) {
    String reqHeightConverted = reqHeight.replace(',', '.');
    this.height = Float.parseFloat(reqHeightConverted);
  }

}


