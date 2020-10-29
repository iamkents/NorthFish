package com.NorthFish.api;

import com.NorthFish.common.ResultObject;
import com.NorthFish.entity.eStudyLesson;
import com.NorthFish.entity.eStudyLessonDetail;
import com.NorthFish.entity.eStudyWordLetter;
import com.NorthFish.service.LessonDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessonDetail")
public class lessonDetailController {

    @Autowired
    LessonDetailService lessonDetailService;

    @CrossOrigin
    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = {"Accept=application/json;charset=UTF-8"})
    public ResultObject getAll() {
        ResultObject re=ResultObject.createInstance();
        Iterable<eStudyLessonDetail> wordLetter = lessonDetailService.getAll();
        re.setData(wordLetter);
        return re;
    }

    @CrossOrigin
    @RequestMapping(value = "/getLessonDetail/{id}", method = RequestMethod.GET, headers = {"Accept=application/json;charset=UTF-8"})
    public ResultObject getLessonDetailById(@PathVariable String id) {
        ResultObject re=ResultObject.createInstance();
        eStudyLessonDetail lesson = lessonDetailService.getSingle(id);
        re.setData(lesson);
        return re;
    }

    @CrossOrigin
    @RequestMapping(value = "/getLessonDetailByLessonId/{lessonId}", method = RequestMethod.GET, headers = {"Accept=application/json;charset=UTF-8"})
    public ResultObject getLessonDetailByLessonId(@PathVariable String lessonId) {
        ResultObject re=ResultObject.createInstance();
        Iterable<eStudyWordLetter> lesson = lessonDetailService.getLessonDetailByLessonId(lessonId);
        re.setData(lesson);
        return re;
    }

}
