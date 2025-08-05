
# Modelando um IPhone com UML

Desafio de Projeto apresesentado para o Bootcamp da DIO. Objetivo é modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Funcionalidades a modelar

- Reprodutor Musical
- Aparelho Telefônico
- Navedor de Internet


## Código do diagrama UML

```javascript
classDiagram
        IPhoneModel ..|> ReprodutorMusical
        IPhoneModel ..|> AparelhoTelefonico
        IPhoneModel ..|> NavegadorInternet

        class ReprodutorMusical {
          +tocar()
          +pausar()
          +selecionarMusica(String musica)
        }
        class AparelhoTelefonico {
          +ligar(String numero)
          +atender()
          +iniciarCorreioVoz()
        }
        class NavegadorInternet {
          +exibirPagina(String url)
          +adicionarNovaAba()
          +atualizarPagina()
        }

``` 

## Diagrama UML

<img width="3840" height="1370" alt="IPhoneModel _ Mermaid Chart-2025-08-05-222648" src="https://github.com/user-attachments/assets/87bd93a9-3b06-45f1-9357-a7c8b0db30d8" />
