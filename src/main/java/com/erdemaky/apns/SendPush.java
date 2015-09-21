package com.erdemaky.apns;

import com.erdemaky.DeviceTokens;
import com.erdemaky.Properties;

/**
 * @author Erdem Akyıldız
 */
public class SendPush {

    private static Properties properties = new Properties();
    
    static {
        //Set .p12 file
        properties.setKeystorePath("../keystore.p12");
        properties.setPassword("123456");
        properties.setProduction(false);
        properties.setSound("default");
        properties.setBagde(1);
    }
    
    public static void main(String[] args) {
        
        DeviceTokens<String, String> deviceToken = new DeviceTokens<>();
        deviceToken.add("user001", "1215abdca91a56d5c53c66d7d2e982598b7a6fb989d398fb87d0ce79d52e238a");
        
        String titleAndMessage = "Title : Hi !";
        new PushMessage(titleAndMessage, properties.getBagde(), properties.getSound(), 
                properties.getKeystorePath(), properties.getPassword(), properties.getProduction(), deviceToken.get("user001")).start();
    }
    
    
}
