package com.mycode.springboot.learnspringboot;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//in CourseController we want to build a REST API so we use @RestController
@RestController
public class CourseController {

    //http://localhost:8080/courses
    //return Course: id,name, author
    //creating methods

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn Spring","Arpit Mehta"),
                new Course(2,"Learn Spring-BOOT","Arpit Mehta"),
                new Course(23,"Learn Spring-Devtools","Arpit Mehta")
        );
    }
}
