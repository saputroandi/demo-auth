insert into users (email, password, email_verified_at) values ('andi@gmail.com', '$2a$10$3Zixdrt0Ybxd2aqp/ZzvdOALigZRgjf9x3hkBn.8pm5VDrfTxX5L2', null);
insert into users (email, password, email_verified_at) values ('arum@gmail.com', '$2a$10$3Zixdrt0Ybxd2aqp/ZzvdOALigZRgjf9x3hkBn.8pm5VDrfTxX5L2', null);

insert into posts (user_id, title, "content", published_at) values (1, 'title post 1 andi', 'isi content post 1', CURRENT_TIMESTAMP);
insert into posts (user_id, title, "content", published_at) values (1, 'title post 2 andi', 'isi content post 2', CURRENT_TIMESTAMP);
insert into posts (user_id, title, "content", published_at) values (2, 'title post 1 arum', 'isi content post 1', CURRENT_TIMESTAMP);
insert into posts (user_id, title, "content", published_at) values (2, 'title post 2 arum', 'isi content post 2', CURRENT_TIMESTAMP);
insert into posts (user_id, title, "content", published_at) values (2, 'title post 3 arum', 'isi content post 3', CURRENT_TIMESTAMP);