package seedu.addressbook.data.person;


/**
 * Represents a Person's Blocks in the address book.s
 */
public class Block {

    public static final String EXAMPLE = "123";
    public final String value;
    private boolean isPrivate;

    public Block(String block, boolean isPrivate){
        this.isPrivate = isPrivate;
        this.value = block.trim();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Block // instanceof handles nulls
                && this.value.equals(((Block) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
