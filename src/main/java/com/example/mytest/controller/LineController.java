package com.example.mytest.controller;



import com.example.mytest.domain.Line;
import com.example.mytest.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController

public class LineController {

    private LineService lineService;

    @Autowired
    public LineController(LineService lineService) {
        this.lineService = lineService;
    }

    @PostMapping("/process")
    public void addPost( @ModelAttribute  @RequestParam("file") MultipartFile uploadingFiles) throws IOException {


        lineService.addPost( uploadingFiles);

    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Line> getById(@PathVariable(value = "id") String employeeId)
            {
        Line line = lineService.getById(employeeId);
        return ResponseEntity.ok().body(line);
    }
}
