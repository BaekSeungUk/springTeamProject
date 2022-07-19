package com.bitc.gotrip.service;

import com.bitc.gotrip.dto.FileDto;
import com.bitc.gotrip.dto.TripDto;
import com.github.pagehelper.Page;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

public interface TripService {

    List<TripDto> selectTripList() throws Exception;

    void insertTrip(int tripCategoryPk, int tripRegoionPk, String tripName, int tripPrice, String tripContents, Double tripLatitude, Double tripHardness) throws Exception;

    void insertTrip(TripDto trip, MultipartHttpServletRequest multiUploadFiles) throws Exception;


    List<FileDto> selectFileList() throws Exception;

    TripDto selectTripDetail(int tripPk) throws Exception;

    List<FileDto> selectFileDetail(int tripPk) throws Exception;

    void deleteTrip(int tripPk) throws Exception;

    void tripUpdate(TripDto trip) throws Exception;

    Page<TripDto> selectTripListPage(int pageNum) throws Exception;

//    List<FileDto> selectThumFileList()throws Exception;

    List<FileDto> selectThumFileList(int tripPk)throws Exception;
}
