/* Create a class Player with below attributes:  
 
playerId - int  
skill - String  
level - String  
points - int 
 
Write getters, setters and parameterized constructor in the above mentioned attribute  
sequence as required. 
 
Create class Sport with the main method. 
 
Implement two static methods - findPointsForGivenSkill and getPlayerBasedOnLevel in Sport class. 
 
findPointsForGivenSkill method:  
------------------------------------ 
This method will take two input parameters - array of Player objects  
and string parameter skill. The method will return the sum of the points attribute from player objects  
for the skill passed as parameter. If no player with the given skill is present in the array of player  
objects, then the method should return 0. 
 
getPlayerBasedOnLevel method:  
------------------------------------- 
This method will take two String parameters level and skill, along with the array of Player objects.  
The method will return the player object, if the input String parameters matches with the level and  
skill attribute of the player object and its point attribute is greater than or equal to 20. If any  
of the conditions are not met, then the method should return null. 
 
Note : No two player object would have the same value for skill and level attribute. All player object  
would have the points greater than 0. All the searches should be case insensitive. 
 
These above mentioned static methods should be called from the main method. 
 
For findPointsForGivenSkill method - The main method should print the points as it is if the returned  
price is greater than 0, or it should print "The given Skill is not available". 
 
For getPlayerBasedOnLevel method - The main method should print the playerId of the returned player object. 
If the returned value is null then it should print "No player is available with specified level, skill  
and eligibility points". 
 
Before calling these static methods in main, use Scanner object to read the values of four Player objects  
referring attributes in the above mentioned attribute sequence. Next, read the value for skill and level. 
Please consider the skill value read above as skill parameter for both the static methods. 
 
Input: 
----------- 
101 
Cricket 
Basic 
20 
102 
Cricket 
Intermediate 
25 
111 
Football 
Intermediate 
50 
113 
BaseBall 
Advanced 
100 
Cricket 
Intermediate 
 
Output: 
-------------- 
45 
102*/

import java.util.Scanner;

class Player {
    //create Player class with
    // playerId - int
    // skill - String
    // level - String
    // points - int
    private int playerId;
    private String skill;
    private String level;
    private int points;

    //constructor
    //Attribute sequence: playerId, skill, level, points
    public Player(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    //getters and setters for playerId
    public int getPlayerId() {
        return playerId;}
    public void setPlayerId(int playerId) {
        this.playerId = playerId;}

    //getters and setters for skill
    public String getSkill() {
        return skill;}
    public void setSkill(String skill) {
        this.skill = skill;}
  
//getters and setters for level
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    //getters and setters for points
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

public class Sport {

    // Implement static method
    // findPointsForGivenSkill
    // Input: Player array and skill
    // Return: Sum of points for matching skill
    // If no matching skill is found, return 0
    public static int findPointsForGivenSkill(Player[] players, String skill) {

        int sum = 0;

        // search all Player objects
        for (Player player : players) {

            // x: Search should be case insensitive
            if (player.getSkill().equalsIgnoreCase(skill)) {

                // x: Add points of matching players
                sum = sum + player.getPoints();
            }
        }

        // x: Return sum of points
        // Returns 0 automatically if no player matches
        return sum;
    }

    //Implement static method
    //getPlayerBasedOnLevel
    //Input: Player array, level and skill
    //Return matching Player object
    //Conditions:
    //1. Level should match
    //2. Skill should match
    //3. Points should be >= 20
    //If conditions are not satisfied, return null
    public static Player getPlayerBasedOnLevel(
            Player[] players, String level, String skill) {

        // Search all Player objects
        for (Player player : players) {

            // All searches should be case insensitive
            // Level must match
            // Skill must match
            // Points must be >= 20
            if (player.getLevel().equalsIgnoreCase(level)
                    && player.getSkill().equalsIgnoreCase(skill)
                    && player.getPoints() >= 20) {
                // Return the matching Player object
                return player;
            }
        }

        //Return null if no player satisfies conditions
        return null;
    }
    // Create main method
    public static void main(String[] args) {

        // Use Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Create an array for four Player objects
        Player[] players = new Player[4];

        // Read values for four Player objects
        // Attribute sequence:
        // playerId, skill, level, points
        for (int i = 0; i < players.length; i++) {

            // Read playerId
            int playerId = sc.nextInt();
            sc.nextLine();

            // Read skill
            String skill = sc.nextLine();

            // Read level
            String level = sc.nextLine();

            // Read points
            int points = sc.nextInt();

            // Create Player object
            players[i] = new Player(playerId, skill, level, points);
        }

        //After reading four Player objects,
        // read skill and level
        sc.nextLine();

        String skill = sc.nextLine();
        String level = sc.nextLine();
        // Use the skill read above as the skill parameter
        // for BOTH static methods.

        // Call findPointsForGivenSkill()
        int totalPoints = findPointsForGivenSkill(players, skill);
        // If returned value is greater than 0,
        // print the points.
        // Otherwise print specified message.
        if (totalPoints > 0) {
            System.out.println(totalPoints);
        } else {
            System.out.println("The given Skill is not available");
        }

        // Call getPlayerBasedOnLevel()
        Player player = getPlayerBasedOnLevel(players, level, skill);
        // If returned Player object is not null,
        // print playerId.
        if (player != null) {
            System.out.println(player.getPlayerId());
        } else {
            // If returned value is null, print specified message.
            System.out.println(
                "No player is available with specified level, skill and eligibility points"
            );
        }
    }
}
