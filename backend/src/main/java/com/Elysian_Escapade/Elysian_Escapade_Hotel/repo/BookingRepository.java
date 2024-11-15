package com.Elysian_Escapade.Elysian_Escapade_Hotel.repo;

import com.Elysian_Escapade.Elysian_Escapade_Hotel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
//extend
public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
