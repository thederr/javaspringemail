package com.mab.javaemail.appuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@org.springframework.stereotype.Repository
@Transactional(readOnly = true)
public interface AppUserRepository extends
        JpaRepository<AppUser, Long> {
    Optional<AppUser> findByEmail(String email);
}
