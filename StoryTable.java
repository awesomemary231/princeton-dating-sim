public class StoryTable {
    // creates a symbol table to store the specifications for each scene.
    private ST<Integer, Triple> storyTable;

    // populates symbol table based on an input file. creates a linked list of
    // choices based on the specifications of type, parent key, scene and key in
    // the symbol table.
    public StoryTable(In gameFile) {
        storyTable = new ST<Integer, Triple>();
        while (!gameFile.isEmpty()) {
            int key = gameFile.readInt();
            gameFile.readChar();
            char type = gameFile.readChar();
            int parentKey = gameFile.readInt();
            String scene = gameFile.readLine();
            storyTable.put(key, new Triple(type, parentKey, new Choice(scene)));
        }
        for (int key : storyTable) {
            Choice currentChoice = storyTable.get(key).getScene();
            char type = storyTable.get(key).getType();
            int parentKey = storyTable.get(key).getParentKey();
            if (type == 'G') {
                Choice parentChoice = storyTable.get(parentKey).getScene();
                parentChoice.insertGood(currentChoice);
            }
            else if (type == 'B') {
                Choice parentChoice = storyTable.get(parentKey).getScene();
                parentChoice.insertBad(currentChoice);
            }
            else if (type == 'N') {
                Choice parentChoice = storyTable.get(parentKey).getScene();
                parentChoice.insertNeutral(currentChoice);
            }
        }
    }

    // gets the root of the choice ternary tree.
    public Choice getRoot() {
        return storyTable.get(1).getScene();
    }

    // prints the story table to check for bugs.
    public void printStoryTable() {
        for (int key : storyTable) {
            StdOut.println(key + " " + storyTable.get(key).toString());
        }
    }


    public static void main(String[] args) {
        In gameFile = new In("tigerStory.txt");
        In gameFile2 = new In("nassauStory.txt");
        StoryTable tigerStory = new StoryTable(gameFile);
        StoryTable nassauStory = new StoryTable(gameFile2);
        tigerStory.printStoryTable();
        nassauStory.printStoryTable();
        StdOut.print(tigerStory.getRoot());
    }
}
