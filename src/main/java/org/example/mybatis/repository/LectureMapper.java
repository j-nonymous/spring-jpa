package org.example.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.example.mybatis.model.dto.LectureCourseDetail;
import org.example.mybatis.model.dto.LectureCourseInfo;

import java.util.List;
import java.util.Map;

@Mapper
public interface LectureMapper {

    List<LectureCourseInfo> selectLectureCourseInfos();

    List<LectureCourseDetail> selectLectureCourseDetails(Map<String, Object> params);
}
