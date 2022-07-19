package com.bitc.gotrip.service;

import com.bitc.gotrip.common.FileUtils;
import com.bitc.gotrip.dto.FileDto;
import com.bitc.gotrip.dto.TripDto;
import com.bitc.gotrip.mapper.TripMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.ArrayList;
import java.util.List;

@Service
public class TripServiceImpl implements TripService{

    @Autowired
    private TripMapper tripMapper;

    @Autowired
    private FileUtils fileUtils;


    @Override
    public List<TripDto> selectTripList() throws Exception {
        return tripMapper.selectTripList();
    }

    @Override
    public void insertTrip(int tripCategoryPk,int tripRegoionPk, String tripName, int tripPrice, String tripContents, Double tripLatitude, Double tripHardness ) throws Exception {
        TripDto trip = new TripDto();
        trip.setTripCategoryPk(tripCategoryPk);
        trip.setTripRegoionPk(tripRegoionPk);
        trip.setTripName(tripName);
        trip.setTripPrice(tripPrice);
        trip.setTripContents(tripContents);
        trip.setTripLatitude(tripLatitude);
        trip.setTripHardness(tripHardness);

        tripMapper.insertTrip(trip);
    }

    @Override
    public void insertTrip(TripDto trip, MultipartHttpServletRequest multiUploadFiles) throws Exception {
        tripMapper.insertTrip(trip);

        List<FileDto> fileList = fileUtils.parseFileInfo(trip.getTripPk(), multiUploadFiles);

        if (CollectionUtils.isEmpty(fileList) == false) {
            tripMapper.insertFileList(fileList);
        }

    }

    @Override
    public List<FileDto> selectFileList() throws Exception {
        return tripMapper.selectFileList();
    }

    @Override
    public TripDto selectTripDetail(int tripPk) throws Exception {
        TripDto trip = tripMapper.selectTripDetail(tripPk);
        List<FileDto> fileList = tripMapper.selectTripFileList(tripPk);
        trip.setFileList(fileList);
        return trip;
    }

    @Override
    public List<FileDto> selectFileDetail(int tripPk) throws Exception {
        List<FileDto> files = tripMapper.selectFileDetail(tripPk);
//        List<TripDto> tripList = tripMapper.selectTripDetailList(tripPk);

        for (FileDto file : files) {
            List<TripDto> tripList = tripMapper.selectTripDetailList(tripPk);

            file.setTripList(tripList);
        }

//        files.setTripList(tripList);

        return files;
    }

    @Override
    public void deleteTrip(int tripPk) throws Exception {
        tripMapper.deleteTrip(tripPk);
    }

    @Override
    public void tripUpdate(TripDto trip) throws Exception {
        tripMapper.tripUpdate(trip);
    }

    @Override
    public Page<TripDto> selectTripListPage(int pageNum) throws Exception {
        PageHelper.startPage(pageNum, 5);

        Page<TripDto> dataList = tripMapper.selectTripListPage();

        for (TripDto item : dataList) {
            List<FileDto> fileList = selectThumFileList(item.getTripPk());

            item.setFileList(fileList);
        }

        return dataList;
        //        return tripMapper.selectTripListPage();
    }

//    @Override
//    public List<FileDto> selectThumFileList() throws Exception {
//        return tripMapper.selectThumFileList();
//    }

    @Override
    public List<FileDto> selectThumFileList(int tripPk) throws Exception {
        return tripMapper.selectThumFileList(tripPk);
    }
}
