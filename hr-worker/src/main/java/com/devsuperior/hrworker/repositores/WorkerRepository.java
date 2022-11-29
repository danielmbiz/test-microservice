package com.devsuperior.hrworker.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
