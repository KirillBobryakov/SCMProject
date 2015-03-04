package com.springapp.web;

import com.springapp.domain.Company;
import com.springapp.domain.Country;
import com.springapp.domain.Currency;
import com.springapp.domain.Procurement;
import com.springapp.service.*;
import org.aspectj.apache.bcel.generic.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by bkv on 17/02/15.
 */
@Controller
public class ProcurementController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private ProcurementGoodService procurementGoodService;

    @Autowired
    private ProcurementService procurementService;

    @Autowired
    private CurrencyService currencyService;



    @RequestMapping("/procurement")
    public String procurement(Map<String, Object> map){
        map.put("company", new Company());
        map.put("companiesList", companyService.listCompanies());
        map.put("addresses", addressService.listAddresses());
        return "/procurement/main";
    }

    @RequestMapping("/procurement/list")
    public String procurementList(Map<String, Object> map){
        map.put("procurements", procurementService.listProcurements());
        return "/procurement/list";
    }

    @RequestMapping("/procurement/new")
    public String procurementNew(Map<String, Object> map){
        map.put("procurement", new Procurement());
        return "/procurement/new";
    }


    @RequestMapping("/procurement/edit/{procurementId}")
    public String procurementEdit(@PathVariable("procurementId") Integer procurementId, Map<String, Object> map){
        map.put("procurement", procurementService.getProcurementById(procurementId));
        map.put("foreign_companies", companyService.listCompaniesByType(CompanyTypeService.FOREIGN));
        map.put("procurementGoods", procurementGoodService.listProcurementGood(procurementId));
        map.put("currencies", currencyService.listCurrencies());

        return "/procurement/edit";
    }

    @RequestMapping(value = "/procurement/create", method = RequestMethod.POST)
    public String addCompany(@ModelAttribute("procurement") Procurement procurement, BindingResult result) {
        procurementService.addProcurement(procurement);

        return "redirect:/procurement/edit/"+procurement.getId();
    }

    @RequestMapping("/procurement/delete/{procurementId}")
    public String addCompany(@PathVariable("procurementId") Integer procurementId) {
        procurementService.removeProcurement(procurementId);

        return "redirect:/procurement/list";
    }


    @RequestMapping(value = "/procurement/unitPriceCurrency", method = RequestMethod.GET)
    public @ResponseBody String getUnitPriceCurrency(@RequestParam(value = "currencyId") int currencyId) {
        return currencyService.getCodeAlfaByCurrencyId(currencyId);
    }

    @RequestMapping(value = "/procurement/getListCurrencies", method = RequestMethod.GET)
    public @ResponseBody String[] getListCurrencies() {
        List<Currency> currencies = currencyService.listCurrencies();
        String[] curs = new String[currencies.size()];
        for(int i = 0; i < currencies.size(); i++){
            curs[i] = ((Currency) (currencies.get(i))).getCodeAlfa();
        }
        return curs;
    }



}
