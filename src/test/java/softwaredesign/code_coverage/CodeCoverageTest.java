package softwaredesign.code_coverage;


import org.junit.Assert;
import org.junit.Test;
import softwaredesign.CodeCoverageClass;

public class CodeCoverageTest {

    CodeCoverageClass codeCoverageClass = new CodeCoverageClass();

    /**
     * statement coverage is the simplest form of code coverage, also called node coverage
     * each statement needs to be executed at least once
     */
    @Test
    public void statementCoverage() {
        //only one test case needed for statement coverage, if parameter someInt is negative, each statement is executed at least once
        int result = codeCoverageClass.methodThatWillBeTestedForCodeCoverage(-1);
        Assert.assertEquals(1, result);
    }

    /**
     * branch coverage considers more flows of control, also called edge coverage
     * each branch needs to be traversed at least once and every entry point taken
     */
    @Test
    public void branchCoverage() {
        //two tests: someInt = 1 and someInt = -1 enough for branch coverage, -1 has been tested in statement coverage above
        int result = codeCoverageClass.methodThatWillBeTestedForCodeCoverage(1);
        Assert.assertEquals(1, result);
    }

    /**
     * condition coverage considers more than one condition for each branch
     * each condition (e.g. if, while) has to be tested for a true case and for a false case at least once
     */
    @Test
    public void conditionCoverage() {
        //three tests enough for condition, the while condition must be tested for true and false, so the test needs to be someInt = 0;
        int result = codeCoverageClass.methodThatWillBeTestedForCodeCoverage(0);
        Assert.assertEquals(0, result);
    }

    /**
     * path coverage requires that all program paths have been traversed at least once
     * strongest form of code coverage, although it is usually impossible to achieve when loops are present
     */
    @Test
    public void pathCoverage() {
    }


}
