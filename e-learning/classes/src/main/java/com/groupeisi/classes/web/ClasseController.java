package com.groupeisi.classes.web;

import com.groupeisi.classes.dto.ClassListResultDTO;
import com.groupeisi.classes.dto.ClasseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("classes")
public class ClasseController {
    @GetMapping("/{code}")
    public ClasseDTO get(@PathVariable("code") String code){
        ClasseDTO classeDTO = new ClasseDTO();
        classeDTO.setCode(code);
        classeDTO.setName("M2GL");
        return classeDTO;
    }
    @GetMapping
    public ClassListResultDTO getAll(){
        return new ClassListResultDTO();
    }
}