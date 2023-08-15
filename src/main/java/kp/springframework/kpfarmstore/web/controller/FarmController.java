package kp.springframework.kpfarmstore.web.controller;

import kp.springframework.kpfarmstore.web.model.FarmDto;
import kp.springframework.kpfarmstore.web.services.FarmService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/farm")
@RestController
public class FarmController {

    private final FarmService farmService;

    public FarmController(FarmService farmService) {
        this.farmService = farmService;
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<FarmDto> getFarmEssential(@PathVariable("id") UUID id){

        return new ResponseEntity<>(farmService.getFarmEssentialById(id), HttpStatus.OK);
    }
}
