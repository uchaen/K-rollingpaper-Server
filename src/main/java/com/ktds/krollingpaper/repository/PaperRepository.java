package com.ktds.krollingpaper.repository;

import com.ktds.krollingpaper.dto.PaperDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PaperRepository {
    private final SqlSessionTemplate sql;

    public PaperDTO findById(Long paperId) {
        return sql.selectOne("Paper.findById", paperId);
    }

    public List<PaperDTO> findAll() {
        return sql.selectList("Paper.findAll");
    }

    public void createPaper(PaperDTO paperDTO) {
        sql.insert("Paper.createPaper", paperDTO);
    }

    public void deletePaper(Long paperId) {
        sql.delete("Paper.deletePaper", paperId);
    }

    public void updatePaper(PaperDTO inputtedPaper) {
        sql.update("Paper.updatePaper", inputtedPaper);
    }
}
