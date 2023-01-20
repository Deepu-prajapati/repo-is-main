package Staticconcept;

/**
 * Static
 */
public class Statics{

    public static class Phone{

        String modelNo;
        int count;
        static int Scount;

        Phone(String modelNo){
            this.modelNo = modelNo;
            count++;
            Scount++;
        }
    }
    

    public static void main(String[] args) {
        
        Phone iPhone = new Phone("14 pro");
        Phone piexel = new Phone("new pro");
        Phone nokia = new Phone("3310");

        System.out.println(iPhone.count);
        System.out.println(piexel.count);
        System.out.println(nokia.count);
    }
}