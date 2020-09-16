package com.example.mytest.service;


import com.brein.geojson.geometry.Line;
import com.brein.geojson.geometry.Point;

import com.example.mytest.domain.LineDto;
import com.example.mytest.entity.Locations;
import com.example.mytest.repository.LineRepository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.esri.core.geometry.Polygon;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class LineService {

    private LineRepository lineRepository;

    @Autowired
    public LineService(LineRepository lineRepository) {
        this.lineRepository = lineRepository;
    }


    public void addPost(
            final MultipartFile uploadingFiles) throws IOException {

        File file = LineService.convert(uploadingFiles);
        ObjectMapper mapper = new ObjectMapper();
        LineDto line = mapper.readValue(file, LineDto.class);
        Locations locations = new Locations();
        locations.setLineDto(line);
        Locations locations1 = lineRepository.save(locations);
//        String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(line);
//        List<Point> point0 = line.getFeatures().get(0).getGeometry().getCoordinates().stream().map(a -> new Point(a.get(0), a.get(1))).collect(Collectors.toList());
//        Line line0 = new Line(point0);
//
//        List<Point> point1 = line.getFeatures().get(1).getGeometry().getCoordinates().stream().map(a -> new Point(a.get(0), a.get(1))).collect(Collectors.toList());
//        List<Point> point2 = line.getFeatures().get(2).getGeometry().getCoordinates().stream().map(a -> new Point(a.get(0), a.get(1))).collect(Collectors.toList());
//        List<Point> point3 = line.getFeatures().get(3).getGeometry().getCoordinates().stream().map(a -> new Point(a.get(0), a.get(1))).collect(Collectors.toList());
//        Line line1 = new Line(point1);
//        Line line2 = new Line(point2);
//        Line line3 = new Line(point3);
//        boolean check0 = line0.intersects(line1);
//        boolean check4 = line0.intersects(line3);
//        boolean check5 = line0.intersects(line2);
//        boolean check1 = line1.intersects(line2);
//        boolean check6 = line1.intersects(line3);
//        boolean check2 = line2.intersects(line3);

        //       System.out.println(prettyStaff1);

    }

    public com.example.mytest.domain.Line getById(String id) {

        //    ObjectId objectId = new ObjectId(id);
        // lineRepository.findById(objectId).get()
        return null;
    }


    public static File convert(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        convFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }

    public static Polygon createPolygon(double[][] pts) {
        Polygon poly = new Polygon();
        poly.startPath(pts[0][0], pts[0][1]);
        for (int i = 1; i < pts.length; i++)
            poly.lineTo(pts[i][0], pts[i][1]);
        return poly;
    }
}
