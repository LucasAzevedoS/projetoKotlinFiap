package com.seuprojeto.biometria_validador.service

import com.seuprojeto.biometria_validador.model.BiometriaFacial
import com.seuprojeto.biometria_validador.repository.BiometriaFacialRepository
import org.springframework.stereotype.Service

@Service
class BiometriaFacialService(
    private val repository: BiometriaFacialRepository
) {
    fun registrar(biometria: BiometriaFacial): BiometriaFacial {
        return repository.salvar(biometria)
    }

    fun listar(): List<BiometriaFacial> = repository.listarTodos()
}
