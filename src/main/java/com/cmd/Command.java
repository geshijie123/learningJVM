package com.cmd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author geshijie
 * @date 2019-05-28 09:57
 */

public class Command {
    public static void exeCmd(String commandStr) {
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        String commandStr = "ping www.baidu.com -t";
        String commandStr2 = "ping geshijie.club";
        //String commandStr = "ipconfig";
//        Command.exeCmd(new String[]{commandStr,commandStr2});
        Command.exeCmd(commandStr);
    }
}
