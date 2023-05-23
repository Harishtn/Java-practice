class Store
{

public static void main(String[] args)
{

int amount=1000;
Store myself=new Store();
myself.purchase(amount);  //Pass by value


}
void purchase(int cash)
{

System.out.println("Came to Store with "+ cash);
}

}


