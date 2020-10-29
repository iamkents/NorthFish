package com.NorthFish.api;

import com.NorthFish.common.ResultObject;
import com.NorthFish.entity.eStudyLesson;
import com.NorthFish.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lesson")
public class lessonController {

    @Autowired
    LessonService lessonService;

    @CrossOrigin
    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = {"Accept=application/json;charset=UTF-8"})
    public ResultObject getAll() {
        ResultObject re=ResultObject.createInstance();
        Iterable<eStudyLesson> wordLetter = lessonService.getAll();
        re.setData(wordLetter);
        return re;
    }

    @CrossOrigin
    @RequestMapping(value = "/getLesson/{id}", method = RequestMethod.GET, headers = {"Accept=application/json;charset=UTF-8"})
    public ResultObject getLesson(@PathVariable String id) {
        ResultObject re=ResultObject.createInstance();
        eStudyLesson lesson = lessonService.getSingle(id);
        re.setData(lesson);
        return re;
    }


}
