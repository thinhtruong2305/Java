package Service.Interface;

import Model.DTO.Flight;
import Model.DTO.Hotel;
import Model.Database.Plan;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface IPlanService {
    public List<Hotel> checkFitTimeHotle(List<Hotel> hotels, LocalDateTime from, LocalDateTime to);
    public List<Flight> checkFitTimeFlight(List<Flight> flights, LocalDateTime from, LocalDateTime to);
    public List<Hotel> checkAvailableHotel(List<Hotel> hotels);
    public List<Plan> getAllPlan();
    public Optional<Plan> createPlan(Plan plan);
    public boolean removeById(int planID);
}
