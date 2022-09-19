package com.cydeo.streotype_annotation.casefactory;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;
@Autowired
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
// @Autowired
  //  private Dimensions dimensions;

  //  public Case(String model, String manufacturer, String powerSupply) {
   //     this.model = model;
   //     this.manufacturer = manufacturer;
      //  this.powerSupply = powerSupply;
  //  }

    public abstract void pressPowerButton();

}
