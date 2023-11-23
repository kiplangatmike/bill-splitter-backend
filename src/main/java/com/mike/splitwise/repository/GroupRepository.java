package com.mike.splitwise.repository;

import com.mike.splitwise.entity.Group;
import com.mike.splitwise.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group,Long> {
}
