package com.annz.pokemon.Controller;

import com.annz.pokemon.Domain.WishingStar;
import com.annz.pokemon.Service.WishingStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


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

@RestController
 class WishingStarController {

    @Autowired
    private com.annz.pokemon.Service.WishingStarService WishingStarService;

    @GetMapping("/wishingStar")
    public WishingStar getstar(int id) {
        return WishingStarService.selectstar(id);
    }

    @GetMapping("/allwish")
    public List<WishingStar> allwish()
    {
        return WishingStarService.selectAllstar();
    }
}
