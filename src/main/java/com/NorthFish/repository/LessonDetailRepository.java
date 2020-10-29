package com.NorthFish.repository;
import com.NorthFish.entity.eStudyLessonDetail;
import com.NorthFish.entity.eStudyWordLetter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LessonDetailRepository extends CrudRepository<eStudyLessonDetail, Long> {


}
