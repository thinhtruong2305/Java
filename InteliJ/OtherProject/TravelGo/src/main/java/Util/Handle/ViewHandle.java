package Util.Handle;

import Controller.PlanController;
import Util.Static.ObjectStorage;
import View.Main;
import View.Plan;
import View.User;

public class ViewHandle {
    private static boolean nhapTiep = true;
    private static int choose;
    private PlanController planController;

    public ViewHandle() {
        planController = new PlanController();
    }

    public void menuFeatureHandle(){
        do{
            Main.menuFeature();
            do {
                try {
                    nhapTiep = true;
                    System.out.print("Nhập lựa chọn của bạn: ");
                    choose = ObjectStorage.getScanner().nextInt();ObjectStorage.getScanner().nextLine();
                    nhapTiep = false;
                }catch(Exception ex) {
                    nhapTiep = true;
                    System.out.println("Bạn nhập sai xin bạn nhập số");
                    ObjectStorage.getScanner().nextLine();
                }
            }while(nhapTiep);
            switch (choose){
                case 1: menuDangNhapHandle();nhapTiep = true;break;
                case 2: menuPlanHandle();nhapTiep = true;break;
                case 3: User.formDangNhap();nhapTiep = true;break;
                default: System.out.println("Tạm biệt bạn");nhapTiep = false;break;
            }
        }while (nhapTiep);
    }
    public void menuDangNhapHandle(){
        do{
            Main.menuLogin();
            do {
                try {
                    nhapTiep = true;
                    System.out.print("Nhập lựa chọn của bạn: ");
                    choose = ObjectStorage.getScanner().nextInt();ObjectStorage.getScanner().nextLine();
                    nhapTiep = false;
                }catch(Exception ex) {
                    nhapTiep = true;
                    System.out.println("Bạn nhập sai xin bạn nhập số");
                    ObjectStorage.getScanner().nextLine();
                }
            }while(nhapTiep);
            switch (choose){
                case 1: User.formDangNhap();nhapTiep = true;break;
                case 2: User.formDangKi();nhapTiep = true;break;
                case 3: menuFeatureHandle();nhapTiep = true;break;
            }
        }while (nhapTiep);
    }
    public void menuPlanHandle(){
        do{
            Main.menuPlan();
            do {
                try {
                    nhapTiep = true;
                    System.out.print("Nhập lựa chọn của bạn: ");
                    choose = ObjectStorage.getScanner().nextInt();
                    nhapTiep = false;
                }catch(Exception ex) {
                    nhapTiep = true;
                    System.out.println("Bạn nhập sai xin bạn nhập số");
                    ObjectStorage.getScanner().nextLine();
                }
            }while(nhapTiep);
            switch (choose){
                case 1: Plan.formPlan();nhapTiep = true;break;
                case 2: planController.showListOfPlan();nhapTiep = true;break;
                case 3: Plan.removePlan();nhapTiep = true;break;
                case 4: menuFeatureHandle();nhapTiep = true;break;
            }
        }while (nhapTiep);
    }
    public void menuReservationHandle(){
        do{
            Main.menuPlan();
            do {
                try {
                    nhapTiep = true;
                    System.out.print("Nhập lựa chọn của bạn: ");
                    choose = ObjectStorage.getScanner().nextInt();
                    nhapTiep = false;
                }catch(Exception ex) {
                    nhapTiep = true;
                    System.out.println("Bạn nhập sai xin bạn nhập số");
                    ObjectStorage.getScanner().nextLine();
                }
            }while(nhapTiep);
            switch (choose){
                case 1: Plan.formPlan();nhapTiep = true;break;
                case 2: planController.showListOfPlan();nhapTiep = true;break;
                case 3: Plan.removePlan();nhapTiep = true;break;
                default: System.out.println("Tạm biệt bạn");nhapTiep = false;break;
            }
        }while (nhapTiep);
    }
}
