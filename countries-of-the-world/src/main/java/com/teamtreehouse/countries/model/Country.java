package com.teamtreehouse.countries.model;

public class Country {

    private String name;
    private int population;
    private String capital;
    private String language;
    private String flag;

    public Country(String name, int population, String capital, String language, String flag) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.language = language;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
