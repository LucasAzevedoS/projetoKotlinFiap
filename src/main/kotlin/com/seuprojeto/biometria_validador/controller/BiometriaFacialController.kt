package com.seuprojeto.biometria_validador.controller

import com.seuprojeto.biometria_validador.model.BiometriaFacial
import com.seuprojeto.biometria_validador.service.BiometriaFacialService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/biometria")
class BiometriaFacialController(
    private val service: BiometriaFacialService
) {

    @PostMapping
    fun cadastrar(@RequestBody biometria: BiometriaFacial): ResponseEntity<BiometriaFacial> {
        val salvo = service.registrar(biometria)
        return ResponseEntity.ok(salvo)
    }

    @GetMapping
    fun listar(): ResponseEntity<List<BiometriaFacial>> {
        return ResponseEntity.ok(service.listar())
    }
}
