package _04_Intro_To_Enums;

import _04_Intro_To_Enums.IntroToEnums.DataTypes;

public enum StatesOfMatter {
	SOLID, LIQUID, GAS, PLASMA,BOSE_EINSTEIN_CONDENSATE

	StatesOfMatter matter;switch(matter)
	{
	case INTEGER:{
		System.out.println("INT");
		break;
	}
	case DOUBLE:{
		System.out.println("DOUBLE");
		break;
	}
	case BOOLEAN:{
		System.out.println("BOOLEAN");
		break;
	}
	case LONG:{
		System.out.println("LONG");
		break;
	}
	case SHORT:{
		System.out.println("SHORT");
		break;
	}
	case BYTE:{
		System.out.println("BYTE");
		break;
	}
	}
}}
