class Employee {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Manager extends Employee {
    int teamSize;

    void setTeam(int teamSize) {
        this.teamSize = teamSize;
    }
}

class ProjectManager extends Manager {
    String project;

    void setProject(String project) {
        this.project = project;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager();
        pm.setName("Ravi");
        pm.setTeam(10);
        pm.setProject("AI System");
        pm.display();
    }
}