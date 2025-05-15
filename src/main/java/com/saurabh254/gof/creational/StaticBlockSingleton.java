//package com.saurabh254.gof.creational;
//
//public class StaticBlockSingleton {
//    private static StaticBlockSingleton instance;
//    private StaticBlockSingleton(){}
//    static {
//        try{
//            instance = new StaticBlockSingleton();
//        }catch(Exception e){
//            throw new Exception("Exception occurred in creating singleton instance");
//        }
//    }
//    public static StaticBlockSingleton getInstance(){
//        return instance;
//    }
//}
