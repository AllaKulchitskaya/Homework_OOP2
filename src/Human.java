public class Human {
    public String name;
    private String town;
    private int yearOfBirth;
    public String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        if (this.name == null || this.name.isEmpty() || this.name.isBlank()) {
            this.name = "Информация не указана";
        }
        setTown(town);
        setYearOfBirth(yearOfBirth);
        this.jobTitle = jobTitle;
        if (this.jobTitle == null || this.jobTitle.isEmpty() || this.jobTitle.isBlank()) {
            this.jobTitle = "Информация не указана";
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
        if (this.town == null || this.town.isBlank() || this.town.isEmpty()) {
            this.town = "Информация не указана";
        }
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        if (this.yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
    }

    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Мой год рождения - " +
                this.yearOfBirth + ". Я работаю на должности " + this.jobTitle + ". Будем знакомы!";
    }
}
