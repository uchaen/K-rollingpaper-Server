package com.ktds.krollingpaper.service;

import com.ktds.krollingpaper.dto.PaperDTO;
import com.ktds.krollingpaper.repository.PaperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PaperService {
    private final PaperRepository paperRepository;

    public List<PaperDTO> findAll() {
        return paperRepository.findAll();
    }

    public void createPaper(PaperDTO paperDTO) {
        paperRepository.createPaper(paperDTO);
    }

    public boolean updatePaper(PaperDTO inputtedPaper) {
        PaperDTO paper = paperRepository.findById(inputtedPaper.getPaperId());
        if (paper != null && Objects.equals(inputtedPaper.getPaperPw(), paper.getPaperPw())) {
            paperRepository.updatePaper(inputtedPaper);
            return true;
        }
        return false;
    }

    public boolean deletePaper(PaperDTO inputtedPaper) {
        PaperDTO paper = paperRepository.findById(inputtedPaper.getPaperId());
        if (paper != null && Objects.equals(inputtedPaper.getPaperPw(), paper.getPaperPw())) {
            paperRepository.deletePaper(inputtedPaper.getPaperId());
            return true;
        }
        return false;
    }
}
