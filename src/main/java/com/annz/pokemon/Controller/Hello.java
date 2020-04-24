package com.annz.pokemon.Controller;

import com.annz.pokemon.Domain.pokemon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world";
    }
}
@Controller
class blank{
    @RequestMapping(value = "/blank")
    public String blank() {
        return "blank";

    }

}