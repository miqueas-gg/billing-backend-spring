package com.mqgg.billing_backend_spring.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public abstract class Invoice {
    protected UUID id;
    protected String customerId;
    protected LocalDate issueDate;

    public Invoice(UUID id, String customerId, LocalDate issueDate) {
        this.id = id;
        this.customerId = customerId;
        this.issueDate = issueDate;
    }

    public UUID getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public abstract BigDecimal calculateTotal();

    public abstract boolean isExpired(LocalDate now);
      // return issueDate.plusDays(30).isBefore(now);
    
}
