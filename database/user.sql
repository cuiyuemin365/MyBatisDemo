-- ----------------------------
-- Table structure for user
-- ----------------------------
drop table if exists `user`;
create table `user`
(
    `id`         int(11)      not null auto_increment,
    `name`       varchar(255) not null,
    `email`      varchar(255) default null,
    `age`        int(11)      default null,
    `sex`        int(255)     default null,
    `schoolName` varchar(255) default null,
    primary key (`id`)
) engine = InnoDB
  auto_increment = 14
  default charset = utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
insert into `user`
values ('1', '易哥', 'yeecode@sample.com', '18', '0', 'Sunny School');
insert into `user`
values ('2', '莉莉', 'lili@sample.com', '15', '1', 'Garden School');
insert into `user`
values ('3', '杰克', 'jack@sample.com', '25', '0', 'Sunny School');
insert into `user`
values ('4', '张大壮', 'zdazhaung@sample.com', '16', '0', 'Garden School');
insert into `user`
values ('5', '王小壮', 'wxiaozhuang@sample.com', '27', '0', 'Sunny School');
insert into `user`
values ('6', '露西', 'lucy@sample.com', '14', '1', 'Garden School');
insert into `user`
values ('7', '李二壮', 'lerzhuang@sample.com', '9', '0', 'Sunny School');
