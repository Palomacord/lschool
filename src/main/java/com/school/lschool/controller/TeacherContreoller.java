package com.school.lschool.controller;

import com.school.lschool.domain.model.Teacher;
import com.school.lschool.domain.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeacherContreoller {
    @Autowired
    private  TeacherRepository teacherRepository;
    @RequestMapping(value = "/createTeacher",method = RequestMethod.GET)
    public ModelAndView form(){
        ModelAndView mv = new ModelAndView("/formRegistration");
        return mv ;
    }
    @RequestMapping(value = "/createTeacher",method = RequestMethod.POST)
    public String form(Teacher teacher){
        teacherRepository.save(teacher);
        return "redirect:/createTeacher";
    }
}
