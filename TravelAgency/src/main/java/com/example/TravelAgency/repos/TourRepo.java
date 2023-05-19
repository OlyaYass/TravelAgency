package com.example.TravelAgency.repos;

import com.example.TravelAgency.models.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TourRepo extends JpaRepository<Tour, Long> {
    List<Tour> findTourByTitle(String title);
}

