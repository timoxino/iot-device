package com.timoxino.iot.device.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.timoxino.iot.device.api.Device;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("smarthome/v1")
public class DeviceController {

  @GetMapping(value = "/devices", produces = APPLICATION_JSON_VALUE)
  public List<Device> listDevices() {
    return Arrays.asList(new Device("NEST"));
  }
}
