class Bike
{

//Fields- Global Variables
// -static, -non-static

static int dealer_id = 1234;  
static String owner_name = "Kumar";
int price;  //declaration ---->non-static
int cc;
float discount; //Data members

public static void main(String [] args)

{

Bike shine   = new Bike(); //new allocates memory
Bike activa  = new Bike();
Bike unicorn = new Bike();

shine.price=65000;
activa.price=80000;
unicorn.price=125000;

shine.discount=5.03f;
activa.discount=1.0f;
unicorn.discount=2.0f;
activa.buy(125000);  //Method calling statement
shine.buy(1500000);

Bike.offer();  //class calling
offer();       //direct calling
shine.offer(); //Object calling

System.out.println(shine.price);

System.out.println(Bike.owner_name);
System.out.println(unicorn.owner_name);
System.out.println(owner_name);


}   

void buy(int amount)
{        //Method local variable

System.out.println("Buying Bike Bike for Rs."+amount);  //+ is concardination
//System.out.println(amount);

}

static void offer()
{

System.out.println("10% discount");

}

}
