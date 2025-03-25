package LogicaNegocio;

/*
 * @author: - Wilmer Stiven Ortega
 *          - Suzana Zambrano Caicedo
 * */


public class Caja {

    /// Atributos

    private float ancho;
    private float alto;
    private float largo;

    /// Constructores


    /// Constructor por defecto

    public Caja() {
        largo = 0;
        ancho = 0;
        alto = 0;
    }

    /// Constructor parametrizado

    public Caja(float ancho, float alto, float largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    /// Constructor de copia

    public Caja(Caja objCaja) { /* "objCaja" es un objeto de la clase "Caja" */
        this.ancho = objCaja.getAncho();
        this.alto = objCaja.getAlto();
        this.largo = objCaja.getLargo();
    }

    /// Methods

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAncho() {
        return this.ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAlto() {
        return this.alto;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getLargo() {
        return this.largo;
    }

    /// Metodos propios

    public String informacion() {
        String info;
        info = "Alto: " + alto + " - " + "Ancho: " + ancho + " - " + "Largo:" + largo;
        return info;
    }

    public float calcVolumen() {
        float volumen;
        volumen = alto * ancho * largo;
        return volumen;
    }

}
