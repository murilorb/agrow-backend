package com.agrow.agrowbackend.repositories;

import com.agrow.agrowbackend.domain.Responsible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsibleRepository extends JpaRepository<Responsible, Long> {

}
