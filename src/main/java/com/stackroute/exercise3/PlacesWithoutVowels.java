package com.stackroute.exercise3;
//Program to print Strings without vowels
public class PlacesWithoutVowels {
    public static String[] convertPlaceNamesWithoutVowels(String[] places) {

        for (int i = 0; i < places.length; i++) {
            places[i]= places[i].replaceAll("[aeiouAEIOU]", "");
        }
        return places;
    }


}
