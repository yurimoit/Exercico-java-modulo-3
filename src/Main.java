import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Professor professor1=new Professor(
                "Marcos",
                "000.000.000-00",
                "Faculdade Fam",
                "marcos@gmail.com",
                11987654567L);

        professor1.adicinarMateriasLecionadas("Programção orientada a objetos");
        professor1.adicinarMateriasLecionadas("Banco de dados");

        Professor professor2=new Professor(
                "Caique",
                "000.000.000-00",
                "Faculdade Fam",
                "caique@gmail.com",
                11987654567L);

        professor2.adicinarMateriasLecionadas("Front-end");
        professor2.adicinarMateriasLecionadas("Back-end");


        Aluno aluno1=new Aluno(
                "Yuri",
                "000.000.000-00",
                "Avenida Paulista",
                "yuri@gamil.com",
                11934567896L);

        List<String> materiasDesejadas=new ArrayList<>();

        materiasDesejadas.addAll(professor1.obterMaterias());
        materiasDesejadas.addAll(professor2.obterMaterias());

        aluno1.adicionarMateria(materiasDesejadas);

        System.out.println("\n//-------------------------------------//");
        System.out.println(professor1);
        System.out.println("\n//-------------------------------------//");
        System.out.println(professor2);
        System.out.println("\n//-------------------------------------//");
        System.out.println(aluno1);
        System.out.println(aluno1.obterMensalidade());


    }
}