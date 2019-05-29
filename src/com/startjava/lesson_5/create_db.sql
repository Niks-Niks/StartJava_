CREATE TABLE jeager (
	id	   SERIAL PRIMARY KEY,
	modelName  TEXT,
	mark       TEXT,
	height     DECIMAL,
	weight     DECIMAL,
	status     TEXT,
	origin     TEXT,
	launch     DATE,
	kaijukill  INTEGER
);
