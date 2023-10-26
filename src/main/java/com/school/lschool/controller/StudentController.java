package com.school.lschool.controller;

import com.school.lschool.domain.model.Student;
import com.school.lschool.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @RequestMapping(value = "/createStudent",method = RequestMethod.GET)
    public ModelAndView form(){
        ModelAndView mv = new ModelAndView("/formRegistration");
        return mv ;
    }

    @RequestMapping(value = "/createStudent",method = RequestMethod.POST)
    public String form(Student student){
        studentRepository.save(student);
        return "redirect:/createStudent";
    }
}
