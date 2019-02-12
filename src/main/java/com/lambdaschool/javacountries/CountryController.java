package com.lambdaschool.javacountries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/data")
public class CountryController {
    @RequestMapping("allcountries")
    public ArrayList<CountryList> getAllCountries(){
        JavaCountriesApplication.ourCountryList.countryList.sort((c1, c2) ->
                c1.getName().compareToIgnoreCase(c2.getName()));
        return JavaCountriesApplication.ourCountryList.countryList;
    }
}
