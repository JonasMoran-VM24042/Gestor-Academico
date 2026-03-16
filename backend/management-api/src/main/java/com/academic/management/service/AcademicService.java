package com.academic.management.service;

import org.springframework.stereotype.Service;

@Service
public class AcademicService {
    public String getWelcomeMessage(){
        return "Bienvenido al Gestor Académico";
    }
}
