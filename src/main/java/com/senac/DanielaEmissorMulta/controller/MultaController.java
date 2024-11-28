package com.senac.DanielaEmissorMulta.controller;

import com.senac.DanielaEmissorMulta.dto.MultaDTO;
import com.senac.DanielaEmissorMulta.service.MultaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/multa")
public class MultaController {
    private final MultaService multaService;

    public MultaController(MultaService multaService) {
        this.multaService = multaService;
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<MultaDTO> deleteMulta(@PathVariable int id) {
        multaService.enviarMultaParaRemocao(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
