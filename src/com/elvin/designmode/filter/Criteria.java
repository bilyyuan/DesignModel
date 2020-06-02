package com.elvin.designmode.filter;

import java.util.List;

public interface Criteria {
    public List<Device> meetCriteria(List<Device> devices);
}
