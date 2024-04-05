public class PessoaFisica extends Pessoa {

    private String nome;

    private String cpf;


    public PessoaFisica(String endereco, String email, long telefone, String nome, String cpf) {
        super(endereco, email, telefone);
        this.nome=nome;
        this.cpf=cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", Endereço='" + this.getEndereco() + '\'' +
                ", E-mail='" + this.getEmail() + '\'' +
                ", Telefone='" + this.getTelefone() + '\'' +
                '}';
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
}
