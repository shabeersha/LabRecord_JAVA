class ascending extends Thread
{
 public void run()
 {
  int i;
  for(i=0;i<=15;i++)
  {
   System.out.println(i);
  }
 }
}

class descending extends Thread
{
 public void run()
 {
  int i;
  for(i=15;i>=0;i--)
  { 
   System.out.println(i);
  }
 }
}

class thread1
{
 public static void main(String args[])
 {
  ascending t1=new ascending();
  descending t2=new descending();
  t1.start();
  t2.start();
 }
}