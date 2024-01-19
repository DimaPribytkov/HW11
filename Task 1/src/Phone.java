public class Phone {

    String number;
    String model;
    double weight;

    static String manufacturerСountry;

    public Phone(){}

    public Phone (String number,  String model, double weight){
    this.number = number;
    this.model = model;
    this.weight = weight;
    }

    public void receiveCall(String nameAbonent) {
       receiveCall(nameAbonent, "Null");
    }

    public void receiveCall (String nameAbonent, String number){

        System.out.println("Звонит абонент по имени " + nameAbonent + (number == "Null" ? "" : number));
    }
    public void country (){

        System.out.println("Страна производитель: " + manufacturerСountry);
    }

}
