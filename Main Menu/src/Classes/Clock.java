/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author jay_d_000
 */
public class Clock {
    
    public int getHours(){
        int hourNum = java.time.LocalDateTime.now().getHour();
        return hourNum;
    }
    
    public int getMinutes(){
        int minuteNum = java.time.LocalDateTime.now().getMinute();
        return minuteNum;
    }
    
    public String getTime(){
        int hourNum = getHours();
        int minuteNum = getMinutes();
        String timeStr = Integer.toString(hourNum) + ":" + Integer.toString(minuteNum);
        return timeStr;
    }
    
}
