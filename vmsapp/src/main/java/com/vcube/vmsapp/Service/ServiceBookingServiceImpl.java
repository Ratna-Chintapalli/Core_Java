package com.vcube.vmsapp.Service;

import java.util.List;

import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.vcube.vmsapp.model.ServiceBooking;
import com.vcube.vmsapp.repo.ServiceBookingRepository;

@Service
public class ServiceBookingServiceImpl implements ServiceBookingService {

    private final ServiceBookingRepository repo;

    public ServiceBookingServiceImpl(ServiceBookingRepository repo) {
        this.repo = repo;
    }

    // ✅ ASCENDING ORDER HERE
    private Pageable getPageable(int pageNo, int pageSize) {
        return PageRequest.of(pageNo, pageSize, Sort.by("bookingId").ascending());
    }

    @Override
    public Page<ServiceBooking> getBookingsPaginated(int pageNo, int pageSize) {
        return repo.findAll(getPageable(pageNo, pageSize));
    }

    @Override
    public Page<ServiceBooking> searchBookings(String vehicleNumber, int pageNo, int pageSize) {
        if (vehicleNumber == null) vehicleNumber = "";
        return repo.findByVehicleNumberContaining(vehicleNumber, getPageable(pageNo, pageSize));
    }

    @Override
    public Page<ServiceBooking> filterBookings(String status, int pageNo, int pageSize) {
        return repo.findByStatus(status, getPageable(pageNo, pageSize));
    }

    @Override
    public Page<ServiceBooking> searchAndFilter(String vehicleNumber, String status, int pageNo, int pageSize) {
        if (vehicleNumber == null) vehicleNumber = "";
        return repo.findByVehicleNumberContainingAndStatus(vehicleNumber, status, getPageable(pageNo, pageSize));
    }

    @Override
    public List<ServiceBooking> getAllBookings() {
        return repo.findAll(Sort.by("bookingId").ascending()); // optional but consistent
    }

    @Override
    public ServiceBooking saveBooking(ServiceBooking booking) {
        return repo.save(booking);
    }

    @Override
    public ServiceBooking getBookingById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteBooking(int id) {
        repo.deleteById(id);
    }

    @Override
    public Page<ServiceBooking> getBookings(int page) {
        return repo.findAll(getPageable(page, 5)); // uses ASC
    }
}