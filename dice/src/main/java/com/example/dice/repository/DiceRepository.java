package com.example.dice.repository;

import com.example.dice.model.Dice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DiceRepository extends JpaRepository<Dice, Long> {


}
