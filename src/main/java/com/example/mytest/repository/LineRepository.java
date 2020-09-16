package com.example.mytest.repository;


import com.example.mytest.domain.Line;
import com.example.mytest.entity.Locations;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import javax.xml.stream.Location;


@Repository
public interface LineRepository extends JpaRepository<Locations, Long> {
}
