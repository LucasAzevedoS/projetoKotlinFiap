package com.seuprojeto.biometria.service

import com.seuprojeto.biometria.model.BiometriaFacial
import com.seuprojeto.biometria.repository.BiometriaFacialRepository
import org.springframework.stereotype.Service

@Service
class BiometriaFacialService(
    private val repository: BiometriaFacialRepository
) {
    fun processarBiometria(biometria: BiometriaFacial): BiometriaFacial {

        val resultado = biometria.copy(
            validado = !biometria.fraudeDetectada,
            dataProcessamento = biometria.dataProcessamento
        )


        return repository.save(resultado)
    }

    fun listarTodas(): List<BiometriaFacial> = repository.findAll()
}


//package com.seuprojeto.biometria.service
//
//import com.seuprojeto.biometria.model.BiometriaFacial
//import org.springframework.stereotype.Service
//import java.time.LocalDateTime
//import java.util.*
//
//@Service
//class BiometriaFacialService {
//    private val registrosEmMemoria = mutableListOf<BiometriaFacial>()
//
//    fun processarBiometria(biometria: BiometriaFacial): BiometriaFacial {
//        val idGerado = UUID.randomUUID().toString()
//
//        val fraude = simularFraude(biometria.imagemBase64)
//        val motivo = if (fraude) "Padrões faciais inconsistentes (simulação de deepfake)" else null
//
//        val resultado = biometria.copy(
//            id = idGerado,
//            fraudeDetectada = fraude,
//            validado = !fraude,
//            motivoFraude = motivo,
//            dataProcessamento = LocalDateTime.now()
//        )
//
//        registrosEmMemoria.add(resultado)
//        return resultado
//    }
//
//    fun listarTodas(): List<BiometriaFacial> = registrosEmMemoria
//
//    private fun simularFraude(imagemBase64: String): Boolean {
//        return imagemBase64.contains("fraude", ignoreCase = true) ||
//                imagemBase64.contains("fake", ignoreCase = true)
//    }
//}
