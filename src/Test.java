public class Test {

    public static void main(String[] args) {


        Customer customer = new Customer("Jan", "Kowalski", "Wrocław", 2500);
        Customer customer1 = new Customer("Zofia", "Bogacka", "Warszawa", 1000);

        customer.getInfo();
        customer1.getInfo();


    }
}
