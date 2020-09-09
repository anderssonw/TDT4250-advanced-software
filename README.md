# TDT4250-advanced-software
William Andersson & Anniken Syvertsen

## Repo Structure


## Content
## Div
Lanugage for instances is Norwegian for now. E.g. seasons will be returned as "Høst" and "Vår".

**Datatypes**

We have created an ENum for credits that is called CreditKind that is used in the Course class to assign a given number of credits for a course.

## Classes
### Course of Study
In the Studyplan model there is a class called Course of Study. This is defined as "the courses of which an education is formed by". The class is used both for Progamme and Specialization (continuation). You can think of program as a sequence of semesters ending in a set of possible continuations, and the continuations are just like the programme itself, they also contain semesters and end in a set of possible continuations. 

### Study Cohort
A study cohort (Norwegian: "kull") lets you set the start year of the course of study. 

### Semester
A semester has a semestercode and a refrence to the study cohort so that a semester will contain given classes for the studycohort that belongs to the course of study, so that each semester instance will be uniqe. (E.g. H2020 for MSIT with study cohort 2020 will be a different semester than H2020 for MSIT with study cohort 2019, since the courses are different for the first and the third semester of MSIT)

### Course
A course has credits and coursecode and also uses derived features to extract the code and the name of the course. 

### Studyplan
The Studyplan is the top class of the model. 

## Derived Features
### Course => course name and course code
When creating a course you have to write it in this format "TDT4250 - Advanced Software Engineering". To get access to both the course code and the course name we have made some derived features that extract the course name and the course code.

### Semester code => season and year
When creating a semester you write "H2020", and we have used derived features to extract what season and what study cohort it is based on the semester code.

## Constraints
### OCL
We use the OCL constraint to check that there are minimum 4 semesters and maximum 10 in a course of study 

### Manually written
Manually written constraints: checks that you have minimum 30 course credits, and that you have a maximum of 30 compulsary course credits. 

## Opposites

## Containments
- CourseOfStudy is contained by StudyPlan: a course of Study (e.g. MSIT) can only belong to one studyplan
- StudyCohort is contained by CourseOfStudy: a study cohort can only belong to one course of study
- Semester is contained by StudyCohort: a semester can only belong to one study chohort. That way you can say that a course in a semester is mandatory. If the semester was not contained by a StudyCohort, it would be difficult to say that a course was mandatory since the semester could be the same for several cohorts.
- Course is contained by StudyPlan: the courses can belong 



## Assumptions
- For this assignment we have assumed that you can only choose a master or bachelor in the studyplan, and therefore minimum semesters are 4 (master) and maximum semesters are 10 integrated master)
- For this assignment we have assumed that the courses are either compulsary or elective 

