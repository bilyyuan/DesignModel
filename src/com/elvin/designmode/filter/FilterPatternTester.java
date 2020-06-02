package com.elvin.designmode.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.elvin.designmode.filter.DeviceType.Type;

public class FilterPatternTester {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();
        
        devices.add(new Device("Macbook pro", 15, DeviceType.Type.TABLET, 1000)); // 1
        devices.add(new Device("Iphone 7", 6, DeviceType.Type.PHONE, 2000)); // 1
        devices.add(new Device("RED Mi 7", 15, DeviceType.Type.PHONE, 3000));
        devices.add(new Device("DELL", 14, DeviceType.Type.PC, 1000)); // 1
        
        devices.add(new Device("Macbook pro 1 ", 14, DeviceType.Type.TABLET, 2000)); // 1
        devices.add(new Device("Iphone 7  1", 6, DeviceType.Type.PHONE, 3000)); // 1
        devices.add(new Device("RED Mi 7  1", 8, DeviceType.Type.PHONE, 4000)); // 1
        devices.add(new Device("DELL  1", 12, DeviceType.Type.PC, 2000)); // 1
        
        devices.add(new Device("Macbook pro  2", 14, DeviceType.Type.TABLET, 3000)); // 1
        devices.add(new Device("Iphone 7  2", 6, DeviceType.Type.PHONE, 4000)); // 1
        devices.add(new Device("RED Mi 7  2", 8, DeviceType.Type.PHONE, 5000)); // 1
        devices.add(new Device("DELL  2", 24, DeviceType.Type.PC, 3000));
        
        devices.add(new Device("Macbook pro  3", 14, DeviceType.Type.TABLET, 4000)); // 1
        devices.add(new Device("Iphone 7  3", 6, DeviceType.Type.PHONE, 5000)); // 1
        devices.add(new Device("RED Mi 7  3", 8, DeviceType.Type.PHONE, 6000)); // 1
        devices.add(new Device("DELL  3", 18, DeviceType.Type.PC, 4000));
        
        devices.add(new Device("Macbook pro  4", 14, DeviceType.Type.TABLET, 400)); // 1
        devices.add(new Device("Iphone 7  4", 6, DeviceType.Type.PHONE, 500)); // 1
        devices.add(new Device("RED Mi 7  4", 8, DeviceType.Type.PHONE, 600)); // 1
        devices.add(new Device("DELL  4", 9, DeviceType.Type.PC, 400)); // 1
        
        devices.add(new Device("Macbook pro  5", 14, DeviceType.Type.TABLET, 300)); // 1
        devices.add(new Device("Iphone 7  5", 6, DeviceType.Type.PHONE, 400)); // 1
        devices.add(new Device("RED Mi 7  5", 8, DeviceType.Type.PHONE, 500)); // 1
        devices.add(new Device("DELL  5", 7, DeviceType.Type.PC, 300)); // 1
        
        
//        Criteria _14InchDeviceCriteria = new Criteria14InchDevice();
//        Criteria _1000DeviceCriteria = new CriteriaThousand();
//        
//        List<Device> _fullmatchDevices = new AddCriteria(_14InchDeviceCriteria, _1000DeviceCriteria).meetCriteria(devices);
//        
//        List<Device> _partialmatchDevices = new OrCriteria(_14InchDeviceCriteria, _1000DeviceCriteria).meetCriteria(devices);
//        
//        // System.out.println(Arrays.toString(_fullmatchDevices.toArray()));
//        System.out.println(Arrays.toString(_partialmatchDevices.toArray()));
        
        
      //lambda表达式
        List<Device>  filtered  = devices.stream()
                .filter(o -> o.getPrice() < 1000)
                .filter(o -> o.getDeviceType() == Type.PHONE) 
                .filter(o -> o.getSize() < 7)
                .collect(Collectors.toList());
        System.out.println("千元内 7inch 以下的手机有: " + filtered);
    }
}

