package br.ufc.web.back.repository;

import org.springframework.data.repository.CrudRepository;

import br.ufc.web.back.classes.Heroes;

public interface HeroesRepository extends CrudRepository<Heroes,Integer>{
    
}
