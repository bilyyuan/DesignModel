package com.elvin.designmode.builder.gof;

/*
 * 
 * Product.
 */
public class Computer {

    private String cpu;
    private String box;
    private String board;
    private String memory;
    private String displayCard;
    private String disk;
    private String lines;
    private String io;
    private String display;
    private String power;
    private String speaker;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisplayCard() {
        return displayCard;
    }

    public void setDisplayCard(String displayCard) {
        this.displayCard = displayCard;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines;
    }

    public String getIo() {
        return io;
    }

    public void setIo(String io) {
        this.io = io;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", box=" + box + ", board=" + board + ", memory=" + memory + ", displayCard="
                + displayCard + ", disk=" + disk + ", lines=" + lines + ", io=" + io + ", display=" + display
                + ", power=" + power + ", speaker=" + speaker + "]";
    }

}
