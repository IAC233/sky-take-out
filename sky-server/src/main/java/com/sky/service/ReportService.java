package com.sky.service;

import com.sky.mapper.OrderMapper;
import com.sky.vo.TurnoverReportVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public interface ReportService {

    /**
     * 营业额统计
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO turnoverStatistics(LocalDate begin, LocalDate end);
}
