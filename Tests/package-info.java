package hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PacienteTeste {

    @Test
    void deveSomarDosePaciente() {
        Paciente paciente = new Paciente();
        paciente.somarDose(80.0f, 20.0f);
        assertEquals(100.0f, paciente.getDose());
    }

    @Test
    void deveSubtrairDosePaciente() {
        Paciente paciente = new Paciente();
        paciente.subtrairDose(80.0f, 10.0f);
        assertEquals(70.0f, paciente.getDose());
    }

    @Test
    void deveMultiplicarDosePaciente() {
        Paciente paciente = new Paciente();
        paciente.multiplicarDose(10.0f, 3.0f);
        assertEquals(30.0f, paciente.getDose());
    }

    @Test
    void deveDividirDosePaciente() {
        Paciente paciente = new Paciente();
        paciente.dividirDose(100.0f, 2.0f);
        assertEquals(50.0f, paciente.getDose());
    }

    @Test
    void naoDeveDividirDosePorZero() {
        try {
            Paciente paciente = new Paciente();
            paciente.dividirDose(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaDosesPaciente() {
        Paciente paciente = new Paciente();
        paciente.calcularMediaDoses(70.0f, 80.0f);
        assertEquals(75.0f, paciente.getDose());
    }
}