package com.dw.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "title_words")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TitleWords {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private Long wordFam;

    @Column(unique = true, nullable = false)
    private String theWord;
}

