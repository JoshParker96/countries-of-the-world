package com.teamtreehouse.countries.data;

import com.teamtreehouse.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {
    public static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("ecuador", 16_705_980, "Quito", "Spanish", "ecuador.png"),
            new Country("France", 65_067_274, "Paris", "French", "france.png"),
            new Country("India", 1_287_353_065, "New Delhi", "Hindi", "india.png"),
            new Country("italy", 59_336_026, "Rome", "Italian", "italy.png"),
            new Country("Kenya", 50_129_467, "Nairobi", "Kikuyu", "kenya.png")
    );

    public static List<Country> getAllCountries() {

        return ALL_COUNTRIES;
    }

    public Country findCountryByName(String name) {
        for(Country country : ALL_COUNTRIES) {
            if(country.getName().equals(name)) {
                return country;
            }
        }
        return null;
    }

}
