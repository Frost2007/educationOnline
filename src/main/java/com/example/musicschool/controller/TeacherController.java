package com.example.musicschool.controller;

import com.example.musicschool.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherService teacherService;
    private final ModelMapper modelMapper;


    @GetMapping("/{id}")
    public String teacherPage(@PathVariable int id, ModelMap modelMap){
        modelMap.addAttribute("teacher", teacherService.findById(id));
        return "news-single";
    }



}
