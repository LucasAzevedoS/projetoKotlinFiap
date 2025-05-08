package com.seuprojeto.biometria_validador.repository

import com.seuprojeto.biometria_validador.model.BiometriaFacial
import org.springframework.stereotype.Repository

@Repository
class BiometriaFacialRepository {
    private val dados = mutableListOf<BiometriaFacial>()
    private var idCounter = 1L

    fun salvar(biometria: BiometriaFacial): BiometriaFacial {
        val novaBiometria = biometria.copy(id = idCounter++)
        dados.add(novaBiometria)
        return novaBiometria
    }

    fun listarTodos(): List<BiometriaFacial> = dados
}
