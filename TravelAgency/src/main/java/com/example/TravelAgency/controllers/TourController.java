package com.example.TravelAgency.controllers;

import com.example.TravelAgency.models.Tour;
import com.example.TravelAgency.services.TourService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class TourController {
    private final TourService tourService;

    @GetMapping("/")
    public String tours(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("tours", tourService.tourList(title));
        return "tours";
    }

    @GetMapping("/tour/{id}")
    public String tourInfo(@PathVariable Long id, Model model) {
        model.addAttribute("tour", tourService.getTourById(id));
        return "tour-info";
    }
}
