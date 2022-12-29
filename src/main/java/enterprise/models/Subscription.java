
package enterprise.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "subscription")
public class Subscription {

    @EmbeddedId
    private KeySubscription keySubscription;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", insertable = false, updatable = false, nullable = false)
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", insertable = false, updatable = false, nullable = false)
    private Course course;

    @Column(name = "subscription_date")
    private Date subscriptionDate;

    public Subscription() {}

    public KeySubscription getKeySubscription() {
        return keySubscription;
    }

    public void setKeySubscription(KeySubscription keySubscription) {
        this.keySubscription = keySubscription;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }
}
