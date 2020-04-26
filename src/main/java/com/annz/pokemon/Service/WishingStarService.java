package com.annz.pokemon.Service;

import com.annz.pokemon.Domain.WishingStar;

import java.util.List;

public interface WishingStarService {
        WishingStar selectstar(int id);//根据id查询一个许愿星

        List<WishingStar> selectAllstar();//查询所有许愿星

        int insertWS(WishingStar ws);//插入一个许愿星

        int updateWs(String password,int id);//更新对应id的password

        String selectac(int id,String password);

        int deletews(int id);//删除一个许愿星
}
