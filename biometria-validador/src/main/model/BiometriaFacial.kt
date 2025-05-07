package com.seuprojeto.biometria.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "biometria_facial")
data class BiometriaFacial(
    @Id
    val id: String? = null,

    val imagemBase64: String, // Imagem da face codificada em base64
    val metadados: MetadadosImagem,

    val validado: Boolean,
    val fraudeDetectada: Boolean,

    val motivoFraude: String? = null,

    val dataProcessamento: LocalDateTime = LocalDateTime.now()
)

data class MetadadosImagem(
    val formato: String,
    val tamanhoKb: Double,
    val dataCaptura: String?,          // ISO 8601, se disponível
    val fabricanteDispositivo: String?,
    val localizacao: String?           // GPS ou local aproximado, se disponível
)
