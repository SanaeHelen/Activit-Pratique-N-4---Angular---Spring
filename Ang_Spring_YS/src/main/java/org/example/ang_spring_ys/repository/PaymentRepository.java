package org.example.ang_spring_ys.repository;

import org.example.ang_spring_ys.entities.Payment;
import org.example.ang_spring_ys.entities.PaymentStatus;
import org.example.ang_spring_ys.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long>
{
    List<Payment> findByStudentCode(String code);
    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByType(PaymentType type);
    List<Payment> findByStudentProgramId(String programId);
}
