package com.bridgelabz.clinicManagement;


import com.bridgelab.utility.Utility;


public class SingltonUtility {
private SingltonUtility(){}
    
    private static class SingletonHelper{
        private static final Utility INSTANCE = new Utility();
    }
    
    public static Utility getInstance(){
        return SingletonHelper.INSTANCE;
    }

}
