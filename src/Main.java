// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PessoaFisica cliente1=new PessoaFisica(
                "Casa 03",
                "yuri@gmail.com",
                11987673499L,
                "Yuri",
                 "000.000.000-00"
                );

        PessoaJuridica cliente2=new PessoaJuridica(
                "Avenida Paulista",
                "dev@gmail.com",
                11987673499L,
                "Dev. midia",
                "67.458.234/0001-99"
        );



        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1);


        System.out.println(cliente2.getNomeFantasia());
        System.out.println(cliente2.getCnpj());
        System.out.println(cliente2);

    }
}