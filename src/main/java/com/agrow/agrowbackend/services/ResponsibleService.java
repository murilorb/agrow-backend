package com.agrow.agrowbackend.services;


import com.agrow.agrowbackend.domain.Responsible;

import java.util.List;
import java.util.Optional;

public interface ResponsibleService {

    Responsible save(Responsible responsible);

    List<Responsible> findAll();

    Optional<Responsible> findOne(Long id);

    void delete(Long id);
}
