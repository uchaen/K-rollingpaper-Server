package com.ktds.krollingpaper.service;

import com.ktds.krollingpaper.dto.LetterDTO;
import com.ktds.krollingpaper.dto.PaperDTO;
import com.ktds.krollingpaper.repository.LetterRepository;
import com.ktds.krollingpaper.repository.PaperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class LetterService {
    private final LetterRepository letterRepository;
    public List<LetterDTO> findAllLetter(Long paperId) {
        return letterRepository.findAllLetter(paperId);
    }

    public void createLetter(LetterDTO letterDTO) {
        letterRepository.createLetter(letterDTO);
    }

    public boolean updateLetter(LetterDTO inputtedLetter) {
        LetterDTO letter = letterRepository.findById(inputtedLetter.getLetterId());
        if (letter != null && Objects.equals(inputtedLetter.getLetterPw(), letter.getLetterPw())) {
            letterRepository.updateLetter(inputtedLetter);
            return true;
        }
        return false;
    }

    public boolean deleteLetter(LetterDTO inputtedLetter) {
        LetterDTO letter = letterRepository.findById(inputtedLetter.getLetterId());
        if (letter != null && Objects.equals(inputtedLetter.getLetterPw(), letter.getLetterPw())) {
            letterRepository.deleteLetter(inputtedLetter.getLetterId());
            return true;
        }
        return false;
    }
}
