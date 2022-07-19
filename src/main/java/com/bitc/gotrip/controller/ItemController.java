package com.bitc.gotrip.controller;

import com.bitc.gotrip.dto.FileDto;
import com.bitc.gotrip.dto.TripDto;
import com.bitc.gotrip.service.TripService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private TripService tripService;

    @RequestMapping("/tripItem")
    public String tripItem() throws Exception {
        return "/item/itemForm";
    }

    @RequestMapping("/tripInsertItem")
    public String insertTrip(TripDto trip, MultipartHttpServletRequest multiUploadFiles) throws Exception {
        tripService.insertTrip(trip, multiUploadFiles);
        return "redirect:/";
    }

    @RequestMapping("/tripDeleteItem")
    public String deleteTrip(@RequestParam("tripPk")int tripPk) throws Exception {
        tripService.deleteTrip(tripPk);
        return "redirect:/tripList";
    }

    @RequestMapping("/tripList")
    public ModelAndView tripDelete(@RequestParam(required = false, defaultValue = "1") int pageNum, HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView("/item/itemList");

        PageInfo<TripDto> dataList = new PageInfo<>(tripService.selectTripListPage(pageNum), 5);

        mv.addObject("dataList", dataList);

        return mv;
    }

    @RequestMapping("/tripItemDetail")
    public ModelAndView tripDetail(@RequestParam("tripPk") int tripPk) throws Exception {
        ModelAndView mv = new ModelAndView("/item/itemDetail");

        TripDto trip = tripService.selectTripDetail(tripPk);
        mv.addObject("trip", trip);

        List<FileDto> files = tripService.selectFileDetail(tripPk);
        mv.addObject("files", files);


        return mv;
    }

    @RequestMapping("/tripUpdate")
    public String tripUpdate(TripDto trip) throws Exception {
        tripService.tripUpdate(trip);
        return "redirect:/tripList";
    }


}
