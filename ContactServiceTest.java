package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactservice.Contact;
import contactservice.ContactService;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("3453525", "joe", "shmo", "5558675309", "somewhere over the rainbow");
		
		contactService.addContact(contact);
		assertTrue(contactService.toString().equals("Contact List:\n  3453525 | joe | shmo | 5558675309 | somewhere over the rainbow\n"));
	}
	
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("3453525", "joe", "shmo", "5558675309", "somewhere over the rainbow");
		
		contactService.addContact(contact);
		
		contactService.updateByID("3453525", "mike", "ike", "5551234567", "at the mall");
		assertTrue(contactService.toString().equals("Contact List:\n  3453525 | mike | ike | 5551234567 | at the mall\n"));
		assertNull(contactService.updateByID(null, null, null, null, null));
	}

	@Test
	void testRemoveContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("3453525", "joe", "shmo", "5558675309", "somewhere over the rainbow");
		
		contactService.addContact(contact);
		
		contactService.removeByID("3453525");
		assertTrue(contactService.toString().equals("Contact List:"));
		assertNull(contactService.removeByID(null));
	}

}
