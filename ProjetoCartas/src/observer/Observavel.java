package observer;

public interface Observavel {
    void adcionarObervador(Observer observador);
    void notificarObservadores(String mensagem);
}
