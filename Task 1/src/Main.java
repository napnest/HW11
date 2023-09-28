public class Main {
    public static void main(String[] args) {
        Phone phoneOne = new Phone(54321, "Huawei", 2.5, "Japan");
        System.out.println("Номер телефона: " + phoneOne.phoneNumber + ", Модель телефона: " +
                phoneOne.phoneModel + ", Вес телефона: " + phoneOne.phoneWeight + ", Сделано в " +
                Phone.madeIn);
        Phone phoneTwo = new Phone();
        phoneTwo.phoneNumber=12345;
        phoneTwo.phoneModel="Poko";
        phoneTwo.phoneWeight=2.1;
        Phone.madeIn="Taiwan";
        System.out.println("Номер телефона: " + phoneTwo.phoneNumber + ", Модель телефона: " +
                phoneTwo.phoneModel + ", Вес телефона: " + phoneTwo.phoneWeight + ", Сделано в " +
                Phone.madeIn);

    }
}
