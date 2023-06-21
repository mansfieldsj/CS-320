package contactservice;

public class Contact {
    final String contactID;
    String firstName, lastName, phone, address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        
    	if(contactID == null || contactID.length()>10) {
    		throw new IllegalArgumentException("Invalid ID");
    	}
    	
    	if(firstName == null || firstName.length()>10) {
    		throw new IllegalArgumentException("Invalid First Name");
    	}
    	
    	if(lastName == null || lastName.length()>10) {
    		throw new IllegalArgumentException("Invalid Last Name");
    	}
    	
    	if(phone == null || phone.length()!=10) {
    		throw new IllegalArgumentException("Invalid Phone");
    	}
    	
    	if(address == null || address.length()>30) {
    		throw new IllegalArgumentException("Invalid Address");
    	}
    	
    	this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactID() { 
    	return contactID; 
    }
    public String getFirstName() { 
    	return firstName; 
    }
    public String getLastName() { 
    	return lastName; 
    }
    public String getPhone() { 
    	return phone; 
    }
    public String getAddress() { 
    	return address; 
    }

    public String toString() {
        return this.contactID + " | " + this.firstName + " | " + this.lastName + " | " + this.phone + " | " + this.address + "\n";
    }
}