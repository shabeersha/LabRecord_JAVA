class a
{
 a()
 {
  System.out.println("a class constructor");
 }
}
class b extends a
{
 b()
 {
  System.out.println("b class constructor");
 }
}
class c extends b
{
 c()
 {
  System.out.println("c class constructor");
 }
}
class multi_inh
{
 public static void main(String args[])
 {
  c ob=new c();
 }
}