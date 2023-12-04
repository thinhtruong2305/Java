package Model.Database;

import java.time.LocalDateTime;

public class Reservation {
    private int reservationID;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private String reservationNoOfHotel;
    private String reservationNoOfFlight;
    private boolean isGauranteedOfHotel;
    private boolean isGauranteedOfFlight;

    public Reservation() {
    }

    public Reservation(LocalDateTime checkIn, LocalDateTime checkOut, String reservationNoOfHotel, String reservationNoOfFlight, boolean isGauranteedOfHotel, boolean isGauranteedOfFlight) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.reservationNoOfHotel = reservationNoOfHotel;
        this.reservationNoOfFlight = reservationNoOfFlight;
        this.isGauranteedOfHotel = isGauranteedOfHotel;
        this.isGauranteedOfFlight = isGauranteedOfFlight;
    }

    public Reservation(int reservationID, LocalDateTime checkIn, LocalDateTime checkOut, String reservationNoOfHotel, String reservationNoOfFlight, boolean isGauranteedOfHotel, boolean isGauranteedOfFlight) {
        this.reservationID = reservationID;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.reservationNoOfHotel = reservationNoOfHotel;
        this.reservationNoOfFlight = reservationNoOfFlight;
        this.isGauranteedOfHotel = isGauranteedOfHotel;
        this.isGauranteedOfFlight = isGauranteedOfFlight;
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public String getReservationNoOfHotel() {
        return reservationNoOfHotel;
    }

    public void setReservationNoOfHotel(String reservationNoOfHotel) {
        this.reservationNoOfHotel = reservationNoOfHotel;
    }

    public String getReservationNoOfFlight() {
        return reservationNoOfFlight;
    }

    public void setReservationNoOfFlight(String reservationNoOfFlight) {
        this.reservationNoOfFlight = reservationNoOfFlight;
    }

    public boolean isGauranteedOfHotel() {
        return isGauranteedOfHotel;
    }

    public void setGauranteedOfHotel(boolean gauranteedOfHotel) {
        isGauranteedOfHotel = gauranteedOfHotel;
    }

    public boolean isGauranteedOfFlight() {
        return isGauranteedOfFlight;
    }

    public void setGauranteedOfFlight(boolean gauranteedOfFlight) {
        isGauranteedOfFlight = gauranteedOfFlight;
    }
}
