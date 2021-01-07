import java.util.*;
class Customer{
    private String name;
    private String address;
  public Customer(String a,String b) {
        this.name = a;
        this.address = b;
    }
     public String getCustomerName() { 
        return this.name; 
    } 
     public String getCustomerAddress() { 
        return this.address; 
    } 
}
class Order { 
    private String status; 
     private String date; 
     String Item1,Item2,Item3;
     double ItemPrice1, ItemPrice2, ItemPrice3;
    double ItemWeight1, ItemWeight2, ItemWeight3;
double Subtotal, Tax, TotalWeight,Total;
     Order(String c,String d)  { 
        this.status = c; 
        this.date=d;
    } 
    public String getOrderStatus() { 
        return this.status; 
    } 
    public String getOrderDate() { 
        return this.date; 
    } 
    double calcSubTotal() {
        Scanner sc= new Scanner(System.in);
      System.out.println("Enter first item: ");
Item1 = sc.nextLine();
System.out.println("Enter second item: ");
Item2 = sc.nextLine();
System.out.println("Enter third item: ");
Item3 = sc.nextLine();
System.out.println("Enter the price of the first item:  ");
ItemPrice1 = sc.nextDouble();
System.out.println("Enter the price of the second item:  ");
ItemPrice2 = sc.nextDouble();
System.out.println("Enter the price of the third item: ");
ItemPrice3 = sc.nextDouble();
System.out.println("Enter the weight of the first item:  ");
ItemWeight1 = sc.nextDouble(); 
 System.out.println("Enter the weight of the second item:  ");
ItemWeight2 = sc.nextDouble(); 
System.out.println("Enter the weight of the third item:  ");
ItemWeight3 = sc.nextDouble(); 
Subtotal = ItemPrice1 + ItemPrice2 + ItemPrice3; //System.out.println("Subtotal:\n"+Subtotal);
return Subtotal;
}
double calcTax() {
   Tax = Subtotal * 0.07;  //   System.out.println("Sales Tax:\n" +Tax); 
      return Tax;
    }
    double calcTotal() {
        Total = Subtotal+Tax; //System.out.println("Total Amount:\n"+Total);
return Total;
}
double calcTotalWeight() {
    TotalWeight = ItemWeight1 + ItemWeight2 + ItemWeight3;   //  System.out.println("Total Weight:\n"+ TotalWeight);
    return TotalWeight;
}
}
public class CustomerC { 
   public static void main(String []args) { 
        Customer cus = new Customer("Naman ","Shrivastava"); 
        Order ob = new Order("Shipping","24/01/21"); 
        System.out.println(cus.getCustomerName()+"\n"+cus.getCustomerAddress()+
               " Subtotal " +ob.calcSubTotal()+"\nTax	"+ob.calcTax()+"\nTotal  "+ob.calcTotal()+"\nTotalweight	"+ob.calcTotalWeight()); 
    } 
}