package structural.patterns.proxy;

/**
 * Company class holds the reference to the expensive ContactList
 * in order to reduce it. We use the structural.patterns.proxy object which implements the same
 * interface as ContactList.
 */

public class Company {
    private String companyName;
    private String companyAddress;
    private String companyContactNo;
    private ContactList contactList;

    public Company(String companyName, String companyAddress, String companyContactNo, ContactList contactList) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyContactNo = companyContactNo;
        this.contactList = contactList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyContactNo() {
        return companyContactNo;
    }

    public ContactList getContactList() {
        return contactList;
    }
}
