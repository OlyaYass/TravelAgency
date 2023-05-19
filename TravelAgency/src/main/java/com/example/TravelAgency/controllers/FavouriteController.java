package com.example.TravelAgency.controllers;

import com.example.TravelAgency.models.Favourite;
import com.example.TravelAgency.models.Tour;
import com.example.TravelAgency.repos.TourRepo;
import com.example.TravelAgency.services.FavouriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class FavouriteController {
    private final FavouriteService favouriteService;
    private final TourRepo tourRepo;

    @PostMapping("/favours/add/{id}")
    public String tours(@PathVariable(value = "id") Long id) {
        Favourite favourite = new Favourite();
        Optional<Tour> tour = tourRepo.findById(id);
        favourite.setTitle(tour.get().getTitle());
        favourite.setPrice(tour.get().getPrice());
        favouriteService.saveTour(favourite);
        return "redirect:/";
    }

    @GetMapping("/favours")
    public String favTours(Model model) {
        model.addAttribute("favTours", favouriteService.favouriteList());
        return "favourite";
    }

    @PostMapping("favours/delete/{id}")
    public String deleteFavourite(@PathVariable Long id) {
        favouriteService.deleteTour(id);
        return "redirect:/favours";
    }

    @PostMapping("favours/order")
    public String order() {
        if (favouriteService.favouriteList().isEmpty()) return "order-null";
        for (Favourite fav : favouriteService.favouriteList()) {
            favouriteService.deleteTour(fav.getId());
        }
        return "order-info";
    }
}
