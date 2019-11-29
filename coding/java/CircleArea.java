class CircleArea
{
   public static void main(String []args)
   {
    int r=20;
    double result=area(r);
    System.out.println("Arra ="+result);
    double result1=circum(r);
    System.out.println("circumference = "+result1);
   }
   static double area(int r)
  {
     double result=3.14*r*r;
      return result;
  }
  static double circum(int r)
  {
     double result=2*3.14*r;
      return result;
  }
}