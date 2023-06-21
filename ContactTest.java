package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactservice.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("3453525", "joe", "shmo", "5558675309", "somewhere over the rainbow");
		assertTrue(contact.getContactID().equals("3453525"));
		assertTrue(contact.getFirstName().equals("joe"));
		assertTrue(contact.getLastName().equals("shmo"));
		assertTrue(contact.getPhone().equals("5558675309"));
		assertTrue(contact.getAddress().equals("somewhere over the rainbow"));
	}
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("345sdfgdg3525", "joe", "shmo", "5558675309", "somewhere over the rainbow");
		});
	}
	
	@Test
	void testContactIDNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "joe", "shmo", "5558675309", "somewhere over the rainbow");
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("3453525", "josephisusai", "shmo", "5558675309", "somewhere over the rainbow");
		});
	}
	
	@Test
	void testContactFirstNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("3453525", null, "shmo", "5558675309", "somewhere over the rainbow");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("3453525", "joe", "shmosdfhgsfgd", "5558675309", "somewhere over the rainbow");
		});
	}
	
	@Test
	void testContactLastNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("3453525", "joe", null, "5558675309", "somewhere over the rainbow");
		});
	}
	
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("3453525", "joe", "shmo", "005558675309", "somewhere over the rainbow");
		});
	}
	
	@Test
	void testContactPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("3453525", "joe", "shmo", "8675309", "somewhere over the rainbow");
		});
	}

	@Test
	void testContactPhoneNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("3453525", "joe", "shmo", null, "somewhere over the rainbow");
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("3453525", "joe", "shmo", "5558675309", "somewhere over the rainbow, not that rainbow");
		});
	}

	@Test
	void testContactAddressNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("3453525", "joe", "shmo", "5558675309", null);
		});
	}
	
	@Test
	void testToString() {
		Contact contact = new Contact("3453525", "joe", "shmo", "5558675309", "somewhere over the rainbow");
		assertTrue(contact.toString().equals("3453525 | joe | shmo | 5558675309 | somewhere over the rainbow\n"));
	}

}
