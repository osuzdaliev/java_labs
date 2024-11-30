CREATE DATABASE StudentsDB;
USE StudentsDB;

CREATE TABLE Students (
                          ID INT AUTO_INCREMENT PRIMARY KEY,
                          LastName VARCHAR(50) NOT NULL,
                          FirstName VARCHAR(50) NOT NULL,
                          MiddleName VARCHAR(50),
                          BirthDate DATE NOT NULL,
                          GradeBookNumber VARCHAR(20) NOT NULL
);

INSERT INTO Students (LastName, FirstName, MiddleName, BirthDate, GradeBookNumber) VALUES
                                                                                       ('Ivanov', 'Ivan', 'Ivanovich', '2000-01-15', '12345'),
                                                                                       ('Petrov', 'Petr', 'Petrovich', '2001-02-20', '12346'),
                                                                                       ('Sidorov', 'Alexey', 'Sergeevich', '2000-03-10', '12347'),
                                                                                       ('Kuznetsova', 'Maria', 'Alexeevna', '2001-04-25', '12348'),
                                                                                       ('Nikolaev', 'Dmitry', 'Igorevich', '2002-05-05', '12349'),
                                                                                       ('Orlova', 'Olga', 'Petrovna', '2000-07-18', '12350'),
                                                                                       ('Smirnov', 'Sergey', 'Ivanovich', '2001-08-09', '12351'),
                                                                                       ('Vasilev', 'Victor', 'Nikolaevich', '2000-09-30', '12352'),
                                                                                       ('Fedorova', 'Elena', 'Viktorovna', '2001-10-12', '12353'),
                                                                                       ('Gusev', 'Andrey', 'Alexandrovich', '2000-11-05', '12354'),
                                                                                       ('Popova', 'Anna', 'Sergeevna', '2001-12-27', '12355'),
                                                                                       ('Ivanova', 'Svetlana', 'Ivanovna', '2000-01-08', '12356'),
                                                                                       ('Alexandrov', 'Nikolay', 'Alexeevich', '2001-02-18', '12357'),
                                                                                       ('Morozov', 'Pavel', 'Igorevich', '2000-03-25', '12358'),
                                                                                       ('Lebedeva', 'Irina', 'Sergeevna', '2001-04-22', '12359'),
                                                                                       ('Efimov', 'Artem', 'Petrovich', '2000-05-15', '12360'),
                                                                                       ('Zaitseva', 'Tatiana', 'Dmitrievna', '2001-07-30', '12361'),
                                                                                       ('Kuzmin', 'Vladimir', 'Olegovich', '2000-08-11', '12362'),
                                                                                       ('Solovyev', 'Roman', 'Alexeevich', '2001-09-05', '12363'),
                                                                                       ('Chernov', 'Alexandr', 'Igorevich', '2000-11-22', '12364');