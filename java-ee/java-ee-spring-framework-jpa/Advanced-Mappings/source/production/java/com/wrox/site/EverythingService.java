package com.wrox.site;

import com.wrox.site.entities.*;

import java.util.List;

public interface EverythingService {
    void saveApplicant(Applicant applicant);

    List<Applicant> getAllApplicants();

    Applicant getApplicant(long id);

    void saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployee(long id);

    void saveNewsArticle(NewsArticle newsArticle);

    List<NewsArticle> getAllNewsArticles();

    void savePerson(Person person);

    List<Person> getAllPersons();

    void saveRésumé(Resume résumé);

    void saveUser(User user);

    List<User> getAllUsers();
}
