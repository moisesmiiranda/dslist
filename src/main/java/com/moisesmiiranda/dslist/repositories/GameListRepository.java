package com.moisesmiiranda.dslist.repositories;

import com.moisesmiiranda.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long> {

}
