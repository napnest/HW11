public class Phone {
    long phoneNumber;
    String phoneModel;
    double phoneWeight;
    static String madeIn="China";
    Phone(){
    }
    Phone(long phoneNumber,String phoneModel, double phoneWeight,String madeIn){
        this.phoneNumber=phoneNumber;
        this.phoneModel=phoneModel;
        this.phoneWeight=phoneWeight;
        madeIn="South Korea";
    }
    void receiveCall(String name){
        System.out.println("Звонит абонент "+name);
    }
    void receiveCall(String name, long phoneNumber){
        System.out.println("Звонит абонент "+name+" номер "+phoneNumber);
    }
}
