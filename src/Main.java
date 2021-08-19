 public class Main        {
         public static void main(String[] args) {
     BmiService service = new BmiService();
     double height =  1.9;
     double imt = service.calculate(height);
     System.out.println(imt);
 }
 }
