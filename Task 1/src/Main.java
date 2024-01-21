public class Main {
    public static void main(String[] args) {

    Phone nokia = new Phone(" 7777", "nokia", 12.5);
        nokia.receiveCall("Иван ");
        System.out.println("Номер телефона: " + nokia.number + " Модель телефона: " + nokia.model +
                " Вес телефона: " + nokia.weight);
    nokia.manufacturerСountry = "Japan";
    nokia.country();


    Phone samsung = new Phone(" 9999", "samsung", 55.2);
        samsung.receiveCall("Саша ");
    System.out.println("Номер телефона: " + samsung.number + " Модель телефона: " + samsung.model +
                " Вес телефона: " + samsung.weight);
        samsung.manufacturerСountry = "Japan";
        samsung.country();


    }
}
