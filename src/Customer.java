public class Customer extends Person {

    private String miasto;

    private int wydatki;

    public Customer(String imie, String nazwisko, String miasto, int wydatki) {
        super(imie, nazwisko);
        this.miasto = miasto;
        this.wydatki = wydatki;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }


    public int getWydatki() {
        return wydatki;
    }

    public void setWydatki(int wydatki) {
        this.wydatki = wydatki;
    }

    public void getInfo() {
        System.out.println(getImie());
        System.out.println(getNazwisko());
        System.out.println(getMiasto());
        System.out.println(getWydatki());

    }
}

