package ro.ase.acs.template;

public abstract class PartMover {
    public final void movePart() {
        liftPart();
        transportPart();
        dropPart();
    }

    protected abstract void liftPart();
    protected abstract void transportPart();
    protected abstract void dropPart();

}
