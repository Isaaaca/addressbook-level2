package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.data.person.UniquePersonList;

import java.util.List;


/**
 * Lists all persons in the address book to the user ordered by name.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Lists all persons in the address book sorted by name.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        UniquePersonList personList = addressBook.getAllPersons();
        personList.sort();
        List<ReadOnlyPerson> allPersons = personList.immutableListView();
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }
}