package com.elvin.designmode.filter;

import java.util.List;

/**
 * 或运算
 * @author spring
 *
 */
public class OrCriteria implements Criteria {

    private Criteria criteria1;
    private Criteria criteria2;   
    public OrCriteria  (Criteria criteria1, Criteria criteria2) {
        this.criteria1 =  criteria1;
        this.criteria2 =  criteria2;
    }
    @Override
    public List<Device> meetCriteria(List<Device> devices) {
        // TODO Auto-generated method stub
        List<Device> devices1 = criteria1.meetCriteria(devices);
        List<Device> devices2 = criteria2.meetCriteria(devices);
        
        for (Device device : devices1) {
            if (!devices2.contains(device)) {
                devices2.add(device);
            }
        }
        return devices2;
    }
}
