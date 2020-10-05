package com.agrow.agrowbackend.services.impl;

import com.agrow.agrowbackend.domain.Form;
import com.agrow.agrowbackend.repositories.FormRepository;
import com.agrow.agrowbackend.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormServiceImpl implements FormService {

    @Autowired
    private FormRepository formRepository;

    @Override
    public Form save(Form form) {
        return formRepository.save(form);
    }

    @Override
    public List<Form> findAll() {
        return formRepository.findAll();
    }

    @Override
    public Form findOne(Long id) {
       return formRepository.findById(id).get();
    }

    @Override
    public Form update(Form form) {
        Optional<Form> formToUpdate = formRepository.findById(form.getId());
        formToUpdate.get().setClient(form.getClient());
        formToUpdate.get().setRequester(form.getRequester());
        formToUpdate.get().setDate(form.getDate());
        formToUpdate.get().setDescription(form.getDescription());
        formToUpdate.get().setResponsible(form.getResponsible());

        return formRepository.save(formToUpdate.get());
    }

    @Override
    public void delete(Long id) {
        formRepository.deleteById(id);
    }
}
