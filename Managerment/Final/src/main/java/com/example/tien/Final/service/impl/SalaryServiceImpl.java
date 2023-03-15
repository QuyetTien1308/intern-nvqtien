package com.example.tien.Final.service.impl;

import com.example.tien.Final.Dto.EmployeeDto;
import com.example.tien.Final.Dto.PositionDto;
import com.example.tien.Final.Dto.SalaryDto;
import com.example.tien.Final.entity.Employee;
import com.example.tien.Final.entity.Position;
import com.example.tien.Final.entity.Salary;
import com.example.tien.Final.repos.SalaryRepository;
import com.example.tien.Final.service.PositionService;
import com.example.tien.Final.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private SalaryRepository salaryRepository;
    @Autowired
    private PositionService positionService;
    @Override
    public List<SalaryDto> getSalary(){
        List<Salary> salaries=salaryRepository.findAll();
        List<SalaryDto> salaryDtos=new ArrayList<>();
        for (Salary salary : salaries){
            SalaryDto salaryDto = SalaryDto.builder()
                    .id(salary.getId())
                    .baseSalary(salary.getBaseSalary())
//                    .daysWorked(salary.getDaysWorked())
                    .positionId(salary.getPosition().getId())
                    .overtimeSalary(salary.getOvertimeSalary())
                    .build();
            salaryDtos.add(salaryDto);
        }
        return salaryDtos;
    }
    @Override
    public Salary save(SalaryDto salaryDto){
        Position position = positionService.getPositionById(salaryDto.getPositionId());

        Salary salary = Salary.builder()
                .baseSalary(salaryDto.getBaseSalary())
                .daysWorked(salaryDto.getDaysWorked())
                .overtimeSalary(salaryDto.getOvertimeSalary())
                .position(position)
                .build();
        return salaryRepository.save(salary);
    }

//    public BigDecimal calculateSalary(Salary salary){
//        BigDecimal salaryPerday = salary.getBaseSalary();
//        BigDecimal totalWorkingDays = new BigDecimal(salary.get)
//    }




























//    @Override
//    public double calculateSalary(EmployeeDto employee){
//        double baseSalary = employee.g  etSalaryDto().getBasicSalary();
//        double totalSalary = baseSalary * employee.getDaysWorked();
//        if (employee.getDaysWorked() > 22){
//            totalSalary += baseSalary * 0.3;
//        }
//        if(employee.getSalaryDto().getOvertimeSalary()){
//            totalSalary += 300000;
//        }
//        return totalSalary;
//    }
}
