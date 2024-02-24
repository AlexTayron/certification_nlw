package com.alextayron.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.alextayron.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;


@Service
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute( VerifyHasCertificationDTO dto ){
        if(dto.getEmail().equals("alextayron@gmail.com")&& dto.getTechnology().equals("JAVA")){
            return true;
        }
        return false;
    }
}
