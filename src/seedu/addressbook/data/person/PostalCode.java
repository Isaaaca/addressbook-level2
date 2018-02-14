package seedu.addressbook.data.person;

/**
 * Represents a Person's PostalCode in the address book.
 */
public class PostalCode {

    public static final String EXAMPLE = "425261";

    public final String value;
    private boolean isPrivate;

    public PostalCode(String postalCode, boolean isPrivate){
        this.isPrivate = isPrivate;
        this.value = postalCode.trim();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PostalCode // instanceof handles nulls
                && this.value.equals(((PostalCode) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}