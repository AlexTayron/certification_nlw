package com.alextayron.certification_nlw.modules.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alextayron.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.alextayron.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase; 

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO){

        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if(result){
            return "Usuario ja fez a prova";
        }
        System.out.println(verifyHasCertificationDTO);
        return "Usuário pode fazer a prova";
    }
    
}
