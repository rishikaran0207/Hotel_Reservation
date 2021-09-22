package com.bridgelabz.HotelReservation;

public class HotelReservationSystem {
    String hotel;
    String customer;
    HotelReservationSystem(String hotel,String customer){
        this.hotel = hotel;
        this.customer = customer;
    }
    void hotelDetails(){
        if (hotel == "LakeWood"){
            int rate = 110;
            System.out.println("Rate of Regular Customers of LakeWood Hotel:"+rate);
        }
        if (hotel == "BridgeWood"){
            int rate = 160;
            System.out.println("Rate of Regular Customers of BridgeWood Hotel:"+rate);
        }
        if (hotel == "RidgeWood"){
            int rate = 220;
            System.out.println("Rate of Regular Customers of RidgeWood Hotel:"+rate);
        }
    }
    public static void main(String[] args){
        HotelReservationSystem hotel1 = new HotelReservationSystem("LakeWood","Regular");
        HotelReservationSystem hotel2 = new HotelReservationSystem("BridgeWood","Regular");
        HotelReservationSystem hotel3 = new HotelReservationSystem("RidgeWood","Regular");
        hotel1.hotelDetails();
        hotel2.hotelDetails();
        hotel3.hotelDetails();
    }
}
