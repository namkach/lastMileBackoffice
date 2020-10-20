package Steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotTyping {
	public void type(String c) throws AWTException {
		Robot r = new Robot();
	    switch (c) {
	        //letters
	        case "a": r.keyPress(KeyEvent.VK_A); r.keyRelease(KeyEvent.VK_A); break;
	        case "b": r.keyPress(KeyEvent.VK_B); r.keyRelease(KeyEvent.VK_B); break;
	        case "c": r.keyPress(KeyEvent.VK_C); r.keyRelease(KeyEvent.VK_C); break;
	        case "d": r.keyPress(KeyEvent.VK_D); r.keyRelease(KeyEvent.VK_D); break;
	        case "e": r.keyPress(KeyEvent.VK_E); r.keyRelease(KeyEvent.VK_E); break;
	        case "f": r.keyPress(KeyEvent.VK_F); r.keyRelease(KeyEvent.VK_F); break;
	        case "g": r.keyPress(KeyEvent.VK_G); r.keyRelease(KeyEvent.VK_G); break;
	        case "h": r.keyPress(KeyEvent.VK_H); r.keyRelease(KeyEvent.VK_H); break;
	        case "i": r.keyPress(KeyEvent.VK_I); r.keyRelease(KeyEvent.VK_I); break;
	        case "j": r.keyPress(KeyEvent.VK_J); r.keyRelease(KeyEvent.VK_J); break;
	        case "k": r.keyPress(KeyEvent.VK_K); r.keyRelease(KeyEvent.VK_K); break;
	        case "l": r.keyPress(KeyEvent.VK_L); r.keyRelease(KeyEvent.VK_L); break;
	        case "m": r.keyPress(KeyEvent.VK_M); r.keyRelease(KeyEvent.VK_M); break;
	        case "n": r.keyPress(KeyEvent.VK_N); r.keyRelease(KeyEvent.VK_N); break;
	        case "o": r.keyPress(KeyEvent.VK_O); r.keyRelease(KeyEvent.VK_O); break;
	        case "p": r.keyPress(KeyEvent.VK_P); r.keyRelease(KeyEvent.VK_P); break;
	        case "q": r.keyPress(KeyEvent.VK_Q); r.keyRelease(KeyEvent.VK_Q); break;
	        case "r": r.keyPress(KeyEvent.VK_R); r.keyRelease(KeyEvent.VK_R); break;
	        case "s": r.keyPress(KeyEvent.VK_S); r.keyRelease(KeyEvent.VK_S); break;
	        case "t": r.keyPress(KeyEvent.VK_T); r.keyRelease(KeyEvent.VK_T); break;
	        case "u": r.keyPress(KeyEvent.VK_U); r.keyRelease(KeyEvent.VK_U); break;
	        case "v": r.keyPress(KeyEvent.VK_V); r.keyRelease(KeyEvent.VK_V); break;
	        case "w": r.keyPress(KeyEvent.VK_W); r.keyRelease(KeyEvent.VK_W); break;
	        case "x": r.keyPress(KeyEvent.VK_X); r.keyRelease(KeyEvent.VK_X); break;
	        case "y": r.keyPress(KeyEvent.VK_Y); r.keyRelease(KeyEvent.VK_Y); break;
	        case "z": r.keyPress(KeyEvent.VK_Z); r.keyRelease(KeyEvent.VK_Z); break;
	        case "1": r.keyPress(KeyEvent.VK_1); r.keyRelease(KeyEvent.VK_1); break;
	        case "2": r.keyPress(KeyEvent.VK_2); r.keyRelease(KeyEvent.VK_2); break;
	        case "3": r.keyPress(KeyEvent.VK_3); r.keyRelease(KeyEvent.VK_3); break;
	        case "4": r.keyPress(KeyEvent.VK_4); r.keyRelease(KeyEvent.VK_4); break;
	        case "5": r.keyPress(KeyEvent.VK_5); r.keyRelease(KeyEvent.VK_5); break;
	        case "6": r.keyPress(KeyEvent.VK_6); r.keyRelease(KeyEvent.VK_6); break;
	        case "7": r.keyPress(KeyEvent.VK_7); r.keyRelease(KeyEvent.VK_7); break;
	        case "8": r.keyPress(KeyEvent.VK_8); r.keyRelease(KeyEvent.VK_8); break;
	        case "9": r.keyPress(KeyEvent.VK_9); r.keyRelease(KeyEvent.VK_9); break;
	        case "0": r.keyPress(KeyEvent.VK_0); r.keyRelease(KeyEvent.VK_0); break;
	        case ":": r.keyPress(KeyEvent.VK_COLON); r.keyRelease(KeyEvent.VK_COLON); break;
	        case "/": r.keyPress(KeyEvent.VK_SLASH); r.keyRelease(KeyEvent.VK_SLASH); break;
	        case ".": r.keyPress(KeyEvent.VK_PERIOD); r.keyRelease(KeyEvent.VK_PERIOD); break;
	        case "_": 
	        	r.keyPress(KeyEvent.VK_SHIFT);
	            r.keyPress(KeyEvent.VK_MINUS);
	            r.keyRelease(KeyEvent.VK_SHIFT);
	            r.keyRelease(KeyEvent.VK_MINUS);
	        	break;
	        //special
//	        case "alt": r.keyPress(KeyEvent.VK_ALT); break;
//	        case "tab": r.keyPress(KeyEvent.VK_TAB); break;
//	        case "enter": r.keyPress(KeyEvent.VK_ENTER); break;
//	        case "shift": r.keyPress(KeyEvent.VK_SHIFT); break;
//	        case "windows": r.keyPress(KeyEvent.VK_WINDOWS); break;
//	        case "control": r.keyPress(KeyEvent.VK_CONTROL); break;
//	        case "open_bracket": r.keyPress(KeyEvent.VK_OPEN_BRACKET); break;//[
//	        case "escape": r.keyPress(KeyEvent.VK_ESCAPE); break;//[
	        default:
	            throw new IllegalArgumentException("Cannot type character " + c);
	    }
	}
	
	public void importRidersPath(String pathName, String fileName) throws AWTException {
		Robot robot = new Robot();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
 		robot.delay(3000);
 		int tabRound;
 		tabRound = 5;
 		for (int i = 0; i < tabRound; i++) {
 			robot.keyPress(KeyEvent.VK_TAB);
 			robot.keyRelease(KeyEvent.VK_TAB);
 		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
 		
		robot.delay(2000);
        int length = pathName.length();
        String text;
        for (int i = 0; i < length; i++) 
        {
        	text = pathName.substring(i,i+1);
        	System.out.println(text);
            type(text);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        tabRound = 6;
 		for (int i = 0; i < tabRound; i++) {
 			robot.keyPress(KeyEvent.VK_TAB);
 			robot.keyRelease(KeyEvent.VK_TAB);
 		}
 		
        length = fileName.length();
        for (int i = 0; i < length; i++) 
        {
            text = fileName.substring(i,i+1);
        	System.out.println(text);
            type(text);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
