public class Customer {

    //properties

    private String name;
    private double wallet;

    //constructors

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    //methods
    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

//    pay


    public boolean canAffordTrain(Train train) {

        if (this.wallet >= train.getPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public void pay(Train train) {
        if (canAffordTrain(train)) {
            this.wallet -= train.getPrice();
        }
    }

//    public double refund(Train train) {
//        if (train.removeCustomer(this.name)) {
//            this.wallet += train.getPrice();
//            return this.wallet;
//        }
//    }

}




