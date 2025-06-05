package ro.ase.acs.template;

public class RoboticArm extends PartMover {
    @Override
    protected void liftPart() {
        System.out.println("Robotic arm is lifting");
    }

    @Override
    protected void transportPart() {
        System.out.println("Robotic arm is transporting");
    }

    @Override
    protected void dropPart() {
        System.out.println("Robotic arm is dropping");
    }
}
