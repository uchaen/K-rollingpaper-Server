package com.ktds.krollingpaper.controller;

import com.ktds.krollingpaper.dto.LetterDTO;
import com.ktds.krollingpaper.dto.PaperDTO;
import com.ktds.krollingpaper.service.LetterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping("/letter")
@RequiredArgsConstructor
public class LetterController {
    private final LetterService letterService;

    @GetMapping("/list")
    public List<LetterDTO> findAllLetter(@RequestParam("paperId") Long paperId) {
        return letterService.findAllLetter(paperId);
    }

    @PostMapping("")
    public void createLetter(@RequestBody LetterDTO letterDTO) {
        letterService.createLetter(letterDTO);
    }

    @PostMapping("/delete")
    public boolean deleteLetter(@RequestBody LetterDTO inputtedLetter) {
        return letterService.deleteLetter(inputtedLetter);
    }

    @PutMapping("/update")
    public boolean updateLetter(@RequestBody LetterDTO inputtedLetter) {
        return letterService.updateLetter(inputtedLetter);
    }
}
