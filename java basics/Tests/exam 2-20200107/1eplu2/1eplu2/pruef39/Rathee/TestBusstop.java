public class TestBusstop{
Busstop b = new Busstop();

public void test1(){





 
if(b.maxSeats()==40)
{System.out.println("Correct1");}
else
{System.out.println("False 1");}


if(b.registrationStartsWith("YD"))
{System.out.println("Correct2");}
else
{System.out.println("False 2");}

b.enter(30);
if(b.getSeats()=30)
{System.out.println("Correct3");}
else
{System.out.println("False 3");}

b.getBus(2);{
if(b.getPassengers()==22)
{System.out.println("Correct4");}
else
{System.out.println("False 4");}


}

b.removeBus();{
if(b.getPassengers()==20)
{System.out.println("Correct5");}
else
{System.out.println("False 5");}



}}


public void test2(){


Bus c = new Bus (15,35,"LD23 JKL ");
Bus d = new Bus (18,55,"OD76 ERT");
b.addBus(c,0);
b.addBus(c,0);
if(c!= null)System.out.println("Error 6");
b.addBus(d);
b.removeBus();{

if(!c)System.out.println("Error 7");
b.removeBus(1);
{if (result== d)System.out.println("Correct 7");}

}





}



}