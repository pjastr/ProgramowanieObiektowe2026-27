package w6.education;

public class University extends School {
    private static final String DEFAULT_TYPE = "university of technology";
    private static final int DEFAULT_STUDIES = 10;

    private String type;
    private int studies;

    public University(String name, String address, int students, String type, int studies) {
        super(name, address, students);
        this.type = isValidType(type) ? type : DEFAULT_TYPE;
        this.studies = studies >= 0 ? studies : DEFAULT_STUDIES;
    }

    private static boolean isValidType(String type) {
        return type != null && !type.isEmpty();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (isValidType(type)) {
            this.type = type;
        }
    }

    public int getStudies() {
        return studies;
    }

    public void setStudies(int studies) {
        if (studies >= 0) {
            this.studies = studies;
        }
    }

    @Override
    public void recruitment(int count) {
        super.recruitment(count);
        studies += count / 10;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: " + type + ". Number of fields of study: "
                + studies + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {                     // the same class and address
            return false;
        }
        University other = (University) o;
        return studies == other.studies;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Integer.hashCode(studies);
    }
}
