public class OldRobotBuilder implements RobotBuilder{

    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }
    /**
     *
     */
    @Override
    public void buildHead() {
        robot.setRobotHead("Tin Head");
    }

    /**
     *
     */
    @Override
    public void buildTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    /**
     *
     */
    @Override
    public void buildArms() {
        robot.setRobotArms("Blow Torch Arms");
    }

    /**
     *
     */
   public void buildLegs() {
        robot.setRobotLegs("Roller Blade Legs");
    }

    /**
     * @return
     */
    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
