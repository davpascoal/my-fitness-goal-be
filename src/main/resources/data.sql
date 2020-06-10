insert into user (email, first_name, last_name)
values('email@email', 'first name', 'last name');

insert into workout (user_id, title, description, bg_img)
values(1, 'My Workout 0', 'My description 0', 'https://images.unsplash.com/photo-1584735935682-2f2b69dff9d2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3302&q=80');
-- insert into workout (title, description, bg_img)
-- values('My Workout 1', 'My description 1', 'https://images.unsplash.com/photo-1584735935682-2f2b69dff9d2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3302&q=80');
-- insert into workout (title, description, bg_img)
-- values('My Workout 2', 'My description 2', 'https://images.unsplash.com/photo-1584735935682-2f2b69dff9d2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3302&q=80');
-- insert into workout (title, description, bg_img)
-- values('My Workout 3', 'My description 3', 'https://images.unsplash.com/photo-1584735935682-2f2b69dff9d2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3302&q=80');
-- insert into workout (title, description, bg_img)
-- values('My Workout 4', 'My description 4', 'https://images.unsplash.com/photo-1584735935682-2f2b69dff9d2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3302&q=80');

insert into exercise (exercise_name, duration)
values('My exercise 0', 2700000000000);
insert into exercise (exercise_name, duration)
values('My exercise 1', 2700000000000);

insert into workout_exercise (workout_id, exercise_id)
values(1, 1);
insert into workout_exercise (workout_id, exercise_id)
values(1, 2);