import java.util.Scanner;

class Employee{



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();



        //Creating object of EmployeeDetails class
        EmployeeDetails emp = new EmployeeDetails();
            emp.setEmp_id(101);
            emp.setName("Sravan Kumar");
            emp.setDepartment("IT");
            emp.setSalary(15000);
            emp.setAddress("gandhinagar");
            emp.setEmail("sravanrocks21@gmail.com");
            if(n==1) {
                System.out.println(emp.getEmp_id());
            }

            if(n==2) {
                System.out.println(emp.getName());
            }
            if(n==3) {
                System.out.println(emp.getDepartment());

        }


        if(n==4 ){
            System.out.println(emp.getSalary());
        }
        if(n==5) {
            System.out.println(emp.getAddress());
        }
        if(n==6){
            System.out.println(emp.getEmail());
        }
    }
}







