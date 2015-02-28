package com.springapp.web;

import com.springapp.domain.Country;
import com.springapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by bkv on 17/02/15.
 */
@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping("/index")
    public String listCountries(Map<String, Object> map){
        map.put("country", new Country());
        map.put("countryList", countryService.listCountries());
        return "country";
    }

    @RequestMapping("/")
    public String home(){
        return "redirect:/main";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCountry(@ModelAttribute("country") Country country, BindingResult result) {
        countryService.addCountry(country);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{countryId}")
    public String deleteCountry(@PathVariable("countryId") Integer countryId) {

        countryService.removeCountry(countryId);

        return "redirect:/index";
    }

}
