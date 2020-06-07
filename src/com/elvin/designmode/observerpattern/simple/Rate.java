package com.elvin.designmode.observerpattern.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象Subject
 * @author spring
 *
 */
public abstract class Rate {
    protected List<Company> companies = new ArrayList<>();
    public void addListener(Company company) {
        if (!companies.contains(company)) {
            companies.add(company);
        }
    }
    
    public void remove(Company company) {
        companies.remove(company);
    }
    
    public abstract void change(int number);
    
}
