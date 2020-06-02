package com.elvin.designmode.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算14‘及以下的设备
 * 
 * @author spring
 *
 */
public class Criteria14InchDevice implements Criteria {

    @Override
    public List<Device> meetCriteria(List<Device> devices) {
        // TODO Auto-generated method stub
        List<Device> resdevices = new ArrayList<Device>();
        for (Device device : devices) {
            if (device.getSize() <= 14) {
                resdevices.add(device);
            }
        }
        return resdevices;
    }


}