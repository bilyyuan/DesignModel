package com.elvin.designmode.filter;

import java.util.List;

/**
 * 与运算
 * @author spring
 *
 */
public class AddCriteria implements Criteria {

    private Criteria criteria1;
    private Criteria criteria2;   
    public AddCriteria  (Criteria criteria1, Criteria criteria2) {
        this.criteria1 =  criteria1;
        this.criteria2 =  criteria2;
    }
    @Override
    public List<Device> meetCriteria(List<Device> devices) {
        // TODO Auto-generated method stub
        List<Device> devices1 = criteria1.meetCriteria(devices);
        return criteria2.meetCriteria(devices1);
    }

}
