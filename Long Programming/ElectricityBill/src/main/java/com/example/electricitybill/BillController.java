package com.example.electricitybill;

import com.example.electricitybill.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
public class BillController {

    @Autowired
    private BillService service;

    @PostMapping
    public ResponseEntity<BillEntity> createBill(@RequestBody BillEntity bill) {
        return ResponseEntity.ok(service.createBill(bill));
    }

    @GetMapping
    public ResponseEntity<List<BillEntity>> getAllBills() {
        return ResponseEntity.ok(service.getAllBills());
    }

    @PutMapping("/{id}/pay")
    public ResponseEntity<BillEntity> payBill(@PathVariable Long id) {
        return ResponseEntity.ok(service.payBill(id));
    }
}