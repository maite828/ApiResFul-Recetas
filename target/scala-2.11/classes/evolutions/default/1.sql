# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ingrediente (
  id                            bigint not null,
  nombre                        varchar(255),
  constraint pk_ingrediente primary key (id)
);
create sequence ingrediente_seq;

create table rec_ingre (
  id                            bigint not null,
  receta_id                     bigint,
  ingrediente_id                bigint,
  constraint pk_rec_ingre primary key (id)
);
create sequence rec_ingre_seq;

create table receta (
  id                            bigint not null,
  nombre                        varchar(255),
  constraint pk_receta primary key (id)
);
create sequence receta_seq;

alter table rec_ingre add constraint fk_rec_ingre_receta_id foreign key (receta_id) references receta (id) on delete restrict on update restrict;
create index ix_rec_ingre_receta_id on rec_ingre (receta_id);

alter table rec_ingre add constraint fk_rec_ingre_ingrediente_id foreign key (ingrediente_id) references ingrediente (id) on delete restrict on update restrict;
create index ix_rec_ingre_ingrediente_id on rec_ingre (ingrediente_id);


# --- !Downs

alter table rec_ingre drop constraint if exists fk_rec_ingre_receta_id;
drop index if exists ix_rec_ingre_receta_id;

alter table rec_ingre drop constraint if exists fk_rec_ingre_ingrediente_id;
drop index if exists ix_rec_ingre_ingrediente_id;

drop table if exists ingrediente;
drop sequence if exists ingrediente_seq;

drop table if exists rec_ingre;
drop sequence if exists rec_ingre_seq;

drop table if exists receta;
drop sequence if exists receta_seq;

