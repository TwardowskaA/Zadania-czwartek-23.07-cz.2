public class Employee extends Person {

    private String pesel;
    private String telefon;

    private double wyplata;

    public Employee(String imie, String nazwisko, String pesel, String telefon, double wyplata) {
        super(imie, nazwisko);
        this.pesel = pesel;
        this.telefon = telefon;
        this.wyplata = wyplata;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public double getWyplata() {
        return wyplata;
    }

    public void setWyplata(double wyplata) {
        this.wyplata = wyplata;
    }

    @Override
    public void printInfo(){
        printInfo();
        System.out.println(pesel + " " + telefon);
    }
}
