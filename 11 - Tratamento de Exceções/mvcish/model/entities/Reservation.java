package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;

public class Reservation {
    private Integer roomNumber; 
    private LocalDate checkIn; 
    private LocalDate checkOut; 

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {};
    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        } // Programação defensiva - boa prática

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut; 
    };

    public LocalDate getCheckIn() {
        return checkIn;
    }
    public LocalDate getCheckOut() {
        return checkOut;
    }
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long duration() {
        return Duration.between(checkOut, checkIn).toDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
        if ((checkIn.isBefore(LocalDate.now())) || (checkOut.isBefore(LocalDate.now()))) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room" + roomNumber + ", check-in: " + fmt.format(checkIn) + ", check-out: " + fmt.format(checkOut) + ", " + duration() + " nights";
    }
}
