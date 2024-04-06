import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

    List<String> listaMaterias=new ArrayList<>();

    public Professor(String nome, String cpf, String endereco, String email, long telefone) {
        super(nome, cpf, endereco, email, telefone);
    }



    @Override
    public String toString() {
        return "Professor: {" +
                "Nome: '" + this.getNome() + '\'' +
                "\n, CPF: '" + this.getCpf() + '\'' +
                "\n, Endereço: '" + this.getEndereco() + '\'' +
                "\n, E-mail: '" + this.getEmail() + '\'' +
                "\n, Telefone: '" + this.getTelefone() + '\'' +
                "\nMateria: '" + this.listaMaterias + '\'' +
                '}';
    }

    public void adicinarMateriasLecionadas(String materia){
        listaMaterias.add(materia);
    }

    public List obterMaterias(){
        return listaMaterias;
    }


}
