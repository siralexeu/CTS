package ro.ase.acs.prototype;

public class WoodBlock extends BuildingBlock implements Cloneable{
    private byte[] texture;

    public WoodBlock() {
        System.out.println("Loading texture...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        texture = new byte[]{1, 2, 3, 4, 5};
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        WoodBlock woodBlock = (WoodBlock) super.clone();
        woodBlock.texture = texture.clone();
        return woodBlock;
    }

    @Override
    public void render() {
        System.out.println("Rendering wood block at (" + x + ", " + y + ", " + z + ")");
    }
}
