package in.co.ad.studentrecordmanagement.api.exception;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}
