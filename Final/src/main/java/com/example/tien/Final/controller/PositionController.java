package com.example.tien.Final.controller;

import com.example.tien.Final.Dto.PositionDto;
import com.example.tien.Final.entity.Position;
import com.example.tien.Final.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PositionController {
    @Autowired
    private PositionService service;
    @GetMapping("/Positions")
    private List<PositionDto> findAllPosition(){
        return service.getPosition();
    }
    @GetMapping("/Position/{name}")
    private Position findAllByName(@PathVariable String name){
        return service.getPositionByName(name);
    }
    @PostMapping("/addPosition")
    private Position addPosition(@RequestBody PositionDto position){
        return service.savePosition(position);
    }

    @PostMapping("/addPositions")
    private List<Position> addPositions(@RequestBody List<Position> positions){
        return service.savePositions(positions);
    }
    @PutMapping("/updatePosition/{id}")
    private PositionDto updatePosition(@PathVariable int id ,@RequestBody PositionDto positionDto){
        positionDto.setId(id);
        return service.updatePosition(positionDto);
    }
    @DeleteMapping("/deletePosition/{id}")
    private String deletePosition(@PathVariable int id){
        return service.deletePosition(id);
    }
//    @DeleteMapping("/positions")
//    private ResponseEntity<String> deleteAll(){
//        service.deleteAllPosition();
//        return ResponseEntity.ok("Delete all position");
//    }
}
