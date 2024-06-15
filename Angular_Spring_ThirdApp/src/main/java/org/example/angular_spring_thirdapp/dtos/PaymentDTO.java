package org.example.angular_spring_thirdapp.dtos;

import lombok.*;
import org.example.angular_spring_thirdapp.entities.PaymentStatus;
import org.example.angular_spring_thirdapp.entities.PaymentType;

import java.time.LocalDate;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class PaymentDTO {
    private Long id;
    private LocalDate date;
    private double amount;
    private PaymentType type;
    private PaymentStatus status;
}

