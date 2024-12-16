package com.Elysian_Escapade.Elysian_Escapade_Hotel.service.interface;

import com.Elysian_Escapade.Elysian_Escapade_Hotel.dto.Response;
import com.Elysian_Escapade.Elysian_Escapade_Hotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}

package com.Elysian_Escapade.Elysian_Escapade_Hotel.service.interface;

import com.Elysian_Escapade.Elysian_Escapade_Hotel.dto.Response;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface IRoomService {

    Response addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice, String description);

    List<String> getAllRoomTypes();

    Response getAllRooms();

    Response deleteRoom(Long roomId);

    Response updateRoom(Long roomId, String description, String roomType, BigDecimal roomPrice, MultipartFile photo);

    Response getRoomById(Long roomId);

    Response getAvailableRoomsByDataAndType(LocalDate checkInDate, LocalDate checkOutDate, String roomType);

    Response getAllAvailableRooms();
}

package com.Elysian_Escapade.Elysian_Escapade_Hotel.service.interface;

import com.Elysian_Escapade.Elysian_Escapade_Hotel.dto.LoginRequest;
import com.Elysian_Escapade.Elysian_Escapade_Hotel.dto.Response;
import com.Elysian_Escapade.Elysian_Escapade_Hotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
