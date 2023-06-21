package contactservice;
import java.util.ArrayList;

public class ContactService {
    /*public static void main(String[] args) {
        ContactList contactList = new ContactList("contactList");
        contactList.addContact(new Contact("345345345", "joe", "shmo", "5558675309", "somewhere out there"));
        contactList.addContact(new Contact("343253452", "mike", "deez", "4566456566", "in the USA"));
        contactList.addContact(new Contact("324523534", "steve", "ooooo", "8797855458", "in the hood"));
        contactList.addContact(new Contact("123190890", "poly", "heeeeyy", "1234568678", "church"));
        
        System.out.println(contactList);
        System.out.println();
        
        contactList.removeByID("324523534");
        System.out.println(contactList);
        System.out.println();
        
        contactList.updateByID("343253452", "poly", "heeeeyy", "1234568678", "church");
        
        System.out.println(contactList);
        System.out.println();
        
    }
}
class ContactList {*/
    String contactListName = "Contact List:";
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    /*public ContactList(String name) {
        this.name = name;
    }*/

    public void addContact(Contact c) {
        contacts.add(c);
    }
    
    public Contact removeByID(String contactID) {
    	for (Contact c : this.contacts) {
    		if (c.getContactID().equals(contactID)) {
    			contacts.remove(contacts.indexOf(c));
	    		return null;
    		}
    	}
    	return null;
    }
    
    public Contact updateByID(String contactID, String firstName, String lastName, String phone, String address) {
    	for (Contact c : this.contacts) {
            if (c.getContactID().equals(contactID)) {
            	contacts.set(contacts.indexOf(c), new Contact(contactID, firstName, lastName, phone, address));
                return c;
            }
        }
        return null;
    }

    public String toString() {
        String s = "";
        s += this.contactListName;
        for (Contact c : this.contacts) {
            s += "\n  " + c;
        }
        return s;
    }
}
