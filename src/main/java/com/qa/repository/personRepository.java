package com.qa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.model.MySpringBootDataModel;

@Repository
public interface personRepository  extends JpaRepository<MySpringBootDataModel,Long> {

}
