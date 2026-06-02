package com.dw.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ex_words")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ExWords {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long wordFam;

    @Column(unique = true)
    private String exWord;

    private String exMeaning;

    private String exSentence;
}
