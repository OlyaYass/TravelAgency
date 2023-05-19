package com.example.TravelAgency.repos;

import com.example.TravelAgency.models.Favourite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavouriteRepo extends JpaRepository<Favourite, Long> {
}
