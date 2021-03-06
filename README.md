### TDT4250 - Advanced Software Design
William Andersson & Anniken Syvertsen

# Repo Structure
```
org.eclipse.acceleo.module.studyprogramme | Contains the acceleo project
│   ...
└───src/main
    |   Generate.java
    |   generate.mtl | A MTL file which includes HTML-structure, acceleo-code and styling of the project  

exampleHMTL
│   studyprogramme.html | A simple HMTL file to guide us on how to create the acceleo M2T model.

studyprogramme
│   README.md
│   ... | autogenerated files from eclipse
└───META-INF/
|   |   MANIFEST.MF
|
└───src/sp/
│   │   SpFactory.java
│   │   SpPackage.java
|   |   ... | All other interfaces
|
│   └───examples/ | For different test files, like checking if our derived features were working as intended. Eyeball testing
│   |
│   └───impl/ | Contains implementation classes
|   |
│   └───util/ | Contains utility classes, like manually written validation
└───model/
    │   InstanceTest.xmi | Our main instance, currently showing the full Course of Study for a 2020 cohort of Software, MSIT
    │   sp.ecore | StudyPlan model
    │   sp.genmodel | Studyplan genmodel

```

# Installation

The repo contains everything you would need, but should you want to regenerate both the model code and execute the M2T transformation again, you may follow these instructions:

1. Clone the repo to your desired location.

2. Regenerate the model code by opnening sp.genmodel and right clicking the sp package, shown below, and clicking "Generate Model Code"
![Genmodel](https://i.imgur.com/eFD5YRB.png "Genmodel")

3. You may execute the M2T transformation by running the generate.mtl file as a Java Application. Right click generate.mtl -> Run As -> Launch Acceleo Application, and apply the following settings:
![Java Application Settings](https://i.imgur.com/mgS5doz.png "Java Application Settings")

# Changes from assignment 1
Pretty much no changes were made to the model from assingnment one, except the names of the features in Course and padding the model instance with more data.

# Content - studyprogramme/model
## Classes (eCore)
### Course of Study
In the Studyplan model there is a class called Course of Study. This is defined as "the courses of which an education is formed by". The class is used both for programmes and specializations (continuation). You can think of a program as a sequence of semesters ending in a set of possible continuations, and the continuations are just like the programme itself, they also contain semesters and end in a set of possible continuations.

### Study Cohort
A study cohort (Norwegian: "kull") lets you set the start year of the course of study. 

### Semester
A semester has a semestercode and a refrence to the study cohort so that a semester will contain given classes for the studycohort that belongs to the course of study, so that each semester instance will be unique. (E.g. H2020 for MSIT with study cohort 2020 will be a different semester than H2020 for MSIT with study cohort 2019, since the courses are different for the first and the third semester of MSIT)

### Course
A course has credits and coursecode and also uses derived features to extract the code and the name of the course. 

### Studyplan
The Studyplan is the top class of the model. 

## Derived Features
### Course.name => course.title and course.code
All course names are written in the format: "TDT4250 - Advanced Software Engineering". To get access to both the course code and the course title we derived those features from the full course name.

### Semester code => season and year
When creating a semester you write "H2020", and we have used derived features to extract what season and what year it is based on the semester code.

## Constraints
### OCL
We implemented two OCL constraints to check that there is at least 4 and at most 10 semesters in a course of study 

### Manually written
We implemented two manually written constraints that checks that a semester offers at least 30 course credits through electives and mandatory courses. Additionally there may be no more than 30 compulsory course credits. 

## Opposites
- StudyCohort & Semester
- Course of Study & StudyCohort
- Course of Study & Specialization (Class: CourseOfStudy)
- Studyplan & Course of Study

## Containments
- CourseOfStudy is contained by StudyPlan: a course of Study (e.g. MSIT) can only belong to one studyplan
- StudyCohort is contained by CourseOfStudy: a study cohort can only belong to one course of study
- Semester is contained by StudyCohort: a semester can only belong to one study chohort. That way you can say that a course in a semester is mandatory. If the semester was not contained by a StudyCohort, it would be difficult to say that a course was mandatory since the semester could be the same for several cohorts.
- Course is contained by StudyPlan: the courses can belong 

## Misc.
Lanugage for instances is Norwegian for now. E.g. seasons will be returned as "Host" (acceleo didn't like Ø) and "Vår".

**Datatypes**

We have created an enum for credits called CreditKind that is used in the Course class to assign a given number of credits for a course.

## Assumptions
- For this assignment we have assumed that you can only choose from a Bachelor, Integrated Masters, and a Masters, and therefore the minimum semesters are 4 (Masters) and the maximum semesters are 10 (Integrated Masters)
- For this assignment we have assumed that the courses are either compulsory or elective, no M2A, M1A, K-courses, etc. To solve this we have said that M2A are electives in this case.

# Acceleo
## Explanation of special cases  

To make sure that the elective courses heading would not be rendered unless a semester for a given programme actually had elective courses, we made a check. The check contains an if-statement that says "if (i=1)", ensuring that the code following the statement would only be rendered if the for-loop made it to the first index. This means that if there are no courses in the list, we will never get to index 1 and the 'elective courses' section will not be rendered. 

```
Example: 
[for (electiveCourse : Course | semester.electiveCourses)]
 	[if (i = 1)]
	[/if]
[/for]
```

We had difficulties understanding the Sequence class in acceleo, so this became our solution for checking if a Sequence actually has members.


