//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //esse primeiro metodo é mais parecido com uma função, pois precisa receber e retornar valores
    calculadora cal = new  calculadora();

    int soma = cal.somar(5, 3);

    System.out.println(soma);

    Doce doce = new Doce();
        doce.nome = "brigadeiro";
    doce.dizerNome();

    }
}