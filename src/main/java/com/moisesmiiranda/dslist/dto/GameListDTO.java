package com.moisesmiiranda.dslist.dto;

import com.moisesmiiranda.dslist.entities.GameList;

import javax.swing.text.html.parser.Entity;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {

    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
