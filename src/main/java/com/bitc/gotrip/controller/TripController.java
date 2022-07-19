package com.bitc.gotrip.controller;

import com.bitc.gotrip.dto.FileDto;
import com.bitc.gotrip.dto.TripDto;
import com.bitc.gotrip.service.TripService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TripController {

    @Autowired
    private TripService tripService;



    @RequestMapping("/tripDetail")
    public ModelAndView tripDetail(@RequestParam("tripPk") int tripPk) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/tripDetail");

        TripDto trip = tripService.selectTripDetail(tripPk);
        mv.addObject("trip", trip);

        List<FileDto> files = tripService.selectFileDetail(tripPk);
        mv.addObject("files", files);


        return mv;
    }

    @RequestMapping("/sea")
    public ModelAndView tripSeaList(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/tripSea");
        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }

    @RequestMapping("/sky")
    public ModelAndView tripSkyList(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/tripSky");
        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);
//        List<FileDto> fileList = tripService.selectThumFileList();

//        mv.addObject("fileList", fileList);
        mv.addObject("dataList", dataList);

        return mv;
    }

    @RequestMapping("/mou")
    public ModelAndView tripMouList(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/tripMou");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }

    @RequestMapping("/busan")
    public ModelAndView tripBusan(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/busan");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }
    @RequestMapping("/chungbug")
    public ModelAndView tripChungbug(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/chungbug");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/chungnam")
    public ModelAndView tripChungnam(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/chungnam");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }
    @RequestMapping("/daegu")
    public ModelAndView tripDaegu(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/daegu");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/daejeon")
    public ModelAndView tripDaejeon(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/daejeon");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gangwon")
    public ModelAndView tripGangwon(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/gangwon");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gwangju")
    public ModelAndView tripGwangju(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/gwangju");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }
    @RequestMapping("/gyeongbug")
    public ModelAndView tripGyeongbug(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/gyeongbug");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }
    @RequestMapping("/gyeonggi")
    public ModelAndView tripGyeonggi(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/gyeonggi");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }
    @RequestMapping("/gyeongnam")
    public ModelAndView tripGyeongnam(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/gyeongnam");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/incheon")
    public ModelAndView tripIncheon(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/incheon");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }
    @RequestMapping("/jeju")
    public ModelAndView tripJeju(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/jeju");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }
    @RequestMapping("/jeonbug")
    public ModelAndView tripJeonbug(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/jeonbug");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }
    @RequestMapping("/jeonnam")
    public ModelAndView tripJeonnam(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/jeonnam");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }
    @RequestMapping("/sejong")
    public ModelAndView tripSejong(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/sejong");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }
    @RequestMapping("/seoul")
    public ModelAndView tripSeoul(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/seoul");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }
    @RequestMapping("/ulsan")
    public ModelAndView tripUlsan(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location/ulsan");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;

    }

}
