package com.elvin.designmode.filter;

import com.elvin.designmode.filter.DeviceType.Type;

/**
 * 实体类
 * @author spring
 *
 */
public class Device {
    
    public Device(String name, int size, Type pc, int price) {
        this.size = size;
        this.deviceType = pc;
        this.price = price;
        this.name = name;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DeviceType.Type getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType.Type deviceType) {
        this.deviceType = deviceType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 7' 9' 11' 13' 14' 15' etc.
     */
    
    private String name;
    private int size;
    
    private DeviceType.Type deviceType;
    
    private int price;

    @Override
    public String toString() {
        return "Device [name=" + name + ", size=" + size + ", deviceType=" + deviceType + ", price=" + price + "]";
    } 
    

}
