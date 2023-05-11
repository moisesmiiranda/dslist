package com.moisesmiiranda.dslist.controllers;

import com.moisesmiiranda.dslist.dto.GameListDTO;
import com.moisesmiiranda.dslist.dto.GameMinDTO;
import com.moisesmiiranda.dslist.services.GameListService;
import com.moisesmiiranda.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.finAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.finByList(listId);
        return result;
    }

}
