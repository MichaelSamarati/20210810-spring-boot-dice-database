package com.example.dice.service;

import com.example.dice.model.Dice;
import com.example.dice.repository.DiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DiceService {

    @Autowired
    private DiceRepository diceRepository;

    public void insertDice(Dice dice){
        dice.setInsertTimestamp(dice.currentTimestamp());
        diceRepository.save(dice);
    }

    public List<Dice> getAll(){
        return diceRepository.findAll();
    }

    public List<Dice> getDiceById(int id){
        Optional<Dice> optionalDice = diceRepository.findById((long) id);
        return optionalDice.map(Collections::singletonList).orElse(null);
    }

    public void deleteDiceById(int id){
        diceRepository.deleteById((long) id);
    }

    public void deleteDiceAll(){
        diceRepository.deleteAll();
    }

    public void rollDiceById(int id){
        Dice dice = diceRepository.getById((long) id);
        dice.rollDice();
        dice.setLastRollTimestamp(dice.currentTimestamp());
        diceRepository.flush();
    }

    public void rollDiceAll(){
        List<Dice> dices = diceRepository.findAll();
        for(int i = 0; i<dices.size(); i++){
            dices.get(i).rollDice();
            dices.get(i).setLastRollTimestamp(dices.get(i).currentTimestamp());
        }
        diceRepository.flush();
    }

}
