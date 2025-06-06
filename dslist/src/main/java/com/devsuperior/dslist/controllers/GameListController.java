package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;
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
            List<GameListDTO> result = gameListService.findAll();
            return result;
        }

    @GetMapping(value="/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
          return gameService.findByList(listId);
    }

}
