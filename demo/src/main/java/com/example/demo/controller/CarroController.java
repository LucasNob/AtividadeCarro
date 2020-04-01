package com.example.demo.controller;

import java.util.ArrayList;


import com.example.demo.model.Carro;
import com.example.demo.service.CarroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 * CarroController
 */
@Controller
@RequestMapping("/")
public class CarroController {
    @Autowired
    private CarroService cs;

    @GetMapping("carro/{IdCarro}")
    public ModelAndView getCarro(@PathVariable("IdCarro") int idcarro)
    {
        ModelAndView mv= new ModelAndView("carroIndividual");
        Carro car = cs.getCarro(idcarro);
        mv.addObject("carro", car);
        return mv;
    }   
    @GetMapping("carros")
    public ModelAndView getCarros()
    {
        ModelAndView mv = new ModelAndView("tabelaCarros");
        ArrayList<Carro> carList = cs.getCarros();;
        mv.addObject("carros",carList);
        return mv;
    }
}
    
