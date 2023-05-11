package com.moisesmiiranda.dslist.services;

import com.moisesmiiranda.dslist.dto.GameListDTO;
import com.moisesmiiranda.dslist.entities.GameList;
import com.moisesmiiranda.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> finAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
