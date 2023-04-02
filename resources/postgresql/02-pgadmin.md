# pgAdmin

pgAdmin is a client application for PostgreSQL with a graphical user interface. You can use it to create new databases, import or export data, run SQL, display database diagrams, and many other tasks related to database administration and maintenance.

![pgAdmin](./img/pgadmin.png)

## Initial setup

The first time you run pgAdmin, it'll prompt you to set up a "master password." This can be anything as long as you can remember it. You can skip setting the password, but it'll prompt you every time you open pgAdmin.

On the left side of the window is the **Browser** pane. You might already see a server called "PostgreSQL 12" under the "Servers" list. If you don't see a server, add one by following these steps:

1. Click on **Servers** and then select **Create > Server** from the **Object** menu.
2. Type in any name in the **Name** field, like "PostgreSQL 12."
3. On the **Connection** tab, type in "localhost" for the **Host name/address** field.
4. Type in the password for the "postgres" user. This was provided to you separately. You may choose to save the password or not.
5. Click the **Save** button.

## Connecting to PostgreSQL

Now that you have a server listed, connect to it by double-clicking on it or by clicking the caret on its side. If you didn't choose to save the password when setting up the connection, or you're using the default "PostgreSQL 12" connection, it'll prompt you for the password of the "postgres" user account. This was provided to you separately.

Once you've connected to the PostgreSQL server, you can proceed to set up the databases you'll use for tutorials and exercises.
