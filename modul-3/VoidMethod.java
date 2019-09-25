/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voidmethod;
public class VoidMethod {
    int hour, minute, second;

    public void duration(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void info() {
        System.out.println("Total Waktu \n" +
                            hour + " jam " +
                            minute + " menit " +
                            second + " detik");
    }

    public static void main (String[] args) {
        VoidMethod vm = new VoidMethod();
        vm.duration(1, 30, 15);
        vm.info();
    }

    }
    

