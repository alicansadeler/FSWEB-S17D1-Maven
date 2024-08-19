package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech")
public class AnimalController {

    private  Map<Integer, Animal> animals = new HashMap<>();

    @GetMapping("/animal")
    public List<Animal> getAnimals() {
        return animals.values().stream().toList();
    }
    @GetMapping("/animal/{id}")
    public Animal getAnimal(@PathVariable int id) {
        return animals.get(id);
    }

    @PostMapping("/animal")
    public Animal setAnimals(@RequestBody Animal animal) {
        animals.put(animal.getId(), animal);
        return animal;
    }

    @PutMapping("/animal/{id}")
    public Animal updateAnimals(@PathVariable int id, @RequestBody Animal animal) {
        animal.setId(id);
        animals.put(animal.getId(), animal);
        return animal;
    }

    @DeleteMapping("/animal/{id}")
    public void deleteAnimals(@PathVariable int id) {
        animals.remove(id);
    }
}
