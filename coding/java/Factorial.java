class Factorial
{
   public static void main(String []args)
   {
    int num=5;
    int factorial=factorial(num);
    System.out.println("Factorial ="+factorial);
   }
   static int factorial(int num)
  {
     int fact=1;
     while(num>0)
     {
       fact=fact*num;
        num--;
     }
    return fact;
  }
}