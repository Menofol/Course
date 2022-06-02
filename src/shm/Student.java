package shm;

public class Student {
    private String name;
    private String group;
    private String course;
    private String faculty;
    private String passType;
    private String passDate;
    private String passReason;
    public String getName() { // отримання даних про прізвище
        return name;
    }
    public void setName(String name) { // встановлення даних про прізвище
            this.name = name;
    }
    public String getGroup() { // отримання даних про групу
        return group;
    }
    public void setGroup(String group) { // встановлення даних про групу
            this.group = group;
    }
    public String getCourse() { // отримання даних про курс
        return course;
    }
    public void setCourse(String course) { // встановлення даних про курс
            this.course = course;
    }
    public String getFaculty() { // отримання даних про факультет
        return faculty;
    }
    public void setFaculty(String faculty) { // встановлення даних про факультет
        this.faculty = faculty;
    }
    public String getPassType() { // отримання даних про тип пропуску
        return passType;
    }
    public void setPassType(String passType) { // встановлення даних про тип пропуску
        this.passType = passType;
    }
    public String getPassDate() { // отримання даних про дату пропуску
        return passDate;
    }
    public void setPassDate(String passDate) { // встановлення даних про дату пропуску
        this.passDate = passDate;
    }
    public String getPassReason() { // отримання даних про причину пропуску
        return passReason;
    }
    public void setPassReason(String passReason) { // встановлення даних про причину пропуску
        this.passReason = passReason;
    }
}