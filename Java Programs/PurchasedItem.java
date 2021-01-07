//19BCE10179
//Naman Shrivastava
//Lab Assignment
class PurchaseItem {
protected String name;
protected double unitprice;

public PurchaseItem (String name , double unitprice) {
this.name = name;
this.unitprice = unitprice;
}
public PurchaseItem() {
name = "no item" ;
unitprice = 0;
}
public double getunitprice() {
return unitprice;
}
public String getname() {
return name;
}
public void setName(String newName){
this.name = newName;
}
public void setuniteprice(double newuniteprice){
this.unitprice = newuniteprice;
}
public String toString(){
return "\nitem name:" + name + "@" + "\nuniteprice:" + unitprice;
}

}
class WeighedItem extends PurchaseItem {
private double kg;
public WeighedItem(String name , double unitprice , double kg) {
super (name , unitprice);
this.kg = kg;
}
public double getunitprice() {
return unitprice;
}
public String toString() {
return "\nitem name:" + name + "@" +"item weight:" + kg + "\nuniteprice:" + unitprice;
}




}
class counteditem extends PurchaseItem {
private int quantity;
public counteditem(String name , double unitprice , int quantity) {
super (name , unitprice);
this.quantity = quantity;
}
public double getunitprice() {
return unitprice+quantity;
}
public String toString() {
return "\nitem name:" + name + "@" +"quantity:" + quantity + "\nunitprice:" + unitprice;
}
}
public class PurchaseItem {
	public static void main(String[] args) 
		{
			PurchaseItem A = new PurchaseItem("Banana",4.12);
			WeighedItem B = new WeighedItem("Banana",4.12,4.11);
			PurchaseItem C = new PurchaseItem("pens",3.6);
			counteditem D = new counteditem("pens",3.6,45);

			System.out.println(B);
			System.out.println(D);
	}
}