public interface Bookable {

   double getPrice();
   boolean book(int hasCapacity);
   void book(Customer cancel);
//   void book(Customer book);
}
