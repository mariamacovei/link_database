package com.macoveim.lab3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@RestController
@RequestMapping("/debtor")

public class DebtorWebService {
    @Autowired
    private DebtorRepository debtorRepository;

    @GetMapping
    public List<Debtor> findAll(){
        return debtorRepository.findAll();
    }
    @PostMapping
    public void save (@RequestBody Debtor debtor){
        debtorRepository.save(debtor);
    }
    @DeleteMapping("/{cnp}")
    public void delete(@PathVariable String cnp){
        debtorRepository.delete(cnp);
    }
}
