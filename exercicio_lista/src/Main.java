import java.util.ArrayList;
import java.util.List;


import java.util.Locale;
import java.util.Scanner;


import entities.Employee;

public class Main {
    public static void main(String[] args) {




        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();


        System.out.print("How many employees will be registered: ");
        int N = sc.nextInt();

        for(int i=0; i<N; i++){

            System.out.println();
            System.out.printf("%dº Employee:  \n", i+1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            // instantiating the object
            Employee emp = new Employee(id, name, salary);

            // adding emp object to the list
            list.add(emp);

        }


        // part 2 - updating salary of given employe !


        System.out.println("Enter the employee id that will " +
                "have salary increase: ");

        int idSalary = sc.nextInt();
        Integer pos = positionId(list,idSalary);
        if (pos == null){
            System.out.println("This id does not exist ! ");

        }

        else{
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");


        for(Employee emp : list){
            System.out.println(emp);
        }

        sc.close();
    }

    // auxiliary function

    public static Integer positionId(List<Employee> list, int id){
        for (int i=0; i < list.size(); i++){

            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

}
