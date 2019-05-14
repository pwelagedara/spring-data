package online.pubudu.springdata.integration.database.repository;

import online.pubudu.springdata.integration.database.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long>{
}
