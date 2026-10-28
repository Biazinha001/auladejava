public class Email {
    private String enderecoEmail;
    private String tipo; // ex: pessoal, trabalho

    public Email(String enderecoEmail, String tipo) {
        this.enderecoEmail = enderecoEmail;
        this.tipo = tipo;
    }

    public String getEnderecoEmail() { return enderecoEmail; }
    public void setEnderecoEmail(String enderecoEmail) { this.enderecoEmail = enderecoEmail; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
