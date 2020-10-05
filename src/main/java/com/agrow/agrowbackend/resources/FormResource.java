package com.agrow.agrowbackend.resources;

import com.agrow.agrowbackend.domain.Form;
import com.agrow.agrowbackend.services.impl.FormServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/formularios")
public class FormResource implements Serializable {

    @Autowired
    private FormServiceImpl formService;

    @GetMapping
    public ResponseEntity<List<Form>> getAll(){
        List<Form> allForms = formService.findAll();
        return ResponseEntity.ok().body(allForms);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Form> getForm(@PathVariable Long id){
        Form form = formService.findOne(id);
        return ResponseEntity.ok().body(form);
    }

    @PostMapping
    public ResponseEntity<Form> createForm(@RequestBody Form form) {
        Form formSaved = formService.save((form));
        return ResponseEntity.ok().body(formSaved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteForm(@PathVariable Long id){
         formService.delete(id);
         return ResponseEntity.ok().build();
    }



}
