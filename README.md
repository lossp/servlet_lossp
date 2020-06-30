# servlet_lossp
This project is mainly for personal study

## Building up the environment
First of all, download Tomcat from the apache website, and then import the Tomcat into the IDE

## The diagram of Servlet inheritance

![HttpServlet inheritance](https://s1.ax1x.com/2020/06/29/Nh37gP.png)

As we can see from this diagram, HttpServlet is the subclass of GenericServlet, The main reason of the existence of GenericServlet is that GenericServlet basically represents the low level of internet activity, such as TCP or Http.
HttpServlet is the achievement for the Http method. On the other hand, it reserves positions for multiple network.


## Tomcat and Servlet
Servlet only can be invoked by the Servlet container. Tomcat, as a Java Servlet container, is used in this little learning project.
`javax.servlet` only provides the essentials abstract classes and interfaces such as `ServletRequest`, `ServletResponse`, `GenericServlet` etc.
From those we can customized network activities.
From the Servlet code, there is no any of the code dealing with the request-handing. All the request-handlings are done by Tomcat, which is also a servlet container.
In this way, can javax.servlet be reused under similar circumstances.

Tomcat accepts requests and allocates one thread to deal with one request. the basic logic written in javax.servlet
Tomcat manages the servlet`s life cycle, threads pool, as well as security.

## The List

In the configuration section, the deploy directory is the project`s directory. At least, that`s what i did in this demo.
- [x] tomcat 8 configuration in the Intellij

- [x] basic usage of the Servlet

- [x] draw a diagram of the inheritance of ServletHttp

- [x] the relationship between tomcat and servlet

- [ ] context of the servlet

- [ ] config of the servlet