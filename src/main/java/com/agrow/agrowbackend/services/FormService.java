package com.agrow.agrowbackend.services;

import com.agrow.agrowbackend.domain.Form;

import java.util.List;

public interface FormService  {

    Form save(Form form);

    List<Form> findAll();

    Form findOne(Long id);

    Form update(Form form);

    void delete(Long id);
}
