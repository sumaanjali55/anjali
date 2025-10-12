package entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private String ename;
    private double esal;

    // Getters and Setters
    public int getEid() { return eid; }
    public void setEid(int eid) { this.eid = eid; }

    public String getEname() { return ename; }
    public void setEname(String ename) { this.ename = ename; }

    public double getEsal() { return esal; }
    public void setEsal(double esal) { this.esal = esal; }
}

