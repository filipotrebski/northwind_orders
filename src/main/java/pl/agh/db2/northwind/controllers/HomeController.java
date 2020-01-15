package pl.agh.db2.northwind.controllers;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class HomeController {

    @ResponseBody
    public String home(){

        return "Strona startowa";
    }
}
