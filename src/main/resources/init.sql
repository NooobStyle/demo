CREATE TABLE IF NOT EXISTS client (
	id bigserial PRIMARY KEY,
	first_name text,
	last_name text,
	deleted boolean
);

INSERT INTO client (first_name, last_name, deleted)
VALUES
('Rahhy', 'Pettor', false),
('Вася', 'Пупкин', false),
('Olen', 'Maks', true)
ON CONFLICT DO NOTHING;