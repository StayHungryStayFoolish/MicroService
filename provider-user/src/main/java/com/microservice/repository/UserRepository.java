package com.microservice.repository;

import com.microservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bonismo@hotmail.com
 * 下午1:33 on 17/12/8.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
