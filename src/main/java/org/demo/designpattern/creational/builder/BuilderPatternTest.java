package org.demo.designpattern.creational.builder;

import java.sql.Date;
import java.time.LocalDate;

public class BuilderPatternTest {

    public static void main(String[] args) {
        ;
        LocalDate localDate = LocalDate.now();
        ComputerSystem OfficeComputer = ComputerSystem.builder().operatingSystem("Windows")
                .version("Windows10").licenseType("commercial")
                .licenseEndDate(Date.valueOf(localDate.plusYears(10L))).vendor("DELL").build();
        System.out.println(OfficeComputer.toString());
        ComputerSystem pc = ComputerSystem.builder().operatingSystem("Windows").licenseType("Home")
                .licenseEndDate(Date.valueOf(localDate.plusYears(5L))).build();
    }
}
