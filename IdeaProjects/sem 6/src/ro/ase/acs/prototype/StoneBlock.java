package ro.ase.acs.prototype;

public class StoneBlock extends BuildingBlock implements Cloneable{
    private byte[] texture;

    public StoneBlock() {
        System.out.println("Loading texture...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        texture = new byte[]{5, 6, 7, 8, 9};
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        StoneBlock stoneBlock = (StoneBlock) super.clone();
        stoneBlock.texture = texture.clone();
        return stoneBlock;
    }

    @Override
    public void render() {
        System.out.println("Rendering wood block at (" + x + ", " + y + ", " + z + ")");
    }
}
