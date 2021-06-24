package com.dong.readTxt;
/**
 * 读取文件的倒数第3行，并打印其内容
 */
 
import java.io.File;
import java.io.IOException;
 
import org.apache.commons.io.input.ReversedLinesFileReader;
 
public class ReversedLinesFileReaderExample {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Administrator\\Desktop\\文档\\小微.txt");
		int n_lines = 142004;
		int counter = 1;

		//构造方法 ReversedLinesFileReader(final File file, final int blockSize, final String encoding) 
		ReversedLinesFileReader object = new ReversedLinesFileReader(file, 4096, "UTF-8");
		while (counter <= n_lines) {
			if (counter == n_lines) {
				System.out.println(object.readLine());
			}
			try { Thread.sleep ( 6000 ) ;
			} catch (InterruptedException ie){}
			object.readLine();//读取下一行
			System.out.println(object.readLine());
			counter++;
		}
	}
}