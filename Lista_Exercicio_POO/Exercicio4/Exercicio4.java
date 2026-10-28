
public class Exercicio4 {

    public static void main(String[] args) {

        // Instância de Motor
        Motor motor1 = new Motor("2.0 Turbo", 200);

        // Instâncias de Acessorio
        Acessorio acessorio1 = new Acessorio("Central multimídia", 1500.00);
        Acessorio acessorio2 = new Acessorio("Câmera de ré", 400.00);
        Acessorio acessorio3 = new Acessorio("Teto solar", 5000.00);

        // Array de acessórios
        Acessorio[] acessorios = {
            acessorio1, acessorio2, acessorio3
        };

        // Instância de Carro
        Carro carro1 = new Carro(
            "Volkswagen", "Jetta", motor1, acessorios
        );

        // Exibição dos dados
        System.out.println("=== CARRO ===");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());

        System.out.println("\n=== MOTOR ===");
        System.out.println("Modelo: " + carro1.getMotor().getModelo());
        System.out.println("Potência: " + carro1.getMotor().getPotencia() + " cv");

        System.out.println("\n=== ACESSÓRIOS ===");

        for (Acessorio acessorio : carro1.getAcessorios()) {
            System.out.println("Nome: " + acessorio.getNome());
            System.out.println("Preço: R$ " + acessorio.getPreco());
        }
    }
}

