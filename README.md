# servlet_lossp
This project is mainly for personal study

## Building up the environment
First of all, download Tomcat from the apache website, and then import the Tomcat into the IDE

## The diagram of Servlet inheritance

![HttpServlet inheritance](https://s1.ax1x.com/2020/06/29/Nh37gP.png)

As we can see from this diagram, HttpServlet is the subclass of GenericServlet, The main reason of the existence of GenericServlet is that GenericServlet basically represents the low level of internet activity, such as TCP or Http.
HttpServlet is the achievement for the Http method. On the other hand, it reserves positions for multiple network.


In the configuration section, the deploy directory is the project`s directory. At least, that`s what i did in this demo.
- [x] tomcat 8 configuration in the Intellij

- [x] basic usage of the Servlet

- [x] draw a diagram of the inheritance of ServletHttp