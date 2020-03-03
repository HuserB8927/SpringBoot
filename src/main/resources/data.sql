INSERT INTO Parents (first_name, last_name) VALUES ('Viz','Elek');
INSERT INTO Parents (first_name, last_name) VALUES ('Locsolok','Anna');
INSERT INTO Parents (first_name, last_name) VALUES ('Kezmuves','Kelemen');
INSERT INTO Kids (first_name, last_name, parents_id) VALUES ('Nagy','Zolika', (SELECT id FROM Parents WHERE last_name = 'Elek'));
INSERT INTO Kids (first_name, last_name, parents_id) VALUES ('Cserkesz','Misike', (SELECT id FROM Parents WHERE last_name = 'Elek'));
INSERT INTO Kids (first_name, last_name, parents_id) VALUES ('Mézesb','Ödönke', (SELECT id FROM Parents WHERE last_name = 'Anna'));