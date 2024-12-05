package com.Elysian_Escapade.Elysian_Escapade_Hotel.service.interface;

import com.Elysian_Escapade.Elysian_Escapade_Hotel.dto.Response;
import com.Elysian_Escapade.Elysian_Escapade_Hotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
