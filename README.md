# Akashi
![It's Akashi's Turn!](http://cdn.awwni.me/q0w7.jpg)

Because obviously Oracle is never going to get ES2015+ support in Java applications, screw it, why not do it myself? 

## Why?
Let me preface this with an **I'm sorry**. Really. ES2015 support in an environment isn't *all that* important to me, but this is more of a shot at Oracle. In case you didn't know, we were originally told Java 9 would support ES2015, but it barely qualifies as such. They're adding `const`, `let`, and `symbol`. Maybe a couple of onesies and twosies, but 3 additional features a new language does not make (I'm looking at you, Python). 

### But who would even use this? The only time you use JS in a Java application is some web applications?
I agree-*mostly*. Usually, if you want JS on server side, you'd use NodeJS. If you want to hack some interop together, you can use the Java application as the base and communicate over sockets with NodeJS, but there's a single situation where that doesn't work out, and it's specific as f\*ck. With [one of my projects](https://github.com/Thiq), I'm constantly wishing I had native ES2015 support. I could communicate with NodeJS and have sockets setup, but then I wouldn't be able to interact with the data on the server within Node. I could hack together a server that grabs the data, but then it'd be extremely difficult to keep in sync. Plus, with all event handling being synchronous and on a tick system, things will then get locked out and we could have some pretty bad sync issues. tl;dr, there may be times when data within the Java application can't be sent or read by the NodeJS server. 

## So how do you plan on doing this?
As with most languages, I'm going to be taking the AST approach, but instead of converting it to Java code, I'll be outputting to bytecode. "Whaaaaaa? Why?!" Because that's the most lightweight approach. Whether I'll be rolling out my own AST implementation or using something like ANTLR has yet to be seen, but it shall be seen&trade;

### Roadmap
- [ ] start
- [ ] everything else
