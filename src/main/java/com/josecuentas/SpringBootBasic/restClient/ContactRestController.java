package com.josecuentas.SpringBootBasic.restClient;

import com.josecuentas.SpringBootBasic.entity.BaseEntity;
import com.josecuentas.SpringBootBasic.entity.Contact;
import com.josecuentas.SpringBootBasic.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactRestController {

	@Autowired
	private ContactRepository contactRepository;

	@GetMapping(path = "/")
	public @ResponseBody ResponseEntity<BaseEntity> getAllUser() {
		BaseEntity<Iterable<Contact>> response = new BaseEntity<>();
		response.status = BaseEntity.SUCCESS;
		response.msg = "OK";
		response.data = contactRepository.findAll();
		return new ResponseEntity<BaseEntity>(response, HttpStatus.OK);
	}

	@PostMapping(path = "/add")
	public @ResponseBody ResponseEntity<Contact> addNewUser(@RequestBody Contact contact) {
		contact.id = 0;
		contactRepository.save(contact);
		return new ResponseEntity<>(contact, HttpStatus.OK);
	}

	@PutMapping(path = "/update")
	public @ResponseBody ResponseEntity<Contact> updateUser(@RequestBody Contact contact) {
		contactRepository.save(contact);
		return new ResponseEntity<>(contact, HttpStatus.OK);
	}

	@DeleteMapping(path = "/delete/{id}")
	public @ResponseBody ResponseEntity<BaseEntity> deleteUser(@PathVariable("id") Integer id) {
		try {
			contactRepository.delete(id);
		} catch (Exception e) {
			BaseEntity<Contact> response = new BaseEntity<Contact>();
			response.status = BaseEntity.ERROR;
			response.msg = e.getMessage();
			return new ResponseEntity<BaseEntity>(response, HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.OK);
	}
}
