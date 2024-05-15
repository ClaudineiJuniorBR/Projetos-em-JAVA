package curso.programacao.java;

public class MinhaClasse {
    
    public static void main(String[] args) throws Exception {
       
        final String BR = "Brasil"; // A variavel nunca vai mudar o valor (final = não deixa alterar)
        double PI = 3.14; // Tipo de valor float
        int idade = 20; // variavel de valor inteira
        int anoFabricacao = 2024; // pode ser usado assim
        boolean verdadeiro = true; // valor bool 1 ou 0 
        String primeiroNome = "Claudinei"; //atribuindo primeiro nome
        String segundoNome = "Júnior"; // atribuindo segundo nome
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome); //chamada do método
        //quando chegar nesse momento vai chamar o método nomeCompleto 

        System.out.println(nomeCompleto); // aqui vai aparecer o return do Método
        } //fecha o main
    public static String nomeCompleto (String primeiroNome,String segundoNome){ // criando o método
        return "Resultado do Método "+ primeiroNome.concat(" ").concat(segundoNome); //Concatena os dois nomes
    } //fecha o nomeCompleto
} // fecha a classe MinhaClasse
