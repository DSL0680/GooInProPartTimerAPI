package org.gooinpro.gooinproparttimerapi.worklogs.repository.search;

import org.gooinpro.gooinproparttimerapi.worklogs.dto.WorkLogsDTO;
import java.util.List;

public interface WorkLogsSearch {
    // 파트타이머의 근무 기록 조회 (월별)
    List<WorkLogsDTO> getMonthlyWorkLogs(Long pno, Integer year, Integer month);

    // 파트타이머의 근무 기록 조회 (근무지별)
    List<WorkLogsDTO> getWorkLogsByJob(Long pno, Long jmno);
}
