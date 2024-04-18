
package midterm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hotro
 */
public abstract class Bike implements IMotoBike{
    private String bikeID;
    private String manufacturer;
    private Date entryDate;
    private double price;
    private double num;
    public abstract double discount();

    public Bike(String bikeID, String manufacturer, Date entryDate, double price, double num) {
        this.bikeID = bikeID;
        this.manufacturer = manufacturer;
        this.entryDate = entryDate;
        this.price = price;
        this.num = num;
    }

    public Bike() {
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat datefm = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Moi nhap bike ID: ");
        bikeID = sc.nextLine();
        System.out.print("Moi nhap Manufacturer: ");
        manufacturer = sc.nextLine();
        System.out.print("Moi nhap entry date: ");
        try {
            entryDate = datefm.parse(sc.nextLine());
        } catch (ParseException ex) {
            System.out.println("Phai nhap theo dinh dang dd/MM/yyyy");
        }
        System.out.print("Moi nhap Price: ");
        price = sc.nextDouble();
        System.out.print("Moi nhap Num: ");
        num = sc.nextDouble();
    }
    public void Output(){
        System.out.println("ID: "+bikeID);
        System.out.println("Manufacturer: "+manufacturer);
        System.out.println("Entry Date: "+entryDate);
        System.out.println("Price: "+ price);
        System.out.println("Num: "+num);
    }
    public String getBikeID() {
        return bikeID;
    }

    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
    
}
