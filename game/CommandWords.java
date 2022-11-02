import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class is part of the "World of Advenrture" application. 
 *
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 */

public class CommandWords {
    // a constant array that holds all valid command words
    private static ArrayList<String> validCommands = new ArrayList<>();

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()   {
        validCommands = new ArrayList<>();
        for(CommandWord command : CommandWord.values()){
            if(command != CommandWord.UNKNOWN)
                validCommands.add(command.toString());
        }
    }

    public CommandWord getCommandWord(String e){
        CommandWord command = CommandWord.UNKNOWN;
        for(String value : this.validCommands){
            if(value.equals(e)) {
                command = CommandWord.valueOf(e);
            }
        }
        return command;
    }

    /**
     * Check whether a given String is a valid command word. 
     * @return true if a given string is a valid command,
     * false if it isn't.
     */
    public boolean isCommand(String s)  {
        for(int i = 0; i < validCommands.size(); i++) {
            if(validCommands.get(i).equals(s))
                return true;
        }
        // if we get here, the string was not found in the commands
        return false;
    }
}
