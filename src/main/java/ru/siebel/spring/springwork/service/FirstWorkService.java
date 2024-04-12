package ru.siebel.spring.springwork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstWorkService {
    private SimpleService simpleService;

    private CommonService commonService;

    @Autowired
    public FirstWorkService(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @Autowired
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    public String execute() {
        simpleService.checkField();
        return commonService.execute();
    }
}
