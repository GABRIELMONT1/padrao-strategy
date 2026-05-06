package hospital;

public class Paciente {

    private float dose;

    public float getDose() {
        return dose;
    }

    public void somarDose(float dose1, float dose2) {
        CalculadoraHospital calc = new CalculadoraHospital(dose1, dose2);
        this.dose = calc.calcular(new CalculoSomar());
    }

    public void subtrairDose(float dose1, float dose2) {
        CalculadoraHospital calc = new CalculadoraHospital(dose1, dose2);
        this.dose = calc.calcular(new CalculoSubtrair());
    }

    public void dividirDose(float dose1, float dose2) {
        CalculadoraHospital calc = new CalculadoraHospital(dose1, dose2);
        this.dose = calc.calcular(new CalculoDividir());
    }

    public void multiplicarDose(float dose1, float dose2) {
        CalculadoraHospital calc = new CalculadoraHospital(dose1, dose2);
        this.dose = calc.calcular(new CalculoMultiplicar());
    }

    public void calcularMediaDoses(float dose1, float dose2) {
        CalculadoraHospital calc = new CalculadoraHospital(dose1, dose2);
        this.dose = calc.calcular(new CalculoMedia());
    }
}