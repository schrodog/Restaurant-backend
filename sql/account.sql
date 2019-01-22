CREATE USER 'emily'@'localhost' IDENTIFIED BY '29ds4k';
GRANT ALL ON Restaurant.masterorder TO 'emily'@'localhost';
GRANT SELECT, UPDATE(quantity) ON Restaurant.menu TO 'emily'@'localhost';
GRANT ALL ON Restaurant.`order` TO 'emily'@'localhost';
GRANT ALL ON Restaurant.report TO 'emily'@'localhost';
GRANT SELECT, UPDATE(Available) ON Restaurant.`table` TO 'emily'@'localhost';
GRANT SELECT(StaffID,password,UserName), UPDATE(PassWord) ON Restaurant.staff TO 'emily'@'localhost';

CREATE USER 'greg'@'localhost' IDENTIFIED BY '7dck3i';
GRANT ALL ON Restaurant.masterorder TO 'greg'@'localhost';
GRANT SELECT, UPDATE(quantity) ON Restaurant.menu TO 'greg'@'localhost';
GRANT ALL ON Restaurant.`order` TO 'greg'@'localhost';
GRANT ALL ON Restaurant.report TO 'greg'@'localhost';
GRANT SELECT, UPDATE(Available) ON Restaurant.`table` TO 'greg'@'localhost';
GRANT SELECT(StaffID,password,UserName), UPDATE(PassWord) ON Restaurant.staff TO 'greg'@'localhost';

CREATE USER 'gc28'@'localhost' IDENTIFIED BY '2x3x4x';
GRANT ALL ON Restaurant.masterorder TO 'gc28'@'localhost';
GRANT SELECT, UPDATE(quantity) ON Restaurant.menu TO 'gc28'@'localhost';
GRANT ALL ON Restaurant.`order` TO 'gc28'@'localhost';
GRANT ALL ON Restaurant.report TO 'gc28'@'localhost';
GRANT SELECT, UPDATE(Available) ON Restaurant.`table` TO 'gc28'@'localhost';
GRANT SELECT(StaffID,password,UserName), UPDATE(PassWord) ON Restaurant.staff TO 'gc28'@'localhost';

CREATE USER 'cw2000'@'localhost' IDENTIFIED BY 'sejicnq';
GRANT ALL ON Restaurant.masterorder TO 'cw2000'@'localhost';
GRANT SELECT, UPDATE(quantity) ON Restaurant.menu TO 'cw2000'@'localhost';
GRANT ALL ON Restaurant.`order` TO 'cw2000'@'localhost';
GRANT ALL ON Restaurant.report TO 'cw2000'@'localhost';
GRANT SELECT, UPDATE(Available) ON Restaurant.`table` TO 'cw2000'@'localhost';
GRANT SELECT(StaffID,password,UserName), UPDATE(PassWord) ON Restaurant.staff TO 'cw2000'@'localhost';

CREATE USER 'bwong'@'localhost' IDENTIFIED BY '12583k';
GRANT ALL ON Restaurant.masterorder TO 'bwong'@'localhost';
GRANT SELECT, UPDATE(quantity) ON Restaurant.menu TO 'bwong'@'localhost';
GRANT ALL ON Restaurant.`order` TO 'bwong'@'localhost';
GRANT ALL ON Restaurant.report TO 'bwong'@'localhost';
GRANT SELECT, UPDATE(Available) ON Restaurant.`table` TO 'bwong'@'localhost';
GRANT SELECT(StaffID,password,UserName), UPDATE(PassWord) ON Restaurant.staff TO 'bwong'@'localhost';

CREATE USER 'kwok'@'localhost' IDENTIFIED BY 'ka123';
GRANT ALL ON *.* TO 'kwok'@'localhost' WITH GRANT OPTION;
GRANT CREATE USER ON *.* TO 'kwok'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;
