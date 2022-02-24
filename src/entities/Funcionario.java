package entities;

public class Funcionario {
    public String nome;
    public double salario;
    public double tax;

    public double IncreaseSalary(double percentage){
        return this.salario += (this.salario * (percentage / 100));
    }

    public double LiquidSalary(){
        return this.salario - this.tax;
    }

    public String toString(){
        return String.format("%s, $ %.2f", this.nome, LiquidSalary());
    }
}
