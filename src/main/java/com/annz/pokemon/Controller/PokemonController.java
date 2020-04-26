package com.annz.pokemon.Controller;


import com.annz.pokemon.Domain.pokemon;
import com.annz.pokemon.Service.pokemonService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    private pokemonService pokemonService;

    @RequestMapping("/getAllpokemon")
    public List<pokemon> getAllpokemon()
    {
      return  pokemonService.getAllpokemon();
    }
}