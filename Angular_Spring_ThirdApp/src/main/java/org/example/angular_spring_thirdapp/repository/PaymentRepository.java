package org.example.angular_spring_thirdapp.repository;

import org.example.angular_spring_thirdapp.entities.Payment;
import org.example.angular_spring_thirdapp.entities.PaymentStatus;
import org.example.angular_spring_thirdapp.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long>
{
    List<Payment> findByStudentCode(String code);
    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByType(PaymentType type);
    List<Payment> findByStudentProgramId(String programId);
}
