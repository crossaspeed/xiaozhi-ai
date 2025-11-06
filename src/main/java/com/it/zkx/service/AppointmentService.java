package com.it.zkx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.zkx.bean.Appointment;
import org.springframework.stereotype.Service;

public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}
