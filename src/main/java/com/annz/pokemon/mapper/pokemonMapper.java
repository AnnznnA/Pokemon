package com.annz.pokemon.mapper;

import com.annz.pokemon.Domain.pokemon;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface pokemonMapper {
    @Select(" select * from pokemon")
    List<pokemon> getAllpokemon();
}
