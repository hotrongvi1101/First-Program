
package midterm;

import java.util.ArrayList;
import java.util.Scanner;

public class BikeList {
    ArrayList<Bike> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Bike bike;
    public void addNew(){
        int type=0, a=1;
        while(a==1){
            System.out.println("Ban muon them loai xe nao:");
            System.out.println("1: Honda\t2: Yamaha");
            type = sc.nextInt();
            if(type == 1){
                bike = new Bike_Honda();
                bike.Input();
                list.add(bike);
            }
            if(type == 2){
                bike = new Bike_Yamaha();
                bike.Input();
                list.add(bike);
            }
            System.out.println("Ban muon them xe nua khong: ");
            System.out.println("1: Co\t2: Khong");
            a = sc.nextInt();
        }
    }
    public void Update(){
        String id="";
        System.out.print("Moi nhap ID xe can update: ");
        id = sc.nextLine();
        for(Bike bike:list){
            if(bike.getBikeID().equals(id)){
                if(bike instanceof Bike_Honda){
                    System.out.println("Thong tin cu: ");
                    bike.Output();  
                    System.out.println("Moi nhap lai thong tin moi: ");
                    bike.Input();
                }
                if(bike instanceof Bike_Honda){
                    System.out.println("Thong tin cu: ");
                    bike.Output();  
                    System.out.println("Moi nhap lai thong tin moi: ");
                    bike.Input();
                }
                
            }
        }
    }
    public void Delete(){
        String id="";
        System.out.print("Moi nhap ID xe can update: ");
        id = sc.nextLine();
        for(Bike bike:list){
            if(bike.getBikeID().equals(id)){
                if(bike instanceof Bike_Honda){
                    list.remove(bike);
                }
                if(bike instanceof Bike_Honda){
                    list.remove(bike);
 
                }
                
            }
        }
    }
    public void Find(){
        String id="";
        System.out.print("Moi nhap ID xe can update: ");
        id = sc.nextLine();
        for(Bike bike:list){
            if(bike.getBikeID().equals(id)){
                if(bike instanceof Bike_Honda){
                    bike.Output();
                }
                if(bike instanceof Bike_Honda){
                    bike.Output();
 
                }
                
            }
        }
    }
    public void Menu(){
        int choice = 0, a =1;
        while(a==1){
            System.out.println("Ban muon chon chuc nang nao: ");
            System.out.println("1: AddNew\t2: Update\t3: Delete\t4:Find");
            choice = sc.nextInt();
        
            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    Update();
                    break;
                case 3:
                    Delete();
                    break;
                case 4:
                    Find();
                    break;
            }
            System.out.println("Ban muon su dung them chuc nang nua khong: ");
            System.out.println("1: Co\t2: Khong");
            a = sc.nextInt();
        }
    }
    
}
