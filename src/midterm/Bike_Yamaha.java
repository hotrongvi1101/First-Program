
package midterm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bike_Yamaha extends Bike {
    private double surcharge;

    public Bike_Yamaha(String bikeID, String manufacturer, Date entryDate, double price, double num) {
        super(bikeID, manufacturer, entryDate, price, num);
    }

    public Bike_Yamaha() {
    }
    
    public double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat datefm = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Moi nhap bike ID: ");
        setBikeID(sc.nextLine());
        System.out.print("Moi nhap Manufacturer: ");
        setManufacturer(sc.nextLine());
        System.out.print("Moi nhap entry date: ");
        try {
            setEntryDate( datefm.parse(sc.nextLine()));
        } catch (ParseException ex) {
            System.out.println("Phai nhap theo dinh dang dd/MM/yyyy");
        }
        System.out.print("Moi nhap Price: ");
        setPrice(sc.nextDouble());
        System.out.print("Moi nhap Num: ");
        setNum(sc.nextDouble());
        System.out.print("Moi nhap Surcharge: ");
        surcharge = sc.nextDouble();
    }
    public void Output(){
        System.out.println("ID: "+getBikeID());
        System.out.println("Manufacturer: "+getManufacturer());
        System.out.println("Entry Date: "+getEntryDate());
        System.out.println("Price: "+ getPrice());
        System.out.println("Num: "+getNum());
        System.out.println("Surcharge: "+getSurcharge());
    }
    @Override
    public double totalBill(){
        return getNum()*getPrice()+surcharge-discount();
    }
    @Override
    public double discount(){
        return getNum()*getPrice()*5/100;
    }
}
