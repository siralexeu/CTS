package ro.ase.acs.template;

public class Worker extends PartMover{
    @Override
    protected void liftPart() {
        System.out.println("Worker is lifting");
    }

    @Override
    protected void transportPart() {
        System.out.println("Worker is transporting");
    }

    @Override
    protected void dropPart() {
        System.out.println("Worker is dropping");
    }
}
