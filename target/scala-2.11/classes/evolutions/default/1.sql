# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ingredient_task (
  id                            bigint not null,
  task_id                       bigint,
  ingredient_id                 bigint,
  measure                       varchar(255),
  quantity                      float,
  constraint pk_ingredient_task primary key (id)
);
create sequence ingredient_task_seq;

create table ingrediente (
  id                            bigint not null,
  name                          varchar(255),
  constraint pk_ingrediente primary key (id)
);
create sequence ingrediente_seq;

create table receta (
  id                            bigint not null,
  name                          varchar(255),
  created_at                    timestamp not null,
  constraint pk_receta primary key (id)
);
create sequence receta_seq;

create table receta_ingrediente (
  receta_id                     bigint not null,
  ingrediente_id                bigint not null,
  constraint pk_receta_ingrediente primary key (receta_id,ingrediente_id)
);

create table receta_tag (
  receta_id                     bigint not null,
  tag_id                        bigint not null,
  constraint pk_receta_tag primary key (receta_id,tag_id)
);

create table tag (
  id                            bigint not null,
  name                          varchar(255),
  constraint pk_tag primary key (id)
);
create sequence tag_seq;

create table task (
  id                            bigint not null,
  description                   varchar(255),
  seconds                       integer,
  recipe_id                     bigint,
  constraint pk_task primary key (id)
);
create sequence task_seq;

alter table ingredient_task add constraint fk_ingredient_task_task_id foreign key (task_id) references task (id) on delete restrict on update restrict;
create index ix_ingredient_task_task_id on ingredient_task (task_id);

alter table ingredient_task add constraint fk_ingredient_task_ingredient_id foreign key (ingredient_id) references ingrediente (id) on delete restrict on update restrict;
create index ix_ingredient_task_ingredient_id on ingredient_task (ingredient_id);

alter table receta_ingrediente add constraint fk_receta_ingrediente_receta foreign key (receta_id) references receta (id) on delete restrict on update restrict;
create index ix_receta_ingrediente_receta on receta_ingrediente (receta_id);

alter table receta_ingrediente add constraint fk_receta_ingrediente_ingrediente foreign key (ingrediente_id) references ingrediente (id) on delete restrict on update restrict;
create index ix_receta_ingrediente_ingrediente on receta_ingrediente (ingrediente_id);

alter table receta_tag add constraint fk_receta_tag_receta foreign key (receta_id) references receta (id) on delete restrict on update restrict;
create index ix_receta_tag_receta on receta_tag (receta_id);

alter table receta_tag add constraint fk_receta_tag_tag foreign key (tag_id) references tag (id) on delete restrict on update restrict;
create index ix_receta_tag_tag on receta_tag (tag_id);

alter table task add constraint fk_task_recipe_id foreign key (recipe_id) references receta (id) on delete restrict on update restrict;
create index ix_task_recipe_id on task (recipe_id);


# --- !Downs

alter table ingredient_task drop constraint if exists fk_ingredient_task_task_id;
drop index if exists ix_ingredient_task_task_id;

alter table ingredient_task drop constraint if exists fk_ingredient_task_ingredient_id;
drop index if exists ix_ingredient_task_ingredient_id;

alter table receta_ingrediente drop constraint if exists fk_receta_ingrediente_receta;
drop index if exists ix_receta_ingrediente_receta;

alter table receta_ingrediente drop constraint if exists fk_receta_ingrediente_ingrediente;
drop index if exists ix_receta_ingrediente_ingrediente;

alter table receta_tag drop constraint if exists fk_receta_tag_receta;
drop index if exists ix_receta_tag_receta;

alter table receta_tag drop constraint if exists fk_receta_tag_tag;
drop index if exists ix_receta_tag_tag;

alter table task drop constraint if exists fk_task_recipe_id;
drop index if exists ix_task_recipe_id;

drop table if exists ingredient_task;
drop sequence if exists ingredient_task_seq;

drop table if exists ingrediente;
drop sequence if exists ingrediente_seq;

drop table if exists receta;
drop sequence if exists receta_seq;

drop table if exists receta_ingrediente;

drop table if exists receta_tag;

drop table if exists tag;
drop sequence if exists tag_seq;

drop table if exists task;
drop sequence if exists task_seq;

