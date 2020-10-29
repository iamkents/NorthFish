package com.NorthFish.service;
import com.NorthFish.entity.eStudyLesson;
import com.NorthFish.repository.LessonRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Optional;

@Service
public class LessonService {

    @Resource
    private LessonRepository lessonRepository;

    public Iterable<eStudyLesson> getAll(){
        return lessonRepository.findAll();
    }

    public eStudyLesson getSingle(String id){
        Optional<eStudyLesson> op = lessonRepository.findById(Long.parseLong(id));
        return op.get();

    }
}
