package LogicaNegocio;

public class Cuenta {

    /// Atributos

    String nombreTitular;
    double dineroCuenta;

    /// Constructores

    public Cuenta() {
        nombreTitular = "No registrado";
        dineroCuenta = 0.0;
    }

    public Cuenta(String nombreTitular, double dineroCuenta) {
        this.nombreTitular = nombreTitular;
        this.dineroCuenta = dineroCuenta;
    }

    /// Metodos get y set

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getDineroCuenta() {
        return dineroCuenta;
    }

    public void setDineroCuenta(double dineroCuenta) {
        this.dineroCuenta = dineroCuenta;
    }

    /// Metodos toString

    public String getStringDinero() {
        return Double.toString(dineroCuenta);
    }

    ///  Metodos propios

    public String ingresarDinero(double dinero) {
        if (dinero > 0) {
            this.dineroCuenta += dinero;
            return "El dinero en la cuenta total es: " + dineroCuenta;
        }
        return "No se pudo ingresar el dinero";
    }

    public String retirarDinero(double dinero) {
        if (dinero > 0 && dinero <= this.dineroCuenta) {
            this.dineroCuenta -= dinero;
            return "El dinero en la cuenta total es: " + dineroCuenta;
        } else if (dinero > this.dineroCuenta)
            return "No puedes retirar mas de " + dineroCuenta;
        return "No se pudo retirar el dinero; ingresa valores positivos";
    }

}
