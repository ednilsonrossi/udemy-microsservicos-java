package com.ednilsonrossi.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ednilsonrossi.hrworker.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
