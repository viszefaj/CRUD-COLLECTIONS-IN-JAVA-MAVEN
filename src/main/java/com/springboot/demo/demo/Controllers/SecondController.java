package com.springboot.demo.demo.Controllers;

import com.springboot.demo.demo.Entities.Spid;
import com.springboot.demo.demo.services.SpidService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/spid")
public class SecondController{
    SpidService spidService;

    SecondController(SpidService spidService){
        this.spidService=spidService;
    }
    //get all spids
    @GetMapping("/spids")
    public List<Spid> retrieveAllSpids() throws Exception {
        return spidService.retrieveAllSpids();
    }

    //get one spid
    @GetMapping("/spid/{id}")
    public Optional<Spid> getSpidId(@PathVariable("id") Long id)
    {
        return spidService.getSpidId(id);
    }

    //create spid
    @PostMapping("/create")
    public String createSpid(
            @RequestBody Spid spid
    ) throws Exception {
        spidService.createSpid(spid);
        return  "Spid has been registered :" + spid.getId();
    }
    //delete spid
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteSpid(
            @PathVariable(name = "id") long id
    ) throws Exception {
        spidService.deleteSpid(id);
        return new ResponseEntity("Spid has been deleted", HttpStatus.OK);
    }
    //update spid status
    @PutMapping("/changeStatus/{id}")
    public ResponseEntity<Spid> changeSpidStatus(
            @PathVariable (name = "id")Long id) throws Exception {
        return new ResponseEntity(spidService.changeStatus(id),HttpStatus.OK);
    }

    //Find a spid
    @GetMapping("/spid/{id}")
    public ResponseEntity<Spid> getSpid(
            @PathVariable(name = "id") long id
    ) throws Exception {
        return new ResponseEntity(spidService.findSpidById(id), HttpStatus.OK);
    }
}
