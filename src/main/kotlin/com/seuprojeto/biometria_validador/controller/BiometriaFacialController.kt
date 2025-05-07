package com.seuprojeto.biometria.controller

import com.seuprojeto.biometria.model.BiometriaFacial
import com.seuprojeto.biometria.service.BiometriaFacialService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/biometria/facial")
class BiometriaFacialController(
    private val biometriaFacialService: BiometriaFacialService
) {

    @PostMapping
    fun processarBiometriaFacial(@RequestBody biometria: BiometriaFacial): ResponseEntity<BiometriaFacial> {
        val resultado = biometriaFacialService.processarBiometriaFacial(biometria)
        return ResponseEntity.ok(resultado)
    }

    @GetMapping
    fun listarTodas(): ResponseEntity<List<BiometriaFacial>> {
        val lista = biometriaFacialService.listarTodas()
        return ResponseEntity.ok(lista)
    }

    @GetMapping("/")
    fun index(): String {
        return "Bem-vindo à API de Biometria Facial!";
    }
}