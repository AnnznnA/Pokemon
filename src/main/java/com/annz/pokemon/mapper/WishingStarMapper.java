package com.annz.pokemon.mapper;

import com.annz.pokemon.Domain.WishingStar;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WishingStarMapper {
    WishingStar selectstar(int id);
    List<WishingStar> selectAllstar();
}