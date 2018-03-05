package com.xzcai.netty;

import java.io.IOException;
public class TimeServerNio {
    public static void main(String[] args) throws IOException{
        int prot=8080;
        if(args!=null &&args.length>0){
            try {
                prot=Integer.valueOf(args[0]);
            }catch (NumberFormatException e){

            }
        }

        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(prot);
    }
}
