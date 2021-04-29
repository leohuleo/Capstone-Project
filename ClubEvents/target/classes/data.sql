INSERT INTO user(id, username, email, password, enabled, role)
    VALUES(default, 'demoUser', '123@gmail.com', '$2a$10$ttzFFfwf4ey2AkCV/ZwRCeXQZs9sltiFswbutAM1NIzGhr46Taveq', true, 'ROLE_USER');

INSERT INTO user(id, username, email, password, enabled, role)
    VALUES(default, 'demoAdmin','1234@gmail.com','$2a$10$ttzFFfwf4ey2AkCV/ZwRCeXQZs9sltiFswbutAM1NIzGhr46Taveq',true,'ROLE_ADMIN');