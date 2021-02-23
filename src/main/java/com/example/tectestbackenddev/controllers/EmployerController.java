package com.example.tectestbackenddev.controllers;

import com.example.tectestbackenddev.entities.Employer;
import com.example.tectestbackenddev.resources.EmployerResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployerController {

    Employer actualUser;

    @Autowired
    private EmployerResources employerResources;

    @GetMapping("/")
    public String index(@ModelAttribute("model") ModelMap model){
        model.addAttribute("products", employerResources.getProductSold());
        return "menu";
    }

    @RequestMapping(value="/soldProduct")
    public String viewProductSold(@ModelAttribute("model") ModelMap model){
        model.addAttribute("products", employerResources.getProductSold());
        return "ProductList";
    }

    @RequestMapping(value="addNewProduct")
    public String viewAddNewProduct(@ModelAttribute("model") ModelMap model){
        return "addProduct";
    }


}
