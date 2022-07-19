package com.bitc.gotrip.dto;

import lombok.Data;

import java.util.List;

@Data
public class TripDto {

    private int tripPk;
    private int tripCategoryPk;
    private int tripRegoionPk;
    private String tripName;
    private int tripPrice;
    private String tripContents;
    private double tripLatitude;
    private double tripHardness;
    private String tripCreate;
    private String tripUpdate;


    private List<FileDto> fileList;
}


