package com.bitc.gotrip.dto;

import lombok.Data;

import java.util.List;

@Data
public class FileDto {

    private int filePk;
    private int tripPk;
    private String originalFileName;
    private String storedFilePath;
    private long fileSize;
    private int tableNum;
    private int pkNum;

    private List<TripDto> tripList;
}
