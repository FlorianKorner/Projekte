public class TestHexa{


public void test1(){


Hexa h = new Hexa();

h.print();

if(Math.abs(h.getCircumference()-6)<0.0001 )

{System.out.println ("Correct 1 ");}
else 
{System.out.println ("Error 1 ");}


if (Math.abs(h.getArea()-2.598)<0.0001)

{System.out.println ("Correct 2 ");}
else 
{System.out.println ("Error 2 ");}

}

public void test2(){

Hexa h2 = new Hexa(3.0);
h2.print();
h2.setSide(3.0);
if(h2.getSide()== 3.0)
        {System.out.println("Correct 3");}
        else {

            System.out.println("Error 3");}

if(Math.abs(h2.getCircumference()-18)<0.0001 )

{System.out.println ("Correct 4 ");}
else 
{System.out.println ("Error 4 ");}


if (Math.abs(h2.getArea()-23.3826)<0.0001)

{System.out.println ("Correct 5 ");}
else 
{System.out.println ("Error 5");}





}












}