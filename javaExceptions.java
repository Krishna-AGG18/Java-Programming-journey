


public class javaExceptions {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println(a[0]);

        //ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 5
        // System.out.println(a[8]);
        System.out.println("Helloo guys....");

        try{
            System.out.println(5/0);
        }
        
        catch(RuntimeException e){
            // System.out.println(e.getStackTrace());   //object of stack trace elements

            System.out.println(e.getMessage());  // message print krega
 
            System.out.println(e);  // e.tostring same hotaa hai
 
        }// handles the exception no abnormal termination
        
        finally{
            System.out.println("bete raja ha ham...\nwill run always no matter exception is there or not");
            System.out.println("byeeee guys....");
        }

    }
}
