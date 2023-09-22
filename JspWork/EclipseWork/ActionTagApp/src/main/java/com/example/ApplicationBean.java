package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.net.URL;

public class ApplicationBean {
	private int visitCount;
	private String path;
	
	public ApplicationBean() {
		BufferedReader br = null;
		try{
			// 클래스 경로 확인
			URL url = getClass().getResource("/");
			// url.getPath() 첫번째 위치 counter.txt. 파일을 저장을 해라
			path = url.getPath().substring(1) + "counter.txt";
			br = new BufferedReader(new FileReader(path));
			String strCounter = br.readLine();
			visitCount = Integer.parseInt(strCounter);
		}
		catch(Exception err){
			err.printStackTrace();
		}
		finally{
			if(br != null){
				try{
					br.close();
				}
				catch(Exception err){}
			}
		}
	}
	
	// finalize : 객체가 사라지기 직전에
	@Override
	protected void finalize() throws Throwable {
		setFile();
	}
	
	// bean 프로퍼티로 쓸 게 아니라서 매개변수가 없음
	public void setFile(){
		PrintWriter pw = null;
		
		try{
			// 방문자의 숫자를 파일에 저장시키겠다.
			pw = new PrintWriter(path);
			pw.println(visitCount);
		}
		catch(Exception err){
			err.printStackTrace();
		}
		finally{
			if(pw != null){
				try{
					pw.close();
				}
				catch(Exception err){}
			}
		}
	}
	
	public void setCounter(int num) {
		visitCount++;
		setFile();
//		// 10명에 한 번씩 저장
//		if(visitCount % 10 == 0) {
//			setFile();
//			
//		}
	}
	
	public int getCounter() {
		return visitCount;
	}
	
}