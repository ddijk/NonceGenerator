
package com.mycompany.noncegenerator;

import java.security.SecureRandom;
import java.util.Base64;

/**
 *
 * @author dick
 */
public class NonceGenerator {
    
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        
        byte seed[] = random.generateSeed(20);
        
        System.out.println("lenght="+ seed.length);
        
        Base64.Encoder encoder = Base64.getEncoder();
        
        byte[] nonce = encoder.encode(seed);
        
        String nonceAsString = new String(nonce);
        
        System.out.println("Nonce is "+nonceAsString);
    }
    
}
