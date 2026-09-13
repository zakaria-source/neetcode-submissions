package com.zakaria.katas.tripservice;

import java.util.ArrayList;
import java.util.List;

public class TripService {
    public record Trip(String name) {}
    public static class User {
        private final List<User> friends = new ArrayList<>();
        public User addFriend(User friend) { friends.add(friend); return this; }
        public List<User> friends() { return friends; }
    }
    public static class UserNotLoggedInException extends RuntimeException {}

    // Legacy seams: tests may subclass TripService instead of touching external systems.
    protected User loggedUser() { throw new UnsupportedOperationException("Imagine static UserSession dependency"); }
    protected List<Trip> tripsBy(User user) { throw new UnsupportedOperationException("Imagine static TripDAO dependency"); }

    public List<Trip> getTripsByUser(User user) {
        List<Trip> tripList = new ArrayList<>();
        User logged = loggedUser();
        boolean isFriend = false;
        if (logged != null) {
            for (User friend : user.friends()) {
                if (friend == logged) { isFriend = true; break; }
            }
            if (isFriend) tripList = tripsBy(user);
            return tripList;
        }
        throw new UserNotLoggedInException();
    }
}
