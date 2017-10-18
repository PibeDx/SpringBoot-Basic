package com.josecuentas.SpringBootBasic.repository;

import com.josecuentas.SpringBootBasic.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer>{
	public Account findByUsername(String username);
}
