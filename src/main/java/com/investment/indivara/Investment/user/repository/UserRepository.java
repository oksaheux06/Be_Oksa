package com.investment.indivara.Investment.user.repository;

import com.investment.indivara.Investment.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository  extends JpaRepository <User,Long> {
}
