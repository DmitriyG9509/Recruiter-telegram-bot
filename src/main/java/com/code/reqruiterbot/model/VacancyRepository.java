package com.code.reqruiterbot.model;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface VacancyRepository extends CrudRepository<Vacancy, Integer> {
    List<Vacancy> findAll();
    Vacancy findByVacancyId(Integer vacancyId);
}