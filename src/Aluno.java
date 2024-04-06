import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {


    public  static final double VALOR_MENSALIDADE=100.00;

    private List<Professor> listaMateriasCursadas=new ArrayList<>();

    public Aluno(String nome, String cpf, String endereco, String email, long telefone) {
        super(nome, cpf, endereco, email, telefone);
    }

    @Override
    public String toString() {
        return "Aluno {" +
                "Nome: '" + this.getNome() + '\'' +
                "\n, CPF:'" + this.getCpf() + '\'' +
                "\n, Endereço: '" + this.getEndereco() + '\'' +
                "\n, E-mail: '" + this.getEmail() + '\'' +
                "\n, Telefone: '" + this.getTelefone() + '\'' +
                "\n, Materias do curso: '" + this.listaMateriasCursadas + '\'' +
                '}';
    }

    public  void adicionarMateria(List materias){
        listaMateriasCursadas.addAll(materias);
    }

    public String obterMensalidade() {
        return "Valor mensalidade: R$"+(VALOR_MENSALIDADE * listaMateriasCursadas.size());
    }


}
