package oops;


// Loose coupling to achieve True Polymorphism
class MyPlane{

    void fly(){
        System.out.println("My plane is Fly at mid heigth");
    }
    void land(){
        System.out.println("my plane is land");
    }
}

class Cargo extends MyPlane{

    void fly(){
        System.out.println("cargo plane in also fly");
    }
    void land(){
        System.out.println("cargo plane is also land");
    }
}
class Fighter extends Cargo{
    void fly(){
        System.out.println("fighter plane is fly at high heigth");
    }
    void land(){
        System.out.println("fighter plane is land at low space");
    }
}

class Passenger extends Fighter{
    void fly(){
        System.out.println("passenger plane fly is medium latitude");
    }
    void land(){
        System.out.println("passenger plane land at big track size");
    }
}

public class LooseCoupling {
    public static void main(String[] args) {

        Cargo cp = new Cargo();
        Fighter fp = new Fighter();
        Passenger pp = new Passenger();

        MyPlane ref;
        ref = cp;
        ref.fly();
        ref.land();

        ref = fp;
        ref.fly();
        ref.land();

        ref = pp;
        ref.fly();
        ref.land();
    }
}
