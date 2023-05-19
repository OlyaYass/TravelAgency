package com.example.TravelAgency.services;

import com.example.TravelAgency.models.Tour;
import com.example.TravelAgency.repos.TourRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TourService {
    private final TourRepo tourRepo;

    public List<Tour> tourList(String title) {
        if (title != null) return tourRepo.findTourByTitle(title);
        return tourRepo.findAll();
    }

    public Tour getTourById(Long id) {
        return tourRepo.findById(id).orElse(null);
    }
}
