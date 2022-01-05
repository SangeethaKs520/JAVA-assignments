package assign4;

import java.util.Arrays;

class Empy {

    int empid;
    String Name;
    String designation;
    double basic;
    double hra;

    int getEmpid() {
        return empid;
    }

    void setEmpid(int empid) {
        this.empid = empid;
    }

    String getName() {
        return Name;
    }

    void setName(String name) {
        Name = name;
    }

    String getDesignation() {
        return designation;
    }

    void setDesignation(String designation) {
        this.designation = designation;
    }

    double getBasic() {
        if (basic < 500) {
            try {
                throw new LowSalException();

            } catch (LowSalException e) {
                // TODO Auto-generated catch block
                // e.printStackTrace();
                System.out.println(e);
            }
        }
        return basic;
    }

    void setBasic(double basic) {
        this.basic = basic;
    }

    public Empy() {

        this.empid = 1;
        Name = "Abhi";
        this.designation = "SOFT ENGG";
        this.basic = 300;
    }

    public Empy(int empid, String name, String designation, double basic) {

        this.empid = empid;
        Name = name;
        this.designation = designation;
        this.basic = basic;
    }

    public void printDET() {
        System.out.println("Id Of Employye :" + empid
                + "\n Name of Employee is :" + Name
                + "\n Designation Of Employee is:" + designation
                + "\nSalary Of Employee :" + basic);

    }

    public void calculateHRA() {
        if (designation == "Manager") {

            hra = basic * 0.1;
            System.out.println("HRA OF MANAGER : " + hra);
        }

        else if (designation == "Officer") {

            hra = basic * 0.12;
            System.out.println("HRA OF OFFICER : " + hra);
        }

        else {

            hra = basic * 0.05;
            System.out.println("HRA OF CLEARK : " + hra);
        }
    }

    public static void main(String[] args) {
        Empy e = new Empy();
        e.getBasic();
        e.printDET();
        System.out.println();
        Empy e1 = new Empy(2, "Amol", "Manager", 50000);
        e1.printDET();
        e1.calculateHRA();
        System.out.println();
        Empy e2=new Empy(3,"Suraj","officer",10000);
        e2.printDET();
        e2.calculateHRA();
        System.out.println();
        System.out.println();
        Empy e3=new Empy(4,"Sushant","cleark",15000);
        e3.printDET();
        e3.calculateHRA();

    }
    
   

    public class LowSalException extends Exception {

        @Override
        public String toString() {
            return "Opps There is Low Balance Than 500 Reppues";
                   
        }
       
       

    }

}


