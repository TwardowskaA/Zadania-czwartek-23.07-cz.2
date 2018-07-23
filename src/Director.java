public class Director extends Employee {

    private double premia;


    public Director(String imie, String nazwisko, String pesel, String telefon, double wyplata, double premia) {
        super(imie, nazwisko, pesel, telefon, wyplata);
        this.premia = premia;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }
}
