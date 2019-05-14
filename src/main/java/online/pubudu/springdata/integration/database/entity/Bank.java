package online.pubudu.springdata.integration.database.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Bank {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE,  generator = "seq_bank_id")
    @SequenceGenerator(name="seq_bank_id",sequenceName="seq_bank_id", allocationSize=5)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private Set<Branch> branches;

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }
}
