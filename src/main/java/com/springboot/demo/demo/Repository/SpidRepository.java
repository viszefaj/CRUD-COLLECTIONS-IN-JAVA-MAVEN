package com.springboot.demo.demo.Repository;

import com.springboot.demo.demo.Entities.Spid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpidRepository extends JpaRepository<Spid, Long> {

}
