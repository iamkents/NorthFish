package com.NorthFish.service;
import com.NorthFish.entity.eStudyLessonDetail;
import com.NorthFish.entity.eStudyWordLetter;
import com.NorthFish.repository.LessonDetailRepository;
import com.NorthFish.repository.WordLetterRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Optional;

@Service
public class LessonDetailService {

    @Resource
    private LessonDetailRepository lessonDetailRepository;

    @Resource
    private WordLetterRepository wordLetterRepository;

    public Iterable<eStudyLessonDetail> getAll(){
        return lessonDetailRepository.findAll();
    }

    public eStudyLessonDetail getSingle(String id){
        Optional<eStudyLessonDetail> op = lessonDetailRepository.findById(Long.parseLong(id));
        return op.get();
    }

    public Iterable<eStudyWordLetter> getLessonDetailByLessonId(String lessonId){
        Iterable<eStudyWordLetter> op = wordLetterRepository.getLessonDetailByLessonId(Integer.parseInt(lessonId));
        return op;
    }
}
