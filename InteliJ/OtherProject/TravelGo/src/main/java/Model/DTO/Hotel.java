package Model.DTO;

import Model.Enum.HotelStatus;

import java.time.LocalDateTime;

public class Hotel {
    private int room;
    private HotelStatus status;
    private String name;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    public Hotel() {
    }

    public Hotel(int room, HotelStatus status, String name, LocalDateTime checkIn, LocalDateTime checkOut) {
        this.room = room;
        this.status = status;
        this.name = name;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public HotelStatus getStatus() {
        return status;
    }

    public void setStatus(HotelStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
