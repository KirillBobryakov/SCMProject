package com.springapp.web;

import com.springapp.domain.Country;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by bkv on 17/02/15.
 */
@Controller
public class MainController {




    @RequestMapping("/main")
    public String indexPage(){
        return "indexPage";
    }
}
