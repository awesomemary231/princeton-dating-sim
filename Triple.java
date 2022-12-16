public class Triple {
    // type of choice. 'G' for good, 'B' for bad, 'N' for neutral.
    private char type;
    // parent key of choice.
    private int parentKey;
    // the choice.
    private Choice scene;

    // creates a triple that contains the type and parent key of a Choice.
    public Triple(char type, int parentKey, Choice scene) {
        this.type = type;
        this.parentKey = parentKey;
        this.scene = scene;
    }

    // gets the scene from the triple.
    public Choice getScene() {
        return scene;
    }

    // gets the type from the triple.
    public char getType() {
        return type;
    }

    // gets the parent key from the triple.
    public int getParentKey() {
        return parentKey;
    }

    // returns the string representation of the triple.
    public String toString() {
        return type + " " + parentKey + " " + scene.toString();
    }

    public static void main(String[] args) {
        Triple test = new Triple('G', 2, new Choice("test"));
        StdOut.println(test.getScene().toString());
        StdOut.println(test.getParentKey());
        StdOut.println(test.getType());
        StdOut.println(test.toString());
    }
}
