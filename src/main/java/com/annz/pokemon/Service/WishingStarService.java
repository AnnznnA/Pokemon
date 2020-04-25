package com.annz.pokemon.Service;

import com.annz.pokemon.Domain.WishingStar;

import java.util.List;

public interface WishingStarService {
        WishingStar selectstar(int id);//根据id查询一个许愿星

        List<WishingStar> selectAllstar();
}
