import java.util.Scanner;
import java.util.regex.*;
public class ValidaComplex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senhaUsuario = scan.nextLine();
//        String senhaForte = "Senha123";
//        String senhaFraca = "senha";

        System.out.println(validaSenha(senhaUsuario));
    }
    public static Integer validaSenha(String senhaUser){
        String regex = "^ (? =. * [0-9]) (? =. * [az]) (? =. * [AZ]) (? = \\ S + $). {8, 32} $";
        if (senhaUser.length() >= 8 && senhaUser.length() <= 32){
            if (senhaUser.contains(regex));

            return 1;
        } return 0;
    }
}
/*
^ representa o caractere inicial da string.
(? =. * [0-9]) representa um dígito deve ocorrer pelo menos uma vez.
(? =. * [az]) representa um alfabeto minúsculo deve ocorrer pelo menos uma vez.
(? =. * [AZ]) representa um alfabeto maiúsculo que deve ocorrer pelo menos uma vez.
(? =. * [@ # $% ^ & - + =()] representa um caractere especial que deve ocorrer pelo menos uma vez.
(? = \\ S + $) espaços em branco não são permitidos em toda a string.
. {8, 20} representa pelo menos 8 caracteres e no máximo 20 caracteres.
$ representa o final da string.
 */