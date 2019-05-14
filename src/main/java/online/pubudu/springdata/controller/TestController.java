package online.pubudu.springdata.controller;

import online.pubudu.springdata.integration.database.entity.Bank;
import online.pubudu.springdata.integration.database.repository.BankRepository;
import online.pubudu.springdata.integration.database.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class TestController {

    @Autowired
    private BankRepository bankRepository;

    @Autowired
    private BranchRepository branchRepository;

    @GetMapping("/insert")
    public String insert() {

        Bank bank = new Bank(UUID.randomUUID().toString());
        bankRepository.save(bank);

        return "Okay";
    }

    @GetMapping("/retrieve")
    public String retrieve() {

        List<Bank> bankList = bankRepository.findAll();

        String commaSeperatedBankNames = String.join(",", bankList.stream().map(b -> b.getName()).collect(Collectors.toList()));
        return commaSeperatedBankNames;
    }
}
