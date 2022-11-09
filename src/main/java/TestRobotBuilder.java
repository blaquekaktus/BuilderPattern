public class TestRobotBuilder {
    public static void main(String[] args) {
        RobotBuilder oldStyleRobot =  new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
        robotEngineer.makeRobot();
        Robot firstRobot = robotEngineer.getRobot();
        System.out.println("Robot Built");
        System.out.println("Robot Head Type: " + firstRobot.getHead());
        System.out.println("Robot Torso Type: " + firstRobot.getTorso());
        System.out.println("Robot Arms Type: " + firstRobot.getArms());
        System.out.println("Robot Legs Type: " + firstRobot.getLegs());
    }
}
