package org.demo.designpattern.creational.builderpatternwithlombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.Date;
import java.util.Set;

@Builder
@Getter
public class ComputerServer {
    @Builder.Default
    private String operatingSystem ="Windows Server 2016";
    private String version;
    private String licenseType;
    private String vendor;
    private Date licenseEndDate;
    private int ram;
    @Singular
    private Set<String> userDetails;
}
