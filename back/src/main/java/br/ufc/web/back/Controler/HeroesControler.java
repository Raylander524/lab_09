package br.ufc.web.back.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.web.back.classes.Heroes;
import br.ufc.web.back.repository.HeroesRepository;

@RestController
@RequestMapping("/")
public class HeroesControler {

    @Autowired
    HeroesRepository heroesRepository;

    @GetMapping("api/heroes")
    public Iterable<Heroes> retornaHeroes(){
        return heroesRepository.findAll();
    }

    @PostMapping("api/heroes")
    public void adicionaHeroes(@RequestBody Heroes heroes){
        heroesRepository.save(heroes);
    }
    
}
