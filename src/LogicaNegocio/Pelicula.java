package LogicaNegocio;

public class Pelicula {

    ///Atributos
    String nombre;
    String director;
    String genero;
    int duracion;
    int year;
    double calificacion;

    //Constructores

    public Pelicula() {
        nombre = "No registrado";
        director = "No registrado";
        genero = "No registrado";
        duracion = 0;
        year = 0;
        calificacion = 0;
    }

    public Pelicula(String nombre, String director, String genero, int duracion, int year, double calificacion) {

        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.year = year;
        this.calificacion = calificacion;

    }

    /// Metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /// Metodos propios
    public String info() {
        return " Nombre: " + nombre +"\n"+ " Director:" + director + "\n"+
                "Genero:" + genero +"\n"+ "Duracion:" + duracion +"\n"+
                "Año:" + year +"\n"+ "Calificacion:" + calificacion +"\n";
    }




    private boolean esPeliculaEpica() {
        return duracion >= 180;
    }

    private String calcularValoracion() {
        if (calificacion >= 0 && calificacion <= 2) {
            return "Muy mala";
        }
        if (calificacion > 2 && calificacion <= 5) {
            return "Mala";
        }
        if (calificacion > 5 && calificacion <= 7) {
            return "Regular";
        }
        if (calificacion > 7 && calificacion <= 8) {
            return "Buena";
        }
        if (calificacion > 8 && calificacion <= 10) {
            return "Exelente";
        }
        return "Fuera de rango";
    }
}
