package com.dong.readTxt;

import java.io.*;
public class Start

{
    public void readAndRead()
        {
            int i =0;
            try
        {
            FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\文档\\小微.txt");//需要读取的文件路径
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();

            while(s!=null)//如果当前行不为空
            {
                try { Thread.sleep ( 6000 ) ;
                } catch (InterruptedException ie){}
                System.out.println(s);//打印当前行
                s= br.readLine();//读取下一行
                i ++;
            }
            br.close();//关闭BufferReader流
            fr.close(); //关闭文件流
        }catch(IOException e)//捕捉异常
        {
            System.out.println("指定文件不存在");//处理异常
        }
        }
        public static void main(String [] args)
        {
            Start start = new Start();
            start.readAndRead();

        }
}