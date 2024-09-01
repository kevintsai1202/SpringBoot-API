package com.kt.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kt.web.entity.Alert;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {

}
