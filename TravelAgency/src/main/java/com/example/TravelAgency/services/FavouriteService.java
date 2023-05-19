package com.example.TravelAgency.services;

import com.example.TravelAgency.models.Favourite;
import com.example.TravelAgency.models.Tour;
import com.example.TravelAgency.repos.FavouriteRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FavouriteService {
    private final FavouriteRepo favouriteRepo;

    public void saveTour(Favourite favourite) {
        favouriteRepo.save(favourite);
    }

    public List<Favourite> favouriteList() {
        return favouriteRepo.findAll();
    }

    public void deleteTour(Long id) {
        favouriteRepo.deleteById(id);
    }
}
