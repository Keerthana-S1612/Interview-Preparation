package com.example.electricitybill;

import com.example.electricitybill.BillEntity;
import com.example.electricitybill.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillRepository repository;

    public BillEntity createBill(BillEntity bill) {
        int units = bill.getCurrentReading() - bill.getPreviousReading();
        bill.setUnitsConsumed(units);
        bill.setTotalAmount(units * bill.getRatePerUnit());
        bill.setStatus("UNPAID");
        return repository.save(bill);
    }

    public List<BillEntity> getAllBills() {
        return repository.findAll();
    }

    public BillEntity payBill(Long id) {
        BillEntity bill = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bill not found!"));
        bill.setStatus("PAID");
        return repository.save(bill);
    }
}