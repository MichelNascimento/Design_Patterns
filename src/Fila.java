public class Fila {
    private static Fila instance = null;
    private Queue<String> queue;

    private Fila() {
        this.queue = new LinkedList<>();
    }

    public static synchronized Fila getInstance() {
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
    }

    public synchronized void adicionarDocumento(String Documento) {
        this.queue.add(Documento);
    }

    public synchronized String removerDocumento() {
        return this.queue.poll();
    }

    public synchronized boolean estaVazia() {
        return this.queue.isEmpty();
    }
}
