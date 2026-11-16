# Store Management Project

## What is it

This is a ***very*** basic version of what a shop's *Products* could look like. The basic class has a **name**, **productType**, and **cost**.

You can add on to this class easily, or just use it as is and create a mini shop where you could sell these products.

As an example there are three products of type *Jello* (in `src/com/products/jellos`), ***ButterScotch***, ***LemonTajin***, and ***SaltedCucumber***. Feel free to look at these classes to see how you could easily expand a shop to have as many products as you like (meaning it is **very** simple).

## How to Use / Run

After cloning the repository, you can run these commands:
(This will run the Main.java file, which will show how the products would look like when fetching them)
```bash
> javac -d out/ $(find src -name *.java) # ONLY RUN if you made any changes inside of src/ OR there is nothing inside of out/
> java -cp out/ com.app.Main
```
