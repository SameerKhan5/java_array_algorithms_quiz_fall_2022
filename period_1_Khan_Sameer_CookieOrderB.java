// Sameer Khan
// Cookie Order B

public int removeVariety(String cookieVar) {
   int numBoxesRemoved = 0;
   for (int i = this.orders.size() - 1; i >= 0; i--) {
       CookieOrder thisOrder = this.orders.get(i);
       if(cookieVar.equals(thisOrder.getVariety())) {
           numBoxesRemoved += thisOrder.getNumBoxes();
           this.orders.remove(i);
       }
   }
   return numBoxesRemoved;
}
