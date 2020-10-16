package com.example.demo.repository;

import com.example.demo.entity.PersistentLogins;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersistenLoginsRepository extends JpaRepository<PersistentLogins, Integer> {
}
