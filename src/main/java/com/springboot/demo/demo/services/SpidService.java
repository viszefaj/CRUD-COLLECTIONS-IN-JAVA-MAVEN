package com.springboot.demo.demo.services;

import com.springboot.demo.demo.Entities.Spid;
import com.springboot.demo.demo.Entities.SpidStatus;
import com.springboot.demo.demo.Repository.SpidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpidService {
    @Autowired
    SpidRepository spidRepository;

    public List<Spid> retrieveAllSpids() throws Exception {
        if (spidRepository.findAll().isEmpty()) {
            throw new Exception("There are no spids");
        }
        return spidRepository.findAll();
    }

    public Spid createSpid(Spid spid){
        return spidRepository.save(spid);
    }

    public void deleteSpid(long id) throws Exception {
        Optional<Spid> findSpid = spidRepository.findById(id);
        if (findSpid.get().getStatus() != SpidStatus.PENDING) {
            throw new Exception("Spid must be deleted only if its status is pending");
        }
        spidRepository.delete(findSpid.get());
    }

    public Spid changeStatus (Long id) throws Exception{
        Optional<Spid> findSpid = spidRepository.findById(id);
        if (findSpid.get().getStatus().equals(SpidStatus.PENDING)){
            findSpid.get().setStatus(SpidStatus.READY_FOR_REVIEW);
        }else throw new Exception("Status is already READY_FOR_REVIEW");
        Spid changedStatusSaved = findSpid.get();
        return changedStatusSaved;
    }

}
