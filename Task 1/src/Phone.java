public class Phone {
    int phoneNumber;
    String phoneModel;
    double phoneWeight;
    static String madeIn="China";
    Phone(){
    }
    Phone(int phoneNumber,String phoneModel, double phoneWeight,String madeIn){
        this.phoneNumber=phoneNumber;
        this.phoneModel=phoneModel;
        this.phoneWeight=phoneWeight;
    }
    void receiveCall(String name){
        System.out.println("Звонит абонент "+name);
    }
    void receiveCall(String name, int phoneNumber){
        System.out.println("Звонит абонент "+name+" номер "+phoneNumber);
    }
}
