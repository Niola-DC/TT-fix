package com.example.triptix.service;

import com.example.triptix.model.*;
import com.example.triptix.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private DestinationRepository destinationRepository;

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private TripRepository tripRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private SeatRepository seatRepository;

    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }

    public List<VehicleType> getAllVehicleTypes() {
        return vehicleTypeRepository.findAll();
    }

    public List<Trip> getAvailableTrips() {
        return tripRepository.findAll();
    }

    public Ticket bookTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
    public List<Seat> getAvailableSeats() {
        return seatRepository.findAll();
    }
}
