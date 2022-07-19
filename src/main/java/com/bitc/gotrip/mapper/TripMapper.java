package com.bitc.gotrip.mapper;

import com.bitc.gotrip.dto.FileDto;
import com.bitc.gotrip.dto.TripDto;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TripMapper {

    List<TripDto> selectTripList() throws Exception;

    void insertTrip(TripDto trip) throws Exception;

    void insertFileList(List<FileDto> fileList) throws Exception;

    List<FileDto> selectFileList() throws Exception;

    TripDto selectTripDetail(int tripPk) throws Exception;

    List<FileDto> selectTripFileList(int tripPk) throws Exception;

    List<FileDto> selectFileDetail(int tripPk) throws Exception;

    List<TripDto> selectTripDetailList(int tripPk) throws Exception;

    void deleteTrip(int tripPk) throws Exception;

    void tripUpdate(TripDto trip) throws Exception;

    Page<TripDto> selectTripListPage() throws Exception;

//    List<FileDto> selectThumFileList()throws Exception;

    List<FileDto> selectThumFileList(int tripPk) throws Exception;
}
