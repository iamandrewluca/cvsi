package com.winify.cvsi.server.controller;

import com.winify.cvsi.core.dto.ASimpleDto;
import com.winify.cvsi.core.dto.CvsiResponse;
import com.winify.cvsi.core.enums.ErrorEnum;
import com.winify.cvsi.server.facade.AFacade;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.RequestContextUtils;

//@Controller
@RestController
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON_VALUE)
public class AController {
    @Autowired
    private AFacade aFacade;
    final static Logger log = Logger.getLogger(AController.class);

    @GetMapping(path = "/me/{modelId}")
    public HttpEntity<CvsiResponse> getAModel(@PathVariable Long modelId){
        log.info("get by id try to get something");

        return new ResponseEntity(aFacade.getASimpleDto(modelId), HttpStatus.OK);
    }

    @PostMapping (path = "/me")
    public HttpEntity<CvsiResponse> saveAModel(){
        aFacade.saveAModel();
        log.info("post me not work :D");

        return new ResponseEntity(new CvsiResponse(), HttpStatus.OK);
    }

//    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/him")
    public HttpEntity<CvsiResponse> getHim(){
        log.info("da ladnoooo");

        return new ResponseEntity(new CvsiResponse(ErrorEnum.UNKNOWN_ERROR, "NOK"), HttpStatus.OK);
    }
}
