package com.elvin.designmode.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算1000元及以内的设备
 * @author spring
 *
 */
public class CriteriaThousand implements Criteria {

    @Override
    public List<Device> meetCriteria(List<Device> devices) {
        // TODO Auto-generated method stub
        List<Device> resdevices = new ArrayList<Device>();
        for (Device device : devices) {
            if (device.getPrice() <= 1000) {
                resdevices.add(device);
            }
        }
        return resdevices;
    }

}
