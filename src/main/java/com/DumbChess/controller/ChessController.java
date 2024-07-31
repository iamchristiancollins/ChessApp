// src/main/java/com/dumbchess/controller/ChessController.java
package com.DumbChess.controller;

import com.DumbChess.model.*;
import com.DumbChess.service.ChessService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chess")
public class ChessController {
    private final ChessService chessService;

    public ChessController(ChessService chessService) {
        this.chessService = chessService;
    }

    @GetMapping("/initialize")
    public Board initializeBoard() {
        return chessService.initializeBoard();
    }

    @PostMapping("/move")
    public boolean makeMove(@RequestBody Move move) {
        return chessService.validateMove(move);
    }

    @PostMapping("/customize")
    public void customizeRules() {
        chessService.customizeRules();
    }

    @PostMapping("/randomize")
    public void randomizeRules() {
        chessService.randomizeRules();
    }
}
