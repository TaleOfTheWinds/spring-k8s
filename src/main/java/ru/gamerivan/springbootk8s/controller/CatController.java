package ru.gamerivan.springbootk8s.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gamerivan.springbootk8s.dto.CatDTO;
import ru.gamerivan.springbootk8s.entity.Cat;
import ru.gamerivan.springbootk8s.service.CatService;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @PostMapping
    public Cat save(CatDTO cat) {
        return catService.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }
}
