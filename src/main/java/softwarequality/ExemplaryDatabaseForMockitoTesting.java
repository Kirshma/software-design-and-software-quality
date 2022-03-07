package softwarequality;

public class ExemplaryDatabaseForMockitoTesting {

    public String queryDataBase(String queryString) {
        if (queryString != null && !queryString.isEmpty()) {
            //connect to and query database
            return "Standard database result";
        }
        else throw new IllegalArgumentException();
    }

}
