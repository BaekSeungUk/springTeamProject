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
public class TripController2 {

    @Autowired
    private TripService tripService;




    @RequestMapping("/busan2")
    public ModelAndView tripBusan2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/busan");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/chungbug2")
    public ModelAndView tripChungbug2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/chungbug");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/chungnam2")
    public ModelAndView tripChungnam2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/chungnam");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/daegu2")
    public ModelAndView tripDaegu2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/daegu");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/daejeon2")
    public ModelAndView tripDaejeon2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/daejeon");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gangwon2")
    public ModelAndView tripGangwon2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/gangwon");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gwangju2")
    public ModelAndView tripGwangju2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/gwangju");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gyeongbug2")
    public ModelAndView tripGyeongbug2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/gyeongbug");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gyeonggi2")
    public ModelAndView tripGyeonggi2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/gyeonggi");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gyeongnam2")
    public ModelAndView tripGyeongnam2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/gyeongnam");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/incheon2")
    public ModelAndView tripIncheon2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/incheon");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/jeju2")
    public ModelAndView tripJeju2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/jeju");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/jeonbug2")
    public ModelAndView tripJeonbug2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/jeonbug");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/jeonnam2")
    public ModelAndView tripJeonnam2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/jeonnam");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/sejong2")
    public ModelAndView tripSejong2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/sejong");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/seoul2")
    public ModelAndView tripSeoul2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/seoul");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/ulsan2")
    public ModelAndView tripUlsan2(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location2/ulsan");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }

    @RequestMapping("/busan3")
    public ModelAndView tripBusan3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/busan");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/chungbug3")
    public ModelAndView tripChungbug3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/chungbug");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/chungnam3")
    public ModelAndView tripChungnam3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/chungnam");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/daegu3")
    public ModelAndView tripDaegu3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/daegu");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/daejeon3")
    public ModelAndView tripDaejeon3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/daejeon");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gangwon3")
    public ModelAndView tripGangwon3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/gangwon");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gwangju3")
    public ModelAndView tripGwangju3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/gwangju");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gyeongbug3")
    public ModelAndView tripGyeongbug3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/gyeongbug");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gyeonggi3")
    public ModelAndView tripGyeonggi3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/gyeonggi");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/gyeongnam3")
    public ModelAndView tripGyeongnam3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/gyeongnam");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/incheon3")
    public ModelAndView tripIncheon3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/incheon");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/jeju3")
    public ModelAndView tripJeju3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/jeju");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/jeonbug3")
    public ModelAndView tripJeonbug3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/jeonbug");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/jeonnam3")
    public ModelAndView tripJeonnam3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/jeonnam");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/sejong3")
    public ModelAndView tripSejong3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/sejong");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/seoul3")
    public ModelAndView tripSeoul3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/seoul");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }
    @RequestMapping("/ulsan3")
    public ModelAndView tripUlsan3(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/trip/location3/ulsan");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }


}
