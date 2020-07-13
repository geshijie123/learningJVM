

package com.jenkins;


import cn.hutool.crypto.digest.BCrypt;

/**
 * <dependency>
 *     <groupId>org.mindrot</groupId>
 *     <artifactId>jbcrypt</artifactId>
 *     <version>0.4</version>
 * </dependency>
 */
public class jenkinsPWD {
    public static void main(String[] args) {
        String admin="$2a$10$LUqlS6ihDbvmT3EkKBYPyeZ2O5p8K..iJ1ms.gne2hj76Y0.sZq1a";

        // 加密
//        String admin = BCrypt.hashpw("admin", BCrypt.gensalt());
//        System.out.println("加密："+admin);

        // 解密
        if(BCrypt.checkpw("root",admin)){
            System.out.println(BCrypt.hashpw(admin, "root"));
            System.out.println("is match");
        } else {
            System.out.println("is not match");
        }
    }
}
