package com.solvd.service.person;

import lombok.Data;

@Data
public class Client extends Person {
    private int numberOfRequests;
    private String status;

    public void setStatus(int numberOfRequests) {
        if (numberOfRequests < 5) status = "Not VIP";
        else status = "VIP";
    }

    public Client inputClientData(int id, String name, String surname, String phone, int numberOfRequests) {
        setId(id);
        setFirstName(name);
        setLastName(surname);
        setPhone(phone);
        setNumberOfRequests(numberOfRequests);
        setStatus(numberOfRequests);
        return this;
    }

    @Override
    public String toString() {
        return "Client id " + id + ": " + firstName + " " + lastName +
                ". Phone number: " + phone + ". Number of requests " + numberOfRequests +
                ". " + status + " status";
    }
}
