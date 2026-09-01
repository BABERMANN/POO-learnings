package org.example;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hellor word");


        Funcionario Eredin1 = new Funcionario("Eredin",2500.78);
        Funcionario Eredin2 = new Funcionario("PI",2500.78);
        Funcionario Eredin3 = new Funcionario("apolo",2500.78);
        Funcionario Eredin4 = new Funcionario("bruna",2500.78);
        Funcionario Eredin5 = new Funcionario("Lua",2500.78);

        Eredin1.setSupervisor(Eredin2);
        Eredin2.setSupervisor(Eredin3);
        Eredin3.setSupervisor(Eredin4);
        Eredin4.setSupervisor(Eredin5);

        System.out.println(Eredin1.getCadeiaDeComando());




    }
}