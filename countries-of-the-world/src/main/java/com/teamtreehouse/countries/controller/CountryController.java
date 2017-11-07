package com.teamtreehouse.countries.controller;

import com.teamtreehouse.countries.data.CountryRepository;
import com.teamtreehouse.countries.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    public CountryRepository countryRepository;

    @RequestMapping("/")
    public String listOfCountries(ModelMap modelMap) {
        List<Country> allCountries = CountryRepository.getAllCountries();
        modelMap.put("country", allCountries);
        return "index";
    }

    @RequestMapping("/country/{name}")
    public String detailPage(@PathVariable String name, ModelMap modelMap) {
        Country country = countryRepository.findCountryByName(name);
        modelMap.put("country", country);
        return "detail";
    }

}
