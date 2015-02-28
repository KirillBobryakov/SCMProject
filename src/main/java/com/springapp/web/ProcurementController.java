package com.springapp.web;

import com.springapp.domain.Company;
import com.springapp.domain.Country;
import com.springapp.domain.Procurement;
import com.springapp.service.AddressService;
import com.springapp.service.CompanyService;
import com.springapp.service.ProcurementGoodService;
import com.springapp.service.ProcurementService;
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
public class ProcurementController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private ProcurementGoodService procurementGoodService;


    @Autowired
    private ProcurementService procurementService;

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
        map.put("companies", companyService.listCompanies());
        map.put("procurementGoods", procurementGoodService.listProcurementGood(procurementId));
        return "/procurement/edit";
    }

    @RequestMapping(value = "/procurement/create", method = RequestMethod.POST)
    public String addCompany(@ModelAttribute("procurement") Procurement procurement, BindingResult result) {
        procurementService.addProcurement(procurement);

        return "redirect:/procurement/edit?procurementId="+procurement.getId();
    }

    @RequestMapping("/procurement/delete/{procurementId}")
    public String addCompany(@PathVariable("procurementId") Integer procurementId) {
        procurementService.removeProcurement(procurementId);

        return "redirect:/procurement/list";
    }
}
