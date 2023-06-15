package com.kodilla.beanlifecycle.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/create")
    public Map<Integer, String> createStudents(@RequestParam(defaultValue = "20") int n, @RequestParam(defaultValue = "10") int z) throws IllegalAccessException, NoSuchFieldException {
        Map<Integer, String> result = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student(z);
            Field indexNumberField = student.getClass().getDeclaredField("indexNumber");
            indexNumberField.setAccessible(true);
            String indexNumber = (String) indexNumberField.get(student);
            result.put(System.identityHashCode(student), indexNumber);
        }

        return result;
    }
}
