package TPO;

import java.util.List;

public class Gerente extends Empleado{
	private Sede sedeAsignada;

    // Constructor
    public Gerente(int id, String nombre, Sede sedeAsignada) {
        super(id, nombre);
        this.sedeAsignada = sedeAsignada;
    }

    // Métodos específicos de Gerente
    public List<PruebaLaboratorio> visualizarPruebas() {
        // Implementación para visualizar pruebas
        return null; // Modifica según tus necesidades
    }

    public void cambiarCriterioVencimiento(PruebaLaboratorio prueba, FechaVencimientoCriterio criterio) {
        // Implementación para cambiar criterio de vencimiento de una prueba
    }

    // Otros métodos si son necesarios

}
