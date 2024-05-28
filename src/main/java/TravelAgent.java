public class TravelAgent  {

    Train train;
    Customer customer;

    public boolean makeBooking () {
        if (train.capacityLimit && customer.canAffordTrain){
            customer.pay(train);
            train.addCustomer(customer);
            return true;
        } else

        {
            return false;
        }
    }

//    cancel bookings

    public boolean cancelBooking() {
        if (train.removeCustomer()){
           customer.refundCustomer(train);
           return true;
        } else {
            return false;
        }
    }



}
