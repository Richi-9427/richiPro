package com.learning.springFramework;

import com.learning.springFramework.game.GameRunner;
import com.learning.springFramework.game.MarioGame;
import com.learning.springFramework.game.SuperContra;
import  com.learning.springFramework.game.PacMan;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // var game=new MarioGame();
//	 var game=new SuperContra();
	 var game=new PacMan();
	 //object creation
      var gameRunner=new GameRunner(game);
      //object creation and wiring object
      gameRunner.run();
      
	}
}