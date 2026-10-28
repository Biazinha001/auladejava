public class Exercicio6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Pedro", "123.456.789-00");

        cliente.adicionarEndereco(new Endereco("Rua das Flores", 100, "Boituva", "SP"));
        cliente.adicionarEndereco(new Endereco("Av. Brasil", 250, "Sorocaba", "SP"));

        cliente.adicionarTelefone(new Telefone("15", "99999-1111"));
        cliente.adicionarTelefone(new Telefone("15", "3333-2222"));

        cliente.adicionarEmail(new Email("joao@email.com", "pessoal"));
        cliente.adicionarEmail(new Email("joao@empresa.com", "trabalho"));

        System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf());

        System.out.println("\nEndereços:");
        for (Endereco e : cliente.getEnderecos()) {
            System.out.println("- " + e.getRua() + ", " + e.getNumero() + " - " + e.getCidade() + "/" + e.getEstado());
        }

        System.out.println("\nTelefones:");
        for (Telefone t : cliente.getTelefones()) {
            System.out.println("- (" + t.getDdd() + ") " + t.getNumero());
        }

        System.out.println("\nEmails:");
        for (Email em : cliente.getEmails()) {
            System.out.println("- " + em.getEnderecoEmail() + " (" + em.getTipo() + ")");
        }
    }
}
