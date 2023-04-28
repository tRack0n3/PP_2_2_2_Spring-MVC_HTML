package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String getCarList(@RequestParam(value = "count", defaultValue = "5") int count,
                             Model model) {

        model.addAttribute("cars", carService.getCar(count));

        return "cars";
    }
}
