/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */ArrayList<Player> array = new ArrayList<>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	            	Player player = new Player();
	                String line = scanner.nextLine();
	            
	                String[] wake = line.split(",");
	                
	                player.setPosition(wake[0]);
	                player.setName(wake[1]);
	                player.setCountry(wake[2]);
	                player.setTeam(wake[3]);
	                
	                array.add(player);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }



		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

	        Collections.shuffle(array);
	        int dfCount = 0;
	        int mfCount = 0;
	        int fwCount = 0;
	        for(int i =0;i<array.size();i++) {
	        	
	        if( array.get(i).getPosition().equals("GK") ) {
	        	System.out.println(array.get(i));
	        	break;
	        }
	        }
	        
	        for(int i =0;i<array.size();i++) {
	        	 if( array.get(i).getPosition().equals("DF") ) {
	        		 System.out.println(array.get(i));
	        		 dfCount++;
	        		 if(dfCount ==4) {
	        			 break;
	        		 }
	        	 }
	        }
	        for(int i =0;i<array.size();i++) {
	        	 if( array.get(i).getPosition().equals("MF") ) {
	        		 System.out.println(array.get(i));
	        		 mfCount++;
	        		 if(mfCount ==4) {
	        			 break;
	        		 }
	        	 }
	        }
	        for(int i =0;i<array.size();i++) {
	        	 if( array.get(i).getPosition().equals("FW") ) {
	        		 System.out.println(array.get(i));
	        		 fwCount++;
	        		 if(fwCount ==2) {
	        			 break;
	        		 }
	        	 }
	        }
	        
	        
	        
	       
		       
	        

	        }
	}

