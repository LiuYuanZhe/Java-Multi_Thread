package com.sdust.ssm.thread.tomcat;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by LiuYuanZhe on 18/3/31.
 */
public class Gupao {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(9000);
            while (true){
                Socket socket = serverSocket.accept();//阻塞了,要等待浏览器访问
                InputStream is = socket.getInputStream();
                int len = 0;
                byte[] buffer = new byte[1024];
                while ((len=is.read(buffer))>0){
                    System.out.println(new String(buffer,0,len));
                }
//                OutputStream outs = socket.getOutputStream();
//                outs.write("hello!!!".getBytes());
//                outs.flush();
//                outs.close();
            }
//            InputStream in = new FileInputStream("");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
