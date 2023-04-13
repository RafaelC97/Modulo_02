var artista1 = {

    nome: "Tim Maia",
    anoLancamentoPrimeiroCD: 1970,
    melhoresMusicas: [
        "Ela partiu", 
        "Gostava tanto de Você", 
        "Me dê motivo"
    ],
    integrantes: [
        {
            nome: "Tim Maia",
            paisOrigem: "Brasil",
            idade: 56
        }
    ],
    estiloMusical: "MPB"
}

var artista2 = {

    nome: "Charlie Brown Jr.",
    anoLancamentoPrimeiroCD: 1995,
    melhoresMusicas: [
        "Zoio de lula", 
        "Uma criança com seu olhar", 
        "Papo reto"
    ],
    integrantes: [
        {
            nome: "Chorão",
            paisOrigem: "Brasil",
            idade: 42
        },
        {
            nome: "Champignon",
            paisOrigem: "Brasil",
            idade: 35
        },
        {
            nome: "Marcão Britto",
            paisOrigem: "Brasil",
            idade: 52
        },
        {
            nome: "Thiago Castanho",
            paisOrigem: "Brasil",
            idade: 48
        },
        {
            nome: "Bruno Graveto",
            paisOrigem: "Brasil",
            idade: 40
        }
        
    ],
    estiloMusical: "Rock Nacional"
}

var artista3 = {

    nome: "Linkin Park",
    anoLancamentoPrimeiroCD: 2000,
    melhoresMusicas: [
        "Given Up", 
        "Papercut", 
        "In The End"
    ],
    integrantes: [
        {
            nome: "Chester Bennington",
            paisOrigem: "Estados Unidos da America",
            idade: 41
        },
        {
            nome: "Mike Shinoda",
            paisOrigem: "Estados Unidos da America",
            idade: 46
        },
        {
            nome: "Rob Bourdon",
            paisOrigem: "Estados Unidos da America",
            idade: 44
        },
        {
            nome: "Brad Delson",
            paisOrigem: "Estados Unidos da America",
            idade: 45
        },        
        {
            nome: "Dave Farrell",
            paisOrigem: "Estados Unidos da America",
            idade: 46
        },        
        {
            nome: "Joe Hahn",
            paisOrigem: "Estados Unidos da America",
            idade: 46
        }
    ],
    estiloMusical: "New Metal"
}

var database = []
database.push(artista1, artista2, artista3)
console.log(database)
database.sort((a, b ) => {
    return a.nome.localeCompare(b.nome)})
console.log(database)
database.pop()
console.log(database)