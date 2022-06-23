package com.example.musicschool.service;

import com.example.musicschool.entity.Testimonial;
import com.example.musicschool.repository.TestimonialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestimonialService {
    private final TestimonialRepository testimonialRepository;

    public Testimonial saveTestimonial(Testimonial testimonial) {

        return testimonialRepository.save(testimonial);
    }

    public List<Testimonial> findAllTestimonials() {

        return testimonialRepository.findAll();
    }

    public Optional<Testimonial> findById(int id) {
        return testimonialRepository.findById(id);

    }

    public void deleteTestimonialById(int Id){
        testimonialRepository.deleteById(Id);
    }
}
