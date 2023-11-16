package TPO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Laboratorio {
	private int id;
    private int capacidadPersonas;
    private Set<String> condicionesPeligrosidad;
    private Map<String, Double> costosCondiciones;
    private List<Tecnico> profesionalesReservados;
    private List<Lote> lotes;

    public Laboratorio(int id, int capacidadPersonas) {
        this.id = id;
        this.capacidadPersonas = capacidadPersonas;
        this.condicionesPeligrosidad = new HashSet<>();
        this.costosCondiciones = new HashMap<>();
        this.profesionalesReservados = new ArrayList<>();
        this.lotes = new ArrayList<>();
    }

    public Reserva reservar(Tecnico tecnico, List<ProductoQuimico> productos) {
        // Implementación de la reserva
        // ...
        return new Reserva(); // Reemplazar con la lógica real de reserva
    }

    public void realizarPrueba(Reserva reserva) {
        // Implementación de la realización de la prueba
        // ...
    }

    public void aprobarLote(Lote lote) {
        // Implementación de la aprobación del lote
        // ...
    }

}
