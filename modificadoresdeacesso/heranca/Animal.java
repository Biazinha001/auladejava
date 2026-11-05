public abstract class Animal {
    String nome;
    
    public abstract void som();

    public void acordar() {
        System.out.println("O animal acordou!");
    }

    public void dormir() {
        System.out.println("O animal dormiu!");
    }
}
