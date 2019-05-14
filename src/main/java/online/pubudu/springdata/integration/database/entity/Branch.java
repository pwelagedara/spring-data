package online.pubudu.springdata.integration.database.entity;

import javax.persistence.*;

@Entity
public class Branch {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE,  generator = "seq_bank_id")
    @SequenceGenerator(name="seq_bank_id",sequenceName="seq_bank_id", allocationSize=5)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "bank_id", nullable = false)
    private Bank bank;

    @Column(nullable = false)
    private String routingNumber;

    public Branch() {
    }

    public Branch(String name, Bank bank, String routingNumber) {
        this.name = name;
        this.bank = bank;
        this.routingNumber = routingNumber;
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

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
}
