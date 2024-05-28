import java.util.ArrayList;
import java.util.List;

public class Train {


    //properties
    private double price;
    private int capacity;
    private ArrayList<Customer> customerCollection;


    //constructor
    public Train(double price, int capacity){
        this.price = price;
        this.capacity = capacity;
        this.customerCollection = new ArrayList<>();
    }


    //methods (getters and setters)
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public ArrayList<Customer> getCustomers(){
        return customerCollection;
    }

    public void setCustomers(ArrayList<Customer> customerCollection){
        this.customerCollection = customerCollection;
    }

    public void addCustomer (Customer newCustomer){
        this.customerCollection.add(newCustomer);
    }

    public int customerCount (){
       return this.customerCollection.size();
    }

    public boolean capacityLimit(){
        if (customerCollection.size() < capacity){
            return true;
        }
        else return false;
    }

}
