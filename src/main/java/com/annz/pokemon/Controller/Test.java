package com.annz.pokemon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Test {
    @RequestMapping(value = "/test")
    public String hello() {
        return "hello world，w d n m d";
    }
}
@Controller
class blank{
    @RequestMapping(value = "/blank")
    public String blank() {
        return "blank";

    }

}

//@RestController
// class MybatisDate {
//
//    @Autowired
//    private CharacteristicS Characteristicservice;
//
//    @GetMapping("/getCharacteristics")
//    public com.annz.pokemon.Domain.Characteristic getCharacteristics() {
//        //System.out.println("test :id: "+id);
//        return Characteristicservice.SelectCharacteristic();
//    }
//}