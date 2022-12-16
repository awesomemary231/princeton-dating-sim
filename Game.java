public class Game {
    public static void main(String[] args) {
        // create story tables with input story text files.
        In tigerStoryFile = new In("tigerStory.txt");
        StoryTable tigerStory = new StoryTable(tigerStoryFile);
        In nassauStoryFile = new In("nassauStory.txt");
        StoryTable nassauStory = new StoryTable(nassauStoryFile);
        In witherspoonStoryFile = new In("witherspoonStory.txt");
        StoryTable witherspoonStory = new StoryTable(witherspoonStoryFile);
        // create user input and game output objects.
        In userInput = new In();
        Out gameOutput = new Out();
        boolean completedTiger = false;
        boolean completedNassau = false;
        boolean completedWitherspoon = false;
        boolean playAnother = true;
        gameOutput.println("Welcome to Princeton Dating Sim. What is your name, player?");
        String userName = userInput.readString();
        gameOutput.println("Hello " + userName + "! This is a game all about the single"
                                   + " young students at Princeton. Do you have "
                                   + "enough social skills to be able to properly "
                                   + "interact and date Princeton students? Choose a "
                                   + "character route and find out.");
        // operates the game while user wants to continue to play another route.
        while (playAnother) {
            gameOutput.print("Type ");
            if (!completedTiger) {
                gameOutput.print("'1' ");
            }
            if (!completedNassau) {
                gameOutput.print(" '2' ");
            }
            if (!completedWitherspoon) {
                gameOutput.print(" '3' ");
            }
            gameOutput.println("to choose which character you want to play.");
            if (!completedTiger) {
                gameOutput.println("1. Tiger");
            }
            if (!completedNassau) {
                gameOutput.println("2. Nassau");
            }
            if (!completedWitherspoon) {
                gameOutput.println("3. Witherspoon");
            }
            int characterChoice = userInput.readInt();
            // executes if user chooses tiger as a character route.
            if (characterChoice == 1) {
                boolean giveUp = false;
                boolean playAgain = false;
                do {
                    Choice start = tigerStory.getRoot();
                    Choice scene = start;
                    boolean goodEnding = false;
                    gameOutput.println(start.toString());
                    while (scene.getGood() != null) {
                        int userChoice = userInput.readInt();
                        if (userChoice == 1) {
                            scene = scene.getGood();
                            gameOutput.println(scene.toString());
                            goodEnding = true;
                        }
                        if (userChoice == 2) {
                            scene = scene.getBad();
                            gameOutput.println(scene.toString());
                            goodEnding = false;
                        }
                        if (userChoice == 3) {
                            scene = scene.getNeutral();
                            gameOutput.println(scene.toString());
                            goodEnding = false;
                        }
                    }
                    if (!goodEnding) {
                        gameOutput.println(
                                "Enter '1' if you want to try again and '2' if you want to give up.");
                        int tryAgain = userInput.readInt();
                        if (tryAgain == 1) {
                            playAgain = true;
                        }
                        if (tryAgain == 2) {
                            giveUp = true;
                        }
                    }
                    else {
                        playAgain = false;
                        completedTiger = true;
                        gameOutput.println("Congratulations for getting together with Tiger!");
                        if (!completedNassau && !completedWitherspoon) {
                            gameOutput.println(
                                    "GAME OVER. Would you like to play another character route?");
                            gameOutput.println("Enter '1' for yes and '2' for no.");
                            int anotherChar = userInput.readInt();
                            if (anotherChar == 2) {
                                playAnother = false;
                            }
                        }
                    }
                }
                while (playAgain);
                if (giveUp) {
                    break;
                }
            }
            // executes if user chooses nassau as character route.
            if (characterChoice == 2) {
                boolean giveUp = false;
                boolean playAgain = false;
                do {
                    Choice start = nassauStory.getRoot();
                    Choice scene = start;
                    boolean goodEnding = false;
                    gameOutput.println(start.toString());
                    while (scene.getGood() != null) {
                        int userChoice = userInput.readInt();
                        if (userChoice == 1) {
                            scene = scene.getGood();
                            gameOutput.println(scene.toString());
                            goodEnding = true;
                        }
                        if (userChoice == 2) {
                            scene = scene.getBad();
                            gameOutput.println(scene.toString());
                            goodEnding = false;
                        }
                        if (userChoice == 3) {
                            scene = scene.getNeutral();
                            gameOutput.println(scene.toString());
                            goodEnding = false;
                        }
                    }
                    if (!goodEnding) {
                        gameOutput.println(
                                "Enter '1' if you want to try again and '2' if you want to give up.");
                        int tryAgain = userInput.readInt();
                        if (tryAgain == 1) {
                            playAgain = true;
                        }
                        if (tryAgain == 2) {
                            giveUp = true;
                        }
                    }
                    else {
                        playAgain = false;
                        completedNassau = true;
                        gameOutput.println("Congratulations for getting together with Nassau!");
                        if (!completedTiger && !completedWitherspoon) {
                            gameOutput.println(
                                    "GAME OVER. Would you like to play another character route?");
                            gameOutput.println("Enter '1' for yes and '2' for no.");
                            int anotherChar = userInput.readInt();
                            if (anotherChar == 2) {
                                playAnother = false;
                            }
                        }
                    }
                }
                while (playAgain);
                if (giveUp) {
                    break;
                }
            }
            // executes if user chooses witherspoon as character route.
            if (characterChoice == 3) {
                boolean giveUp = false;
                boolean playAgain = false;
                do {
                    Choice start = witherspoonStory.getRoot();
                    Choice scene = start;
                    boolean goodEnding = false;
                    gameOutput.println(start.toString());
                    while (scene.getGood() != null) {
                        int userChoice = userInput.readInt();
                        if (userChoice == 1) {
                            scene = scene.getGood();
                            gameOutput.println(scene.toString());
                            goodEnding = true;
                        }
                        if (userChoice == 2) {
                            scene = scene.getBad();
                            gameOutput.println(scene.toString());
                            goodEnding = false;
                        }
                        if (userChoice == 3) {
                            scene = scene.getNeutral();
                            gameOutput.println(scene.toString());
                            goodEnding = false;
                        }
                    }
                    if (!goodEnding) {
                        gameOutput.println(
                                "Enter '1' if you want to try again and '2' if you want to give up.");
                        int tryAgain = userInput.readInt();
                        if (tryAgain == 1) {
                            playAgain = true;
                        }
                        if (tryAgain == 2) {
                            giveUp = true;
                        }
                    }
                    else {
                        completedWitherspoon = true;
                        playAgain = false;
                        gameOutput
                                .println("Congratulations for getting together with Witherspoon!");
                        if (!completedNassau && !completedTiger) {
                            gameOutput.println(
                                    "GAME OVER. Would you like to play another character route?");
                            gameOutput.println("Enter '1' for yes and '2' for no.");
                            int anotherChar = userInput.readInt();
                            if (anotherChar == 2) {
                                playAnother = false;
                            }
                        }
                    }
                }
                while (playAgain);
                if (giveUp) {
                    break;
                }
            }
            // breaks out of loop if all three characters have been played and won.
            if (completedTiger && completedNassau && completedWitherspoon) {
                break;
            }
        }
        gameOutput.println("Thanks for playing Princeton Dating Sim, " + userName + "!");
    }
}
