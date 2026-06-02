package com.dw.controller;

import com.dw.dto.PageDTO;
import com.dw.model.ExWords;
import com.dw.model.TitleWords;
import com.dw.repo.ExRepo;
import com.dw.repo.WordRepo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = {"http://localhost:5173","https://dw-frontend.onrender.com"})
@RequestMapping("/api/words")
public class GameController {

    private final ExRepo exRepo;
    private final WordRepo wordRepo;

    public GameController(WordRepo wordRepo, ExRepo exRepo){
        this.wordRepo = wordRepo;
        this.exRepo = exRepo;
    }

    // it basically takes id from react and returns to it the table (word, meaning, sentence)
    // of the main word from the main table and rows that relate to it from the example table (for 1 word at the time)
    @GetMapping("/{id}")
    public List<PageDTO> startGame(@PathVariable Long id) {

        Optional<TitleWords> mainWordRow = wordRepo.findById(id);
        List<ExWords> exWordRow = exRepo.findByWordFam(id);
        List<PageDTO> dtoList = new ArrayList<>();
        String mainWord = mainWordRow.get().getTheWord();
        if(!exWordRow.isEmpty()){

            for(ExWords exWord : exWordRow){

                PageDTO dto = new PageDTO();
                dto.setWord(mainWord);
                dto.setExample(exWord.getExWord());
                dto.setMeaning(exWord.getExMeaning());
                dto.setSentence(exWord.getExSentence());
                dtoList.add(dto);
            }
        }

        return dtoList;
    }



}
