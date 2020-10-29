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
@Table(name = "eStudy_Lesson_Detail")
public class eStudyLessonDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "lesson_type")
    private String lessonType;

    @Column(name = "lesson_id")
    private Long lessonId;

    @Column(name = "word_letter_id")
    private Long wordLetterId;

    @Column(name = "sentence_id")
    private Long sentenceId;

    @Column(name = "insert_time")
    private Date insertTime;
}