package com.moisesmiiranda.dslist.controllers;

import com.moisesmiiranda.dslist.dto.GameMinDTO;
import com.moisesmiiranda.dslist.entities.Game;
import com.moisesmiiranda.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.finAll();
        return result;
    }
}
