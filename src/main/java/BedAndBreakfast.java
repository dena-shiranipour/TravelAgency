public class BedAndBreakfast implements Bookable {


    private double price;
    private String customer;



    //constructors

    public BedAndBreakfast(double price, String customer) {
        this.price = price;
        this.customer = customer;
    }



    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getCustomer(){
        return customer;
    }

    public void setCustomer(String customer){
        this.customer = customer;
    }

    
}
