package com.app.message.uc4;

public class DTO {
    private String firstName;
    private String lastName;

    // default constructor
    public DTO(){}

    // paramerterised
    public DTO(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    // getter and setter
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

}
