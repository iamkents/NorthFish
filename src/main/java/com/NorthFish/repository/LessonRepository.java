package com.NorthFish.repository;
import com.NorthFish.entity.eStudyLesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends CrudRepository<eStudyLesson, Long> {

}
