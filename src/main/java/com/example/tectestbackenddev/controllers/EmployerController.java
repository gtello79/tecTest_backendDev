package com.example.tectestbackenddev.controllers;

import com.example.tectestbackenddev.dao.EmployerDAO;
import com.example.tectestbackenddev.entities.Product;
import com.example.tectestbackenddev.resources.EmployerResources;
import com.example.tectestbackenddev.resources.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployerController {

    @Autowired
    EmployerDAO actual;

    //Employer actualUser = actual.findById(18986470).get();

    @Autowired
    private EmployerResources employerResources;

    @GetMapping("/")
    public String index(@ModelAttribute("model") ModelMap model){
        model.addAttribute("products", employerResources.getProductSold());
        return "menu";
    }

    @RequestMapping(value="/soldProduct")
    public String viewProductSold(@ModelAttribute("model") ModelMap model){
        System.out.println(employerResources.getProductSold());
        model.addAttribute("products", employerResources.getProductSold());
        return "ProductList";
    }

    @GetMapping(value="/newProduct")
    public ModelAndView viewAddNewProduct(@ModelAttribute("model") ModelMap model){
        model.addAttribute("product", new ProductDTO());
        return new ModelAndView("addProduct", model);
    }


    @PostMapping(value="/newProduct")
    public String viewAddNewProduct(@RequestParam String productName,
                                    @RequestParam int isoCode,
                                    @RequestParam int productId,
                                    @RequestParam double productPrice){
        ProductDTO productDto = new ProductDTO();
        productDto.setProductId(productId);
        productDto.setProductName(productName);
        productDto.setIsoCode(isoCode);
        productDto.setProductPrice(productPrice);

        employerResources.addProduct("Gonzalo", productDto);
        return "showResults";
    }


}
