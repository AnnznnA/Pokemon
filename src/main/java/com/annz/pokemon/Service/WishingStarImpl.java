package com.annz.pokemon.Service;

import com.annz.pokemon.Domain.WishingStar;
import com.annz.pokemon.mapper.WishingStarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WishingStarImpl implements WishingStarService {
    @Autowired
    private com.annz.pokemon.mapper.WishingStarMapper WishingStarMapper;

    @Override
    public WishingStar selectstar(int id) {
        return  WishingStarMapper.selectstar(id);
    }

    @Override
    public List<WishingStar> selectAllstar() {
        return  WishingStarMapper.selectAllstar();
    }
}