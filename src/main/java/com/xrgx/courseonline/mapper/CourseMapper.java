package com.xrgx.courseonline.mapper;

import com.xrgx.courseonline.domain.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper
public interface CourseMapper {

    //全部课程
    List<Course> findAll();

    //插入一条选择
    void insertSelection(String cid, String sid);

    //删除一条选择
    void deleteSelection(String cid, String sid);
}
