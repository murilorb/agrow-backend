package com.agrow.agrowbackend.resources;

import com.agrow.agrowbackend.domain.Responsible;
import com.agrow.agrowbackend.services.ResponsibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/responsavel")
public class ResponsibleResource {

    @Autowired
    private ResponsibleService responsibleService;

    @PostMapping
    public ResponseEntity<Responsible> save(@RequestBody @Validated Responsible responsible) {
        Responsible responsibleToSave = responsibleService.save(responsible);
        return ResponseEntity.ok().body(responsibleToSave);
    }
}
