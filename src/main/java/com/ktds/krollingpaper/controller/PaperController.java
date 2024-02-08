package com.ktds.krollingpaper.controller;

import com.ktds.krollingpaper.dto.PaperDTO;
import com.ktds.krollingpaper.service.PaperService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping("/paper")
@RequiredArgsConstructor
public class PaperController {
    private final PaperService paperService;

    @GetMapping("/list")
    public List<PaperDTO> findAll() {
        return paperService.findAll();
    }

    @PostMapping("")
    public void createPaper(@RequestBody PaperDTO paperDTO) {
        paperService.createPaper(paperDTO);
    }

    @PostMapping("/delete")
    public boolean deletePaper(@RequestBody PaperDTO inputtedPaper) {
        return paperService.deletePaper(inputtedPaper);
    }

    @PutMapping("/update")
    public boolean updatePaper(@RequestBody PaperDTO inputtedPaper) {
        return paperService.updatePaper(inputtedPaper);
    }
}
