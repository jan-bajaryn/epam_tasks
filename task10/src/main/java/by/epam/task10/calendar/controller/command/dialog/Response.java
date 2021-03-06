package by.epam.task10.calendar.controller.command.dialog;

public class Response {
    public static final String EXIT = "EXIT";
    private String status;
    private Request nextRequest;
    private String displayInformation;
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    public String getStatus() {
        return status;
    }

    public Request getNextRequest() {
        return nextRequest;
    }

    public String getDisplayInformation() {
        return displayInformation;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void setNextRequest(Request nextRequest) {
        this.nextRequest = nextRequest;
    }

    public void setDisplayInformation(String displayInformation) {
        this.displayInformation = displayInformation;
    }
}
