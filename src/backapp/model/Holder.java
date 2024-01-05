package backapp.model;

/**
 * The {@code Holder} class represents an entity that holds information about an individual.
 * It encapsulates the essential details such as ID, first name, last name, and social security number (SSN).
 */
public final class Holder {

    /**
     * The unique identifier for the holder.
     */
    private final int id;

    /**
     * The first name of the holder.
     */
    private final String firstname;

    /**
     * The last name of the holder.
     */
    private final String lastname;

    /**
     * The social security number of the holder.
     */
    private final String ssn;

    /**
     * Constructs a new {@code Holder} with the specified details.
     *
     * @param id         The unique identifier for the holder.
     * @param firstname  The first name of the holder.
     * @param lastname   The last name of the holder.
     * @param ssn        The social security number of the holder.
     */
    public Holder(int id, String firstname, String lastname, String ssn) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    /**
     * Retrieves the unique identifier of the holder.
     *
     * @return The unique identifier.
     */
    public int getId() {
        return id;
    }

    /**
     * Retrieves the first name of the holder.
     *
     * @return The first name.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Retrieves the last name of the holder.
     *
     * @return The last name.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Retrieves the social security number of the holder.
     *
     * @return The social security number.
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Converts the holder object to a string representation.
     *
     * @return A string representation of the holder, including first name, last name, ID, and SSN.
     */
    public String converToString() {
        return "Holder: " + firstname + ", " + lastname + ", id: " + id + ", ssn: " + ssn;
    }
}
