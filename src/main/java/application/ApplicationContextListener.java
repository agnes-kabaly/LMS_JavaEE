package application;

import model.Curriculum;
import model.Role;
import model.Solution;
import model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.transaction.Transactional;
import java.time.LocalDateTime;

@WebListener
public class ApplicationContextListener implements ServletContextListener {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void contextInitialized(ServletContextEvent sce) {

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        User user6 = new User();

        user1.setFirstName("Béla");
        user2.setFirstName("Janő");
        user3.setFirstName("Robi");
        user4.setFirstName("Süti");
        user5.setFirstName("Ági");
        user6.setFirstName("Feri");

        user1.setLastName("Kovács");
        user2.setLastName("Diák");
        user3.setLastName("Kiss");
        user4.setLastName("Nagy");
        user5.setLastName("Lakatos");
        user6.setLastName("Molnár");

        user1.setEmail("kovacs@mentor.com");
        user2.setEmail("jeno@diak.com");
        user3.setEmail("robi@mentor.com");
        user4.setEmail("suti@diak.com");
        user5.setEmail("agi@diak.com");
        user6.setEmail("feri@diak.com");

        user1.setRole(Role.MENTOR);
        user2.setRole(Role.STUDENT);
        user3.setRole(Role.MENTOR);
        user4.setRole(Role.STUDENT);
        user5.setRole(Role.STUDENT);
        user6.setRole(Role.STUDENT);

        entityManager.persist(user1);
        entityManager.persist(user2);
        entityManager.persist(user3);
        entityManager.persist(user4);
        entityManager.persist(user5);
        entityManager.persist(user6);

        Curriculum curriculum1 = new Curriculum();
        Curriculum curriculum2 = new Curriculum();
        Curriculum curriculum3 = new Curriculum();
        Curriculum curriculum4 = new Curriculum();

        curriculum1.setTitle("Practice MySQL");
        curriculum2.setTitle("Check if email is exist");
        curriculum3.setTitle("Send a Curriculum list to the frontend");
        curriculum4.setTitle("Start Angular");

        curriculum1.setPublished(true);
        curriculum2.setPublished(false);
        curriculum3.setPublished(true);
        curriculum4.setPublished(false);

        curriculum1.setContent("Create some data...");
        curriculum2.setContent("Maybe in the UserHandler...");
        curriculum3.setContent("repeat some PostMan...");
        curriculum4.setContent("Create some path() and plans with TFS...");

        curriculum1.setPostedDate(LocalDateTime.now());
        curriculum2.setPostedDate(LocalDateTime.now().minusDays(7L));
        curriculum3.setPostedDate(LocalDateTime.now().plusHours(8));
        curriculum4.setPostedDate(LocalDateTime.now().plusHours(26));

        curriculum1.setDeadline(LocalDateTime.now().plusHours(9L));
        curriculum2.setDeadline(LocalDateTime.now().plusDays(15L));
        curriculum3.setDeadline(LocalDateTime.now().plusDays(7L));
        curriculum4.setDeadline(LocalDateTime.now().plusDays(18L));

        curriculum1.setMaxPoint(10);
        curriculum2.setMaxPoint(30);
        curriculum3.setMaxPoint(10);
        curriculum4.setMaxPoint(30);

        curriculum1.setAuthor("Kovács Béla");
        curriculum2.setAuthor("Kiss Robi");
        curriculum3.setAuthor("Kovács Béla");
        curriculum4.setAuthor("Kiss Robi");

        entityManager.persist(curriculum1);
        entityManager.persist(curriculum2);
        entityManager.persist(curriculum3);
        entityManager.persist(curriculum4);

        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();
        Solution solution4 = new Solution();
        Solution solution5 = new Solution();
        Solution solution6 = new Solution();

        solution1.setUserId(2);
        solution2.setUserId(4);
        solution3.setUserId(5);
        solution4.setUserId(6);
        solution5.setUserId(4);
        solution6.setUserId(5);

        solution1.setCurriculumId(1);
        solution2.setCurriculumId(1);
        solution3.setCurriculumId(1);
        solution4.setCurriculumId(1);
        solution5.setCurriculumId(3);
        solution6.setCurriculumId(5);

        solution2.setSolutionContent("INSERT INTO....everywhere...");
        solution3.setSolutionContent("MAYBE INSERT INTO....everywhere...");
        solution3.setSolutionContent("INSERT INTO...");
        solution5.setSolutionContent("Tested by postMan...");
        solution6.setSolutionContent("Create q-u-e-r-y...");

        solution3.setComment("It was really hard for me...");
        solution4.setComment("Ready bros!");
        solution5.setComment("It wasn't so naughty...");
        solution6.setComment("OMG");

        solution1.setPostedDate(LocalDateTime.now().plusDays(1L));
        solution2.setPostedDate(LocalDateTime.now().minusDays(1L));
        solution3.setPostedDate(LocalDateTime.now());
        solution4.setPostedDate(LocalDateTime.now().minusHours(4L));
        solution5.setPostedDate(LocalDateTime.now().minusHours(24L));
        solution6.setPostedDate(LocalDateTime.now().plusHours(1L));

        solution3.setEvaluationDate(LocalDateTime.now().plusHours(1L));
        solution4.setEvaluationDate(LocalDateTime.now().minusHours(6L));
        solution5.setEvaluationDate(LocalDateTime.now().minusHours(9L));

        solution3.setPoints(10);
        solution4.setPoints(10);
        solution5.setPoints(10);

        solution3.setMentorComment("Don't panic, it's OK!");
        solution4.setMentorComment("Keep it up");
        solution5.setMentorComment("Good job!");

        solution3.setEvaluatedBy("Kiss Robi");
        solution4.setEvaluatedBy("Kiss Robi");
        solution5.setEvaluatedBy("Kiss Robi");

        entityManager.persist(solution1);
        entityManager.persist(solution2);
        entityManager.persist(solution3);
        entityManager.persist(solution4);
        entityManager.persist(solution5);
        entityManager.persist(solution6);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }


}
