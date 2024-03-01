package com.beyhan.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
