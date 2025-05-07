//package com.seuprojeto.biometria.service
//
//import com.seuprojeto.biometria.model.BiometriaFacial
//import com.seuprojeto.biometria.repository.BiometriaFacialRepository
//import org.springframework.stereotype.Service
//
//@Service
//class BiometriaFacialService(
//    private val repository: BiometriaFacialRepository
//) {
//    fun processarBiometria(biometria: BiometriaFacial): BiometriaFacial {
//        // Aqui futuramente vamos fazer validações (formato, deepfake etc.)
//        val resultado = biometria.copy(
//            validado = biometria.fraudeDetectada,
////            dataProcessamento = biometria.dataProcessamento
//        )
//
//        // Salva o resultado no banco
//        return repository.save(resultado)
//    }
//
//    fun listarTodas(): List<BiometriaFacial> = repository.findAll()
//}

package com.seuprojeto.biometria.service

import com.seuprojeto.biometria.model.BiometriaFacial
import org.springframework.stereotype.Service

@Service
class BiometriaFacialService {
    fun processarBiometriaFacial(biometria: BiometriaFacial): BiometriaFacial {
        // Lógica mock ou real
        return biometria.copy(validado = true)
    }

    fun listarTodas(): List<BiometriaFacial> {
        return listOf()
    }
}