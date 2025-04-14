package com.demo.mvc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.demo.mvc.model.Car;
@RepositoryRestResource(collectionResourceRel = "car",path = "car")
public interface CarRepo extends JpaRepository<Car, Integer> {

}
