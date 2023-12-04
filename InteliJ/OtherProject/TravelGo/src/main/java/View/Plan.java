package View;

import Controller.PlanController;
import Model.DTO.Flight;
import Model.DTO.Hotel;
import Util.Static.ObjectStorage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Plan {
    private static PlanController planController = new PlanController();
    public static void listOfHotelAndFlight(List<Hotel> hotels, List<Flight> flights){
        System.out.println("\t\t\tBảng khách sạn");
        System.out.println("Tên khách sạn \t\t\t Phòng \t\t\t Trạng thái");
        for (Hotel hotel : hotels) {
            System.out.println(hotel.getName() + "\t" + hotel.getRoom() + "\t" + hotel.getStatus());
        }
        System.out.println("\t\t\tBảng chuyến bay");
        System.out.println("Hãng \t\t\t Mã chuyến bay \t\t\t Ngày giờ khởi hành \t\t\t Ngày giờ hạ cánh");
        for (Flight flight : flights) {
            System.out.println(flight.getHang() + "\t" + flight.getMaChuyenBay() + "\t" + flight.getNgayDi() + "\t" + flight.getNgayDen());
        }
    }
    public static void listOfPlan(List<Model.Database.Plan> plans){
        System.out.println("\t\t\tBảng kế hoạch");
        System.out.println("Địa điểm \t\t\t Số lượng khách \t\t\t Ngày bắt đầu \t\t\t Ngày kết thúc");
        for (Model.Database.Plan plan : plans) {
            System.out.println(plan.getPlace() + "\t" + plan.getPAX() + "\t" + plan.getStartDate() + "\t" + plan.getEndDate());
        }
    }
    public static void formPlan(){
        System.out.println("\t\tChào mừng bạn đến với TravelGo");
        System.out.print("Nhập tên địa điểm: ");
        String place = ObjectStorage.getScanner().nextLine();
        System.out.print("Nhập tên số lượng người: ");
        int PAX = ObjectStorage.getScanner().nextInt();ObjectStorage.getScanner().nextLine();
        System.out.print("Nhập tên ngày bắt đầu: ");
        String checkIn = ObjectStorage.getScanner().nextLine();
        System.out.print("Nhập tên ngày kết thúc: ");
        String checkOut = ObjectStorage.getScanner().nextLine();
        planController.savePlan(new Model.Database.Plan(ObjectStorage.getUser().getUserID(), LocalDateTime.parse(checkIn, DateTimeFormatter.ofPattern("dd-MM-yyyy")).toLocalDate(), LocalDateTime.parse(checkOut, DateTimeFormatter.ofPattern("dd-MM-yyyy")).toLocalDate(), PAX, place));
        planController.showListOfFlightAndHotel(LocalDateTime.parse(checkIn, DateTimeFormatter.ofPattern("dd-MM-yyyy")), LocalDateTime.parse(checkOut, DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
    public static void removePlan(){
        System.out.println("\t\tChào mừng bạn đến với TravelGo");
        System.out.print("Nhập ID: ");
        int ID = ObjectStorage.getScanner().nextInt();
        planController.removePlan(ID);
    }
}
