package com.dw.repo;

import com.dw.model.TitleWords;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WordRepo extends JpaRepository<TitleWords, Long> {

    Optional<TitleWords> findByTheWord(String word);
    Optional<TitleWords> findByWordFam(Long word_fam);

}
