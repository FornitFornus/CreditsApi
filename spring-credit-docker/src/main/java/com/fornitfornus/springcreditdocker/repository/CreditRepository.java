package com.fornitfornus.springcreditdocker.repository;

import com.fornitfornus.springcreditdocker.model.Credit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends CrudRepository<Credit, Long> {
}
