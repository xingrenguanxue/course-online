package com.xrgx.courseonline.mapper;

import com.xrgx.courseonline.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TeacherMapper {
    Teacher findTeacherByTid(String tid);
}
