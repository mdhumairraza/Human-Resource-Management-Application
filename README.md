# radioactive-muscle-5983-
Human Resource management system


# The Basic Prerequisites of this Applications are.
- [x] Should Have a MySQL Server and a Database Created.
- [x] Should have created folllowing tables into the database WITH SAME DATATYPES.


- [X] TABLE DEPARTMENT


| Field     | Type        | Null | Key | Default | Extra          |
|-----------|-------------|------|-----|---------|----------------|
| dept_id   | int         | NO   | PRI | NULL    | auto_increment |
| dept_name | varchar(20) | NO   | UNI | NULL    |                |



<hr />

- [X] TABLE ADMIN


| Field         | Type        | Null | Key | Default | Extra          |
|---------------|-------------|------|-----|---------|----------------|
| admin_id      | int         | NO   | PRI | NULL    | auto_increment |
| admin_name    | varchar(30) | NO   |     | NULL    |                |
| admin_pass    | varchar(8)  | NO   | UNI | NULL    |                |
| admin_dept_id | int         | NO   |     | NULL    |                |




<hr />

- [x] TABLE EMPLOYEE


| Field       | Type        | Null | Key | Default           | Extra             |
|-------------|-------------|------|-----|-------------------|-------------------|
| emp_id      | int         | NO   | PRI | NULL              | auto_increment    |
| emp_name    | varchar(30) | NO   |     | NULL              |                   |
| emp_pass    | varchar(8)  | NO   | UNI | NULL              |                   |
| emp_dept_id | int         | YES  | MUL | NULL              |                   |
| emp_login   | datetime    | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |




<hr />

- [x] TABLE LEAVEAPPLICATION


| Field     | Type        | Null | Key | Default | Extra |
|-----------|-------------|------|-----|---------|-------|
| emp_id    | int         | YES  | UNI | NULL    |       |
| leave_day | varchar(10) | YES  |     | NULL    |       |
| status    | varchar(10) | YES  |     | Pending |       |



<hr />



# Description :-

Software To Monitor Your Employees details, Productive Time, Leave Status & Department Details.




<h3>Admin Roles are:</h3>

•	Admin can add new Departments.
</br>
•	Admin can view and update the Departments.
</br>
•	Admin can register new Employees and give them their password.
</br>
•	Admin can also transfer them to other departments.
</br>
•	Admin can grant or deny employee leave request.
</br>



<h3>Employee Roles are:</h3>
</br>
•	Employee can view and update his profile.
</br>
•	Employee can also change his password.
</br>
•	Employee can also request for leaves.
</br>


# Tech stack and Tools used 

- Java
- MySQL
- Git & GitHub




# Flow of Application

<h3>Database Schema:</h3>
![ER_Diagram](https://user-images.githubusercontent.com/112873688/221327729-74c61191-3130-4d39-b0b8-380dfbe7290e.png)


# Flowchart 
![mdhumairraza_flowDiagram](https://user-images.githubusercontent.com/112873688/221328077-8d6a59af-ed68-474c-8909-12ec9775b0f9.png)


## **Application Start** 
*Start View Of Application*
</br>

## **ADMIN ACCESSIBLE FUNCTIONS** 

![Screenshot_20230225_063616](https://user-images.githubusercontent.com/112873688/221327790-1bccff1c-4904-4e33-8ff3-d8e64609cb86.png)

</br>

## ****EMPLOYEE ACCESSIBLE FUNCTIONS** 
![Screenshot_20230225_063842](https://user-images.githubusercontent.com/112873688/221327817-a6eb5c47-55e2-4523-86aa-560972c8cba6.png)


</br>

-*User can go back to the previous option*
</br>


# Thank you for reading..
