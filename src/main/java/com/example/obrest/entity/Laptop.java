package com.example.obrest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {

    //Atributos
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String model;
    private String brand;
    private Integer ssdStorare;
    private Integer ram;

    //Constructores


    public Laptop() {
    }

    public Laptop(Long id, String model, String brand, Integer ssdStorare, Integer ram) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.ssdStorare = ssdStorare;
        this.ram = ram;
    }


    //Metodos


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSsdStorare() {
        return ssdStorare;
    }

    public void setSsdStorare(Integer ssdStorare) {
        this.ssdStorare = ssdStorare;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }
}
