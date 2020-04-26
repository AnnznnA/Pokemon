package com.annz.pokemon.Controller;

import com.annz.pokemon.Domain.WishingStar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WishStarController {

    @Autowired
    private com.annz.pokemon.Service.WishingStarService WishingStarService;

    @RequestMapping("/wishingStar")
    public WishingStar wishingStar(int id) {
        return WishingStarService.selectstar(id);
    }

    @RequestMapping("/Firstwish")
    public WishingStar Firstwish()
    {
        return WishingStarService.selectAllstar().get(0);
    }

    @RequestMapping("/allwish")
    public List<WishingStar> allwish()
    {
        return WishingStarService.selectAllstar();
    }

    @RequestMapping("/CreattempWs")
    public int Creatws()
    {
        WishingStar ws = new WishingStar();
        ws.setPassword("temppassword");
        ws.setAccount("tempaccont");
        return WishingStarService.insertWS(ws);

    }

    @GetMapping("/updatePWD")
    public int updatePWD(String password,Integer id)
    {
        id=Integer.valueOf(id);
        //Integer为对象，从url中传过来，需要改成基本数据类型。
        return WishingStarService.updateWs(password,id);
    }

    @RequestMapping("/peac")
    public String peac(Integer id,String password)
    {
        id = Integer.valueOf(id);
        return WishingStarService.selectac(id,password);
    }

    @RequestMapping("deletews")
    public int deletews(Integer id)
    {
        id = Integer.valueOf(id);
        return WishingStarService.deletews(id);
    }
}