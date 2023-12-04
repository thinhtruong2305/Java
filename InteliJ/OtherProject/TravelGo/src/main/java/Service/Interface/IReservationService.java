package Service.Interface;

import Model.DTO.Flight;
import Model.DTO.Hotel;
import Model.Database.Reservation;

import java.util.Optional;

public interface IReservationService {
    public Optional<Reservation> bookFlight(Flight flight, boolean isGauranteed);
    public Optional<Reservation> bookHotel(Hotel hotel, boolean isGauranteed);
}
