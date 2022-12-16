public class Choice {
    // scene the player is currently on.
    private String scenario;
    // choice the player is led to if the player chooses the good route.
    private Choice good;
    // choice the player is led to if the player chooses the bad route.
    private Choice bad;
    // choice the player is led to if the player chooses the neutral route.
    private Choice neutral;

    // creates a choice object that contains a scenario and good, bad and neutral
    // choices.
    public Choice(String scenario) {
        this.scenario = scenario;
        good = null;
        bad = null;
        neutral = null;
    }

    // inserts a choice in the good pointer.
    public void insertGood(Choice scene) {
        good = scene;
    }

    // inserts a choice in the bad pointer.
    public void insertBad(Choice scene) {
        bad = scene;
    }

    // inserts a choice in the neutral pointer.
    public void insertNeutral(Choice scene) {
        neutral = scene;
    }

    // gets the good choice from a choice.
    public Choice getGood() {
        return good;
    }

    // gets the bad choice from a choice.
    public Choice getBad() {
        return bad;
    }

    // gets the neutral choice from a choice.
    public Choice getNeutral() {
        return neutral;
    }

    // converts a choice to the string representation of the current scene.
    public String toString() {
        String scene = scenario.replace("_", " ");
        scene = scene.replace("+", "'");
        scene = scene.replace("(", "\"");
        scene = scene.replace("-", "\n");
        return scene;
    }

    public static void main(String[] args) {
        Choice test = new Choice("test");
        Choice good = new Choice("good");
        Choice good1 = new Choice("good_again");
        Choice bad = new Choice("bad");
        Choice neutral = new Choice("neutral");
        test.insertGood(good);
        good.insertGood(good1);
        test.insertBad(bad);
        test.insertNeutral(neutral);
        StdOut.println(test.getGood().toString());
        StdOut.println(good.getGood().toString());
        StdOut.println(test.getBad().toString());
        StdOut.println(test.getNeutral().toString());
    }
}
