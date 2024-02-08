package com.ktds.krollingpaper.repository;

import com.ktds.krollingpaper.dto.LetterDTO;
import com.ktds.krollingpaper.dto.PaperDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class LetterRepository {
    private final SqlSessionTemplate sql;

    public List<LetterDTO> findAllLetter(Long paperId) {
        return sql.selectList("Letter.findAllLetter", paperId);
    }

    public LetterDTO findById(Long letterId) {
        return sql.selectOne("Letter.findById", letterId);
    }

    public void createLetter(LetterDTO letterDTO) {
        sql.insert("Letter.createLetter", letterDTO);
    }

    public void updateLetter(LetterDTO inputtedLetter) {
        sql.update("Letter.updateLetter", inputtedLetter);
    }

    public void deleteLetter(Long letterId) {
        sql.delete("Letter.deleteLetter", letterId);
    }
}
