public class Pessoa {

    private String endereco;
    private String email;
    private long telefone;

    public Pessoa(String endereco, String email, long telefone) {
        this.endereco=endereco;
        this.email=email;
        this.telefone=telefone;
    }



    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}
