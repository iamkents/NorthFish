package com.NorthFish.repository;
import com.NorthFish.entity.eStudyWordLetter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WordLetterRepository extends CrudRepository<eStudyWordLetter, Long> {
    @Query(value="select b.* from eStudy_Lesson_Detail a left join eStudy_WordLetter b on a.word_letter_id=b.id where a.lesson_id=:lessonId order by a.order_index",nativeQuery = true)
    Iterable<eStudyWordLetter> getLessonDetailByLessonId(@Param("lessonId")Integer lessonId);
}
