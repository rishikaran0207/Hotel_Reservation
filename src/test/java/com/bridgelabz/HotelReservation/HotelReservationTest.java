package com.bridgelabz.HotelReservation;

import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservationSystem obj_hotel1 = new HotelReservationSystem("LakeWood","Regular");
    HotelReservationSystem obj_hotel2 = new HotelReservationSystem("BridgeWood","Regular");
    HotelReservationSystem obj_hotel3 = new HotelReservationSystem("RidgeWood","Regular");
    HotelReservationSystem cheap_hotel = new HotelReservationSystem();
    @Test
    public void toCheck_HotelDetails() {
        obj_hotel1.hotelDetails();
    }
    @Test
    public void toCheck_CheapHotel() {
        cheap_hotel.cheapestHotel();
    }
    @Test
    public void toCheck_Weekday_Weekend_Rate() {
        obj_hotel1.weekday_weekend_rate();
        obj_hotel2.weekday_weekend_rate();
        obj_hotel3.weekday_weekend_rate();
    }
    @Test
    public void toCheck_Cheapest_Weekday_Weekend_Hotel() {
        obj_hotel1.cheapest_weekday_weekend_hotel();
        obj_hotel2.cheapest_weekday_weekend_hotel();
        obj_hotel3.cheapest_weekday_weekend_hotel();
    }
}
