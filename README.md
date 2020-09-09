# TDT4250-advanced-software

## Div
Lanugage for instances is Norwegian for now. E.g. seasons will be returned as "Høst" and "Vår".

## Classes
### Course of Study
In the Studyplan model there is a class called Course of Study. This is defined as "the courses of which an education is formed by". The class is used both for Progamme and Specialization (continuation). You can think of program as a sequence of semesters ending in a set of possible continuations, and the continuations are just like the programme itself, they also contain semesters and end in a set of possible continuations. 

## Study Cohort
A study cohort (Norwegian: "kull") lets you set the start year of the course of study.


## Derived Features
### Course name + course code = course
When creating a course you have to write it in this format "TDT4250 - Advanced Software Engineering". To get access to both the course code and the course name we have made some derived features that extract the course name and the course code.

### Season + year = semester code
When creating a semester you write "H2020", and we have used derived features to extract what season and what study cohort it is based on the semester code.

## Constraints
### OCL
We use the OCL constraint to check that there are minimum 4 semesters and maximum 10 in a course of study 

### Manually written
Other constraints, that are manually written, checks that you have minimum 30 course credits, and that you have a maximum of 30 compulsary course credits. 

## Opposites

## Containments
- 

## Assumptions
- For this assignment we have assumed that you can only choose a master or bachelor in the studyplan, and therefore minimum semesters are 4 (master) and maximum semesters are 10 integrated master)
