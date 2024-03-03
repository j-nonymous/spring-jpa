package org.example.service;

import org.example.mybatis.model.dto.LectureCourseDetail;
import org.example.mybatis.model.dto.LectureCourseInfo;
import org.example.mybatis.repository.LectureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LectureService {
    @Autowired
    private LectureMapper lectureMapper;

    public List<LectureCourseInfo> getLectureCourseInfo() {
        return lectureMapper.selectLectureCourseInfos();
    }

    public List<LectureCourseDetail> getLectureCourseDetails(Map<String, Object> params) {
        return lectureMapper.selectLectureCourseDetails(params);
    }
}
