package com.company;

import java.util.Scanner;

public class _16_URL_Parser {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String url = console.nextLine();
        int index = url.indexOf("://");

        String protocol = "";
        String server = "";
        String resource = "";

        if(index != -1){
            protocol = url.substring(0,index);
            url = url.replace(protocol+"://","");
            index = url.indexOf('/');
            if(index!=-1){
                server = url.substring(0,index);
                resource = url.substring(index+1);
            }else{
                server = url;
            }
        }else{
            server = url;
        }
        System.out.println("[protocol] = " + "\"" + protocol.trim() + "\"");
        System.out.println("[server] = "+ "\"" + server.trim() + "\"");
        System.out.println("[resource] = "+ "\"" +resource.trim() + "\"" );
    }
}
