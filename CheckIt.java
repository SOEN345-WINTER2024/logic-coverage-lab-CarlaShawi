public class CheckIt
{

   // Modified to return boolean for easier testing
   public static boolean checkIt(boolean a, boolean b, boolean c) {
      return a || (b && c);
   }
   
   public static void main (String []argv)
   {  // Driver method for checkIt
      // Read an array from standard input, call checkIt()
      boolean []inArr = new boolean [argv.length];
      if (argv.length != 3)
      {
         System.out.println ("Usage: java checkIt v1 v2 v3");
         return;
      }
   
      for (int i = 0; i< argv.length; i++)
      {
         inArr [i] = Boolean.parseBoolean(argv[i]);
      }
   
      checkIt (inArr[0], inArr[1], inArr[2]);
   }
}
