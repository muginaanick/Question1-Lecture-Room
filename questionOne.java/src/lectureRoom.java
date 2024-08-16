public class lectureRoom {
    private int students;
    private boolean[] lights;

    public lectureRoom() {
        this.students = 0;
        this.lights = new boolean[3];
    }

    public void addStudents(int count) {
        this.students += count;
    }

    public void removeStudents(int count) {
        this.students = Math.max(0, this.students - count);
    }

    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            this.lights[lightNumber - 1] = true;
        } else {
            System.out.println("Invalid light number. It should be between 1 and 3.");
        }
    }

    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            this.lights[lightNumber - 1] = false;
        } else {
            System.out.println("Invalid light number. It should be between 1 and 3.");
        }
    }

    public int getStudents() {
        return this.students;
    }

    public boolean[] getLights() {
        return this.lights;
    }

    public void displayStatus() {
        System.out.println("Number of students: " + this.students);
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + ": " + (lights[i] ? "On" : "Off"));
        }
    }
}