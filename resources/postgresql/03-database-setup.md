# Database setup

There are three example databases that need to be set up in preparation for tutorials and exercises:

- `PizzaShop` - contains data about a fictitious pizza shop's orders and customers
- `UnitedStates` - contains data about US states, cities, and national parks
- `MovieDB` - contains data about a sampling of movies and actors

Setting up each new database on your PostgreSQL server using pgAdmin consists of two steps:

1. Create an empty database
2. Run SQL to define structures and load data

## Create an empty database

To create a new, empty database with pgAdmin, click on your server (which, by default, is named "PostgreSQL 12") in the Browser pane. Then, on the **Object** menu, select **Create > Database**.

In the window that appears, enter a name in the **Database** field and click the **Save** button. For example, enter "PizzaShop" to create the `PizzaShop` database.

An entry for the new database is then added in the Browser pane beneath your server, in the **Databases** section.

### Create all three example databases

After creating the `PizzaShop` database, repeat the process for the `UnitedStates` and `MovieDB` databases, and confirm all three are listed beneath your server in the Browser pane.

## Run SQL to define structures and load data

To finish setting up a database, first select the database in the Browser pane. For example, select `PizzaShop`. Then, on the **Tools** menu, select **Query Tool**.

In the toolbar of the pane that appears on the right, click the **Open File** button:

![Open File button](./img/open-file.png)

Navigate to the SQL file for the database. The `PizzaShop.sql` file is in your student repository under the `resources/postgresql` folder. Click the **Select** button, and the file opens in the Query Editor. Click the **Execute/Refresh** button:

![Execute/Refresh button](./img/execute-button.png)

Output then appears in the **Messages** pane near the bottom of the pgAdmin window, with a final line that begins, "Query returned successfully."

At this point, the database is set up and ready to use.

### Finish setting up all three example databases

After running the `PizzaShop.sql` file, repeat the process for the `UnitedStates` and `MovieDB` databases, with the corresponding SQL files in the `resources/postgresql` folder.

### !callout-success
## Tip: Re-run the starting SQL to reset the database

If you've modified a database and want to reset it back to its starting state, you can run the same SQL file that you used to initially set it up.
### !end-callout

## Setting up other databases

Some exercises require you to set up additional databases. In those cases, you'll follow the same two steps, and you'll use the SQL file provided with the exercise.