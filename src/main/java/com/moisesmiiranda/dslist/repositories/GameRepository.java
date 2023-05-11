package com.moisesmiiranda.dslist.repositories;

import com.moisesmiiranda.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {

}
