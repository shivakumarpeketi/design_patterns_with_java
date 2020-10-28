package org.demo.designpattern.creational.builder;

import java.util.Date;

public class ComputerSystem {
    private String operatingSystem;
    private String version;
    private String licenseType;
    private String vendor;
    private Date licenseEndDate;

    private ComputerSystem(ComputerBuilder builder){
        this.operatingSystem = builder.operatingSystem;
        this.version = builder.version;
        this.licenseType = builder.licenseType;
        this.vendor = builder.vendor;
        this.licenseEndDate = builder.licenseEndDate;
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }


    public static  class ComputerBuilder {
        private String operatingSystem;
        private String version;
        private String licenseType;
        private String vendor;
        private Date licenseEndDate;

        public ComputerSystem build() {
            return new ComputerSystem(this);
        }

        public ComputerBuilder licenseEndDate(Date licenseEndDate) {
            this.licenseEndDate = licenseEndDate;
            return this;
        }

        public ComputerBuilder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public ComputerBuilder licenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public ComputerBuilder version(String version) {
            this.version = version;
            return this;
        }

        public ComputerBuilder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
    }

    @Override
    public String toString() {
        return "ComputerSystem{ " +
                "operatingSystem='" + operatingSystem + '\'' +
                ", version='" + version + '\'' +
                ", licenseType='" + licenseType + '\'' +
                ", vendor='" + vendor + '\'' +
                ", licenseEndDate=" + licenseEndDate +
                " }";
    }
}
