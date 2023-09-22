import java.util.Scanner;
import java.io.*;

class Employee {
    int empid;
    long mobile;
    String name, address, mailid;
    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.println("Enter Employee Id : ");
        empid = sc.nextInt();
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter Mail Id : ");
        mailid = sc.next();
        System.out.println("Enter Address : ");
        address = sc.next();
        System.out.println("Enter Mobile Number : ");
        mobile = sc.nextLong();
    }

    void display() {
        System.out.println("Employee Id : " + empid);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Mail Id : " + mailid);
        System.out.println("Mobile Number : " + mobile);
    }
}

class Programmer extends Employee {
    double bp, da, hra, pf, club, net, gross;

    void getProgrammer() {
        System.out.println("Enter basic pay : ");
        bp = sc.nextDouble();
    }

    void calculateProg() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
    }

    void getSalary() {
        System.out.println("Gross Salary : " + gross);
        System.out.println("Net salary : " + net);
    }
}

class TeamLead extends Employee {
    double bp, da, hra, pf, club, net, gross;

    void getTeamLead() {
        System.out.println("Enter basic pay : ");
        bp = sc.nextDouble();
    }

    void calculateTeamLead() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
    }

    void getTlSalary() {
        System.out.println("Gross Salary : " + gross);
        System.out.println("Net salary : " + net);
    }
}

class AssProManager extends Employee {
    double bp, da, hra, pf, club, net, gross;

    void getAssProManager() {
        System.out.println("Enter basic pay : ");
        bp = sc.nextDouble();
    }

    void calculateAssiProManager() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
    }

    void getAPMSalary() {
        System.out.println("Gross Salary : " + gross);
        System.out.println("Net salary : " + net);
    }
}

class ProjectManager extends Employee {
    double bp, da, hra, pf, club, net, gross;

    void getProjectManager() {
        System.out.println("Enter basic pay : ");
        bp = sc.nextDouble();
    }

    void calculateProjectManager() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
    }

    void getPMSalary() {
        System.out.println("Gross Salary : " + gross);
        System.out.println("Net salary : " + net);
    }
}

class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter your Choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
            Programmer obj = new Programmer();
                obj.getData();
                obj.getProgrammer();
                obj.display();
                obj.calculateProg();
                obj.getSalary();
                break;
            case 2:
                TeamLead obj1 = new TeamLead();
                obj1.getData();
                obj1.getTeamLead();
                obj1.display();
                obj1.calculateTeamLead();
                obj1.getTlSalary();
                break;
            case 3:
                AssProManager obj2 = new AssProManager();
                obj2.getData();
                obj2.getAssProManager();
                obj2.display();
                obj2.calculateAssiProManager();
                obj2.getAPMSalary();
                break;
            case 4:
                ProjectManager obj3 = new ProjectManager();
                obj3.getData();
                obj3.getProjectManager();
                obj3.display();
                obj3.calculateProjectManager();
                obj3.getPMSalary();
                break;
            default:
                break;
        }
    }
}
