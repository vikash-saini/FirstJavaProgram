package com.company;

interface MyCamera1{
    public void clickPicture();
}
class GPS{
    public void showLocation(){
        System.out.println("showing location");
    }
}
class Phone{

    public  void greet(){
        System.out.println("Good morning");
    }

    public  void on(){
        System.out.println("Turning on phone");
    }
}

class Smartphone extends GPS implements MyCamera1{

    public void greet1(){
        System.out.println("Good morning from Smartphone");
    }
    public  void on(){
        System.out.println("Turning on Smartphone");
    }
    public void playMusic(){
        System.out.println("Playing music...!");
    }

    @Override
    public void showLocation(){
        System.out.println("showing location with images");
    }

    @Override
    public void clickPicture() {
        System.out.println("Click picture with filter");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //    Phone obj = new Phone();
//            Smartphone obj = new Smartphone();

//        Phone obj = new Smartphone(); // yes it is allowed
//        obj.greet();
//        obj.on();
//      obj.playMusic(); // this is not allowed

        GPS obj1 = new Smartphone();
//        obj1.playmusic() -->Error -not Allowed
        obj1.showLocation();

        MyCamera1 obj2= new Smartphone();
        obj2.clickPicture();

//        obj2.playMusic() not Allowed
    }

}
