package org.example.angular_spring_thirdapp.web;


import org.example.angular_spring_thirdapp.entities.Payment;
import org.example.angular_spring_thirdapp.entities.PaymentStatus;
import org.example.angular_spring_thirdapp.entities.PaymentType;
import org.example.angular_spring_thirdapp.entities.Student;
import org.example.angular_spring_thirdapp.repository.PaymentRepository;
import org.example.angular_spring_thirdapp.repository.StudentRepository;
import org.example.angular_spring_thirdapp.services.PaymentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("*")
public class PaymentRestController
{
    private StudentRepository studentRepository;
    private PaymentRepository paymentRepository;

    private PaymentService paymentService;

    public PaymentRestController(StudentRepository studentRepository, PaymentRepository paymentRepository, PaymentService paymentService) {
        this.studentRepository = studentRepository;
        this.paymentRepository = paymentRepository;
        this.paymentService = paymentService;
    }

    @GetMapping(path="/payments")
    public List<Payment> allPayments()
    {
        return paymentRepository.findAll();
    }

    @GetMapping("/students/{code}/payments")
    public List<Payment> paymentsByStudent(@PathVariable String code)
    {
        return paymentRepository.findByStudentCode(code);
    }


    // screen solution
    @GetMapping("/payments/byStatus")
    public List<Payment> paymentsByStatus(@RequestParam PaymentStatus status)
    {
        return paymentRepository.findByStatus(status);
    }

    @GetMapping("/payments/byType")
    public List<Payment> paymentsByType(@RequestParam PaymentType type)
    {
        return paymentRepository.findByType(type);
    }
    @GetMapping("/payments/byProgramId")
    public List<Payment> getPaymentsByProgramId(@RequestParam String programId) {
        return paymentRepository.findByStudentProgramId(programId);
    }


    @GetMapping(path="/payments/{id}")
    public Payment getPaymentById(@PathVariable Long id)
    {
        return paymentRepository.findById(id).get();
    }

    @GetMapping(path = "/students")
    public List<Student> allStudents()
    {
        return studentRepository.findAll();
    }

    @GetMapping(path ="/students/{code}")
    public Student getStudentByCode(@PathVariable String code)
    {
        return studentRepository.findByCode(code);
    }

    @GetMapping(path = "/studentsByProgramId")
    public List<Student> getStudentsByProgramId(@RequestParam String programId)
    {
        return studentRepository.findByProgramId(programId);
    }

    @PutMapping("/payments/{paymentId}/updateStatus")
    public Payment updatePaymentStatus(@RequestParam PaymentStatus status, @PathVariable Long paymentId){
        return paymentService.updatePaymentStatus(status,paymentId);
    }
    @PostMapping(path="/payments", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Payment savePayment(@RequestParam MultipartFile file, double amount, PaymentType type,
                               LocalDate date, String studentCode) throws IOException {
        return paymentService.savePayment(file,amount,type,date,studentCode);
    }
    @GetMapping(path="payments/{id}/file",produces = MediaType.APPLICATION_PDF_VALUE)
    public byte[] getPaymentFile(@PathVariable Long id) throws IOException {
        return paymentService.getPaymentFile(id);
    }


}
