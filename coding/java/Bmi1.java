class Bmi1
{
   public static void main(String []args)
   {
      int weight=70;
      double height=5.5;
      double bmi=weight/(height*height);
      if(bmi>=30 && bmi<=39.9)
      {
         System.out.println("you are in obese range");
      }
       else if(bmi>=25)
       {
            System.out.println("you are in over weight range");
       }
        else if(bmi>=18.5)
       {
            System.out.println("you are in healthy weight range");
       }
       else if(bmi<=18.5)
       {
            System.out.println("you are in underweight range");
       }
   }
}