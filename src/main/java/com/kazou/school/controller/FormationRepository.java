package com.kazou.school.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kazou.school.model.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {


}
