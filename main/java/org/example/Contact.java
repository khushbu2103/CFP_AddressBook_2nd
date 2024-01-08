package org.example;

/**
 * The Contact class represents a contact with various personal details.
 */
public class Contact {
    // Private fields to store contact information
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;

    /**
     * Overrides the toString method to provide a string representation of the Contact object.
     *
     * @return A string containing all the contact details.
     */
    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    // Getter methods to retrieve individual contact details

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods to update individual contact details

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Constructs a Contact object with the provided contact details.
     *
     * @param firstName   The first name of the contact.
     * @param lastName    The last name of the contact.
     * @param address     The address of the contact.
     * @param city        The city of the contact.
     * @param state       The state of the contact.
     * @param zipCode     The zip code of the contact.
     * @param phoneNumber The phone number of the contact.
     * @param email       The email address of the contact.
     */
    public Contact(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
