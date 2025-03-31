package LogicaNegocio;

public class Estudiante {

    /// Atributos

    private double notaExam1;
    private double notaExam2;
    private double notaExam3;
    private double notaFinal;

    /// Constructores

    public Estudiante() {
        notaExam1 = 0;
        notaExam2 = 0;
        notaExam3 = 0;
    }

    public Estudiante(double nota1, double nota2, double nota3) {
        this.notaExam1 = nota1;
        this.notaExam2 = nota2;
        this.notaExam3 = nota3;

    }

    public Estudiante(Estudiante estudiante) {
        this.notaExam1 = estudiante.getNotaExam1();
        this.notaExam2 = estudiante.getNotaExam2();
        this.notaExam3 = estudiante.getNotaExam3();
        this.notaFinal = estudiante.getNotaFinal();
    }

    /// Metodos get y set

    public double getNotaExam1() {
        return notaExam1;
    }

    public void setNotaExam1(double notaExam1) {
        this.notaExam1 = notaExam1;
    }

    public double getNotaExam2() {
        return notaExam2;
    }

    public void setNotaExam2(double notaExam2) {
        this.notaExam2 = notaExam2;
    }

    public double getNotaExam3() {
        return notaExam3;
    }

    public void setNotaExam3(double notaExam3) {
        this.notaExam3 = notaExam3;
    }

    public double getNotaFinal() {
        return notaFinal;
    } // No hay metodo setNotaFinal porque depende
    // de las demas notas para ser asignado

    /// Metodos propios

    public String getInformacion() {
        return " 1° Nota de evaluacion: " + notaExam1 + "\n 2° Nota de evaluacion: " + notaExam2 + "\n 3° Nota de evaluacion: " + notaExam3 + "\n  Resultado final: " + calcNotaFinal() + "\n";
    }

    public double calcNotaFinal() {
        this.notaFinal = (notaExam1 + notaExam2) * 0.35 + (notaExam3) * 0.3;
        return notaFinal;
    }

}

