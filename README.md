# IndividualSingletonLab
Individual - Threads and the Singleton

Each thread independently worked on creating an instance of RunnableClass with an encapsulated instance of 
LazyInitializedSingleton. Because these thread worked independently of each other, the instance of LazyInitializedSingleton
was unique. Because each instantiation of RunnableClass (and LazyInitializedSingleton) was unique and attached to a 
separate thread, they did not share memory and had a different hashcode. 

I thought it was cool that conditions were set with LazyInitializedSingleton and RunnableClass to check variables and 
fill them if they were empty. Additionally, in my Main method, I did not realize you could create a bunch of objects 
the same name while differentiating them based on an encapsulated name variable. I assume there is a better way to run 
a loop and name the objects different names, but I was unable to figure that out. 
