package com.agrow.agrowbackend.repositories;

import com.agrow.agrowbackend.domain.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository  extends JpaRepository<Form, Long> {

}
