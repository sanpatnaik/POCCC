public class ComplexMethod {

    public String intToEnglishValue(int i) {
        if (i == 1) {
            return "Ones";
        }
        if (i == 2) {
            return "Two's";
        }
        if (i == 3) {
            return "Three";
        }
        if (i == 4) {
            return "Fours";
        }
        if (i == 5) {
            return "Fives";
        }
        if (i == 6) {
            return "Sixes";
        }
		if (i == 7) {
            return "Seven";
        }
        if (i > 7) {
            throw new NotImplementedException();
        }
        return null;
    }

}