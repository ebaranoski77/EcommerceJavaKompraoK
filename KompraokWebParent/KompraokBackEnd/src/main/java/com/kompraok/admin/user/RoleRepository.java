package com.kompraok.admin.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kompraok.common.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}