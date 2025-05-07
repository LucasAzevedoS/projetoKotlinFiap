package com.seuprojeto.biometria.repository

import com.seuprojeto.biometria.model.BiometriaFacial
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

interface BiometriaFacialRepository: MongoRepository<BiometriaFacial, String> {
}