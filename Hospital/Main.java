package hospital;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente();

        paciente.somarDose(80.0f, 20.0f);
        System.out.println("Soma das doses: " + paciente.getDose());

        paciente.subtrairDose(80.0f, 10.0f);
        System.out.println("Subtração das doses: " + paciente.getDose());

        paciente.multiplicarDose(10.0f, 3.0f);
        System.out.println("Multiplicação das doses: " + paciente.getDose());

        paciente.dividirDose(100.0f, 2.0f);
        System.out.println("Divisão das doses: " + paciente.getDose());

        paciente.calcularMediaDoses(70.0f, 80.0f);
        System.out.println("Média das doses: " + paciente.getDose());
    }
}