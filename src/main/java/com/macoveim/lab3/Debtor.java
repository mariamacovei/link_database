package com.macoveim.lab3;

public class Debtor {
    private long id;
    private String lastName;
    private String firstName;
    private String cnp;
    private String locality;

    public Debtor(long id, String lastName, String firstName, String cnp, String locality) {
        this.setId(id);
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setCnp(cnp);
        this.setLocality(locality);
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLocality() {
        return locality;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Debtor{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", cnp='" + cnp + '\'' +
                ", locality='" + locality + '\'' +
                '}';
    }
}