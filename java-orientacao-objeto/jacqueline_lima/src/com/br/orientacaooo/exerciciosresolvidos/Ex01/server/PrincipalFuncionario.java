package com.br.orientacaooo.exerciciosresolvidos.Ex01.server;

import com.br.orientacaooo.exerciciosresolvidos.Ex01.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionarios será(ão) cadastrado(s): ");
        int numeroFuncionarioRegistrar = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();
        for(int i = 1; i <= numeroFuncionarioRegistrar; i++) {
            System.out.println();
            System.out.println("Funcionário: " + i);

            System.out.println("Id: ");
            int idCadastrado = sc.nextInt();
            while(hasId(employeeList, idCadastrado)){
                idCadastrado = sc.nextInt();
            }
            System.out.println("Name");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary");
            double salary = sc.nextDouble();
            employeeList.add(new Employee(idCadastrado, name, salary));
        }
        //atualizacao de salario por id e porcentagem
        System.out.println();
        System.out.println();
        System.out.println("Entre com o codigo do funcionario e o percentual de aumento: ");
        int idAumento = sc.nextInt();
        Employee emp = employeeList.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
        if(emp == null){
            System.out.println("O id informado não existe!");
        }else{
            System.out.println("Entre com o percentual de aumento: ");
            double percentege = sc.nextDouble();
            emp.increaseSalary(percentege);
        }

        sc.close();

        System.out.println();
        System.out.println("Lista atualizada de funcionarios");
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }

    public static boolean hasId(List<Employee> employeeList, int id){
        Employee employee = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
