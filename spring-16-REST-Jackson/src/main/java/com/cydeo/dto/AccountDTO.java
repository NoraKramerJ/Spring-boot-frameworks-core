package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

//@JsonIgnoreProperties(value={"address","country","state"},ignoreUnknown = true) // to use to ignore multiple fields
@JsonIgnoreProperties(ignoreUnknown = true)
//ignoreUnknown: if there is anything that is coming from API to the application, it will ignore it
public class AccountDTO {

    @JsonIgnore // to use it to ignore any individual field if I add it on top of the field
    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;
    @JsonBackReference // This field is not going to be serialized
    private UserDTO user;

}
