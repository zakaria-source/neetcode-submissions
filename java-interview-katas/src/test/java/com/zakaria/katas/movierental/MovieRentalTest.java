package com.zakaria.katas.movierental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovieRentalTest {
    @Test void statementKeepsExistingBehaviour() {
        var customer = new MovieRental("Zakaria");
        customer.addRental(new MovieRental.Rental(new MovieRental.Movie("Matrix", MovieRental.REGULAR), 3));
        String statement = customer.statement();
        assertTrue(statement.contains("Matrix\t3.5"));
        assertTrue(statement.contains("Amount owed is 3.5"));
        assertTrue(statement.contains("1 frequent renter points"));
    }
}
