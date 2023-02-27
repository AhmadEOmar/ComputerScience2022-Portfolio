<!-- TOC start -->
# Table Of Content
- [Read me for CS 305 Software Security ](#read-me-for-cs-305-software-security)
- [Questions](#questions)
- [Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?](#briefly-summarize-your-client-artemis-financial-and-their-software-requirements-who-was-the-client-what-issue-did-they-want-you-to-address)
- [What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?](#what-did-you-do-very-well-when-you-found-your-clients-software-security-vulnerabilities-why-is-it-important-to-code-securely-what-value-does-software-security-add-to-a-companys-overall-wellbeing)
- [What part of the vulnerability assessment was challenging or helpful to you?](#what-part-of-the-vulnerability-assessment-was-challenging-or-helpful-to-you)
- [How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?](#how-did-you-increase-layers-of-security-in-the-future-what-would-you-use-to-assess-vulnerabilities-and-decide-which-mitigation-techniques-to-use)
- [How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?](#how-did-you-make-certain-the-code-and-software-application-were-functional-and-secure-after-refactoring-the-code-how-did-you-check-to-see-whether-you-introduced-new-vulnerabilities)
- [What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?](#what-resources-tools-or-coding-practices-did-you-use-that-might-be-helpful-in-future-assignments-or-tasks)
- [Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?](#employers-sometimes-ask-for-examples-of-work-that-you-have-successfully-completed-to-show-your-skills-knowledge-and-experience-what-might-you-show-future-employers-from-this-assignment)
<!-- TOC end -->
<!-- TOC --><a name="read-me-for-cs-305-software-security"></a>
# Read me for CS 305 Software Security 
+ This is the read me file for my portfolio submission for CS 305 in which I submitted my project 1 Artemis Financial Vulnerability Assessment and project 2 Artemis Financial Practices for Secure Software Report in which I looked into the needs of our client Artemis Financial and helped them with security recommendations but also by looking through their code to ensure that there is no out of date frameworks being used that can cause security issues.
+ In this read me file I will also be answering a few set questions about my thought process and what I was doing for Artemis Financial exactly.

<!-- TOC --><a name="questions"></a>
# Questions


<!-- TOC --><a name="briefly-summarize-your-client-artemis-financial-and-their-software-requirements-who-was-the-client-what-issue-did-they-want-you-to-address"></a>
# Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?
+ Our client Artemis Financial is a company that creates individualized financial plans for them, the finance plans include savings, retirement, investments, and insurance. Artemis Financial wants to modernize their operations and use a RESTful web API and wanted to make sure that their company is protected from external threats.
+ The reason that Artemis Financial will value secure communications is that since they deal with customers information that will most likely have sensitive information that will need to be secured since that information can potentially include social security, tax information, addresses, emails, and payment information. This makes secure communication vital for Artemis Financial due to the sensitive information that they host and move around. 
+ The potential external threats that Artemis Financial will deal with a third party accessing its information since they will be hosting financial data of those customers. They will need to make sure that any of the client information is encrypted, and that any information they send is secured as well as encrypted to prevent access due to potential breaches that can accrue.
+ Modernization that Artemis Financial would consider is making sure that they are on the latest versions for both software and hardware they use which helps to reduce chance of security breaches, having a dedicated IT team to ensure that employees have restricted access in which information they can send and access and this will also in turn help in the first point and having the IT team do regular maintenance check to check for any potential problems. The use of open-source libraries helps with security since multiple people that use the library can investigate the source code, point out, and fix any potential security problems since they are using the library themselves and want it to be as secure as possible the more popular an open-source library the more likely it’s secure. 


<!-- TOC --><a name="what-did-you-do-very-well-when-you-found-your-clients-software-security-vulnerabilities-why-is-it-important-to-code-securely-what-value-does-software-security-add-to-a-companys-overall-wellbeing"></a>
# What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?
+ By using a range of tools such as the Maven Dependency Check as well as a manual review of the code that we were given I was able to find frameworks that had potential issues and areas in the code that could lead to potential issues that were not accounted for. 
+ For our client’s case as a financial company the moment they have a security breach they would lose the trust of their clients since they deal with information that is vital to their client base and by ensuring the code is as secure as possible, we reduce the chance of unauthorized access to systems that people should not have access which in turn protects the client's customer data. 
+ As I stated above it helps to ensure that we mitigate the chance of unauthorized access to systems that people should not have access and by not having secure software it can lead to a data breach which helps reassure our client that the chance of a data breach happening on the software side is relatively small to no chance at all.


<!-- TOC --><a name="what-part-of-the-vulnerability-assessment-was-challenging-or-helpful-to-you"></a>
# What part of the vulnerability assessment was challenging or helpful to you?
+ The most challenging but also helpful was learning how to use the Maven Dependency Check to see how it gathers that information of what frameworks and dependency's have issues. Learning how to read that information to understand what needs to be updated right away, but also learning what could be classified as a false positive was a learning process but it helped me to understand that information and know how to patch them or suppress the false positives.


<!-- TOC --><a name="how-did-you-increase-layers-of-security-in-the-future-what-would-you-use-to-assess-vulnerabilities-and-decide-which-mitigation-techniques-to-use"></a>
# How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?
+ I first checked the Maven Dependency Check to find out what frameworks or dependencies we used in the project that could be security issues in which I had our client update those to the latest version to ensure that they are not running an older version that has those security issues. I then combed through the software itself to find areas in it that would give potential access with how they had the code setup and informed them to change those areas to ensure that the software was secure. 
+ I would use the Maven Dependency Check to check for any outdated frameworks or dependencies to ensure they are on the latest versions, but I would also check for any false positives as well.  After that I would manually check the codes for areas that could be potential security issues in how it's setup to ensure that they are secure or that we are aware of them. The techniques to use would honestly depend on the project and I would have to change my process since not everything will be the exact same and I would have to account for that.


<!-- TOC --><a name="how-did-you-make-certain-the-code-and-software-application-were-functional-and-secure-after-refactoring-the-code-how-did-you-check-to-see-whether-you-introduced-new-vulnerabilities"></a>
# How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?
+ I would keep running the Maven Dependency Check, but I also made sure that the changes that I did to the code was indeed keeping the software secure. In project 2 I changed the use from HTTP to HTTPS for added security and went through to run a localhost to check and ensure that the HTTPS was working but also the encryption that I included was working as well, to do this I had to create a self-signed certificate to be able to test this. By doing this I ensured that the software was using SHA-256 as it's encryption method but that it was encrypting the data string that I had in place, this told me that the refactoring that I did was indeed working.


<!-- TOC --><a name="what-resources-tools-or-coding-practices-did-you-use-that-might-be-helpful-in-future-assignments-or-tasks"></a>
# What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
+ Honestly the best way I able to handle this assignment was to first read the documentation that we had and if I ran into any issues, I would search StackOverFlow to find questions that were close to what I was doing and reading the top-rated prompt to gain more information and try testing it on my end. I also used Google and the wide array of tutorials it gave me access to find out how to do certain things that were similar and to change it to match my work.
+ By learning how to search for relevant information was also another skill that was helpful to learn since I may know the general direction to go with in my coding, but developers are human's as well, and we can't remember everything related to computer science so by learning this skill it helps to get to that information and be able to implement it into your code.


<!-- TOC --><a name="employers-sometimes-ask-for-examples-of-work-that-you-have-successfully-completed-to-show-your-skills-knowledge-and-experience-what-might-you-show-future-employers-from-this-assignment"></a>
# Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?
+ I would show them how I refactored the code to match what we were trying to accomplish since by refactoring the code I first had to search for vulnerabilities, change our port number, change from HTTP to HTTPS, create a self-signed certificate, use SHA-256 for encryption, and how I read the Maven Dependency Check to gain valuable information. 
+ Each of these steps were vital to ensure that the software was secure as can be, and by doing this I showed that I was searching for issues in the software and took the steps to ensure the security of the software which is important in the real world due to having access to customer data that needs to be secure and encrypted.

