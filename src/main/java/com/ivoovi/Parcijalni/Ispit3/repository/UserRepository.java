package com.ivoovi.Parcijalni.Ispit3.repository;


import com.ivoovi.Parcijalni.Ispit3.domain.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Long> {
    public UserInfo findByUsername(String username);
}
