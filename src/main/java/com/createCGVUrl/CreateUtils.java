package com.createCGVUrl;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class CreateUtils {

//    static   String URL="http://localhost:8080/front/monitor!toCGVinfoPage.do";
    static String URL="http://www.baikanmovie.com:8081/front/monitor!toCGVinfoPage.do";

    static String key="yoidol";


    public static void main(String[] args) throws UnsupportedEncodingException {


        String one="1:幸福蓝海";
        String two="2:青岛cgv李峰";
        String three="3:青岛万达活动李峰";
        String four="4:全国万达";
        String five="5:长沙cgv";
        String six="6:武汉cgv";
        String eight="8:万达特惠福州陈守燕";
        String nine="9:横店特惠福州陈守燕";
        String ten="10:广州万达";
        String eleven="12:昆明万达";
        String fourteen="14:王涛-迎春活动";

        https://mallapi2.gz-cctv.com/aspx/coupon/give.aspx?ckey=9eb95569a333e29945fb49bb968ae116

        getUrl("总管理员" , one + "|" + two+ "|" + three+ "|" + four+ "|" + five+ "|" + six+ "|" + eight+ "|" +  nine+ "|" + ten+ "|" + eleven + "|" + fourteen);
//        getUrl("青岛" , two + "|" + three);
//        getUrl("长沙" , five);
//        getUrl("武汉" , six);
//        getUrl("福州" , eight + "|" + nine);
//        getUrl("广州" , ten);
//        getUrl("昆明" , eleven);
        getUrl("王涛-迎春活动" , fourteen);
    }

    public static String getUrl(String name ,String citys) throws UnsupportedEncodingException {
        String list = Base64.getEncoder().encodeToString(citys.getBytes("UTF-8"));
        String encodeName = Base64.getEncoder().encodeToString(name.getBytes("UTF-8"));
        String sign = DigestUtils.md5Hex(list + key + encodeName);
        System.out.println(name);
        String s = URL + "?list=" + list + "&name=" + encodeName + "&sign=" + sign;
        System.out.println(s.replace("+","%2B"));
        return  null;
    }
}
