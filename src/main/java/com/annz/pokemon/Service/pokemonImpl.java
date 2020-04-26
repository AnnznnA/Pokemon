package com.annz.pokemon.Service;

import com.annz.pokemon.Domain.pokemon;
import com.annz.pokemon.mapper.pokemonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class pokemonImpl implements pokemonService {


    @Autowired
    private pokemonMapper pokemonMapper;

    @Override
    public List<pokemon> getAllpokemon() {
        return pokemonMapper.getAllpokemon();
    }
}