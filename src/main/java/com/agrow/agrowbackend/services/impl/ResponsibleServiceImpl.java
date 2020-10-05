package com.agrow.agrowbackend.services.impl;

import com.agrow.agrowbackend.domain.Responsible;
import com.agrow.agrowbackend.repositories.ResponsibleRepository;
import com.agrow.agrowbackend.services.ResponsibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsibleServiceImpl implements ResponsibleService {

    @Autowired
    private ResponsibleRepository responsibleRepository;

    @Override
    public Responsible save(Responsible responsible) {
        return responsibleRepository.save(responsible);
    }

    @Override
    public List<Responsible> findAll() {
        return responsibleRepository.findAll();
    }

    @Override
    public Optional<Responsible> findOne(Long id) {
        return responsibleRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        responsibleRepository.deleteById(id);
    }
}
