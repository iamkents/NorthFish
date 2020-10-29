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
@Table(name = "eStudy_Lesson")
public class eStudyLesson implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "lesson_type")
    private String lessonType;

    @Column(name = "grade")
    private String grade;

    @Column(name = "subject")
    private String subject;

    @Column(name = "insert_time")
    private Date insertTime;

    @Column(name = "lesson_no")
    private String lessonNo;

    @Column(name = "lesson_icon")
    private String lessonIcon;

    @Column(name = "lesson_date")
    private Date lessonDate;
}