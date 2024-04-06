public class Pessoa {

    private String nome;

    private String cpf;

    private String endereco;
    private String email;
    private long telefone;


    public Pessoa(String nome, String cpf,String endereco, String email, long telefone) {
        this.nome = nome;
        this.cpf=cpf;
        this.endereco=endereco;
        this.email=email;
        this.telefone=telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
