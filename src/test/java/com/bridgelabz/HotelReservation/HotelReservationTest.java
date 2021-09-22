package com.bridgelabz.HotelReservation;

import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservationSystem obj = new HotelReservationSystem("LakeWood","Regular");

    @Test
    public void toCheck_HotelDetails() {
        obj.hotelDetails();
    }
}
