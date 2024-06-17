package com.example.triptix.controller;

import com.example.triptix.model.*;
import com.example.triptix.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TicketController {

    @Autowired
    private TicketService ticketingService;

    @GetMapping("/destinations")
    public List<Destination> getAllDestinations() {
        return ticketingService.getAllDestinations();
    }

    @GetMapping("/vehicle-types")
    public List<VehicleType> getAllVehicleTypes() {
        return ticketingService.getAllVehicleTypes();
    }

    @GetMapping("/trips")
    public List<Trip> getAvailableTrips() {
        return ticketingService.getAvailableTrips();
    }
    @GetMapping("/seats")
    public List<Seat> getAvailableSeats() {
        return ticketingService.getAvailableSeats();
    }

    @PostMapping("/tickets")
    public Ticket bookTicket(@RequestBody Ticket ticket) {
        return ticketingService.bookTicket(ticket);
    }
}
