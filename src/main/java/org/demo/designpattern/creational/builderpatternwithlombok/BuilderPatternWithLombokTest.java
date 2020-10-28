package org.demo.designpattern.creational.builderpatternwithlombok;

import java.sql.Date;
import java.time.LocalDate;

public class BuilderPatternWithLombokTest {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String[] userDetails = {"Siva", "Raghu", "Rana"};
        ComputerServer windowsServer = ComputerServer.builder().version("Windows10").licenseType("commercial")
                .licenseEndDate(Date.valueOf(localDate.plusYears(10L))).vendor("DELL")
                .build();
        System.out.println(windowsServer.getUserDetails());
//        ComputerSystem pc = ComputerServer.builder().setOperatingSystem("Linux").setLicenseType("Home")
//                .setLicenseEndDate(Date.valueOf(localDate.plusYears(2L))).build();
    }
}
