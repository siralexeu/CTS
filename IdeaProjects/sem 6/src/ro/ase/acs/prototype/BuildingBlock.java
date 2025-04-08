package ro.ase.acs.prototype;

public abstract class BuildingBlock {
    protected int x, y, z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        BuildingBlock copy = (BuildingBlock) super.clone();
        copy.x = this.x;
        copy.y = this.y;
        copy.z = this.z;
        return copy;
    }

    public abstract void render();
}
