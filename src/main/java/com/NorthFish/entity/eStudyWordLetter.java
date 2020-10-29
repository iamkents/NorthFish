package com.NorthFish.entity;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
@Table(name = "eStudy_WordLetter")
public class eStudyWordLetter implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "word_text")
    private String wordText;

    @Column(name = "voice_url")
    private String voiceUrl;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "insert_time")
    private Date insertTime;

}