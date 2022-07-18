# HostelAPP - Camada de negócios via princípios GRASP

Implementação da camada de negócios do HostelApp para a disciplina Orientação a Objetos do curso de Ciência da Computação da UNIFAL-MG usando princípios GRASP.

# Visão para o produto "HostelApp"

Para uma Startup com o objetivo de fornecer soluções de software para albergues que quer se tornar conhecida mundialmente, O HostelApp é uma solução para fins educacionais. Diferentemente das diversas outras soluções proprietárias, o HostelApp é GRATUITO e OPEN-SOURCE.

Para uma Startup com o objetivo de fornecer soluções de software para albergues
que quer se tornar conhecida mundialmente,
O HostelApp é uma solução para fins educacionais.
Diferentemente das diversas outras soluções proprietárias, o HostelApp é GRATUITO e OPEN-SOURCE.

# Objetivo principal deste repositório

Este repositório contém uma implementação da camada de negócios com as regras de negócio utilizando princípios GRASP (General Responsibility Assignment Software Patterns) para um albergue fictício, denominado Sparking Water. Nosso objetivo neste repositório é ser o mais agnóstico de tecnologia possível (sem APIs de apresentação para GUIs, sem APIs para integração com bancos de dados, etc.). A única tecnologia usada é Java SE simples. 

# Como usar o código neste repositório?

O código no repositório funciona como base para experimentar diversas APIs, tecnologias e arquiteturas distintas usadas no desenvolvimento de software. Pode-se, por exemplo, reutilizar o código neste repositório, incrementando-o com uma camada de apresentação escrita em Jakarta Server Faces - JSF e uma camada de Integração com JPA/Hibernate. Outro desenvolvedor pode optar por não usar uma camada de apresentação com JSF, mas, em vez disso, expor a lógica de negócios com uma camada RESTful e construir um front-end completamente desacoplado com tecnologias HTML, CSS e JavaScript.
