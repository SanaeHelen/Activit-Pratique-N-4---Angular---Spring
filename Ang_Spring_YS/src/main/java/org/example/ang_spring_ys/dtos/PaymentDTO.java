package org.example.ang_spring_ys.dtos;

import lombok.*;
import org.example.ang_spring_ys.entities.PaymentStatus;
import org.example.ang_spring_ys.entities.PaymentType;

import java.time.LocalDate;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class PaymentDTO {
    private Long id;
    private LocalDate date;
    private double amount;
    private PaymentType type;
    private PaymentStatus status;
}

