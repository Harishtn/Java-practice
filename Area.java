class Area
{


public static void main(String args[])
{

Area square=new Area();
Area rectangle=new Area();
int result=square.calculate(40); //parameter
System.out.println(result);
rectangle.calculate(40,30);

}
int calculate(int a)
{

return a*a;

}
void calculate(int len, int br)
{

System.out.println(len*br);

}


}
