# First-Year/Sophomore 102 Spring 2017

This repository contains the LaTeX and HTML source code for the practical,
writing, and presentation assignments, course teaching slides, study guides, and
the syllabus for Computer Science 111, Spring 2017. Taught by [Gregory M.
Kapfhammer](http://www.cs.allegheny.edu/sites/gkapfham) in the [Department of
Computer Science](http://www.cs.allegheny.edu) at [Allegheny
College](http://www.allegheny.edu), the course has the following description:

> An examination of the pervasive nature of computer software and the impact
> that it has on individuals and society. Participating in team-based and
> hands-on explorations of software systems, students examine the technical
> and ethical challenges facing a culture that relies heavily on computer
> software. Using state-of-the-art software technology to investigate topics
> such as social networking, online search, and digital music, students
> further develop their oral and written communication skills.

The source code of the LaTeX documents uses a custom LaTeX style file and
several other packages that are normally standard with a modern LaTeX
distribution such a TeXLive 2016. All of the slides are programmed with the
[reveal.js](https://github.com/hakimel/reveal.js/) framework. The background
images in the slides were all collected from the [Flickr Creative
Commons](https://www.flickr.com/creativecommons/) through the use of the
[cogdog/flickr-cc-helper](https://github.com/cogdog/flickr-cc-helper) tool.

You are invited to use this repository as a means for learning more about
instruction in an introductory computer science course. If you find this
repository useful, could I trouble you to star it and then acknowledge it in
your own teaching efforts?

You can type the following command if you want to clone this repository:

```shell
git clone https://github.com/gkapfham/fs102S2017.git
```

If you want to compile the LaTeX document to a PDF, then you should type the
following commands. In this example, I show how to compile the syllabus for the
course.

```shell
cd fs102S2017
cd syllabus
pdflatex fs102S2017_syllabus.tex
```

Please note that the LaTeX documents have been compiled on an Ubuntu 16.04
workstation running a recent version of LaTeX that was manually installed using
the TeXLive installer. It is also worth noting that you can also compile the
documents using other LaTeX development tools, such as `latexmk`. If you are
unable to compile the LaTeX source code with your development tools and your
execution environment, then please open a new issue and I will attempt to
resolve your concerns.

Additionally, the HTML slides have been tested on modern Web browsers (e.g.,
Chrome and Firefox) that run on the Ubuntu and Android operating systems. If the
HTML slides do not correctly display on your Web browser, then I also encourage
you to open an issue so that I can handle the problem that you have found.
