package lab3;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create user stories
        UserStory userStory1 = new UserStory(1, "Implement user registration", 5, new ArrayList<>());
        UserStory userStory2 = new UserStory(2, "Implement login functionality", 8, Arrays.asList(userStory1));

        // Create bugs
        Bug bug1 = Bug.createBug(1, "Fix registration form validation", 3, userStory1);
        Bug bug2 = Bug.createBug(2, "Fix login authentication issue", 5, userStory2);

        // Create sprint with capacity 20
        Sprint sprint = new Sprint(20);

        // Add user stories and bugs to sprint
        sprint.addUserStory(userStory1);
        sprint.addUserStory(userStory2);
        sprint.addBug(bug1);
        sprint.addBug(bug2);

        // Display sprint details
        System.out.println("Sprint Tickets:");
        for (Ticket ticket : sprint.getTickets()) {
            System.out.println(ticket);
        }
        System.out.println("Total Estimate: " + sprint.getTotalEstimate());
    }
}