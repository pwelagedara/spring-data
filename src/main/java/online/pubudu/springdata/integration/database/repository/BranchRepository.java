package online.pubudu.springdata.integration.database.repository;

import online.pubudu.springdata.integration.database.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long>{
}
