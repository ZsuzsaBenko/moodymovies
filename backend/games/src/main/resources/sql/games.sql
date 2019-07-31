/*DONT RUN WITHOUT REPLACE ALL THE YOUTUBE LINKS TO EMBED CODES*/
-- Action games
INSERT INTO SCREEN_FUN(ID, FUN_TYPE, GENRE, PLOT, POSTER, RATING, RUNTIME, TITLE, TRAILER, YEAR, DIRECTOR, PRODUCER)
VALUES (1, 'game', 'ACTION',
        'An action-adventure video game developed by Rockstar North and published by Rockstar Games.', 'gtav.png', 95.0,
        100, 'GTA V', 'https://www.youtube.com/embed/hvoD7ehZPcM', 2013, 'Leslie Benzies', 'Imran Sarwar');
INSERT INTO SCREEN_FUN(ID, FUN_TYPE, GENRE, PLOT, POSTER, RATING, RUNTIME, TITLE, TRAILER, YEAR, DIRECTOR, PRODUCER)
VALUES (2, 'game', 'ACTION',
        'An online multiplayer battle royale game developed and published by PUBG Corporation, a subsidiary of South Korean video game company Bluehole. ',
        'pubg.jpg', 80.0, 0, 'PlayerUnknowns Battlegrounds', 'https://www.youtube.com/embed/ODWCbu_cuqk', 2017, 'Brendan Greene
', 'Chang-han Kim');
INSERT INTO SCREEN_FUN(ID, FUN_TYPE, GENRE, PLOT, POSTER, RATING, RUNTIME, TITLE, TRAILER, YEAR, DIRECTOR, PRODUCER)
VALUES (3, 'game', 'ACTION',
        'Atari 2600 game made by Mystique in 1982 that is widely considered offensive due to its plot involving the apparent rape of a Native American woman.',
        'gtav.png', 32.0, 20, 'Custers Revenge', 'https://www.youtube.com/embed/hvoD7ehZPcM', 1982, 'Mystique',
        'Mystique');

-- Comedy games
INSERT INTO SCREEN_FUN(ID, FUN_TYPE, GENRE, PLOT, POSTER, RATING, RUNTIME, TITLE, TRAILER, YEAR, DIRECTOR, PRODUCER)
VALUES (4, 'game', 'COMEDY', 'The Jackbox Party Pack 4, Drawful 2, and Quiplash are our top selection to play today.',
        'partypack.jpeg', 92.0, 1200, 'The Jackbox Party Pack 5', 'https://www.youtube.com/embed/uuPY0_8CO6o', 2018,
        'Jackbox Games', 'Jackbox Games');
INSERT INTO SCREEN_FUN(ID, FUN_TYPE, GENRE, PLOT, POSTER, RATING, RUNTIME, TITLE, TRAILER, YEAR, DIRECTOR, PRODUCER)
VALUES (5, 'game', 'COMEDY', 'A point-and-click adventure, developed and published by Daedalic Entertainment.',
        'deponia.jpg', 6.27, 1200, 'Deponia', 'https://www.youtube.com/embed/KRQhKw-YCWs', 2012,
        'Daedalic Entertainment', 'WW: Lace International');

-- Horror games
INSERT INTO SCREEN_FUN(ID, FUN_TYPE, GENRE, PLOT, POSTER, RATING, RUNTIME, TITLE, TRAILER, YEAR, DIRECTOR, PRODUCER)
VALUES (6, 'game', 'HORROR',
        'Interactive drama and survival horror video game. Players assume control of eight young adults who have to survive on Blackwood Mountain when their lives are threatened.',
        'untildawn.jpg', 97.0, 200, 'Until Dawn', 'https://www.youtube.com/embed/4bgIZONHPXA', 2012, 'Will Byles
', 'Pete Samuels');
INSERT INTO SCREEN_FUN(ID, FUN_TYPE, GENRE, PLOT, POSTER, RATING, RUNTIME, TITLE, TRAILER, YEAR, DIRECTOR, PRODUCER)
VALUES (7, 'game', 'HORROR', 'TPS survival horror video game', 'silenthill.jpg', 30.0, 80, 'Silent Hill 2',
        'https://www.youtube.com/embed/KRQhKw-YCWs', 2001, 'Masashi Tsuboyama', 'Akihiro Imamura');

-- DOCUMENTARY games
INSERT INTO SCREEN_FUN(ID, FUN_TYPE, GENRE, PLOT, POSTER, RATING, RUNTIME, TITLE, TRAILER, YEAR, DIRECTOR, PRODUCER)
VALUES (8, 'game', 'DOCUMENTARY',
        'A real-time strategy video game. The game requires players to collect resources to construct buildings, produce citizens, and conquer opposing civilizations. Empire Earth spans 500,000 years of world history, and ending with the nano age.',
        'empire.jpg', 72.0, 120, 'Empire Earth', 'https://www.youtube.com/embed/rP4wCFe1_Lo', 2001,
        'Stainless Steel Studios', 'Sierra On-Line');
INSERT INTO SCREEN_FUN(ID, FUN_TYPE, GENRE, PLOT, POSTER, RATING, RUNTIME, TITLE, TRAILER, YEAR, DIRECTOR, PRODUCER)
VALUES (9, 'game', 'DOCUMENTARY', 'Online learning game set in a big open world is a cut above.', 'jumpstart.jpg', 20.0,
        20, 'JumpStart 3D Virtual World', 'https://www.youtube.com/embed/2h9YntthI5U', 2009, 'JumpStart', 'JumpStart');

-- DRAMA games
INSERT INTO SCREEN_FUN(ID, FUN_TYPE, GENRE, PLOT, POSTER, RATING, RUNTIME, TITLE, TRAILER, YEAR, DIRECTOR, PRODUCER)
VALUES (10, 'game', 'DRAMA',
        '2D artillery turn-based tactics video game. The player controls a team of up to eight worms in combat against opposing teams.',
        'worms.jpg', 96.0,
        60, 'Worms Armageddon', 'https://www.youtube.com/embed/Xl2Oox2a58k', 1999, 'Karl Morton', 'Martyn Brown');
INSERT INTO SCREEN_FUN(ID, FUN_TYPE, GENRE, PLOT, POSTER, RATING, RUNTIME, TITLE, TRAILER, YEAR, DIRECTOR, PRODUCER)
VALUES (11, 'game', 'DRAMA',
        'The first installment in the Hitman series revolves around a test subject known as 47 escaping the asylum where he had been experimented on all his life and being employed by the Agency.',
        'hitman.jpg', 20.0,
        20, 'Hitman: Codename 47', 'https://www.youtube.com/embed/2h9YntthI5U', 2000, 'IO Interactive',
        'Eidos Interactive');

-- ANIMATED games 12 13 canvas rider, snake
INSERT INTO SCREEN_FUN(ID, DIRECTOR, FUN_TYPE, GENRE, PLOT, POSTER, PRODUCER, RATING, RUNTIME, TITLE, TRAILER, YEAR)
values (12, 'Kano/Apps', 'game', 'ANIMATED', 'Riding a bicycle with a stick figure through a track.', 'canvasrider.png',
        'One More Level', 15.0, 5, 'Canvas Rider', 'https://www.youtube.com/embed/Q91yUSWyeZ0', 2013);
INSERT INTO SCREEN_FUN(ID, DIRECTOR, FUN_TYPE, GENRE, PLOT, POSTER, PRODUCER, RATING, RUNTIME, TITLE, TRAILER, YEAR)
values (13, 'Gremlin', 'game', 'ANIMATED',
        'Player maneuvers a line which grows in length, with the line itself being a primary obstacle.', 'snake.jpg',
        'N/A', 98.0, 5, 'SNAKE', 'https://www.youtube.com/embed/-Dk4FtER2ic', 1976);

-- SCIFI games 14 15 alien vs predator star wars
INSERT INTO SCREEN_FUN(ID, DIRECTOR, FUN_TYPE, GENRE, PLOT, POSTER, PRODUCER, RATING, RUNTIME, TITLE, TRAILER, YEAR)
values (14, 'William Westwater', 'game', 'SCIFI',
        'A science fiction first-person shooter video game takes place in the year 2231.', 'alien.jpg',
        'David Stalker', 98.0, 50, 'Aliens versus Predator 2', 'https://www.youtube.com/embed/MVYveod5WXE', 2001);
INSERT INTO SCREEN_FUN(ID, DIRECTOR, FUN_TYPE, GENRE, PLOT, POSTER, PRODUCER, RATING, RUNTIME, TITLE, TRAILER, YEAR)
values (15, 'Steve Raffel', 'game', 'SCIFI',
        'First- and third-person shooter sci-fi video game set in the Star Wars universe.', 'starwars.jpg',
        'Jon Zuk', 18.0, 500, 'Star Wars Jedi Knight: Jedi Academy', 'https://www.youtube.com/embed/CjINupZXJXc',
        2003);

-- ROMANCE games 16 17 csgo doom
INSERT INTO SCREEN_FUN(ID, DIRECTOR, FUN_TYPE, GENRE, PLOT, POSTER, PRODUCER, RATING, RUNTIME, TITLE, TRAILER, YEAR)
values (16, 'Hidden Path Entertainment', 'game', 'ROMANCE',
        'The game pits two teams against each other: the Terrorists and the Counter-Terrorists. Both sides are tasked with eliminating the other while also completing separate objectives.',
        'csgo.jpeg',
        'Valve Corporation', 94.0, 500000, 'CS:GO', 'https://www.youtube.com/embed/edYCtaNueQY', 2012);
INSERT INTO SCREEN_FUN(ID, DIRECTOR, FUN_TYPE, GENRE, PLOT, POSTER, PRODUCER, RATING, RUNTIME, TITLE, TRAILER, YEAR)
values (17, 'Tom Hall', 'game', 'ROMANCE',
        'Players assume the role of a space marine, popularly known as "Doomguy", fighting his way through hordes of invading demons from Hell.', 'doom.jpg',
        'id Software', 16.0, 500, 'DOOM', 'https://www.youtube.com/embed/BkaC1-QoraY', 1993);


INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (1, 'Dan Houser');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (1, 'Rupert Humphries');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (1, 'Michael Unsworth');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (2, 'Tae-seok Jang');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (3, 'George Armstrong Custer');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (4, 'Matulef Jeffrey');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (5, 'Edna Harvey');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (5, 'Emily Morganti');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (6, 'Brandon Kosinski');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (6, 'Rami Malek');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (7, 'Akira Yamaoka');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (8, 'Ed Lima');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (8, 'Steve Maitland');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (9, 'Steve Manctuary');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (10, 'Dan Cartwright');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (10, 'Bjørn Lynne');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (11, 'Peter Gjellerup Koch');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (11, 'Morten Iversen');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (11, 'Jesper Kyd');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (14, 'Kevin Kilstrom');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (15, 'Mike Morasky');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (16, 'Adrian Carmack');
INSERT INTO SCREEN_FUN_ACTORS("SCREEN_FUN_ID", "ACTORS")
VALUES (16, 'Kevin Cloud');