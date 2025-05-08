package ro.ase.acs.flyweight;

public class CustomCharacter implements TextCharacter {
    private byte[] image;
    private char character;

    public CustomCharacter(byte[] image, char character) {
        this.character = character;
        this.image = image;
    }

    @Override
    public void display(CharacterPosition characterPosition) {
        System.out.println(character + " " + characterPosition.getLine() + ": " + characterPosition.getColumn());
    }
}
