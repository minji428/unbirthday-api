package com.example.unbirthday.main.Controller;

import com.example.unbirthday.main.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    final
    MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @RequestMapping("/hello")
    public String main(){
        return "hello";
    }
}
