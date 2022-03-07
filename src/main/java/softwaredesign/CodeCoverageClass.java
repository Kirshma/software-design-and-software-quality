package softwaredesign;

public class CodeCoverageClass {

    public int methodThatWillBeTestedForCodeCoverage(int someInt) {
        int counter = 0;
        if (someInt <= 0) {
            someInt *= -1;
        }
        while (someInt > 0) {
            counter++;
            someInt -= 1;
        }
        return counter;
    }

}
