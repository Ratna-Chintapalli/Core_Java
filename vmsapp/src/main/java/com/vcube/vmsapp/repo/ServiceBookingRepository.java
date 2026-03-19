package com.vcube.vmsapp.repo;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.vmsapp.model.ServiceBooking;

public interface ServiceBookingRepository extends JpaRepository<ServiceBooking, Integer> {

    // ✅ Custom query methods (Spring will implement automatically)

    Page<ServiceBooking> findByVehicleNumberContaining(String vehicleNumber, Pageable pageable);

    Page<ServiceBooking> findByStatus(String status, Pageable pageable);

    Page<ServiceBooking> findByVehicleNumberContainingAndStatus(String vehicleNumber, String status, Pageable pageable);
}