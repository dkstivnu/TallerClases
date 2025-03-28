package LogicaNegocio;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private long ID;
    private String sexo;

    public Persona() {
        this.nombre = "No registrado";
        this.apellido = "No registrado";
        this.edad = 0;
        this.ID = 0;
        this.sexo = "No registrado";
    }

    public Persona(String nombre, String apellido, int edad, long ID, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ID = ID;
        this.sexo = sexo;
    }

    public Persona(Persona persona) {

        this.nombre = persona.getNombre();
        this.apellido = persona.getApellido();
        this.edad = persona.getEdad();
        this.ID = persona.getID();
        this.sexo = persona.getSexo();


    }

    /// Metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /// Metodos propios

    public String esMayor() {
        if (edad > 18) {
            return "La persona es mayor de edad";
        }
        return "La persona no es mayor de edad";

    }

    public String getInformacion() {
        return " El nombre es: " + nombre + "\n El apellido es: " + apellido + "\n La edad es: " + edad + "\n El sexo es: " + sexo + "\n La identificacion es: " + ID + "\n";
    }
}