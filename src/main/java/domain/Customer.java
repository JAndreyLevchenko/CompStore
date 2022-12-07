package domain;

import domain.enums.Role;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Customer {

    UUID id = UUID.randomUUID();
    String firstName;
    String lastName;
    Set<Order> orders;
    Contacts contacts;
    Role role = Role.SIMPLE_CUSTOMER;
    List<ShipingAddress> addresses;


}