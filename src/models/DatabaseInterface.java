package models;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseInterface {
    Connection getConnection() throws SQLException;

    void selectAirports();

    void selectPlanes();

    void selectFlights();

    void selectTickets();

    void showAirports();

    void showPlanes();

    void showFlights();

    void showTickets();

    void addTicket(Ticket ticket);

    void deleteTicket(Ticket ticket);

    void updateTicket(Ticket ticket);

    default void showDatabase() {
        showAirports();
        System.out.println();
        showPlanes();
        System.out.println();
        showFlights();
        System.out.println();
        showTickets();
    }
}
