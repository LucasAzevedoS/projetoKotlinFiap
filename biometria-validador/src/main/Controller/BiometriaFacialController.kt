package com.seuprojeto.biometria.controller

import com.seuprojeto.biometria.model.BiometriaFacial
import com.seuprojeto.biometria.service.BiometriaFacialService
import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/facial")
class BiometriaFacialController(
    private val biometriaFacialService: BiometriaFacialService
) {

    init {
        logger.info("Controller BiometriaFacialController iniciado")
    }

    @PostMapping
    fun processarBiometriaFacial(@RequestBody biometria: BiometriaFacial): ResponseEntity<BiometriaFacial> {
        val resultado = biometriaFacialService.processarBiometria(biometria)
        return ResponseEntity.ok(resultado)
    }


    @GetMapping("/listarTodos")
    fun listarTodas(): ResponseEntity<List<BiometriaFacial>> {
        val lista = biometriaFacialService.listarTodas()
        return ResponseEntity.ok(lista)
    }
}
