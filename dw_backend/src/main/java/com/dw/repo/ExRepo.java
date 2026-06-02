package com.dw.repo;

import com.dw.model.ExWords;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExRepo extends JpaRepository<ExWords, Long> {

    List<ExWords> findByWordFam(Long word_fam);

}
