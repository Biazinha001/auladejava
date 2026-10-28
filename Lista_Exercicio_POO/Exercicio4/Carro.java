
public class Carro {

    // Atributos
    String marca = "";
    String modelo = "";
    Motor motor;
    Acessorio[] acessorios;

    // Construtor
    public Carro(String marca, String modelo, Motor motor,
                 Acessorio[] acessorios) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.acessorios = acessorios;
    }

    // Getters e Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setAcessorios(Acessorio[] acessorios) {
        this.acessorios = acessorios;
    }

    public Acessorio[] getAcessorios() {
        return this.acessorios;
    }
}

