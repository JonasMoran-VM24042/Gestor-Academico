package com.academic.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.academic.management.dto.StudentDTO;

@Service
public class StudentService {

    private List<StudentDTO> students =  new ArrayList<>();
    // Read
    public List<StudentDTO> findAll(){
        return students;
    }
    // Create
    public StudentDTO save(StudentDTO student){
        student.setId((long)(students.size()+ 1));
        students.add(student);
        return student;
    }

    //Update
    public StudentDTO update(Long id, StudentDTO updateData){
        for (StudentDTO s: students){
            if(s.getId().equals(id)){
                s.setFullname(updateData.getFullname());
                s.setGrade(updateData.getGrade());
                return s;
            }
        }
        return null;
    }

    //Delete
    public boolean delete(long id){
        return students.removeIf(s -> s.getId().equals(id));
    }

}
