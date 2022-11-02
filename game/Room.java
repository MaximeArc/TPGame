import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 */
public class Room {
    private String description;
    private HashMap<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description)    {

        this.description = description;
        exits = new HashMap<>();

    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param direction The room's possible exit(s).

     */
    public Room getExit(String direction)   {

        return exits.get(direction);
    }

    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription() {
        return description;
    }

    public String getExitString()
    {
        String sorties = "Sorties :";
        for(String exit : exits.keySet())
        {
            sorties += " "+exit +" ";
        }
        return sorties;
    }

    public String getLongDescription()
    {
        return "You are " + description + "\n" + getExitString();
    }

}
