package com.springboot.demo.demo.Repository;

import com.springboot.demo.demo.Entities.Spid;
import com.springboot.demo.demo.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpidRepository extends JpaRepository<Spid, Long> {
    Optional<Spid> findById(Long id);
    public Spid changeSpidStatus(long id) throws Exception;
    public Spid findSpidById(long id) throws Exception;

}
