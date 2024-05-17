package lab3;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UserStory userStory1 = new UserStory(1, "Implement user registration", 5, new ArrayList<>());
        UserStory userStory2 = new UserStory(2, "Implement login functionality", 8, Arrays.asList(userStory1));

        Bug bug1 = Bug.createBug(1, "Fix registration form validation", 3, userStory1);
        Bug bug2 = Bug.createBug(2, "Fix login authentication issue", 5, userStory2);

        Sprint sprint = new Sprint(20);

        sprint.addUserStory(userStory1);
        sprint.addUserStory(userStory2);
        sprint.addBug(bug1);
        sprint.addBug(bug2);

        System.out.println("Sprint Tickets:");
        for (Ticket ticket : sprint.getTickets()) {
            System.out.println(ticket);
        }
        System.out.println("Total Estimate: " + sprint.getTotalEstimate());
    }
}