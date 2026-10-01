//exemplo1

public class Main {
    public static void main(String[] args){
        Veiculo carro_1 = new Veiculo("Fiat", "Uno");
        Veiculo carro_2 = new Veiculo("BYD", "Compact 2026");
        Veiculo carro_3 = new Veiculo("Honda", "Civic");
        Veiculo carro_4 = new Veiculo("Gurgel", "Gurgel 1960");

        System.out.println("carro1:" + carro_1.marca);
        Veiculo[]  estacionamento = {carro_1, carro_2, carro_3, carro_4};

        for(Veiculo item : estacionamento){

            System.out.println("marca:" + item.marca);
            System.out.println("modelo:" + item.modelo);
        }
    }
}
