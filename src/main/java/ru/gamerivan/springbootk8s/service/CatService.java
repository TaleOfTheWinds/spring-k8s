package ru.gamerivan.springbootk8s.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gamerivan.springbootk8s.dto.CatDTO;
import ru.gamerivan.springbootk8s.entity.Cat;
import ru.gamerivan.springbootk8s.repository.CatRepository;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public Cat save(CatDTO catDTO) {
        Cat cat = new Cat()
                .setName(catDTO.getName())
                .setBirthDay(catDTO.getBirthDay())
                .setCreatedAt(LocalDateTime.now());
        return catRepository.save(cat);
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
}
