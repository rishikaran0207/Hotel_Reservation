package com.bridgelabz.HotelReservation;

import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservationSystem obj = new HotelReservationSystem("LakeWood","Regular");
    HotelReservationSystem cheap_hotel = new HotelReservationSystem();
    @Test
    public void toCheck_HotelDetails() {
        obj.hotelDetails();
    }
    @Test
    public void toCheck_CheapHotel() {
        cheap_hotel.cheapestHotel();
    }
}
