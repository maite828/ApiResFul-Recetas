# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ingredient (
  id                            bigint not null,
  name                          varchar(255),
  quantity                      float,
  constraint pk_ingredient primary key (id)
);
create sequence ingredient_seq;

create table ingredient_task (
  id                            bigint not null,
  task_id                       bigint,
  ingredient_id                 bigint,
  constraint pk_ingredient_task primary key (id)
);
create sequence ingredient_task_seq;

create table recipe (
  id                            bigint not null,
  name                          varchar(255),
  portions                      integer,
  created_at                    timestamp not null,
  constraint pk_recipe primary key (id)
);
create sequence recipe_seq;

create table recipe_ingredient (
  recipe_id                     bigint not null,
  ingredient_id                 bigint not null,
  constraint pk_recipe_ingredient primary key (recipe_id,ingredient_id)
);

create table recipe_tag (
  recipe_id                     bigint not null,
  tag_id                        bigint not null,
  constraint pk_recipe_tag primary key (recipe_id,tag_id)
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
  recipe_id                     bigint,
  constraint pk_task primary key (id)
);
create sequence task_seq;

alter table ingredient_task add constraint fk_ingredient_task_task_id foreign key (task_id) references task (id) on delete restrict on update restrict;
create index ix_ingredient_task_task_id on ingredient_task (task_id);

alter table ingredient_task add constraint fk_ingredient_task_ingredient_id foreign key (ingredient_id) references ingredient (id) on delete restrict on update restrict;
create index ix_ingredient_task_ingredient_id on ingredient_task (ingredient_id);

alter table recipe_ingredient add constraint fk_recipe_ingredient_recipe foreign key (recipe_id) references recipe (id) on delete restrict on update restrict;
create index ix_recipe_ingredient_recipe on recipe_ingredient (recipe_id);

alter table recipe_ingredient add constraint fk_recipe_ingredient_ingredient foreign key (ingredient_id) references ingredient (id) on delete restrict on update restrict;
create index ix_recipe_ingredient_ingredient on recipe_ingredient (ingredient_id);

alter table recipe_tag add constraint fk_recipe_tag_recipe foreign key (recipe_id) references recipe (id) on delete restrict on update restrict;
create index ix_recipe_tag_recipe on recipe_tag (recipe_id);

alter table recipe_tag add constraint fk_recipe_tag_tag foreign key (tag_id) references tag (id) on delete restrict on update restrict;
create index ix_recipe_tag_tag on recipe_tag (tag_id);

alter table task add constraint fk_task_recipe_id foreign key (recipe_id) references recipe (id) on delete restrict on update restrict;
create index ix_task_recipe_id on task (recipe_id);


# --- !Downs

alter table ingredient_task drop constraint if exists fk_ingredient_task_task_id;
drop index if exists ix_ingredient_task_task_id;

alter table ingredient_task drop constraint if exists fk_ingredient_task_ingredient_id;
drop index if exists ix_ingredient_task_ingredient_id;

alter table recipe_ingredient drop constraint if exists fk_recipe_ingredient_recipe;
drop index if exists ix_recipe_ingredient_recipe;

alter table recipe_ingredient drop constraint if exists fk_recipe_ingredient_ingredient;
drop index if exists ix_recipe_ingredient_ingredient;

alter table recipe_tag drop constraint if exists fk_recipe_tag_recipe;
drop index if exists ix_recipe_tag_recipe;

alter table recipe_tag drop constraint if exists fk_recipe_tag_tag;
drop index if exists ix_recipe_tag_tag;

alter table task drop constraint if exists fk_task_recipe_id;
drop index if exists ix_task_recipe_id;

drop table if exists ingredient;
drop sequence if exists ingredient_seq;

drop table if exists ingredient_task;
drop sequence if exists ingredient_task_seq;

drop table if exists recipe;
drop sequence if exists recipe_seq;

drop table if exists recipe_ingredient;

drop table if exists recipe_tag;

drop table if exists tag;
drop sequence if exists tag_seq;

drop table if exists task;
drop sequence if exists task_seq;

