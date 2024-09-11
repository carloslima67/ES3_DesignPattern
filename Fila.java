package impressora;

public class Fila {
	private static Fila instancia;
	public static Fila getInstance() {
		if (instancia == null) {
			instancia = new Fila();
		}
		return instancia;
	}
	private Fila() {}
	
	public void ImprimeDocumento() {}
	public void RemoveDocumento() {}
	public void RemoveTodosDocumento() {}
	
}
