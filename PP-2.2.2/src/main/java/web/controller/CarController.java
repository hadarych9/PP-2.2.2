package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ResourceBundle;

@Controller
@RequestMapping("/")
public class CarController {

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public void printCars(ModelMap model) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");
        model.addAttribute("title", resourceBundle.getString("title"));
        model.addAttribute("cars", CarService.getCarList());
    }
}
