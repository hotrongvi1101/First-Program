
package midterm;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bike_Honda extends Bike {
    private String state;

    public Bike_Honda(String bikeID, String manufacturer, Date entryDate, double price, double num) {
        super(bikeID, manufacturer, entryDate, price, num);
    }

    public Bike_Honda() {
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        sc.nextLine();
        System.out.print("Moi nhap State: ");
        state = sc.nextLine();
    }
    public void Output(){
        System.out.println("ID: "+getBikeID());
        System.out.println("Manufacturer: "+getManufacturer());
        System.out.println("Entry Date: "+getEntryDate());
        System.out.println("Price: "+ getPrice());
        System.out.println("Num: "+getNum());
        System.out.println("State: "+getState());
    }
    @Override
    public double totalBill(){
        return getNum()*getPrice()*discount();
    }
    @Override
    public double discount(){
        if("new".equals(state)){
            return getNum()*getPrice()*10/100;
        }
        if("old".equals(state)){
            return getNum()*getPrice()*50/100;
        }
        else 
            return 0;
    }
}
