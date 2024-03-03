package org.example.controller;

import org.example.mybatis.model.dto.LectureCourseDetail;
import org.example.mybatis.model.dto.LectureCourseInfo;
import org.example.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class LectureController {
    @Autowired
    private LectureService lectureService;

    @GetMapping("/mappers/lecture")
    public List<LectureCourseInfo> getLecture() {
        return lectureService.getLectureCourseInfo();
    }

    @GetMapping("/mappers/lecture/details")
    public List<LectureCourseDetail> getListOfStudentName(@RequestParam Map<String, Object> params) {
        return lectureService.getLectureCourseDetails(params);
    }
}