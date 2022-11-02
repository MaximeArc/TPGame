public enum CommandWord {

    LOOK("look"), HELP("help"), QUIT("quit"), GO("go"), UNKNOWN(null);

    private String commandWord;
    CommandWord(String s) {
        this.commandWord=s;
    }

    public String toString(){
        return commandWord;
    }

}
