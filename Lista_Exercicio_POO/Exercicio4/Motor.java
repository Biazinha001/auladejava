
public class Motor {

    // Atributos
    String modelo = "";
    int potencia = 0;

    // Construtor
    public Motor(String modelo, int potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
    }

    // Getters e Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return this.potencia;
    }
}

