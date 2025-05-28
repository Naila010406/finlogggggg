package entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class Transaction {
    private Long id;
    private String type;
    private Date date;
    private String category;
    private BigDecimal amount;
    private String notes;
    private Timestamp createdAt;
    
    public Transaction() {}
    public Transaction(
            Long id,
            String type,
            Date date,
            String category,
            BigDecimal amount,
            String notes
    ) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.notes = notes;
    }

    // Getters
    public Long getId() { return id; }
    public String getType() { return type; }
    public Date getDate() { return date; }
    public String getCategory() { return category; }
    public BigDecimal getAmount() { return amount; }
    public String getNotes() { return notes; }
    public Timestamp getCreatedAt() { return createdAt; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setType(String type) { this.type = type; }
    public void setDate(Date date) { this.date = date; }
    public void setCategory(String category) { this.category = category; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
    public void setNotes(String notes) { this.notes = notes; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
}
