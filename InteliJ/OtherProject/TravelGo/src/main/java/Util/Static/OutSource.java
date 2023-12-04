package Util.Static;

import Model.DTO.Flight;
import Model.DTO.Hotel;
import Model.Enum.HotelStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OutSource {
    public static List<Flight> getSourceFlights(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("ABC", "AB123", LocalDateTime.of(2021, 5, 12, 9, 45), LocalDateTime.of(2021, 5, 13, 14, 20 )));
        flights.add(new Flight("ABC", "AB124", LocalDateTime.of(2021, 5, 12, 12, 00), LocalDateTime.of(2021, 5, 13, 13, 20 )));
        flights.add(new Flight("JKF", "KF123", LocalDateTime.of(2021, 8, 15, 21, 45), LocalDateTime.of(2021, 8, 16, 02, 30 )));
        flights.add(new Flight("UBT", "AF0376", LocalDateTime.of(2021, 2, 15, 14, 15), LocalDateTime.of(2021, 5, 13, 17, 10 )));
        return flights;
    }
    public static List<Hotel> getSourceHotels(){
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel(108, HotelStatus.READY,"Dibbert - Dietrich",null,null));
        hotels.add(new Hotel(104, HotelStatus.OWNED,"Heaney LLC",LocalDateTime.of(2023, 10, 19, 14, 00),LocalDateTime.of(2023, 10, 26, 12,00)));
        hotels.add(new Hotel(106, HotelStatus.FIXING,"Balistreri, Friesen and Carroll",null,null));
        hotels.add(new Hotel(109, HotelStatus.READY,"Bosco - Conroy",null,null));
        hotels.add(new Hotel(105, HotelStatus.READY,"Wolff, Schmitt and Carroll",null,null));
        hotels.add(new Hotel(103, HotelStatus.OWNED,"Wolff - Fahey",LocalDateTime.of(2023, 7, 1, 14, 00),LocalDateTime.of(2023, 6, 20, 12,00)));
        hotels.add(new Hotel(107, HotelStatus.CLEANING,"Zemlak - Beier",null,null));
        return hotels;
    }
}
