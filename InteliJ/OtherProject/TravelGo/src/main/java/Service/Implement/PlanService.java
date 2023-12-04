package Service.Implement;

import Model.DTO.Flight;
import Model.DTO.Hotel;
import Model.Database.Plan;
import Model.Enum.HotelStatus;
import Service.Interface.IPlanService;
import Util.Connection.ConnectionJDBC;
import Util.Database.Query;
import Util.Static.ObjectStorage;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlanService implements IPlanService {
    @Override
    public List<Hotel> checkFitTimeHotle(List<Hotel> hotels, LocalDateTime from, LocalDateTime to) {
        List<Hotel> result = new ArrayList<>();
        hotels.forEach(x -> {
            if(x.getCheckIn().toEpochSecond(ZoneOffset.UTC) >= from.toEpochSecond(ZoneOffset.UTC) && x.getCheckOut().toEpochSecond(ZoneOffset.UTC) <= to.toEpochSecond(ZoneOffset.UTC))
                result.add(x);
        });
        return result;
    }

    @Override
    public List<Flight> checkFitTimeFlight(List<Flight> flights, LocalDateTime from, LocalDateTime to) {
        List<Flight> result = new ArrayList<>();
        flights.forEach(x -> {
            if(x.getNgayDi().toEpochSecond(ZoneOffset.UTC) >= from.toEpochSecond(ZoneOffset.UTC) && x.getNgayDen().toEpochSecond(ZoneOffset.UTC) <= to.toEpochSecond(ZoneOffset.UTC))
                result.add(x);
        });
        return result;
    }

    @Override
    public List<Hotel> checkAvailableHotel(List<Hotel> hotels) {
        List<Hotel> availableHotels = new ArrayList<>();
        hotels.forEach(x -> {
            if(x.getStatus() == HotelStatus.READY)
                availableHotels.add(x);
        });
        return availableHotels;
    }

    public List<Plan> getAllPlan(){
        List<Plan> result;
        try {
            result = Query.getAllPlan(ConnectionJDBC.getConnection_JDBC());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public Optional<Plan> createPlan(Plan plan) {
        Plan result;
        if(ObjectStorage.getUser() == null)
            return null;
        try {
            result = Query.CreatePlan(ConnectionJDBC.getConnection_JDBC(), plan, ObjectStorage.getUser().getUserID());
            if(result == null)
                return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Optional.of(result);
    }

    @Override
    public boolean removeById(int planID) {
        try {
            if(Query.removeReservationByPlanID(ConnectionJDBC.getConnection_JDBC(), planID) && Query.removePlanByID(ConnectionJDBC.getConnection_JDBC(), planID))
                return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
