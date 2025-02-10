[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17736574)
# Sistema di Gestione di un Parco Auto

## Classe base `Veicolo`
- **Attributi:**
  - `marca`
  - `modello`
  - `anno`
- **Metodo:**
  - `descrizione()` che stampa le informazioni del veicolo

## Classe derivata `Auto`
- **Attributi aggiuntivi:**
  - `numero_di_porte`
  - `stato_porte`
- **Metodi:**
  - `descrizione()` che sovrascrive il metodo della classe base per includere il numero di porte e visualizza lo stato di tutte le porte
  - `apri_porta(porta)` che riceve il numero di porta e gestisce l'apertura della porta (una porta può essere aperta solo se esiste e se è chiusa). Visualizzare opportuni messaggi:
    - "porta aperta correttamente"
    - "porta già aperta in precedenza"
    - "porta inesistente"
  - `chiudi_porta(porta)` che riceve il numero di porta e gestisce la chiusura della porta (una porta può essere chiusa solo se esiste e se è aperta). Visualizzare opportuni messaggi:
    - "porta chiusa correttamente"
    - "porta già chiusa in precedenza"
    - "porta inesistente"

## Classe derivata `Moto`
- **Attributi aggiuntivi:**
  - `tipo`
  - `stato_cavalletto`
- **Metodi:**
  - `descrizione()` che sovrascrive il metodo della classe base per includere il tipo di moto
  - `metti_cavalletto()` che gestisce l'inserimento del cavalletto. Visualizzare opportuni messaggi:
    - "cavalletto inserito correttamente"
    - "cavalletto già inserito in precedenza"
  - `togli_cavalletto()` che gestisce la rimozione del cavalletto. Visualizzare opportuni messaggi:
    - "cavalletto rimosso correttamente"
    - "cavalletto già rimosso in precedenza"

## Classe `Gestione`
- Permette di testare le classi precedentemente create
