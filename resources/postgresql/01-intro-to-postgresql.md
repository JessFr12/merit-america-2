# Intro to PostgreSQL

PostgreSQL (also known as Postgres) is a widely used, open source relational database management system (RDBMS). PostgreSQL has been around for more than 30 years and is used to store the data for popular websites like Reddit and Instagram.

### !callout-info
## Note: The term "database"
You'll encounter the term "database" used in two ways:
1. As an informal alternative to "relational database management system." For example, if someone says, "That company uses PostgreSQL as their database."
2. To refer to a specific set of data stored within a RDBMS. For example, if someone asks, "Is that information stored in the customer or employee database?"
### !end-callout

## Why use PostgreSQL?

There are many options available for storing data. Some reasons a developer might choose PostgreSQL include:
- Price - Unlike commercial options such as Oracle or Microsoft SQL Server, PostgreSQL is free.
- SQL - PostgreSQL supports SQL, which is a powerful language for working with data. Other options like MongoDB don't support SQL.
- Compatibility - Some options like Apache Derby or H2 are primarily intended for use with Java, but PostgreSQL can be used with virtually any programming language.
- Scalability - PostgreSQL can be used for large amounts of data and many simultaneous users. Other options like SQLite are intended for a single user or smaller data sets.
- Advanced features - While other options like MySQL focus on speed or ease-of-use, PostgreSQL offers a larger set of features for developers to use.

## Running PostgreSQL

When PostgreSQL is used in production by a business, it runs on a server located in a data center. When you're using PostgreSQL for learning and development, you'll run it locally on your computer, but it's still a server application that runs in the background. PostgreSQL doesn't have a visible user interface. This means that to use PostgreSQL, you'll need a client application like **pgAdmin**.