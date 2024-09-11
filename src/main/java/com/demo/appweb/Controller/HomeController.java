package com.demo.appweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")

public class HomeController {
    @GetMapping("/Listar")
    @ResponseBody
    public String verContacto() {
        return "hola mundo es bonito";
    }

    @GetMapping("/nombre")
    @ResponseBody
    public String verRous() {
        return "Rous Aroni Cjuro";
    }

    @GetMapping("/suma")
    @ResponseBody
    public String sumar() {
        int num1 = 5;
        int num2 = 5;
        int sum = num1 + num2;
        return "la suma es: " + sum;

    }

    @GetMapping("/multi")
    @ResponseBody
    public String mult() {
        int num1 = 5;
        int num2 = 4;
        int mult = num1 * num2;
        return "la multiplicacion es:" + mult;
    }

    @GetMapping("/Suma/{n1}/{n2}")
    @ResponseBody
    public String suma(@PathVariable("n1") int n1, @PathVariable("n2") int n2){

        return "la suma es: " + n1;

    }
    @GetMapping("parametro/{id}")
    @ResponseBody
    public String other(@PathVariable("id")int n1){
        return "ruta con parametros" + n1;
    }


}
