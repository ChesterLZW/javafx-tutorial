public class Duke {
    private String commandType = "Default";

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        String trimmedInput = input.trim();
        if (trimmedInput.isEmpty()) {
            commandType = "Error";
            return "Please enter a message.";
        }

        String commandWord = trimmedInput.split("\\s+", 2)[0].toLowerCase();
        switch (commandWord) {
        case "todo":
        case "deadline":
        case "event":
            commandType = "AddCommand";
            break;
        case "mark":
            commandType = "ChangeMarkCommand";
            break;
        case "delete":
            commandType = "DeleteCommand";
            break;
        default:
            commandType = "Default";
            break;
        }
        return "Duke heard: " + input;
    }

    public String getCommandType() {
        return commandType;
    }
}
