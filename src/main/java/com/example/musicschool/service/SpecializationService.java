package com.example.musicschool.service;

import com.example.musicschool.entity.Specialization;
import com.example.musicschool.repository.SpecializationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SpecializationService {
    private final SpecializationRepository specializationRepository;

    public Specialization saveSpecialization(Specialization specialization) {
        return specializationRepository.save(specialization);
    }

    public List<Specialization> findAllSpecializations() {
        return specializationRepository.findAll();
    }

    public Optional<Specialization> findById(int id) {
        return specializationRepository.findById(id);
    }

}
