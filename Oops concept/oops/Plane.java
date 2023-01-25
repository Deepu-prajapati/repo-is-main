package oops;


//  Inheritance or tight coupling;
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

public class Plane {
    public static void main(String[] args) {
        Cargo cp = new Cargo();
        Fighter fp = new Fighter();
        Passenger pp = new Passenger();

        cp.fly();
        cp.land();
        System.out.println();
        fp.fly();
        fp.land();
        System.out.println();
        pp.fly();
        pp.land();
    }
}
