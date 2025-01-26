package com.test.Encapsulation;

import java.sql.SQLOutput;

public class Country {
   private String name;
   private   String capital;
   private String population;
   private String language;
   private String currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void Country1(){
        System.out.println(this.getName());
        System.out.println(this.getCapital());
        System.out.println(this.getPopulation());
        System.out.println(this.getLanguage());
        System.out.println(this.getCurrency());
    }
}
