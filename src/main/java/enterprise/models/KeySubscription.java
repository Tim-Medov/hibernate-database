
package enterprise.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class KeySubscription implements Serializable {

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "course_id")
    private Integer courseId;

    public KeySubscription() {}

    public KeySubscription(Integer studentId, Integer courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof KeySubscription)) return false;

        KeySubscription keySubscription = (KeySubscription) o;

        return getStudentId() == keySubscription.getStudentId() && getCourseId() == keySubscription.getCourseId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), getCourseId());
    }
}
