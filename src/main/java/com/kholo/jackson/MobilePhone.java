package com.kholo.jackson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MobilePhone  {

    //Creating properties of the class
    private String brand;
    private String name;
    private int ram;
    private int rom;

    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                '}';
    }
}
