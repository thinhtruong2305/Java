package Model.Database;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Plan {
    private int planID;
    private int userID;
    private LocalDate startDate;
    private LocalDate endDate;
    private int PAX;
    private String place;

    public Plan() {
    }

    public Plan(int userID, LocalDate startDate, LocalDate endDate, int PAX, String place) {
        this.userID = userID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.PAX = PAX;
        this.place = place;
    }

    public Plan(int planID, int userID, LocalDate startDate, LocalDate endDate, int PAX, String place) {
        this.planID = planID;
        this.userID = userID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.PAX = PAX;
        this.place = place;
    }

    public int getPlanID() {
        return planID;
    }

    public void setPlanID(int planID) {
        this.planID = planID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getPAX() {
        return PAX;
    }

    public void setPAX(int PAX) {
        this.PAX = PAX;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
