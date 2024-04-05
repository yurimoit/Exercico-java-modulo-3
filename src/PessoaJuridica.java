public class PessoaJuridica extends Pessoa {
    private String nomeFantasia;

    private String cnpj;



    public PessoaJuridica(String endereco, String email, long telefone, String nomeFantasia, String cnpj) {
        super(endereco, email, telefone);
        this.nomeFantasia=nomeFantasia;
        this.cnpj=cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nomeFantasia='" + nomeFantasia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", Endereço='" + this.getEndereco() + '\'' +
                ", E-mail='" + this.getEmail() + '\'' +
                ", Telefone='" + this.getTelefone() + '\'' +
                '}';
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
