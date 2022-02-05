-- ----------------------------
-- Table structure for task
-- ----------------------------
drop table if exists `task`;
create table `task`
(
    `id`       int(11)      not null auto_increment,
    `userId`   int(11)      not null,
    `taskName` varchar(255) not null,
    primary key (`id`)
) engine = InnoDB
  auto_increment = 35
  default charset = utf8mb4;

-- ----------------------------
-- Records of task
-- ----------------------------
insert into `task`
values ('1', '1', 'Clean classroom.');
insert into `task`
values ('2', '1', 'Open the door.');
insert into `task`
values ('3', '2', 'Open windows.');
insert into `task`
values ('4', '3', 'Clean the blackboard.');
insert into `task`
values ('5', '2', 'Buy some boos.');
insert into `task`
values ('6', '3', 'Buy some pens.');
insert into `task`
values ('7', '4', 'Buy some flowers.');