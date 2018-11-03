package cn.guangjian.service;

import cn.guangjian.domain.log.SysLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SysLogService {
     void save(SysLog sysLog);

    List<SysLog> findAll();
}
