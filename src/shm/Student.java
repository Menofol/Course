package shm;

public class Student {
    private String name;
    private String group;
    private String course;
    private String faculty;
    private String passType;
    private String passDate;
    private String passReason;
    public String getName() {
        return name;
    }
    public void setName(String name) {
            this.name = name;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
            this.group = group;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
            this.course = course;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getPassType() {
        return passType;
    }
    public void setPassType(String passType) {
        this.passType = passType;
    }
    public String getPassDate() {
        return passDate;
    }
    public void setPassDate(String passDate) {
        this.passDate = passDate;
    }
    public String getPassReason() {
        return passReason;
    }
    public void setPassReason(String passReason) {
        this.passReason = passReason;
    }
}