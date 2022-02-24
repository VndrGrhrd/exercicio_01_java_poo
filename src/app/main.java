package app;

import entities.Funcionario;

public class main {
    public static void main(String[] args) {
        Funcionario A = new Funcionario();

        A.nome = "Vandoir";
        A.salario = 3000;
        A.tax = 2500;



        System.out.println(A);
        System.out.println();

        A.IncreaseSalary(10);
        System.out.println(A.salario);
        System.out.println(A);
        System.out.println();


    }
}
