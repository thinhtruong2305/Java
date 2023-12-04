package Controller;

import Model.Database.Plan;
import Service.Implement.PlanService;
import Service.Interface.IPlanService;
import Util.Static.ObjectStorage;
import Util.Static.OutSource;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Optional;

public class PlanController {
    private IPlanService planService;

    public PlanController() {
        planService = new PlanService();
    }

    public void showListOfFlightAndHotel(LocalDateTime from, LocalDateTime to){
        View.Plan.listOfHotelAndFlight(planService.checkFitTimeHotle(planService.checkAvailableHotel(OutSource.getSourceHotels()), from, to), planService.checkFitTimeFlight(OutSource.getSourceFlights(), from, to));
    }

    public void showListOfPlan(){
        View.Plan.listOfPlan(planService.getAllPlan());
    }

    public boolean savePlan(Plan plan){
        Optional<Plan> result = planService.createPlan(plan);
        if(result.isPresent()){
            ObjectStorage.setPlan(result.get());
            System.out.println("Tạo kế hoạch thành công");
            return true;
        }else{
            System.out.println("Tạo kế hoạch thất bại");
            return false;
        }
    }
    public boolean removePlan(int planID){
        if(planService.removeById(planID)){
            System.out.println("Hủy kế hoạch thành công");
            return true;
        }else{
            System.out.println("Hủy kế hoạch thất bại");
            return false;
        }
    }
}
