CREATE DATABASE `project_crowd` CHARACTER SET utf8;

USE project_crowd;
DROP TABLE IF EXISTS t_admin;
CREATE TABLE t_admin
(
     id            INT NOT NULL AUTO_INCREMENT,  # primary key
     login         VARCHAR(255) NOT NULL,        # login account
     user_pswd     CHAR(32) NOT NULL,            # login pwd
     user_name     VARCHAR(255) NOT NULL,        # user name
     email         VARCHAR(255) NOT NULL,        # email
     create_time   CHAR(19),                     # create time
     PRIMARY KEY (id)                            
);