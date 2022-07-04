Есть сущность Person, у нее есть: 
- индификатор
- имя
- фамилия.

Задание создать проект.

Добавление таблицы в базу необходимо сделать через liquibase, сделать тесты используя H2. Покрыть функционал тестами и сделать отчет используя плагин jacoco. Подключить checkstyle к проекту.

Для сущности Person сделать DAO над каждым полем написать свою аннотацию MyColumn(name - название колонки) с названием колонки, над классом Person написать аннотацию MyTable(name - название таблицы). Реализовать CRUD операции с Person используя jdbc

- select
- update
- delete
- insert

Причем эти операции должны составлять запрос в базу используя аннотации MyColumn и MyTable (через рефлексию). T.е. если пользователь данного API создаст другую сущность то

- select
- update
- delete
- insert

должны работать без изменения внутреней логики
__________
There is a Person entity, it has:

- an identifier;
- a first name
- a last name.

The task is to create a project. Adding a table to the database must be done through liquibase, make tests using H2. Cover functionality with tests and make a report using the jacoco plugin. Connect checkstyle to the project.

For the Person entity, make a DAO over each field, write your own annotation MyColumn(name - the name of the column) with the name of the column, write the annotation MyTable(name - the name of the table) above the Person class. Implement CRUD operations on Person using jdbc

- select
- update
- delete
- insert

Moreover, these operations should make a request to the database using the annotations MyColumn and MyTable (through reflection). i.e. if the user of this API creates another entity, then

- select
- update
- delete
- insert

should work without changing the internal logic
