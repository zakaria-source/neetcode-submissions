package com.zakaria.katas.movierental;

import java.util.ArrayList;
import java.util.List;

public class MovieRental {
    public static final int REGULAR=0, NEW_RELEASE=1, CHILDRENS=2;
    public record Movie(String title, int priceCode) {}
    public record Rental(Movie movie, int daysRented) {}

    private final String customer;
    private final List<Rental> rentals = new ArrayList<>();
    public MovieRental(String customer) { this.customer = customer; }
    public void addRental(Rental rental) { rentals.add(rental); }

    // Fowler-style legacy statement method. Refactor in small safe steps.
    public String statement() {
        double total = 0; int points = 0;
        String result = "Rental Record for " + customer + "\n";
        for (Rental rental : rentals) {
            double amount = 0;
            switch (rental.movie().priceCode()) {
                case REGULAR -> { amount += 2; if (rental.daysRented() > 2) amount += (rental.daysRented()-2)*1.5; }
                case NEW_RELEASE -> amount = rental.daysRented()*3;
                case CHILDRENS -> { amount += 1.5; if (rental.daysRented() > 3) amount += (rental.daysRented()-3)*1.5; }
                default -> throw new IllegalArgumentException("Unknown price code");
            }
            points++;
            if (rental.movie().priceCode()==NEW_RELEASE && rental.daysRented()>1) points++;
            result += "\t" + rental.movie().title() + "\t" + amount + "\n";
            total += amount;
        }
        return result + "Amount owed is " + total + "\nYou earned " + points + " frequent renter points";
    }
}
