package com.example.dice.api;

import com.example.dice.model.Dice;
import com.example.dice.service.DiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DiceController {

    @Autowired
    private DiceService diceService;

    @GetMapping(path = "/")
    public String startpage(){
        return "index";
    }

    @GetMapping(path = "/post")
    public String postDicePage(){
        return "post";
    }

    @GetMapping(path = "/get")
    public String getDicePage(){
        return "get";
    }

    @GetMapping(path = "/roll")
    public String rollDicePage(){
        return "roll";
    }

    @GetMapping(path = "/delete")
    public String deleteDicePage(){
        return "delete";
    }

    @PostMapping(path = "/post/successful")
    public String postDice(Dice dice){
        diceService.insertDice(dice);
        return "successful";
    }

    @PostMapping(path = "/delete/all/successful")
    public String deleteAllDice(){
        diceService.deleteDiceAll();
        return "successful";
    }

    @PostMapping(path = "/delete/successful")
    public String deleteDiceById(int id){
        diceService.deleteDiceById(id);
        return "successful";
    }

    @GetMapping(path = "/get/all/result")
    public String getAllDice(Model model){
        model.addAttribute("dices", diceService.getAll());
        return "result";
    }

    @GetMapping(path = "/get/result")
    public String getDiceById(int id, Model model){
        model.addAttribute("dices", diceService.getDiceById(id));
        return "result";
    }

    @PostMapping(path = "/roll/successful")
    public String rollDiceById(int id){
        diceService.rollDiceById(id);
        return "successful";
    }

    @PostMapping(path = "/roll/all/successful")
    public String rollAllDice(){
        diceService.rollDiceAll();
        return "successful";
    }

}
