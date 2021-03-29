package com.kompraok.admin.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.kompraok.common.entity.Role;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)

public class RoleRepositoryTests {

	@Autowired
	private RoleRepository repository;

	@Test
	public void testCreateFirstRole() {
		Role roleAdmin = new Role("Admin","manage everything");
		Role saveRole = repository.save(roleAdmin);
		assertThat(saveRole.getId()).isGreaterThan(0);
		
	}


}
