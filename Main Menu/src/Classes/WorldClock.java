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
public class WorldClock extends Clock{
       
    public int adjust;
    
    public WorldClock(int adjustment){
        adjust = adjustment;
    }
    
    public int getHours(int adjust){
        int hourNum = java.time.LocalDateTime.now().getHour() + adjust;
        while(hourNum >= 24){
            hourNum -= 24;
        }
        return hourNum;
    }
    
}
