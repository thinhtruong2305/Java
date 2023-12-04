package Service.Implement;

import Model.DTO.Flight;
import Model.DTO.Hotel;
import Model.Database.Reservation;
import Service.Interface.IReservationService;
import Util.Connection.ConnectionJDBC;
import Util.Database.Query;
import Util.Static.ObjectStorage;

import java.sql.SQLException;
import java.util.Optional;
import java.util.UUID;

public class ReservationService implements IReservationService {
    @Override
    public Optional<Reservation> bookFlight(Flight flight, boolean isGauranteed) {
        Reservation result;
        Reservation reservation = new Reservation(flight.getNgayDi(), flight.getNgayDen(),null , flight.getMaChuyenBay(), false, isGauranteed);
        try {
            result = Query.createReservation(ConnectionJDBC.getConnection_JDBC(), reservation, ObjectStorage.getPlan().getPlanID());
            if(result == null)
                return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Optional.of(result);
    }

    @Override
    public Optional<Reservation> bookHotel(Hotel hotel, boolean isGauranteed) {
        Reservation result;
        Reservation reservation = new Reservation(hotel.getCheckIn(), hotel.getCheckOut(), UUID.randomUUID().toString(), null, isGauranteed, false);
        try {
            result = Query.createReservation(ConnectionJDBC.getConnection_JDBC(), reservation, ObjectStorage.getPlan().getPlanID());
            if(result == null)
                return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Optional.of(result);
    }
}
