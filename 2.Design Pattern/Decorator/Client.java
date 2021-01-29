package Decorator;

import Decorator.Decorators.Manager;
import Decorator.Decorators.TeamLeader;
import Decorator.Employees.EmployeeComponent;
import Decorator.Employees.EmployeeConcreteComponent;

public class Client {
    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("GPCoder");
        employee.showEmployeeInformation();
        employee.doTask();

        System.out.println("\nTEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showEmployeeInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
        EmployeeComponent manager = new Manager(employee);
        manager.showEmployeeInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showEmployeeInformation();
        teamLeaderAndManager.doTask();
    }
}
