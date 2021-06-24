package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	public static void scopeMe (Zodiac zSigns) {
		switch(zSigns) {
		case ARIES:{
			JOptionPane.showMessageDialog(null, "Don't be so impatient about fixing a problem that you end up doing something rash.");
		break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "Don't try to force any answers from people.");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "Don't say no when the adventure bus comes around to pick you up.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "Don't make any major decisions, and certainly don't try to herd people into corners.");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "Don't spill all the beans at once.");
			break;
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "Grab opportunities with both hands and rev your engine into high gear.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "Don't stress about work or the things you need to get done.");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "Keep things light and don't worry about tomorrow until it comes.");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "Don't stress over things you don't understand.");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "Take a long-distance trip in your mind.");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "Enjoy the day and don't sweat the details.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "Have a dance party in your living room and liven things up with some freshly cut flowers on your table.");
			break;
		}
		default:
			break;
		
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac mySign = Zodiac.CANCER;
		scopeMe(mySign);
	}
}