class Shape
{
public void rs()
{
System.out.println("area"+98);
}}
class Rect extends Shape
{
public void area()
{
System.out.println("area of rect");
}}
class Area{
public static void main (String[] args)
{
Rect hh=new Rect();
hh.rs();
hh.area();
}
}

