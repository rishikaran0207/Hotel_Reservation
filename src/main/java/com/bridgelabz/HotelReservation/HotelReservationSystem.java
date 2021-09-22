package com.bridgelabz.HotelReservation;
import java.text.SimpleDateFormat;
import java.util.Date;
public class HotelReservationSystem {
    String hotel;
    String customer;
    HotelReservationSystem(){
        hotel = " ";
        customer = " ";
    }
    HotelReservationSystem(String hotel,String customer){
        this.hotel = hotel;
        this.customer = customer;
    }
    void hotelDetails() {
        if (hotel == "LakeWood") {
            int rate = 110;
            System.out.println("Rate of Regular Customers of LakeWood Hotel:" + rate);
        }
        if (hotel == "BridgeWood") {
            int rate = 160;
            System.out.println("Rate of Regular Customers of BridgeWood Hotel:" + rate);
        }
        if (hotel == "RidgeWood") {
            int rate = 220;
            System.out.println("Rate of Regular Customers of RidgeWood Hotel:" + rate);
        }
    }
    void cheapestHotel(){
        int count=0;
        count = (count+2);
        int LakeWood_Rate = 110, BridgeWood_Rate = 160, RidgeWood_Rate = 220;
        LakeWood_Rate = (LakeWood_Rate*count);
        BridgeWood_Rate = (BridgeWood_Rate*count);
        RidgeWood_Rate = (RidgeWood_Rate*count);
        if (LakeWood_Rate<BridgeWood_Rate && LakeWood_Rate<RidgeWood_Rate){
            System.out.println("Cheapest hotel: LakeWood");
            System.out.println(LakeWood_Rate);
        }
        if (BridgeWood_Rate<LakeWood_Rate && BridgeWood_Rate<RidgeWood_Rate){
            System.out.println("Cheapest hotel: BridgeWood");
            System.out.println(BridgeWood_Rate);
        }
        if (RidgeWood_Rate<BridgeWood_Rate && RidgeWood_Rate<LakeWood_Rate){
            System.out.println("Cheapest hotel: RidgeWood");
            System.out.println(RidgeWood_Rate);
        }
    }

    public void weekday_weekend_rate(){
        if (hotel == "LakeWood") {
            int weekday_rate = 110;
            int weekend_rate = 90;
            System.out.println("Weekday Rate of Regular Customers of LakeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of LakeWood Hotel:" + weekend_rate);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 150;
            int weekend_rate = 50;
            System.out.println("Weekday Rate of Regular Customers of BridgeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of BridgeWood Hotel:" + weekend_rate);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 220;
            int weekend_rate = 150;
            System.out.println("Weekday Rate of Regular Customers of RidgeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of RidgeWood Hotel:" + weekend_rate);
        }
    }

    public static void main(String[] args) throws Exception {
        HotelReservationSystem hotel1 = new HotelReservationSystem("LakeWood","Regular");
        HotelReservationSystem hotel2 = new HotelReservationSystem("BridgeWood","Regular");
        HotelReservationSystem hotel3 = new HotelReservationSystem("RidgeWood","Regular");
        hotel1.hotelDetails();
        hotel2.hotelDetails();
        hotel3.hotelDetails();
        String sDate1="22-09-2021";
        String sDate2="23-09-2021";
        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
        System.out.println(sDate1+"\t"+date1);
        System.out.println(sDate2+"\t"+date2);
        HotelReservationSystem hotel = new HotelReservationSystem();
        hotel.cheapestHotel();
        hotel1.weekday_weekend_rate();;
        hotel2.weekday_weekend_rate();
        hotel3.weekday_weekend_rate();
    }
}
