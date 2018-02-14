package seedu.addressbook.data.person;

/**
 * Represents a Person's Street in the address book.
 */
public class Street {

    public static final String EXAMPLE = "Something Ave 3";

    public final String value;
    private boolean isPrivate;

    public Street(String street, boolean isPrivate){
        this.isPrivate = isPrivate;
        this.value = street.trim();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && this.value.equals(((Street) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
