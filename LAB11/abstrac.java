abstract class shape
{
 double l,b,a;
 abstract double area(double l,double b);
}

class rectangle extends shape
{
 double area(double l,double b)
 {
  this.l=l;
  this.b=b;
  this.a=this.l*this.b;
  return a;
 }
}

class triangle extends shape
{
 double area(double l,double b)
 {
  this.l=l;
  this.b=b;
  this.a=0.5*this.l*this.b;
  return a;
 }
}

class abstrac
{
 public static void main(String args[])
 {
  rectangle ob1=new rectangle();
  triangle ob2=new triangle();
  System.out.println(ob1.area(2.5,2.5));
  System.out.println(ob2.area(2.5,2.5));
 }
}