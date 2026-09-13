package com.zakaria.katas.tripservice;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TripServiceTest {
    @Test void throwsWhenNoUserIsLoggedIn() {
        TripService service = new TestableTripService(null, List.of());
        assertThrows(TripService.UserNotLoggedInException.class,
                () -> service.getTripsByUser(new TripService.User()));
    }

    @Test void returnsNoTripsWhenUsersAreNotFriends() {
        TripService.User logged = new TripService.User();
        TripService service = new TestableTripService(logged, List.of(new TripService.Trip("Paris")));
        assertTrue(service.getTripsByUser(new TripService.User()).isEmpty());
    }

    // Your job: add the friend case, characterize behaviour, then refactor safely.
    static class TestableTripService extends TripService {
        private final User logged; private final List<Trip> trips;
        TestableTripService(User logged, List<Trip> trips) { this.logged=logged; this.trips=trips; }
        @Override protected User loggedUser() { return logged; }
        @Override protected List<Trip> tripsBy(User user) { return trips; }
    }
}
