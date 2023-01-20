package oops;

class Book{
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
}
class Bike{
    private String name;
    private int mileage;
    public Bike(String name, int mileage) {
        this.name = name;
        this.mileage = mileage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

}

class Heart{
    private float wt;
    private int bpm;
    public Heart(float wt, int bpm) {
        this.wt = wt;
        this.bpm = bpm;
    }
    public float getWt() {
        return wt;
    }
    public void setWt(float wt) {
        this.wt = wt;
    }
    public int getBpm() {
        return bpm;
    }
    public void setBpm(int bpm) {
        this.bpm = bpm;
    } 
}

class Brain{
    private float wt;
    private String color;
    public Brain(float wt, String color) {
        this.wt = wt;
        this.color = color;
    }
    public float getWt() {
        return wt;
    }
    public void setWt(float wt) {
        this.wt = wt;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

class Student{
    Heart h = new Heart(250, 72);
    Brain b = new Brain(200, "Gray");

    void book(Book b){
        System.out.println(b.getAuthor());
        System.out.println(b.getName());
    }
    void bike(Bike bi){
        System.out.println(bi.getName());
        System.out.println(bi.getMileage());
    }
}

public class AggreAndComp {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.h.getBpm());
        System.out.println(s.h.getWt());

        System.out.println();

        System.out.println(s.b.getWt());
        System.out.println(s.b.getColor());
       
    }
}
