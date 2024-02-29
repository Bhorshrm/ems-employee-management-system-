DROP TABLE if exists employee;

CREATE TABLE employee
(
    empId      INTEGER not NULL,
    empName    VARCHAR(255),
    emailId    VARCHAR(255),
    department VARCHAR(255),
    status     VARCHAR(255),
    PRIMARY KEY (empId)
);