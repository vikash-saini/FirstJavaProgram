package com.company;

interface Camera{
    void takesnap();
    void recordVideo();

//    interfaces can also have private methods which cannot be accesible within the class directly.
//    private void greet(){
//        System.out.println("Good mornining");
//    }
    /*With default keyword we can declare some methods in interface. it is not necessary for Class to implement the default methods
    * but default methods can be override from the class where the interface is implemented */
    default void record4kvideo(){
//        greet();
        System.out.println("recording 4k video...");
    }

}
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellphone{
    void callNumber(int phonenumber){
        System.out.println("calling a number..." + phonenumber);
    }
    void pickCall(){
        System.out.println("picking call");
    }
}
class MySmartphone extends MyCellphone implements Wifi,Camera{

    @Override
    public void takesnap() {

    }

    @Override
    public void recordVideo() {

    }

//    @Override
//    public void record4kvideo() {
//        System.out.println("overriding the default method");
//    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList ={"Harry","Vikas","Dinesh"};

        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {

    }
}
public class InterfaceExamples {
    public static void main(String[] args) {

        MySmartphone ms  = new MySmartphone();
        String[] arr = ms.getNetworks();
        for(String item:arr){
            System.out.println(item);
        }
        ms.record4kvideo();
//        ms.greet(); --> throw an error,coz it is a private
    }
}
