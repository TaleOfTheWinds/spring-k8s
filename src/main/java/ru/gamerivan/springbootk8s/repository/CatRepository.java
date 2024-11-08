package ru.gamerivan.springbootk8s.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gamerivan.springbootk8s.entity.Cat;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {
}
