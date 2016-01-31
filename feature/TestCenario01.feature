# language: pt

Funcionalidade: Uma funcionalidade de teste para validar o modo de cenario

  Cenário: Quero estar na pagina de login e realizar um login
    Dado que eu esteja na pagina "https://www.mercadolivre.com/jms/mlb/lgz/login"
    Quando eu preencho "user_id" com "TETE7640540"
    E eu preencho "password" com "Asdf123"
    E eu clico em "signInButton"
    Entao eu devo ver "TETE7640540" dentro de "nickName"