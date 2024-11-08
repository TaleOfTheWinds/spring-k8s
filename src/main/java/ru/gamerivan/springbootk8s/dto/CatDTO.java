package ru.gamerivan.springbootk8s.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CatDTO {
    private String name;
    private LocalDate birthDay;
}
