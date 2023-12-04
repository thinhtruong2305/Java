package Util.Database;

import Model.Database.Reservation;
import Model.Database.Plan;
import Model.Database.User;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Query {
    public static User findUserByUserNamePassword(Connection connection, String userName, String password) throws SQLException {
        String query = "SELECT * FROM travelgo.users  WHERE UserName = ? AND Password = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, userName);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int userID = resultSet.getInt("UserID");
            String email = resultSet.getNString("Email");
            String phoneNumber = resultSet.getNString("PhoneNumber");
            User user = new User(userID, userName, password, phoneNumber, email);
            return user;
        }
        return null;
    }
    public static User createUser(Connection connection, User user) throws SQLException{
        String query = "INSERT INTO travelgo.users (Password, PhoneNumber, Email, UserName) VALUES(?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getPassword());
        preparedStatement.setString(2, user.getPhoneNumber());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setString(4, user.getUserName());
        int record = preparedStatement.executeUpdate();

        if (record > 0) {
            return user;
        }
        return null;
    }
    public static Plan CreatePlan(Connection connection, Plan plan, int userID) throws SQLException{
        String query = "INSERT INTO travelgo.plans (UserID, StartDate, EndDate, PAX, Place) VALUES(?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, userID);
        preparedStatement.setDate(2, Date.valueOf(plan.getStartDate()));
        preparedStatement.setDate(3, Date.valueOf(plan.getEndDate()));
        preparedStatement.setInt(4, plan.getPAX());
        preparedStatement.setString(5, plan.getPlace());
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return plan;
        }
        return null;
    }
    public static List<Plan> getAllPlan(Connection connection) throws SQLException{
        String query = "SELECT * FROM travelgo.plans";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        List<Plan> plans = new ArrayList<>();
        while (resultSet.next()) {
            int planID = resultSet.getInt("PlanID");
            int userID = resultSet.getInt("UserID");
            String place = resultSet.getNString("Place");
            int PAX = resultSet.getInt("PAX");
            LocalDate checkIn = LocalDate.parse(resultSet.getNString("CheckIn"));
            LocalDate checkOut = LocalDate.parse(resultSet.getNString("CheckOut"));
            plans.add(new Plan(planID, userID, checkIn, checkOut, PAX, place));
        }
        return plans;
    }
    public static boolean removePlanByID(Connection connection, int planID) throws SQLException{
        String query = "DELETE FROM travelgo.plans WHERE PlanID = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, planID);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            System.out.println("Đã xóa kế hoạch thành công");
            return true;
        }
        return false;
    }
    public static Reservation createReservation(Connection connection, Reservation reservation, int planID) throws SQLException{
        String query = "INSERT INTO travelgo.reservations (PlanID, CheckIn, CheckOut, ReservationNoOfHotel, ReservationNoOffFlight, IsGauranteedOfHotel, IsGauranteedOfFlight) VALUES(?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, planID);
        preparedStatement.setTimestamp(2, Timestamp.valueOf(reservation.getCheckIn()));
        preparedStatement.setTimestamp(3, Timestamp.valueOf(reservation.getCheckOut()));
        preparedStatement.setString(4, reservation.getReservationNoOfHotel());
        preparedStatement.setString(5, reservation.getReservationNoOfFlight());
        preparedStatement.setBoolean(6, reservation.isGauranteedOfHotel());
        preparedStatement.setBoolean(7, reservation.isGauranteedOfFlight());
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return reservation;
        }
        return null;
    }
    public static boolean removeReservationByID(Connection connection, int reservationID) throws SQLException{
        String query = "DELETE FROM travelgo.reservations WHERE ReservationID = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, reservationID);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            System.out.println("Đã hủy đặt vé thành công");
            return true;
        }
        return false;
    }
    public static boolean removeReservationByPlanID(Connection connection, int planID) throws SQLException{
        String query = "DELETE FROM travelgo.reservations WHERE PlanID = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, planID);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return true;
        }
        return false;
    }
}
