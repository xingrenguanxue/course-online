package com.xrgx.courseonline;

import com.xrgx.courseonline.domain.Course;
import com.xrgx.courseonline.mapper.CourseMapper;
import com.xrgx.courseonline.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    @Test
    void contextLoads() {
        List<Course> all = courseMapper.findAll();
        System.out.println(all.size());
    }

}
