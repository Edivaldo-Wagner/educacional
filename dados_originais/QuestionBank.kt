package com.example.data

import com.example.model.Difficulty
import com.example.model.Question
import com.example.model.QuestionType
import com.example.model.Subject

object QuestionBank {

    val initialStudyQuestions: List<Question> = listOf(
        // =========================================================================
        // ========================== HISTÓRIA (40 QUESTÕES) =======================
        // =========================================================================

        // --- ESTADOS PRÉ-COLONIAIS & COMUNIDADES PRIMITIVAS ---
        Question(
            id = "H01",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            difficulty = Difficulty.FACIL,
            questionText = "Qual foi o principal produto mineral explorado no Império de Monomotapa (Mutapa) que atraiu comerciantes árabes-suaílis e portugueses para o vale do Zambeze?",
            options = listOf(
                "Ouro",
                "Carvão mineral",
                "Petróleo",
                "Gás natural"
            ),
            correctIndex = 0,
            explanation = "O ouro aluvionar e de minas rasas no planalto zimbabuano e no vale do Zambeze foi a principal mercadoria de troca que motivou a penetração mercantil no Estado de Mutapa.",
            teacherHint = "Pense no minério precioso que ornamentava a corte do Mwenemutapa."
        ),
        Question(
            id = "H02",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            difficulty = Difficulty.MEDIO,
            questionText = "No Império de Mutapa, a classe dirigente sustentava o seu prestígio e poderio político através da redistribuição de tributos e de:",
            options = listOf(
                "Controlo do comércio de longa distância e laços de parentesco",
                "Eleições periódicas com sufrágio universal",
                "Alianças com governadores coloniais britânicos",
                "Introdução da religião cristã obrigatória para todos os camponeses"
            ),
            correctIndex = 0,
            explanation = "A autoridade do Mwenemutapa assentava na legitimidade mágico-religiosa, na cobrança de tributos (curva) e no monopólio régio sobre o comércio de longa distância de ouro e marfim.",
            teacherHint = "As linhagens nobres controlavam as rotas comerciais e os rituais sagrados da terra."
        ),
        Question(
            id = "H03",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            difficulty = Difficulty.DIFICIL,
            questionText = "No Império de Monomotapa (Mutapa), a tributação simbólica que as populações pagavam ao soberano como sinal de vassalagem e fidelidade denominava-se:",
            options = listOf(
                "Curva (ou Kurva)",
                "Chibalo",
                "Mussoco",
                "Quinto Real"
            ),
            correctIndex = 0,
            explanation = "A Curva era o tributo pago em tecidos, missangas e mercadorias de prestígio pelos capitães portugueses e chefes vassalos ao Mwenemutapa para poderem transitar e comerciar.",
            teacherHint = "Era uma taxa régia de passagem e reconhecimento de suserania."
        ),
        Question(
            id = "H04",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            difficulty = Difficulty.MEDIO,
            questionText = "O Estado Marave, que se desenvolveu a norte do rio Zambeze a partir do século XVI, caracterizava-se pela dinastia governante dos:",
            options = listOf(
                "Caronga (Phiri)",
                "Changamire",
                "Mwenemutapa",
                "Musiwa"
            ),
            correctIndex = 0,
            explanation = "A confederação Marave foi fundada pelo clã Phiri, cujos soberanos usavam o título dinástico de Caronga (ou Karonga), Undi e Lundu.",
            teacherHint = "O clã dirigente dos Marave associou o poder político aos cultos territoriais femininos."
        ),
        Question(
            id = "H05",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            difficulty = Difficulty.MEDIO,
            questionText = "Os Estados Militares do Vale do Zambeze que surgiram no século XIX resultaram principalmente de:",
            options = listOf(
                "Declínio dos antigos Prazos da Coroa e militarização do comércio de marfim e escravos",
                "Conquista directa de colonos holandeses vindos da Colónia do Cabo",
                "Iniciativas de pacificação da Sociedade das Nações",
                "Expansão missionária jesuíta no interior de Gaza"
            ),
            correctIndex = 0,
            explanation = "Com a crise dos prazos e a corrida ao marfim e tráfico negreiro, chefes afro-portugueses armaram exércitos de escravos guerreiros (Achikunda), formando Estados Militares como Macanga e Massingir.",
            teacherHint = "Os senhores da guerra zambezianos usavam exércitos de guerreiros armados com espingardas."
        ),
        Question(
            id = "H06",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            difficulty = Difficulty.FACIL,
            questionText = "Quem foi o líder que unificou as linhagens nguni e fundou o poderoso Estado de Gaza no início do século XIX?",
            options = listOf(
                "Sochangane (Manicusse)",
                "Mawewe",
                "Muzila",
                "Maguiguana"
            ),
            correctIndex = 0,
            explanation = "Sochangane (Manicusse) liderou a migração nguni durante as convulsões do Mfecane, submeteu os povos tsonga e estabeleceu o Estado de Gaza.",
            teacherHint = "Foi o patriarca e avô de Ngungunhane."
        ),

        // --- PENETRAÇÃO MERCANTIL & COMÉRCIO ---
        Question(
            id = "H07",
            subject = Subject.HISTORIA,
            topic = "Penetração Mercantil",
            difficulty = Difficulty.FACIL,
            questionText = "Antes da chegada dos navegadores portugueses no final do século XV, o comércio costeiro em Moçambique era dominado por mercadores:",
            options = listOf(
                "Árabes-Suaílis e Indianos",
                "Britânicos e Neerlandeses",
                "Espanhóis e Franceses",
                "Alemães e Belgas"
            ),
            correctIndex = 0,
            explanation = "Cidades como Sofala, Ilha de Moçambique e Angoche faziam parte da florescente rota comercial suaíli no Índico, comercializando ouro, marfim e tecidos.",
            teacherHint = "Navegavam nos tradicionais dhows aproveitando os ventos das monções."
        ),
        Question(
            id = "H08",
            subject = Subject.HISTORIA,
            topic = "Penetração Mercantil",
            difficulty = Difficulty.MEDIO,
            questionText = "Os 'Prazos da Coroa' que floresceram no vale do Zambeze a partir do século XVII caracterizavam-se por:",
            options = listOf(
                "Grandes propriedades fundiárias doadas pela Coroa portuguesa que combinavam feudos militares e chefaturas tradicionais",
                "Empresas exclusivamente agrícolas geridas por companhias majestáticas alemãs",
                "Escolas missionárias destinadas à formação do clero africano",
                "Feitorias litorais exclusivas para o comércio de especiarias asiáticas"
            ),
            correctIndex = 0,
            explanation = "Os Prazos eram senhorios concedidos por três gerações com transmissão por linha feminina, onde os prazeiros cobravam o mussoco e comandavam os guerreiros Achikunda.",
            teacherHint = "Propriedades zambezianas que combinavam traços feudais com instituições locais."
        ),
        Question(
            id = "H09",
            subject = Subject.HISTORIA,
            topic = "Penetração Mercantil",
            difficulty = Difficulty.MEDIO,
            questionText = "Como se denominava o exército privado de homens armados e dependentes que sustentava o poder militar dos senhores dos Prazos?",
            options = listOf(
                "Achikunda (ou Chikunda)",
                "Madoda",
                "Mabhande",
                "Cipaios"
            ),
            correctIndex = 0,
            explanation = "Os Achikunda eram guerreiros escravizados ou clientes fiéis dos prazeiros, organizados em regimentos com disciplina militar e armas de fogo.",
            teacherHint = "Força militar que garantia a segurança dos prazos e a colecta de tributos no Zambeze."
        ),
        Question(
            id = "H10",
            subject = Subject.HISTORIA,
            topic = "Penetração Mercantil",
            difficulty = Difficulty.DIFICIL,
            questionText = "O imposto de capitação e produção que as comunidades camponesas pagavam aos donos dos Prazos do Zambeze recebia o nome tradicional de:",
            options = listOf(
                "Mussoco",
                "Chibalo",
                "Dízimo",
                "Sisa"
            ),
            correctIndex = 0,
            explanation = "O mussoco era o tributo pago em géneros (cereais, animais, ouro) pelas famílias camponesas vivendo nas terras do prazo.",
            teacherHint = "Tributo feudal e comunal pago aos prazeiros no vale do Zambeze."
        ),
        Question(
            id = "H11",
            subject = Subject.HISTORIA,
            topic = "Penetração Mercantil",
            difficulty = Difficulty.FACIL,
            questionText = "O tráfico atlântico e transoceânico de escravos atingiu o seu pico mais dramático em Moçambique nos séculos:",
            options = listOf(
                "XVIII e XIX",
                "XII e XIII",
                "XV e XVI",
                "XX e XXI"
            ),
            correctIndex = 0,
            explanation = "Embora existisse antes, o tráfico em grande escala de escravizados em Moçambique intensificou-se a partir de finais do séc. XVIII para abastecer o Brasil, Cuba e as ilhas francesas das Mascarenhas.",
            teacherHint = "Período que antecedeu imediatamente a conferência de partilha colonial da África."
        ),
        Question(
            id = "H12",
            subject = Subject.HISTORIA,
            topic = "Penetração Mercantil",
            difficulty = Difficulty.MEDIO,
            questionText = "Qual cidade costeira serviu como a primeira capital colonial de Moçambique até a sua transferência para Lourenço Marques em 1898?",
            options = listOf(
                "Ilha de Moçambique",
                "Beira",
                "Quelimane",
                "Inhambane"
            ),
            correctIndex = 0,
            explanation = "A Ilha de Moçambique foi a sede governamental e praça-forte da presença portuguesa no Índico Oriental até ao final do século XIX.",
            teacherHint = "Cidade insular declarada Património Mundial pela UNESCO na província de Nampula."
        ),

        // --- RESISTÊNCIA COLONIAL & IMPÉRIO DE GAZA ---
        Question(
            id = "H13",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            difficulty = Difficulty.FACIL,
            questionText = "Qual foi o célebre imperador de Gaza que liderou a resistência armada contra a penetração colonial portuguesa no sul de Moçambique no final do século XIX?",
            options = listOf(
                "Ngungunhane",
                "Changamire Dombo",
                "Mawewe",
                "Gungunhana de Sofala"
            ),
            correctIndex = 0,
            explanation = "Ngungunhane (Rei de Gaza) resistiu tenazmente às forças coloniais portuguesas comandadas por Mouzinho de Albuquerque até ser capturado em Chaimite em Dezembro de 1895.",
            teacherHint = "Ele era o governante do Império de Gaza e seu comandante de guerra chamava-se Maguiguana Khosa."
        ),
        Question(
            id = "H14",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            difficulty = Difficulty.MEDIO,
            questionText = "A célebre batalha de Marracuene ('Gwaza Muthini'), um dos maiores marcos da resistência no sul de Moçambique, ocorreu no ano de:",
            options = listOf(
                "1895",
                "1885",
                "1902",
                "1930"
            ),
            correctIndex = 0,
            explanation = "A Batalha de Marracuene aconteceu a 2 de Fevereiro de 1895, opondo os guerreiros de Gaza aos militares coloniais portugueses organizados em quadrado militar.",
            teacherHint = "Ocorreu no mesmo ano da captura de Ngungunhane em Chaimite."
        ),
        Question(
            id = "H15",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            difficulty = Difficulty.MEDIO,
            questionText = "O comandante-geral dos exércitos de Ngungunhane, que continuou a luta armada mesmo após a captura do rei até tombar em combate em Macontene em 1897, foi:",
            options = listOf(
                "Maguiguana Khosa",
                "Nwamatibyane",
                "Mahazule",
                "Farishe"
            ),
            correctIndex = 0,
            explanation = "Maguiguana Khosa foi o brilhante general de Gaza que reorganizou a resistência e enfrentou as tropas coloniais portuguesas até à sua morte em combate em 1897.",
            teacherHint = "Famoso comandante supremo das forças militares de Gaza."
        ),
        Question(
            id = "H16",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            difficulty = Difficulty.DIFICIL,
            questionText = "A grande Revolta do Báruè, desencadeada em 1917 no centro de Moçambique contra a opressão colonial, teve como um dos seus líderes carismáticos e espirituais:",
            options = listOf(
                "Nongwe-Nongwe e a sacerdotisa Mbuya",
                "Ngungunhane e Maguiguana",
                "Eduardo Mondlane e Samora Machel",
                "Caronga e Undi"
            ),
            correctIndex = 0,
            explanation = "A revolta uniu povos shona, sena e prazeiros sob a liderança de Nongwe-Nongwe e do espírito Mwari/Mbuya, resistindo ao recrutamento forçado para a I Guerra Mundial.",
            teacherHint = "Revolta no planalto central que mobilizou milhares de combatentes armados em 1917."
        ),
        Question(
            id = "H17",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            difficulty = Difficulty.MEDIO,
            questionText = "A resistência heróica na província de Nampula contra as campanhas de ocupação militar portuguesa no início do século XX foi liderada principalmente pelos chefes do povo:",
            options = listOf(
                "Macua (com os Namarrais)",
                "Changana",
                "Sena",
                "Chope"
            ),
            correctIndex = 0,
            explanation = "Os guerreiros Namarrais do povo Macua impuseram severas derrotas às forças de ocupação colonial portuguesa nas florestas e palmares do norte até cerca de 1912.",
            teacherHint = "Guerreiros do norte moçambicano conhecidos pela sua táctica de guerrilha na selva."
        ),
        Question(
            id = "H18",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            difficulty = Difficulty.DIFICIL,
            questionText = "A Conferência de Berlim (1884-1885) introduziu uma alteração crucial no direito internacional colonial com o princípio da:",
            options = listOf(
                "Ocupação efectiva do território",
                "Primazia dos direitos históricos de navegação",
                "Partilha proporcional com os chefes nativos",
                "Cessação voluntária de armamentos pesados"
            ),
            correctIndex = 0,
            explanation = "A Conferência de Berlim invalidou os títulos de descoberta marítima, exigindo presença administrativa e militar efectiva no terreno para validar a posse de qualquer território africano.",
            teacherHint = "Obrigou Portugal a realizar as campanhas militares de 'pacificação' em Moçambique."
        ),

        // --- SISTEMA COLONIAL & ECONOMIA ---
        Question(
            id = "H19",
            subject = Subject.HISTORIA,
            topic = "Sistema Colonial",
            difficulty = Difficulty.FACIL,
            questionText = "Como era denominada a prática colonial opressiva de trabalho forçado imposta aos cidadãos nativos de Moçambique?",
            options = listOf(
                "Chibalo",
                "Kupaluxa",
                "Mutapa",
                "Mussoco"
            ),
            correctIndex = 0,
            explanation = "O Chibalo era a escravidão disfarçada institucionalizada pelo Regulamento do Trabalho dos Indígenas, que obrigava os moçambicanos a trabalhos pesados sob chibata.",
            teacherHint = "Palavra emblemática que representa o trabalho forçado colonial."
        ),
        Question(
            id = "H20",
            subject = Subject.HISTORIA,
            topic = "Sistema Colonial",
            difficulty = Difficulty.MEDIO,
            questionText = "O 'Acto Colonial' promulgado pelo regime fascista português em 1930 estabeleceu:",
            options = listOf(
                "A centralização política e subordinação económica rígida das colónias à metrópole",
                "A extinção do trabalho obrigatório e a concessão de cidadania plena",
                "A privatização de todas as ferrovias para companhias sul-africanas",
                "A criação de um parlamento autónomo eleito em Lourenço Marques"
            ),
            correctIndex = 0,
            explanation = "O Acto Colonial de 1930, redigido por Salazar, subordinou toda a economia colonial aos interesses industriais e agrícolas de Portugal, criando o pacto colonial.",
            teacherHint = "Documento legal do Estado Novo salazarista que formalizou o império colonial."
        ),
        Question(
            id = "H21",
            subject = Subject.HISTORIA,
            topic = "Sistema Colonial",
            difficulty = Difficulty.MEDIO,
            questionText = "Quais eram as duas principais Companhias Majestáticas que detinham soberania delegada sobre vastos territórios no centro e norte de Moçambique?",
            options = listOf(
                "Companhia de Moçambique e Companhia do Niassa",
                "Companhia da Zambézia e Companhia do Sena",
                "Companhia Britânica da África do Sul e Anglo American",
                "Sociedade Madal e Açucareira de Xinavane"
            ),
            correctIndex = 0,
            explanation = "A Companhia de Moçambique (Manica e Sofala) e a Companhia do Niassa (Cabo Delgado e Niassa) governavam com moedas, polícia e taxas próprias graças a cartas régias majestáticas.",
            teacherHint = "Governavam os territórios por concessão da Coroa como se fossem governos próprios."
        ),
        Question(
            id = "H22",
            subject = Subject.HISTORIA,
            topic = "Sistema Colonial",
            difficulty = Difficulty.DIFICIL,
            questionText = "A cultura obrigatória do algodão, imposta a centenas de milhares de camponeses no norte e centro de Moçambique a partir de 1938, provocou frequentemente:",
            options = listOf(
                "Graves fomes e escassez alimentar devido ao abandono das culturas de subsistência",
                "Enriquecimento em massa das famílias rurais camponesas",
                "Mecanização rápida da agricultura familiar moçambicana",
                "Fim do trabalho forçado nas plantações de copra"
            ),
            correctIndex = 0,
            explanation = "O regime colonial obrigava os camponeses a plantar algodão a preços irrisórios para abastecer a indústria têxtil portuguesa, impedindo-os de plantar machambas de milho e mandioca.",
            teacherHint = "Uma das maiores causas de miséria e fome descrita na literatura nacional."
        ),
        Question(
            id = "H23",
            subject = Subject.HISTORIA,
            topic = "Sistema Colonial",
            difficulty = Difficulty.MEDIO,
            questionText = "O 'Estatuto dos Indígenas Portugueses das Províncias da Guiné, Angola e Moçambique' dividia a população legalmente em duas categorias:",
            options = listOf(
                "Indígenas e Não-indígenas (assimilados e cidadãos)",
                "Proletários e Burgueses",
                "Militares e Civis",
                "Trabalhadores e Nobres"
            ),
            correctIndex = 0,
            explanation = "A vasta maioria negra era classificada como 'indígena', desprovida de direitos políticos e sujeita ao chibalo; apenas uma minúscula fração conseguia o estatuto de 'assimilado'.",
            teacherHint = "Regime discriminatório que condicionava os direitos à chamada assimilação cultural."
        ),
        Question(
            id = "H24",
            subject = Subject.HISTORIA,
            topic = "Sistema Colonial",
            difficulty = Difficulty.FACIL,
            questionText = "A migração maciça de mão-de-obra moçambicana para as minas de ouro e carvão da África do Sul era intermediada pela agência colonial conhecida como:",
            options = listOf(
                "WNELA (Witwatersrand Native Labour Association)",
                "FRELIMO",
                "UNAMI",
                "SADCC"
            ),
            correctIndex = 0,
            explanation = "A WNELA recrutava trabalhadores mineiros moçambicanos sob acordos bilaterais entre Portugal e o governo sul-africano com pagamento em ouro.",
            teacherHint = "Sigla da empresa de recrutamento de mineiros para a África do Sul."
        ),

        // --- LUTA ARMADA & INDEPENDÊNCIA NACIONAL ---
        Question(
            id = "H25",
            subject = Subject.HISTORIA,
            topic = "Luta Armada e FRELIMO",
            difficulty = Difficulty.FACIL,
            questionText = "Em que data foi fundada a Frente de Libertação de Moçambique (FRELIMO) em Dar-es-Salaam, Tanzânia?",
            options = listOf(
                "25 de Junho de 1962",
                "25 de Setembro de 1964",
                "25 de Junho de 1975",
                "3 de Fevereiro de 1969"
            ),
            correctIndex = 0,
            explanation = "A FRELIMO foi fundada a 25 de Junho de 1962, resultante da fusão patriótica da UDENAMO, MANU e UNAMI, sob presidência do Dr. Eduardo Chivambo Mondlane.",
            teacherHint = "Três anos antes da proclamação da independência, no mesmo dia e mês."
        ),
        Question(
            id = "H26",
            subject = Subject.HISTORIA,
            topic = "Luta Armada e FRELIMO",
            difficulty = Difficulty.FACIL,
            questionText = "Onde e em que data soou o primeiro tiro que marcou o início da Luta Armada de Libertação Nacional em Moçambique?",
            options = listOf(
                "Posto Administrativo de Chai, 25 de Setembro de 1964",
                "Marracuene, 2 de Fevereiro de 1895",
                "Mueda, 16 de Junho de 1960",
                "Machava, 25 de Junho de 1975"
            ),
            correctIndex = 0,
            explanation = "O primeiro ataque guerrilheiro foi liderado por Alberto Chipande no Posto Administrativo de Chai, província de Cabo Delgado, a 25 de Setembro de 1964.",
            teacherHint = "Data consagrada como o Dia das Forças Armadas de Moçambique."
        ),
        Question(
            id = "H27",
            subject = Subject.HISTORIA,
            topic = "Luta Armada e FRELIMO",
            difficulty = Difficulty.MEDIO,
            questionText = "O Dr. Eduardo Chivambo Mondlane, primeiro Presidente da FRELIMO e Arquiteto da Unidade Nacional, foi tragicamente assassinado por uma encomenda-bomba em:",
            options = listOf(
                "3 de Fevereiro de 1969",
                "25 de Setembro de 1964",
                "19 de Outubro de 1986",
                "7 de Setembro de 1974"
            ),
            correctIndex = 0,
            explanation = "Eduardo Mondlane foi assassinado a 3 de Fevereiro de 1969 em Dar-es-Salaam pela PIDE. A data celebra-se anualmente como o Dia dos Heróis Moçambicanos.",
            teacherHint = "Origem do feriado nacional de 3 de Fevereiro (Dia dos Heróis Moçambicanos)."
        ),
        Question(
            id = "H28",
            subject = Subject.HISTORIA,
            topic = "Luta Armada e FRELIMO",
            difficulty = Difficulty.FACIL,
            questionText = "O Massacre de Mueda, perpetrado pelas tropas coloniais a 16 de Junho de 1960 em Cabo Delgado contra manifestantes pacíficos, evidenciou:",
            options = listOf(
                "A impossibilidade de alcançar a independência apenas através de vias pacíficas de protesto",
                "A aceitação pacífica das reivindicações nacionalistas pelo governador colonial",
                "O fim imediato da repressão armada nas áreas rurais",
                "A intervenção directa das Nações Unidas na mediação com Portugal"
            ),
            correctIndex = 0,
            explanation = "O Massacre de Mueda convenceu os líderes nacionalistas moçambicanos de que o colonialismo salazarista só cederia perante a luta armada organizada.",
            teacherHint = "Episódio comemorado a 16 de Junho que impulsionou a via armada."
        ),
        Question(
            id = "H29",
            subject = Subject.HISTORIA,
            topic = "Luta Armada e FRELIMO",
            difficulty = Difficulty.MEDIO,
            questionText = "A heroína moçambicana e dirigente do Destacamento Feminino da FRELIMO, falecida em combate a 7 de Abril de 1971, foi:",
            options = listOf(
                "Josina Machel",
                "Paulina Chiziane",
                "Noémia de Sousa",
                "Graça Machel"
            ),
            correctIndex = 0,
            explanation = "Josina Machel destacou-se na luta armada e na promoção da emancipação da mulher. Em sua honra, celebra-se a 7 de Abril o Dia da Mulher Moçambicana.",
            teacherHint = "Figura homenageada no Dia da Mulher Moçambicana a 7 de Abril."
        ),
        Question(
            id = "H30",
            subject = Subject.HISTORIA,
            topic = "Luta Armada e FRELIMO",
            difficulty = Difficulty.DIFICIL,
            questionText = "A grande ofensiva militar das Forças Armadas portuguesas lançada em 1970 pelo General Kaúlza de Arriaga para esmagar as bases da FRELIMO em Cabo Delgado denominou-se:",
            options = listOf(
                "Operação Nó Górdio",
                "Operação Zebra",
                "Operação Viriato",
                "Operação Trovão do Índico"
            ),
            correctIndex = 0,
            explanation = "A Operação Nó Górdio foi a maior campanha militar portuguesa na guerra colonial, mas falhou estrategicamente em travar a expansão da guerrilha para Niassa e Tete.",
            teacherHint = "Operação cujo nome remete para o famoso nó lendário cortado por Alexandre Magno."
        ),
        Question(
            id = "H31",
            subject = Subject.HISTORIA,
            topic = "Luta Armada e FRELIMO",
            difficulty = Difficulty.FACIL,
            questionText = "Os acordos assinados a 7 de Setembro de 1974 entre a FRELIMO e Portugal, que estabeleceram o cessar-fogo e o Governo de Transição, foram os:",
            options = listOf(
                "Acordos de Lusaka",
                "Acordos de Roma",
                "Acordo de Nkomati",
                "Tratado de Tordesilhas"
            ),
            correctIndex = 0,
            explanation = "Os Acordos de Lusaka, firmados na capital zambiana, consagraram o reconhecimento formal do direito de Moçambique à independência (Dia da Vitória).",
            teacherHint = "Assinados na Zâmbia, originando o feriado do Dia da Vitória a 7 de Setembro."
        ),
        Question(
            id = "H32",
            subject = Subject.HISTORIA,
            topic = "Independência Nacional",
            difficulty = Difficulty.FACIL,
            questionText = "Quem proclamou solemnemente a Independência Total e Completa de Moçambique no Estádio da Machava a 25 de Junho de 1975?",
            options = listOf(
                "Samora Moisés Machel",
                "Eduardo Chivambo Mondlane",
                "Joaquim Alberto Chissano",
                "Marcelino dos Santos"
            ),
            correctIndex = 0,
            explanation = "Samora Moisés Machel, primeiro Presidente de Moçambique, proclamou solenemente a independência à meia-noite de 25 de Junho de 1975.",
            teacherHint = "Primeiro Chefe de Estado da República Popular de Moçambique."
        ),
        Question(
            id = "H33",
            subject = Subject.HISTORIA,
            topic = "Independência Nacional",
            difficulty = Difficulty.MEDIO,
            questionText = "O trágico desastre aéreo que ceifou a vida ao Presidente Samora Machel e à sua comitiva ocorreu em Mbuzini a:",
            options = listOf(
                "19 de Outubro de 1986",
                "25 de Junho de 1975",
                "3 de Fevereiro de 1969",
                "4 de Outubro de 1992"
            ),
            correctIndex = 0,
            explanation = "O avião presidencial Tupolev 134 despenhou-se nos montes Libombos em Mbuzini (África do Sul) a 19 de Outubro de 1986 no regresso de uma cimeira em Mbala.",
            teacherHint = "Mártires de Mbuzini recordados anualmente em Outubro."
        ),
        Question(
            id = "H34",
            subject = Subject.HISTORIA,
            topic = "Independência Nacional",
            difficulty = Difficulty.FACIL,
            questionText = "O Acordo Geral de Paz que pôs fim a 16 anos de guerra civil em Moçambique foi assinado em Roma a:",
            options = listOf(
                "4 de Outubro de 1992",
                "25 de Junho de 1975",
                "7 de Setembro de 1974",
                "19 de Outubro de 1986"
            ),
            correctIndex = 0,
            explanation = "O Acordo de Roma foi assinado a 4 de Outubro de 1992 entre Joaquim Chissano (Governo) e Afonso Dhlakama (RENAMO), instituindo o Dia da Paz e Reconciliação.",
            teacherHint = "Origem do feriado do Dia da Paz celebrado a 4 de Outubro."
        ),
        Question(
            id = "H35",
            subject = Subject.HISTORIA,
            topic = "Independência Nacional",
            difficulty = Difficulty.DIFICIL,
            questionText = "A Constituição de 1990 é um marco jurídico fundamental na história de Moçambique porque introduziu:",
            options = listOf(
                "O Estado de Direito Democrático, o multipartidarismo e a economia de mercado",
                "A nacionalização de todas as propriedades agrícolas privadas",
                "A criação do regime de partido único FRELIMO",
                "A adesão imediata à Comunidade Britânica (Commonwealth)"
            ),
            correctIndex = 0,
            explanation = "A Constituição aprovada em Novembro de 1990 consagrou as liberdades civis fundamentais, a separação de poderes e eleições multipartidárias competitivas.",
            teacherHint = "Transição constitucional para a democracia pluralista e economia aberta."
        ),
        Question(
            id = "H36",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            difficulty = Difficulty.DIFICIL,
            questionText = "No Grande Zimbabué e em Manyikeni (Inhambane), as imponentes muralhas de pedra sem argamassa atestam:",
            options = listOf(
                "Elevado grau de desenvolvimento arquitetónico e centralização política da civilização Shona",
                "Construção militar realizada por navegadores fenícios no Mediterrâneo",
                "Castelos construídos pelos militares portugueses no século XVIII",
                "Aldeamentos improvisados para defesa contra as invasões coloniais do século XX"
            ),
            correctIndex = 0,
            explanation = "Manyikeni e Great Zimbabwe comprovam a sofisticação da arquitetura pré-colonial em pedra das elites dirigentes da cultura Shona-Caranga.",
            teacherHint = "Monumento arqueológico pré-colonial situado próximo de Vilankulo em Moçambique."
        ),
        Question(
            id = "H37",
            subject = Subject.HISTORIA,
            topic = "Penetração Mercantil",
            difficulty = Difficulty.FACIL,
            questionText = "No comércio tradicional entre as comunidades da costa e do interior, que produto extraído das salinas era vital para conservar alimentos e estabelecer trocas?",
            options = listOf(
                "Sal",
                "Açúcar refinado",
                "Chá preto",
                "Café"
            ),
            correctIndex = 0,
            explanation = "O sal marinho era uma das mercadorias de circulação mais valiosas no interior africano, indispensável para conservação e alimentação.",
            teacherHint = "Substância mineral essencial que servia de padrão de troca no interior."
        ),
        Question(
            id = "H38",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            difficulty = Difficulty.MEDIO,
            questionText = "A célebre fortaleza onde Ngungunhane foi detido após a sua captura em Chaimite em 1895 foi a de:",
            options = listOf(
                "Fortaleza de São Sebastião / Dondo",
                "Fortaleza de São Caetano de Sofala",
                "Fortaleza de Lourenço Marques (Nossa Senhora da Conceição)",
                "Forte de São João Baptista de Ibo"
            ),
            correctIndex = 0,
            explanation = "Ngungunhane foi levado prisioneiro para Lourenço Marques (exibido na fortaleza local) antes de ser desterrado para a ilha Terceira, nos Açores.",
            teacherHint = "Fortaleza situada na baixa da capital de Moçambique."
        ),
        Question(
            id = "H39",
            subject = Subject.HISTORIA,
            topic = "Sistema Colonial",
            difficulty = Difficulty.MEDIO,
            questionText = "O 'Regulamento da Cultura do Algodão' em Moçambique dividia o território em concessões algodoeiras atribuídas com exclusividade a:",
            options = listOf(
                "Sociedades concessionárias monopolistas com capitais portugueses",
                "Cooperativas agrícolas dirigidas por camponeses nativos",
                "Empresas estatais da África do Sul",
                "Comités de bairro das missões católicas suíças"
            ),
            correctIndex = 0,
            explanation = "As concessionárias tinham o exclusivo da compra obrigatória de algodão aos camponeses dentro de cada zona fixada pelo governo colonial.",
            teacherHint = "Concessionárias algodoeiras que detinham o monopólio regional."
        ),
        Question(
            id = "H40",
            subject = Subject.HISTORIA,
            topic = "Luta Armada e FRELIMO",
            difficulty = Difficulty.FACIL,
            questionText = "As áreas territoriais libertadas pelo movimento guerrilheiro da FRELIMO onde se criavam novas escolas, hospitais e cooperativas chamavam-se:",
            options = listOf(
                "Zonas Libertadas",
                "Reduções Missionárias",
                "Prazos Livres",
                "Bairros Indígenas"
            ),
            correctIndex = 0,
            explanation = "Nas Zonas Libertadas do norte de Moçambique (Cabo Delgado, Niassa e Tete), a FRELIMO implantou o embrião do novo Estado democrático popular.",
            teacherHint = "Territórios sob controlo da guerrilha durante a luta armada."
        ),
        Question(
            id = "H41",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            subtopic = "Povoamento Bantu: Origens da Expansão Bantu",
            difficulty = Difficulty.FACIL,
            questionText = "De acordo com os estudos linguísticos e arqueológicos sobre a África Austral, o centro geográfico de dispersão original dos povos de língua Bantu localiza-se na região:",
            options = listOf(
                "Entre os actuais Camarões e o sudeste da Nigéria",
                "No vale do rio Nilo, no antigo Egipto",
                "No planalto etíope e Corno de África",
                "Nas margens do rio Zambeze em Moçambique"
            ),
            correctIndex = 0,
            explanation = "As pesquisas demonstraram que a pátria original dos povos Bantu situa-se nos planaltos da fronteira entre a Nigéria e os Camarões.",
            teacherHint = "Região da África Ocidental/Central próxima ao Golfo da Guiné.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H42",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            subtopic = "Povoamento Bantu: Contacto com os Povos Khoisan",
            difficulty = Difficulty.MEDIO,
            questionText = "Antes da fixação dos povos Bantu, o território moçambicano era habitado por caçadores-recoletores nómadas do grupo Khoisan. O encontro entre estes dois grupos caracterizou-se por:",
            options = listOf(
                "Coabitação, assimilação gradual e recuo progressivo dos Khoisan para zonas mais áridas",
                "Extermínio imediato de toda a população autóctone Khoisan pelos Bantu",
                "Conversão pacífica dos Bantu ao nomadismo e abandono da agricultura",
                "Submissão militar dos Bantu aos chefes de linhagem Khoisan"
            ),
            correctIndex = 0,
            explanation = "O contacto processou-se por miscigenação, trocas culturais e recuo progressivo dos grupos Khoisan em direcção ao deserto do Calaári.",
            teacherHint = "Processo de assimilação e coexistência ecológica ao longo de séculos.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H43",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            subtopic = "Povoamento Bantu: A Aldeia Musha e Relações de Linhagem",
            difficulty = Difficulty.MEDIO,
            questionText = "Nas comunidades aldeãs primitivas de linhagem em Moçambique (aldeias Musha), a autoridade e a redistribuição da terra cabiam ao:",
            options = listOf(
                "Ancião da linhagem fundadora (Mwenye ou chefe de terra), que mediava com os espíritos",
                "Capitão-mor nomeado pela administração colonial",
                "Comerciante árabe mais influente da feitoria",
                "Guerreiro mais jovem que vencesse o torneio tribal"
            ),
            correctIndex = 0,
            explanation = "A autoridade assentava no respeito gerontocrático e na linhagem do clã fundador, considerado proprietário místico do solo.",
            teacherHint = "Líder ancestral e espiritual que mantinha o equilíbrio com os antepassados.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H44",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            subtopic = "Estados Marave: Dualismo Phiri e Banda",
            difficulty = Difficulty.DIFICIL,
            questionText = "Na Confederação dos Estados Marave, a convivência política e religiosa estruturava-se na articulação entre dois clãs fundamentais, em que:",
            options = listOf(
                "Os Phiri detinham o poder político e militar, enquanto os Banda detinham o poder religioso da terra",
                "Os Banda governavam o exército régio e os Phiri dedicavam-se unicamente ao artesanato",
                "Os Phiri eram comerciantes estrangeiros banianes e os Banda eram missionários",
                "Ambos os clãs tinham exactamente as mesmas funções administrativas sem divisão de papéis"
            ),
            correctIndex = 0,
            explanation = "Os Phiri assumiram as chefias e a soberania militar, respeitando e incorporando a autoridade mágica dos autóctones Banda nos rituais de chuva.",
            teacherHint = "Divisão clássica entre conquistadores políticos e guardiões espirituais da terra.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H45",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            subtopic = "Estados Marave: O Culto de Makewana",
            difficulty = Difficulty.MEDIO,
            questionText = "Nos Estados Marave, o mais importante centro religioso tradicional, cuja sacerdotisa profetizava chuvas e fertilidade e legitimava os reis, era o culto de:",
            options = listOf(
                "Makewana (em Chifuka)",
                "Mwari (em Matopo)",
                "Mbona (no vale do Chire)",
                "Nyabinghi"
            ),
            correctIndex = 0,
            explanation = "Makewana ('mãe de todas as crianças') era a grande profetisa e voz oracular da divindade Chisumphi no santuário sagrado de Chifuka.",
            teacherHint = "Grande entidade religiosa feminina que abençoava os governantes Marave.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H46",
            subject = Subject.HISTORIA,
            topic = "Estados Pré-Coloniais",
            subtopic = "Estados Marave: Dinastia de Undi e a Machira",
            difficulty = Difficulty.FACIL,
            questionText = "Além do marfim e do comércio de ferro, qual era a principal manufatura têxtil artesanal produzida intensamente nos Estados Marave?",
            options = listOf(
                "Machira (tecidos grossos de algodão)",
                "Seda oriental refinada",
                "Lã de ovelha merino",
                "Veludo de importação europeia"
            ),
            correctIndex = 0,
            explanation = "A 'machira' era o pano tradicional de algodão tecido em teares manuais locais, usado para vestuário e como padrão de pagamento tributário.",
            teacherHint = "Tecido tradicional de algodão nativo fiado à mão.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H47",
            subject = Subject.HISTORIA,
            topic = "Penetração Mercantil",
            subtopic = "Prazos da Coroa: Regime Sucessório das Donas dos Prazos",
            difficulty = Difficulty.MEDIO,
            questionText = "A legislação colonial portuguesa estipulava que a posse e herança dos Prazos da Coroa no vale do Zambeze deviam ser transmitidas:",
            options = listOf(
                "Por linha feminina ao longo de três vidas sucessivas, com obrigação de casamento com homens brancos",
                "Exclusivamente por linha masculina primogénita ao filho varão mais velho",
                "Por eleição democrática realizada pelos camponeses do vale do Zambeze",
                "Por leilão anual organizado pelo bispo de Moçambique"
            ),
            correctIndex = 0,
            explanation = "A Coroa pretendia fixar famílias nobres portuguesas no Zambeze obrigando as herdeiras ('Donas dos Prazos') a desposarem fidalgos do reino ao longo de três gerações.",
            teacherHint = "Mecanismo jurídico de três vidas transmitido de mãe para filha.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H48",
            subject = Subject.HISTORIA,
            topic = "Penetração Mercantil",
            subtopic = "Prazos da Coroa: Os A-Chicunda e as Aringas",
            difficulty = Difficulty.FACIL,
            questionText = "Os exércitos privados permanentes formados por guerreiros escravizados e leais aos senhores dos Prazos do Zambeze eram denominados:",
            options = listOf(
                "A-Chicunda (Achikunda)",
                "Mabutho",
                "Cipaios da Companhia",
                "Sepoys indianos"
            ),
            correctIndex = 0,
            explanation = "Os Achikunda formavam a guarda pretoriana e a espinha dorsal militar dos prazeiros, alojando-se e combatendo a partir das Aringas fortificadas.",
            teacherHint = "Guerreiros da casa que protegiam as terras e recolhiam os tributos.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H49",
            subject = Subject.HISTORIA,
            topic = "Penetração Mercantil",
            subtopic = "Prazos da Coroa: O Tributo do Mussoco",
            difficulty = Difficulty.MEDIO,
            questionText = "O tributo obrigatório em géneros (cereais, marfim, ouro ou galinhas) cobrado pelos prazeiros a cada camponês residente no seu território denominava-se:",
            options = listOf(
                "Mussoco",
                "Curva",
                "Quinto Real",
                "Imposto de Rendimento"
            ),
            correctIndex = 0,
            explanation = "O mussoco era uma apropriação colonial do tributo de vassalagem tradicional que os prazeiros exigiam de todas as famílias camponesas sob o seu domínio.",
            teacherHint = "Tributo típico cobrado pelos senhores dos Prazos do Zambeze.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H50",
            subject = Subject.HISTORIA,
            topic = "Penetração Mercantil",
            subtopic = "Estados Militares: Macanga e a Dinastia dos Cruz",
            difficulty = Difficulty.DIFICIL,
            questionText = "No século XIX, com o enfraquecimento da Coroa, os prazos deram lugar a Estados Militares independentes. Qual foi a família afro-portuguesa que liderou o poderoso Estado Militar de Macanga?",
            options = listOf(
                "A família Cruz (Nhaude e Bonga)",
                "A família Pereira de Massingir",
                "A família Paiva de Andrada",
                "A dinastia dos Mwenemutapa"
            ),
            correctIndex = 0,
            explanation = "Joaquim José da Cruz (Nhaude) e o seu filho António Vicente da Cruz (Bonga) fortificaram a Aringa de Macanga e derrotaram repetidas expedições militares do governo colonial.",
            teacherHint = "Dinastia guerreira cujos líderes Nhaude e Bonga desafiaram as tropas coloniais.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H51",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            subtopic = "Estado de Gaza: Sochangane e a Origem de Gaza",
            difficulty = Difficulty.FACIL,
            questionText = "O comandante dissidente dos Ndwandwe que conduziu os seus guerreiros para norte durante o Mfecane e fundou o Império de Gaza por volta de 1821 foi:",
            options = listOf(
                "Sochangane (Manicusse)",
                "Shaka Zulu",
                "Mzilikazi",
                "Dingane"
            ),
            correctIndex = 0,
            explanation = "Sochangane (Manicusse) venceu rivais Nguni como Nxaba e Zwangendaba e fixou a base do seu império ao longo dos vales do Limpopo e Save.",
            teacherHint = "Primeiro imperador e patriarca fundador do Estado de Gaza.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H52",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            subtopic = "Estado de Gaza: Regimentos Militares Mabutho",
            difficulty = Difficulty.MEDIO,
            questionText = "Como funcionava o recrutamento dos jovens no Estado de Gaza através do sistema dos 'Mabutho'?",
            options = listOf(
                "Eram agrupados por classes de idade em regimentos permanentes, proibidos de casar até prestarem provas de bravura militar",
                "Eram recrutados por sorteio anual e serviam apenas durante os fins-de-semana",
                "Pagavam uma taxa em ouro ao imperador para ficarem isentos do serviço militar",
                "Aliavam-se voluntariamente a mercenários britânicos sem disciplina central"
            ),
            correctIndex = 0,
            explanation = "O sistema Mabutho garantia disciplina férrea, coesão multiétnica e exércitos profissionais prontos para campanhas ofensivas.",
            teacherHint = "Regimentos etários inspirados nas reformas militares Nguni.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H53",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            subtopic = "Estado de Gaza: Guerra Civil Mawewe vs Mzila",
            difficulty = Difficulty.DIFICIL,
            questionText = "Na sangrenta Guerra Civil de Sucessão de Gaza (1858-1862) após a morte de Sochangane, quem derrotou Mawewe com o apoio de colonos e caçadores de Lourenço Marques?",
            options = listOf(
                "Mzila (Mudungazi)",
                "Ngungunhane",
                "Maguiguana Khosa",
                "Nwamantibyane"
            ),
            correctIndex = 0,
            explanation = "Mzila triunfou sobre Mawewe e recompensou os comerciantes portugueses com autorização para trânsito mercantil e caça de elefantes.",
            teacherHint = "Pai de Ngungunhane que transferiu temporariamente a corte para Mossurize.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H54",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            subtopic = "Resistência Anticolonial: Causas da Revolta de Báruè de 1917",
            difficulty = Difficulty.MEDIO,
            questionText = "A Grande Revolta de Báruè de 1917 na região central de Moçambique foi desencadeada principalmente por qual medida colonial abusiva?",
            options = listOf(
                "O recrutamento forçado de milhares de homens para carregadores militares na Primeira Guerra Mundial",
                "A imposição do cristianismo católico nas escolas locais",
                "A introdução da moeda fiduciária de papel em substituição ao sal",
                "A proibição do comércio de chá na província de Manica"
            ),
            correctIndex = 0,
            explanation = "O recrutamento brutal de homens para o esforço de guerra contra as forças alemãs na África Oriental levou à revolta coordenada dos chefes de Báruè.",
            teacherHint = "Recrutamento desumano de carregadores para a frente da Primeira Guerra Mundial.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H55",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            subtopic = "Resistência Anticolonial: Lideranças da Revolta de Báruè",
            difficulty = Difficulty.MEDIO,
            questionText = "Quem foram os líderes e figuras espirituais que galvanizaram a resistência interétnica durante a Revolta de Báruè em 1917?",
            options = listOf(
                "Nongwe-Nongwe, Makombe e a médium espiritual de Mwari",
                "Mouzinho de Albuquerque e Caldas Xavier",
                "Eduardo Mondlane e Samora Machel",
                "Sochangane e Mawewe"
            ),
            correctIndex = 0,
            explanation = "Nongwe-Nongwe e Makombe mobilizaram diversas etnias através dos cultos ancestrais de possessão espiritual, resistindo até 1920.",
            teacherHint = "Aliança entre líderes políticos tradicionais e autoridades religiosas sagradas.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H56",
            subject = Subject.HISTORIA,
            topic = "Resistência Colonial",
            subtopic = "Resistência Anticolonial: Sultanato de Angoche",
            difficulty = Difficulty.DIFICIL,
            questionText = "No litoral norte de Moçambique, o Sultanato de Angoche constituiu um foco prolongado de resistência armada contra a ocupação colonial portuguesa sob a liderança do sultão:",
            options = listOf(
                "Farelay e Mussa Quanto",
                "Ngungunhane",
                "Bonga da Macanga",
                "Gatsi Lucere"
            ),
            correctIndex = 0,
            explanation = "O Sultão Farelay e o chefe Mussa Quanto resistiram tenazmente com canhões e espingardas costeiras até à expedição de Massano de Amorim em 1910.",
            teacherHint = "Sultões muçulmanos do norte que mantiveram o entreposto marítimo livre do jugo colonial.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H57",
            subject = Subject.HISTORIA,
            topic = "Independência Nacional",
            subtopic = "História Internacional: A Conferência de Bandung (1955)",
            difficulty = Difficulty.FACIL,
            questionText = "A Conferência de Bandung, realizada na Indonésia em Abril de 1955 com 29 delegações afro-asiáticas, teve como marco principal:",
            options = listOf(
                "A condenação unânime do colonialismo e a afirmação do Movimento dos Não-Alinhados",
                "A criação do Tratado Militar do Atlântico Norte (NATO)",
                "A partilha imperialista das antigas colónias francesas na Ásia",
                "A assinatura do cessar-fogo da Guerra da Coreia"
            ),
            correctIndex = 0,
            explanation = "Bandung foi o ponto de viragem diplomático dos povos colonizados, dando voz internacional ao Terceiro Mundo e ao direito inalienável à soberania.",
            teacherHint = "Cúpula histórica que consagrou os princípios da descolonização e do não-alinhamento.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H58",
            subject = Subject.HISTORIA,
            topic = "Independência Nacional",
            subtopic = "História de África: Fundação da OUA em Adis Abeba (1963)",
            difficulty = Difficulty.FACIL,
            questionText = "A 25 de Maio de 1963 foi fundada em Adis Abeba (Etiópia) a Organização da Unidade Africana (OUA), cujo objetivo primordial para as colónias portuguesas foi:",
            options = listOf(
                "Criar o Comité de Libertação de África para apoiar material e financeiramente as frentes guerrilheiras",
                "Autorizar a continuação da administração portuguesa até ao ano 2000",
                "Instituir uma moeda única africana ligada ao escudo português",
                "Subordinar os movimentos de libertação aos governos da Europa ocidental"
            ),
            correctIndex = 0,
            explanation = "O Comité de Libertação da OUA em Dar-es-Salaam forneceu passaportes, armamento e fundos directos aos combatentes da FRELIMO, MPLA e PAIGC.",
            teacherHint = "Comité de Libertação de África que financiou a luta armada nas colónias.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H59",
            subject = Subject.HISTORIA,
            topic = "Independência Nacional",
            subtopic = "História de África: Países da Linha da Frente e o Apartheid",
            difficulty = Difficulty.MEDIO,
            questionText = "A coligação dos 'Países da Linha da Frente', liderada por Moçambique, Zâmbia, Tanzânia, Angola e Botswana, desempenhou um papel decisivo na:",
            options = listOf(
                "Solidariedade e apoio militar/diplomático aos movimentos de libertação da Zimbabué (ZANU) e da África do Sul (ANC) contra o Apartheid",
                "Manutenção de bases nucleares das superpotências na África Austral",
                "Criação de um mercado comum exclusivo com o governo segregacionista de Pretória",
                "Defesa da presença militar colonial britânica na Rodésia"
            ),
            correctIndex = 0,
            explanation = "Moçambique arcou com severas retaliações económicas e bombardeamentos por abrigar campos do ANC e ZANU até à queda do regime do Apartheid.",
            teacherHint = "Aliança de governos africanos soberanos contra os regimes minoritários racistas.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),
        Question(
            id = "H60",
            subject = Subject.HISTORIA,
            topic = "Independência Nacional",
            subtopic = "Moçambique Contemporâneo: Acordo Geral de Paz de Roma (1992)",
            difficulty = Difficulty.FACIL,
            questionText = "O Acordo Geral de Paz assinado a 4 de Outubro de 1992 em Roma entre o Presidente Joaquim Chissano e Afonso Dhlakama foi mediado por qual instituição?",
            options = listOf(
                "A Comunidade de Santo Egídio e o Governo italiano",
                "A Organização do Tratado do Atlântico Norte (NATO)",
                "O Tribunal Internacional de Justiça de Haia",
                "O Banco Mundial e o Fundo Monetário Internacional"
            ),
            correctIndex = 0,
            explanation = "A mediação paciente da Comunidade de Santo Egídio em Roma conduziu ao fim da Guerra dos 16 Anos e ao processo eleitoral de 1994.",
            teacherHint = "Instituição católica de caridade e diálogo sediada em Roma.",
            questionType = QuestionType.APRENDIZAGEM,
            source = "Entra na Facul — Questão de aprendizagem"
        ),

        // =========================================================================
        // ========================= PORTUGUÊS (40 QUESTÕES) =======================
        // =========================================================================

        // --- CONCORDÂNCIA VERBAL & NOMINAL ---
        Question(
            id = "P01",
            subject = Subject.PORTUGUES,
            topic = "Concordância Verbal",
            difficulty = Difficulty.FACIL,
            questionText = "Assinale a frase em que a concordância verbal com o verbo 'haver' está rigorosamente CORRETA:",
            options = listOf(
                "Havia muitos estudantes inscritos no exame de admissão.",
                "Haviam muitos estudantes inscritos no exame de admissão.",
                "Houveram várias dúvidas no preenchimento da folha de respostas.",
                "Hão de haverem novas datas para a matrícula."
            ),
            correctIndex = 0,
            explanation = "O verbo 'haver' no sentido de 'existir' ou 'ocorrer' é impessoal, devendo permanecer sempre invariável na 3ª pessoa do singular (Havia muitos estudantes).",
            teacherHint = "Quando 'haver' significa 'existir', não admite sujeito no plural."
        ),
        Question(
            id = "P02",
            subject = Subject.PORTUGUES,
            topic = "Concordância Verbal",
            difficulty = Difficulty.MEDIO,
            questionText = "Em relação à concordância do verbo 'fazer' indicando tempo decorrido, indique a opção correta:",
            options = listOf(
                "Faz três meses que os candidatos se preparam para a prova.",
                "Fazem três meses que os candidatos se preparam para a prova.",
                "Fizeram muitos anos desde que ele concluiu o ensino secundário.",
                "Vão fazerem duas semanas que começaram os testes."
            ),
            correctIndex = 0,
            explanation = "O verbo 'fazer' quando indica tempo transcorrido ou fenómeno meteorológico é impessoal, mantendo-se sempre na 3ª pessoa do singular ('Faz três meses').",
            teacherHint = "Tempo decorrido com o verbo fazer não vai para o plural."
        ),
        Question(
            id = "P03",
            subject = Subject.PORTUGUES,
            topic = "Concordância Verbal",
            difficulty = Difficulty.DIFICIL,
            questionText = "Na oração com a partícula apassivadora 'se', a frase correta de acordo com a norma culta é:",
            options = listOf(
                "Alugam-se quartos para estudantes universitários.",
                "Aluga-se quartos para estudantes universitários.",
                "Precisa-se de técnicos qualificados na universidade.",
                "Tratam-se de questões fundamentais do exame."
            ),
            correctIndex = 0,
            explanation = "Na voz passiva sintética com verbo transitivo direto ('alugar'), o termo seguinte é o sujeito paciente ('quartos'). Logo, o verbo concorda no plural: 'Alugam-se quartos'.",
            teacherHint = "Quartos são alugados -> Alugam-se quartos (sujeito paciente no plural)."
        ),
        Question(
            id = "P04",
            subject = Subject.PORTUGUES,
            topic = "Concordância Verbal",
            difficulty = Difficulty.MEDIO,
            questionText = "Assinale a alternativa que obedece às regras de concordância verbal com sujeito composto anteposto:",
            options = listOf(
                "O professor e o estudante compareceram à sessão solene.",
                "O professor e o estudante compareceu à sessão solene.",
                "Faltou à cerimónia o reitor e o director da faculdade.",
                "Estava presentes a mãe e a filha no anfiteatro."
            ),
            correctIndex = 0,
            explanation = "Quando o sujeito composto se encontra antes do verbo, a concordância faz-se obrigatoriamente no plural ('compareceram').",
            teacherHint = "Dois núcleos antes do verbo exigem forma verbal plural."
        ),
        Question(
            id = "P05",
            subject = Subject.PORTUGUES,
            topic = "Concordância Verbal",
            difficulty = Difficulty.FACIL,
            questionText = "Identifique a frase com concordância nominal CORRETA:",
            options = listOf(
                "Seguem anexos os documentos comprovativos de candidatura.",
                "Seguem anexo os documentos comprovativos de candidatura.",
                "A estudante disse: Muito obrigado pela oportunidade.",
                "Elas mesmo organizaram as sessões de estudo na biblioteca."
            ),
            correctIndex = 0,
            explanation = "'Anexo' é um adjetivo e concorda em género e número com o substantivo a que se refere ('os documentos anexos' -> 'anexos os documentos'). Mulheres dizem 'obrigada' e 'elas mesmas'.",
            teacherHint = "'Anexo' concorda com o substantivo; se fosse 'em anexo', seria invariável."
        ),
        Question(
            id = "P06",
            subject = Subject.PORTUGUES,
            topic = "Concordância Verbal",
            difficulty = Difficulty.MEDIO,
            questionText = "Na expressão com adjetivo posposto a substantivos de géneros diferentes, a forma recomendada é:",
            options = listOf(
                "Ele comprou caderno e caneta novos (ou nova).",
                "Ele comprou caderno e caneta novo.",
                "Ele comprou cadernos e canetas nova.",
                "Ele comprou livro e revista caros apenas no feminino."
            ),
            correctIndex = 0,
            explanation = "Quando o adjetivo qualifica substantivos de géneros diferentes colocados antes dele, pode concordar no masculino plural (concordância gramatical) ou com o mais próximo.",
            teacherHint = "A regra geral privilegia o masculino plural como forma abrangente."
        ),
        Question(
            id = "P07",
            subject = Subject.PORTUGUES,
            topic = "Concordância Verbal",
            difficulty = Difficulty.DIFICIL,
            questionText = "Com expressões partitivas como 'a maioria dos candidatos', 'grande parte dos estudantes', o verbo:",
            options = listOf(
                "Pode concordar tanto no singular (com o núcleo 'maioria') quanto no plural (com o especificador 'candidatos')",
                "Deve ficar obrigatoriamente apenas no singular sem excepção",
                "Deve ficar obrigatoriamente apenas no plural sem excepção",
                "Deve ficar sempre no modo subjuntivo"
            ),
            correctIndex = 0,
            explanation = "Com expressões partitivas seguidas de especificador plural ('A maioria dos alunos chegou / chegaram'), a norma culta admite ambas as concordâncias.",
            teacherHint = "Concordância lógica (com o partitivo) ou atrativa (com o especificador plural)."
        ),

        // --- PRONOMES & COLOCAÇÃO PRONOMINAL ---
        Question(
            id = "P08",
            subject = Subject.PORTUGUES,
            topic = "Pronomes e Colocação",
            difficulty = Difficulty.FACIL,
            questionText = "Segundo a norma culta, assinale a frase com colocação pronominal INCORRETA:",
            options = listOf(
                "Me informaram que a lista de admitidos já foi publicada.",
                "Não me informaram sobre o horário da prova de admissão.",
                "Informaram-me de que a lista de admitidos foi publicada.",
                "Quando me informaram a notícia, fiquei muito emocionado."
            ),
            correctIndex = 0,
            explanation = "Na norma culta gramatical, nunca se deve iniciar uma frase com pronome oblíquo átono (próclise proibida no início absoluto da oração).",
            teacherHint = "Início de frase exige ênclise: 'Informaram-me', nunca 'Me informaram'."
        ),
        Question(
            id = "P09",
            subject = Subject.PORTUGUES,
            topic = "Pronomes e Colocação",
            difficulty = Difficulty.MEDIO,
            questionText = "Assinale a opção em que a próclise é OBRIGATÓRIA devido à presença de palavra atrativa negativa:",
            options = listOf(
                "Jamais te esquecerei dos conselhos dados pelos teus pais.",
                "Esquecer-te-ei jamais dos conselhos dados pelos teus pais.",
                "Jamais esquecerei-te dos conselhos dados pelos teus pais.",
                "Te jamais esquecerei dos teus nobres conselhos."
            ),
            correctIndex = 0,
            explanation = "Palavras de sentido negativo ('não', 'jamais', 'nunca') são forças atrativas que exigem o pronome antes do verbo (próclise obrigatória: 'Jamais te esquecerei').",
            teacherHint = "Palavras negativas atraem o pronome oblíquo para antes do verbo."
        ),
        Question(
            id = "P10",
            subject = Subject.PORTUGUES,
            topic = "Pronomes e Colocação",
            difficulty = Difficulty.DIFICIL,
            questionText = "Com o verbo no futuro do presente ('realizará') no início de uma oração sem palavra atrativa, a colocação exigida é a:",
            options = listOf(
                "Mesóclise (Realizar-se-á o exame amanhã)",
                "Próclise (Se realizará o exame amanhã)",
                "Ênclise (Realizará-se o exame amanhã)",
                "Apócope (Realizar o exame amanhã)"
            ),
            correctIndex = 0,
            explanation = "Com verbos no futuro (do presente ou do pretérito) sem elementos atrativos, a norma-padrão exige mesóclise ('Realizar-se-á', 'Far-se-ia').",
            teacherHint = "Verbo no futuro sem fator de atração pede pronome no meio do verbo."
        ),
        Question(
            id = "P11",
            subject = Subject.PORTUGUES,
            topic = "Pronomes e Colocação",
            difficulty = Difficulty.MEDIO,
            questionText = "Substituindo o complemento direto na oração 'O reitor assinou o termo de posse', a forma correta é:",
            options = listOf(
                "O reitor assinou-o.",
                "O reitor assinou-lhe.",
                "O reitor assinou-lo.",
                "O reitor assinou-no."
            ),
            correctIndex = 0,
            explanation = "O verbo 'assinar' é transitivo direto e termina em vogal ('assinou'). O complemento direto de 3ª pessoa do masculino singular é 'o' ('assinou-o').",
            teacherHint = "'Lhe' substitui complemento indireto; para complemento direto usa-se 'o/a'."
        ),
        Question(
            id = "P12",
            subject = Subject.PORTUGUES,
            topic = "Pronomes e Colocação",
            difficulty = Difficulty.FACIL,
            questionText = "Em 'Os candidatos fizeram os testes com rigor', substituindo o objeto direto por pronome pessoal:",
            options = listOf(
                "Os candidatos fizeram-nos com rigor.",
                "Os candidatos fizeram-os com rigor.",
                "Os candidatos fizeram-lhes com rigor.",
                "Os candidatos fizeram-los com rigor."
            ),
            correctIndex = 0,
            explanation = "Quando o verbo transitivo direto termina em som nasal (-m, -ão, -õe), os pronomes 'o, a, os, as' transformam-se em 'no, na, nos, nas' ('fizeram-nos').",
            teacherHint = "Verbo terminado em som nasal (-m) transforma 'os' em 'nos'."
        ),
        Question(
            id = "P13",
            subject = Subject.PORTUGUES,
            topic = "Pronomes e Colocação",
            difficulty = Difficulty.MEDIO,
            questionText = "O pronome relativo 'cujo' (e suas flexões) deve ser empregado para:",
            options = listOf(
                "Indicar posse entre dois substantivos, concordando com a coisa possuída e nunca aceitando artigo depois dele",
                "Indicar lugar fixo em substituição à palavra 'onde'",
                "Introduzir orações adverbiais temporais no passado",
                "Acompanhar sempre o artigo definido ('cujo o livro')"
            ),
            correctIndex = 0,
            explanation = "'Cujo' estabelece relação de posse ('O candidato cuja nota foi excelente'). É erro crasso colocar artigo após 'cujo' (como 'cujo o').",
            teacherHint = "Expressa posse e nunca deve ser seguido de artigo (cujo pai, não cujo o pai)."
        ),

        // --- REGÊNCIA VERBAL, NOMINAL & CRASE ---
        Question(
            id = "P14",
            subject = Subject.PORTUGUES,
            topic = "Regência Verbal e Crase",
            difficulty = Difficulty.FACIL,
            questionText = "O verbo 'aspirar' com o sentido de 'almejar / desejar uma vaga na universidade' rege a preposição:",
            options = listOf(
                "A (aspirar a uma vaga)",
                "De (aspirar de uma vaga)",
                "Por (aspirar por uma vaga)",
                "Em (aspirar em uma vaga)"
            ),
            correctIndex = 0,
            explanation = "No sentido de ambicionar ou ter como meta, 'aspirar' é transitivo indireto e rege a preposição 'a'. No sentido de inalar perfume ou ar, é transitivo direto.",
            teacherHint = "Diferente de aspirar poeira; quando expressa pretensão exige preposição 'a'."
        ),
        Question(
            id = "P15",
            subject = Subject.PORTUGUES,
            topic = "Regência Verbal e Crase",
            difficulty = Difficulty.MEDIO,
            questionText = "O verbo 'assistir' com o sentido de 'presenciar / ver a aula' é transitivo indireto e rege a preposição:",
            options = listOf(
                "A (assistir à aula)",
                "Com (assistir com a aula)",
                "Em (assistir na aula)",
                "De (assistir da aula)"
            ),
            correctIndex = 0,
            explanation = "No sentido de presenciar ou contemplar, 'assistir' pede a preposição 'a' ('assistir ao debate', 'assistir à palestra'). No sentido de socorrer, pode ser transitivo direto.",
            teacherHint = "Assistir a um filme, assistir a uma cerimónia (sempre com 'a')."
        ),
        Question(
            id = "P16",
            subject = Subject.PORTUGUES,
            topic = "Regência Verbal e Crase",
            difficulty = Difficulty.FACIL,
            questionText = "Assinale a frase em que o uso do acento grave indicador de crase é OBRIGATÓRIO:",
            options = listOf(
                "Os estudantes dirigiram-se à biblioteca central.",
                "Eles começaram a estudar muito cedo para a prova.",
                "O candidato prestou auxílio a uma colega da sala.",
                "Entregou o documento a ele com deferência."
            ),
            correctIndex = 0,
            explanation = "O verbo 'dirigir-se' pede a preposição 'a' (dirigir-se a algum lugar) e 'biblioteca' é palavra feminina com artigo 'a'. A fusão resulta em crase ('à biblioteca'). Não há crase antes de verbo, pronome pessoal ou pronome indefinido.",
            teacherHint = "Verbo que rege preposição 'a' diante de substantivo feminino acompanhado de artigo."
        ),
        Question(
            id = "P17",
            subject = Subject.PORTUGUES,
            topic = "Regência Verbal e Crase",
            difficulty = Difficulty.MEDIO,
            questionText = "Indique a oração em que o acento de crase foi empregado de forma INCORRETA:",
            options = listOf(
                "O professor falou à respeito das notas de admissão.",
                "Referiu-se à professora com muito apreço.",
                "Chegámos às duas horas da tarde para o teste.",
                "Fomos à praia de Bilene no fim de semana."
            ),
            correctIndex = 0,
            explanation = "'Respeito' é uma palavra masculina. Não ocorre crase antes de palavras masculinas, salvo em locuções ocultas como 'à moda de'. O correto é 'a respeito'.",
            teacherHint = "Nunca ocorre crase antes de palavra masculina ('a pé', 'a cavalo', 'a respeito')."
        ),
        Question(
            id = "P18",
            subject = Subject.PORTUGUES,
            topic = "Regência Verbal e Crase",
            difficulty = Difficulty.DIFICIL,
            questionText = "O verbo 'preferir' obedece à seguinte regência na norma-padrão:",
            options = listOf(
                "Prefiro estudar História a fazer uma pausa desnecessária.",
                "Prefiro mais estudar História do que fazer uma pausa.",
                "Prefiro mil vezes História do que Geografia.",
                "Prefiro antes Português do que qualquer outra disciplina."
            ),
            correctIndex = 0,
            explanation = "O verbo 'preferir' rejeita termos intensificadores ('mais', 'antes', 'mil vezes') e não admite a locução 'do que'. A regência padrão é 'preferir X a Y'.",
            teacherHint = "Prefere-se uma coisa A outra coisa (nunca use 'do que')."
        ),
        Question(
            id = "P19",
            subject = Subject.PORTUGUES,
            topic = "Regência Verbal e Crase",
            difficulty = Difficulty.MEDIO,
            questionText = "O verbo 'obedecer' e o seu antónimo 'desobedecer' são transitivos indiretos e regem a preposição:",
            options = listOf(
                "A (obedecer às regras do exame)",
                "De (obedecer das regras do exame)",
                "Com (obedecer com as regras)",
                "Para (obedecer para as leis)"
            ),
            correctIndex = 0,
            explanation = "Na norma culta, obedece-se 'a' alguém ou 'a' alguma norma, exigindo preposição 'a' ('obedecer ao regulamento', 'obedecer às normas').",
            teacherHint = "Quem obedece, obedece A alguma coisa ou A alguém."
        ),
        Question(
            id = "P20",
            subject = Subject.PORTUGUES,
            topic = "Regência Verbal e Crase",
            difficulty = Difficulty.FACIL,
            questionText = "Nas locuções adverbiais femininas indicando hora exata ('às 8 horas', 'às 14 horas'), o acento grave de crase é:",
            options = listOf(
                "Obrigatório",
                "Proibido",
                "Facultativo apenas à noite",
                "Usado apenas em orações interrogativas"
            ),
            correctIndex = 0,
            explanation = "Locuções adverbiais femininas indicativas de horas determinadas recebem obrigatoriamente o acento grave indicador de crase ('A prova começa às 8h').",
            teacherHint = "Indicação de horas exatas recebe sempre crase obrigatória."
        ),

        // --- SINTAXE DO PERÍODO & ORAÇÕES ---
        Question(
            id = "P21",
            subject = Subject.PORTUGUES,
            topic = "Sintaxe do Período",
            difficulty = Difficulty.MEDIO,
            questionText = "Na oração: 'O candidato estudou com afinco, no entanto não obteve a classificação desejada', a conjunção sublinhada introduz uma oração coordenada:",
            options = listOf(
                "Adversativa",
                "Conclusiva",
                "Explicativa",
                "Aditiva"
            ),
            correctIndex = 0,
            explanation = "Conjunções como 'no entanto', 'porém', 'todavia' e 'contudo' exprimem oposição ou contraste, classificando a oração como coordenada sindética adversativa.",
            teacherHint = "Expressa ideia de oposição ou contraste em relação à oração anterior."
        ),
        Question(
            id = "P22",
            subject = Subject.PORTUGUES,
            topic = "Sintaxe do Período",
            difficulty = Difficulty.DIFICIL,
            questionText = "Na frase: 'Embora a prova de admissão fosse exigente, o estudante concluiu todas as questões', a oração introduzida por 'embora' classifica-se como:",
            options = listOf(
                "Subordinada adverbial concessiva",
                "Subordinada adverbial causal",
                "Subordinada adverbial consecutiva",
                "Subordinada substantiva completiva"
            ),
            correctIndex = 0,
            explanation = "'Embora' é a conjunção concessiva por excelência, introduzindo uma circunstância que contraria a oração principal sem impedir a sua realização.",
            teacherHint = "Ideia de concessão (apesar de, ainda que, se bem que)."
        ),
        Question(
            id = "P23",
            subject = Subject.PORTUGUES,
            topic = "Sintaxe do Período",
            difficulty = Difficulty.MEDIO,
            questionText = "Em 'O professor explicou que a matéria seria cobrada no exame', a oração subordinada 'que a matéria seria cobrada no exame' desempenha a função sintática de:",
            options = listOf(
                "Objeto direto (oração subordinada substantiva objetiva direta)",
                "Sujeito (oração subordinada substantiva subjetiva)",
                "Adjunto adnominal",
                "Predicativo do sujeito"
            ),
            correctIndex = 0,
            explanation = "Quem explica, explica algo. A oração introduzida pela conjunção integrante 'que' funciona como objeto direto do verbo transitivo direto 'explicou'.",
            teacherHint = "Substitua a oração inteira por 'isso': O professor explicou isso (objeto direto)."
        ),
        Question(
            id = "P24",
            subject = Subject.PORTUGUES,
            topic = "Sintaxe do Período",
            difficulty = Difficulty.FACIL,
            questionText = "Nas orações coordenadas conclusivas, uma das conjunções típicas empregadas para exprimir dedução é:",
            options = listOf(
                "Portanto",
                "Porque",
                "Embora",
                "Caso"
            ),
            correctIndex = 0,
            explanation = "'Portanto', 'logo', 'por conseguinte' e 'assim' são conjunções coordenativas conclusivas que expressam dedução lógica.",
            teacherHint = "Indica conclusão: 'Penso, logo existo'."
        ),
        Question(
            id = "P25",
            subject = Subject.PORTUGUES,
            topic = "Sintaxe do Período",
            difficulty = Difficulty.DIFICIL,
            questionText = "Na oração: 'Ele estudou tanto durante o ano que obteve a primeira posição no curso', a relação sintática estabelecida pela conjunção 'que' é de:",
            options = listOf(
                "Consequência (oração subordinada adverbial consecutiva)",
                "Causa (oração subordinada causal)",
                "Conformidade (oração subordinada conformativa)",
                "Condição (oração subordinada condicional)"
            ),
            correctIndex = 0,
            explanation = "A estrutura correlativa 'tanto... que' introduz uma oração subordinada adverbial consecutiva, expressando a consequência de uma intensidade prévia.",
            teacherHint = "'Tanto... que', 'tão... que' indicam consequência ou resultado."
        ),
        Question(
            id = "P26",
            subject = Subject.PORTUGUES,
            topic = "Sintaxe do Período",
            difficulty = Difficulty.FACIL,
            questionText = "Uma oração subordinada adjetiva que se encontra isolada por vírgulas e acrescenta uma informação explicativa sobre o antecedente é classificada como:",
            options = listOf(
                "Explicativa",
                "Restritiva",
                "Completiva",
                "Final"
            ),
            correctIndex = 0,
            explanation = "As orações subordinadas adjetivas explicativas vêm sempre entre vírgulas, generalizando ou elucidando uma característica do substantivo antecedente.",
            teacherHint = "Vem entre vírgulas e explica o termo sem delimitar o seu universo."
        ),

        // --- FIGURAS DE ESTILO & RECURSOS EXPRESSIVOS ---
        Question(
            id = "P27",
            subject = Subject.PORTUGUES,
            topic = "Figuras de Estilo",
            difficulty = Difficulty.FACIL,
            questionText = "Na frase 'Aquele candidato faltou com a verdade durante a entrevista', temos a figura de estilo denominada:",
            options = listOf(
                "Eufemismo",
                "Hipérbole",
                "Metáfora",
                "Pleonasmo"
            ),
            correctIndex = 0,
            explanation = "O eufemismo é a figura de estilo empregada para suavizar uma expressão desagradável ou pesada ('faltou com a verdade' em vez de 'mentiu').",
            teacherHint = "Suavização intencional de uma ideia dura ou chocante."
        ),
        Question(
            id = "P28",
            subject = Subject.PORTUGUES,
            topic = "Figuras de Estilo",
            difficulty = Difficulty.FACIL,
            questionText = "A frase 'Já chorei rios de lágrimas à espera dos resultados do exame' contém um exagero intencional conhecido como:",
            options = listOf(
                "Hipérbole",
                "Ironia",
                "Prosopopeia",
                "Metonímia"
            ),
            correctIndex = 0,
            explanation = "A hipérbole consiste no exagero deliberado e enfático para intensificar uma ideia ou sentimento ('chorar rios de lágrimas').",
            teacherHint = "Exagero poético e expressivo da realidade."
        ),
        Question(
            id = "P29",
            subject = Subject.PORTUGUES,
            topic = "Figuras de Estilo",
            difficulty = Difficulty.MEDIO,
            questionText = "Na oração 'Li Mia Couto com muito entusiasmo durante a noite', a figura de estilo presente é a:",
            options = listOf(
                "Metonímia (autor pela obra)",
                "Catacrese",
                "Antítese",
                "Prosopopeia"
            ),
            correctIndex = 0,
            explanation = "Trata-se de metonímia ao substituir o efeito pela causa, ou neste caso específico, a obra ('os livros de Mia Couto') pelo nome do autor ('Mia Couto').",
            teacherHint = "Substituição do termo livro/obra pelo nome do seu autor."
        ),
        Question(
            id = "P30",
            subject = Subject.PORTUGUES,
            topic = "Figuras de Estilo",
            difficulty = Difficulty.MEDIO,
            questionText = "No verso de Camões 'Amor é fogo que arde sem se ver / É ferida que dói e não se sente', a aproximação de termos com sentidos opostos que geram uma contradição lógica constitui um:",
            options = listOf(
                "Paradoxo (ou Oxímoro)",
                "Eufemismo",
                "Pleonasmo vicioso",
                "Anacoluto"
            ),
            correctIndex = 0,
            explanation = "O paradoxo reúne ideias contraditórias que parecem anular-se reciprocamente ('arder sem se ver', 'doer e não se sentir'), criando um sentido profundo.",
            teacherHint = "Contradição que transcende a lógica convencional (diferente da mera antítese)."
        ),
        Question(
            id = "P31",
            subject = Subject.PORTUGUES,
            topic = "Figuras de Estilo",
            difficulty = Difficulty.FACIL,
            questionText = "Atribuir características ou sentimentos humanos a seres inanimados ou irracionais (como 'A brisa da baía sussurrava esperança') é denominado:",
            options = listOf(
                "Personificação (ou Prosopopeia)",
                "Antítese",
                "Sinestesia",
                "Elipse"
            ),
            correctIndex = 0,
            explanation = "A personificação ou prosopopeia humaniza seres inanimados ou animais, atribuindo-lhes linguagem, vontade ou sensações próprias de pessoas.",
            teacherHint = "Tornar uma coisa personificada com atributos humanos."
        ),
        Question(
            id = "P32",
            subject = Subject.PORTUGUES,
            topic = "Figuras de Estilo",
            difficulty = Difficulty.DIFICIL,
            questionText = "A figura de estilo que mistura sensações percebidas por órgãos dos sentidos distintos (como 'sentiu um perfume doce e aveludado') denomina-se:",
            options = listOf(
                "Sinestesia",
                "Assonância",
                "Aliteração",
                "Zeugma"
            ),
            correctIndex = 0,
            explanation = "A sinestesia é a fusão expressiva de diferentes planos sensoriais (olfato + paladar + tato: 'perfume doce e aveludado').",
            teacherHint = "Cruzamento de sentidos humanos diferentes na mesma imagem poética."
        ),

        // --- LITERATURA MOÇAMBICANA & TIPOLOGIA TEXTUAL ---
        Question(
            id = "P33",
            subject = Subject.PORTUGUES,
            topic = "Literatura Moçambicana",
            difficulty = Difficulty.FACIL,
            questionText = "Qual autor moçambicano escreveu as consagradas obras 'Terra Sonâmbula' e 'Vozes Anoitecidas'?",
            options = listOf(
                "Mia Couto",
                "José Craveirinha",
                "Luís Bernardo Honwana",
                "Paulina Chiziane"
            ),
            correctIndex = 0,
            explanation = "Mia Couto é o autor de 'Terra Sonâmbula' (eleito um dos 12 melhores romances africanos do século XX) e 'Vozes Anoitecidas', famoso pela recriação poética da língua.",
            teacherHint = "Escritor e biólogo moçambicano laureado com o Prémio Camões em 2013."
        ),
        Question(
            id = "P34",
            subject = Subject.PORTUGUES,
            topic = "Literatura Moçambicana",
            difficulty = Difficulty.FACIL,
            questionText = "A escritora moçambicana Paulina Chiziane, primeira mulher africana a vencer o Prémio Camões, escreveu o famoso romance:",
            options = listOf(
                "Niketche: Uma História de Poligamia",
                "Ualalapi",
                "Xigubo",
                "Nós Matámos o Cão-Tinhoso"
            ),
            correctIndex = 0,
            explanation = "'Niketche: Uma História de Poligamia' (2002) é a célebre obra de Paulina Chiziane que retrata a vida de Rami e as multifacetadas tradições maritais de Moçambique.",
            teacherHint = "Obra cujo título se inspira numa dança tradicional de celebração feminina."
        ),
        Question(
            id = "P35",
            subject = Subject.PORTUGUES,
            topic = "Literatura Moçambicana",
            difficulty = Difficulty.MEDIO,
            questionText = "O maior poeta de Moçambique, primeiro autor africano a vencer o Prémio Camões em 1991, autor de 'Karingana ua Karingana' e 'Xigubo', foi:",
            options = listOf(
                "José Craveirinha",
                "Rui de Noronha",
                "Kalungano (Marcelino dos Santos)",
                "Noémia de Sousa"
            ),
            correctIndex = 0,
            explanation = "José Craveirinha (1922-2003) é aclamado como o poeta-maior de Moçambique, autor das obras monumentais 'Xigubo', 'Karingana ua Karingana' e 'Cela 1'.",
            teacherHint = "Poeta histórico de Mafalala e galardoado com o Prémio Camões."
        ),
        Question(
            id = "P36",
            subject = Subject.PORTUGUES,
            topic = "Literatura Moçambicana",
            difficulty = Difficulty.MEDIO,
            questionText = "O romance histórico 'Ualalapi', que desmistifica e recria com grande fulgor narrativo o reinado de Ngungunhane em Gaza, foi escrito por:",
            options = listOf(
                "Ungulani Ba Ka Khosa",
                "Luís Bernardo Honwana",
                "Orlando Mendes",
                "Albino Magaia"
            ),
            correctIndex = 0,
            explanation = "Ungulani Ba Ka Khosa escreveu 'Ualalapi' (1987), consagrado como um dos romances mais influentes da ficção pós-independência em Moçambique.",
            teacherHint = "Autor moçambicano célebre pela sua prosa poética e histórica vigorosa."
        ),
        Question(
            id = "P37",
            subject = Subject.PORTUGUES,
            topic = "Literatura Moçambicana",
            difficulty = Difficulty.FACIL,
            questionText = "Noémia de Sousa, frequentemente aclamada como a 'Mãe dos Poetas Moçambicanos', reuniu os seus versos de denúncia e negritude na obra:",
            options = listOf(
                "Sangue Negro",
                "Voz de Pranto",
                "Portagem",
                "Silêncio Escancarado"
            ),
            correctIndex = 0,
            explanation = "Noémia de Sousa expressou a revolta e a identidade africana nos anos 40 e 50, coligida no volume seminal intitulado 'Sangue Negro'.",
            teacherHint = "Coletânea poética que exalta a dignidade do povo negro e de Moçambique."
        ),
        Question(
            id = "P38",
            subject = Subject.PORTUGUES,
            topic = "Interpretação e Tipologia Textual",
            difficulty = Difficulty.MEDIO,
            questionText = "O texto expositivo-explicativo, muito frequente nos manuais escolares e exames de admissão, tem como objetivo principal:",
            options = listOf(
                "Transmitir conhecimentos de forma clara, objetiva e estruturada a quem os desconhece",
                "Narrar acontecimentos fictícios protagonizados por heróis lendários",
                "Defender uma tese política atacando os adversários de modo subjetivo",
                "Descrever impressões estéticas e sensações íntimas do autor"
            ),
            correctIndex = 0,
            explanation = "O texto expositivo-explicativo pretende fazer compreender um fenómeno ou conceito científico de forma neutra, com clareza e rigor terminológico.",
            teacherHint = "Objetivo de informar e esclarecer objetivamente o leitor."
        ),
        Question(
            id = "P39",
            subject = Subject.PORTUGUES,
            topic = "Interpretação e Tipologia Textual",
            difficulty = Difficulty.MEDIO,
            questionText = "Num texto argumentativo, os elementos estruturais essenciais organizam-se tipicamente em:",
            options = listOf(
                "Tese, Argumentos de suporte e Conclusão / Síntese",
                "Introdução narrativa, Clímax e Desfecho ficcional",
                "Versos, Estrofes e Rimas emparelhadas",
                "Data, Saudação e Assinatura epistolar"
            ),
            correctIndex = 0,
            explanation = "O texto argumentativo visa persuadir o destinatário defendendo uma tese fundamentada em argumentos lógicos, refutações e conclusão conclusiva.",
            teacherHint = "Estrutura clássica de convencimento baseada em ideias e provas."
        ),
        Question(
            id = "P40",
            subject = Subject.PORTUGUES,
            topic = "Interpretação e Tipologia Textual",
            difficulty = Difficulty.FACIL,
            questionText = "Quando a linguagem se concentra no próprio código linguístico para explicar ou definir o significado das palavras (como num dicionário ou gramática), predomina a função:",
            options = listOf(
                "Metalinguística",
                "Emotiva ou Expressiva",
                "Conativa ou Apelativa",
                "Fática"
            ),
            correctIndex = 0,
            explanation = "A função metalinguística ocorre quando a linguagem fala da própria linguagem ('o código explicando o código').",
            teacherHint = "Uso da língua para analisar e definir as regras da própria língua."
        )
    )

    /**
     * Banco completo e unificado:
     * - Preserva todas as 80 questões originais de aprendizagem (H01..H40 e P01..P40)
     * - Integra as 100 questões oficiais canónicas dos exames UEM (50 de História e 50 de Português)
     */
    val allQuestions: List<Question> = initialStudyQuestions + OfficialQuestionsBank.allOfficialQuestions


    fun getQuestionsBySubject(subject: Subject): List<Question> {
        return allQuestions.filter { it.subject == subject }
    }

    fun matchesTopic(q: Question, topic: String): Boolean {
        val qTopic = q.topic.lowercase().trim()
        val qSub = q.subtopic.lowercase().trim()
        val qText = q.questionText.lowercase().trim()
        val target = topic.lowercase().trim()

        if (qTopic == target || target.contains(qTopic) || qTopic.contains(target)) return true
        if (qSub.isNotEmpty() && (qSub.contains(target) || target.contains(qSub))) return true

        return when {
            target.contains("bantu") || target.contains("comunidades primitivas") -> {
                (qTopic.contains("estados pré-coloniais") && 
                (qSub.contains("bantu") || qSub.contains("ferro") || qSub.contains("pedra") || qSub.contains("cosmovisão") || 
                 qText.contains("bantu") || qText.contains("ferro") || qText.contains("khoisan") || qText.contains("caçadores"))) ||
                qTopic.contains("metodologia") || qTopic.contains("povoamento bantu")
            }
            target.contains("mutapa") || target.contains("marave") || target.contains("zimbabu") -> {
                qTopic.contains("estados pré-coloniais") || 
                qSub.contains("mutapa") || qSub.contains("marave") || qSub.contains("curva") || qSub.contains("zimbabu") ||
                qText.contains("mutapa") || qText.contains("marave") || qText.contains("curva") || qText.contains("monomotapa") || qText.contains("makewana")
            }
            target.contains("penetração mercantil") || target.contains("mercantil") -> {
                qTopic.contains("penetração mercantil") || 
                qSub.contains("ouro") || qSub.contains("marfim") || qSub.contains("escravos") || qSub.contains("mazanes") ||
                qText.contains("ouro") || qText.contains("marfim") || qText.contains("tráfico") || qText.contains("mazanes") || qText.contains("feitoria")
            }
            target.contains("prazos") || target.contains("estados militares") -> {
                qTopic.contains("prazos") || qSub.contains("prazo") || qSub.contains("chicunda") || qSub.contains("aringa") || qSub.contains("mussoco") || qSub.contains("macanga") || qSub.contains("estados militares") ||
                qText.contains("prazo") || qText.contains("chicunda") || qText.contains("aringa") || qText.contains("mussoco") || qText.contains("macanga")
            }
            target.contains("gaza") || target.contains("mfecane") -> {
                qTopic.contains("gaza") || qSub.contains("gaza") || qSub.contains("mfecane") || qSub.contains("mabutho") || qSub.contains("mandlakazi") || qSub.contains("ngungunhane") ||
                qText.contains("gaza") || qText.contains("sochangane") || qText.contains("manicusse") || qText.contains("mabutho") || qText.contains("ngungunhane") || qText.contains("mzila")
            }
            target.contains("partilha") || target.contains("resistência") -> {
                qTopic.contains("resistência colonial") || qSub.contains("berlim") || qSub.contains("marracuene") || qSub.contains("chaimite") || qSub.contains("báruè") || qSub.contains("angoche") || qSub.contains("macontene") ||
                qText.contains("marracuene") || qText.contains("chaimite") || qText.contains("báruè") || qText.contains("angoche") || qText.contains("maguiguana") || qText.contains("gwaza")
            }
            target.contains("sistema colonial") || target.contains("exploração laboral") || target.contains("colonialismo") -> {
                qTopic.contains("sistema colonial") || qTopic.contains("colonialismo") || 
                qSub.contains("chibalo") || qSub.contains("wenela") || qSub.contains("acto colonial") || qSub.contains("algodão") || qSub.contains("indigenato") || qSub.contains("companhias") ||
                qText.contains("chibalo") || qText.contains("wenela") || qText.contains("acto colonial") || qText.contains("algodão") || qText.contains("indígenas") || qText.contains("salazar")
            }
            target.contains("nacionalismo") || target.contains("libertação") || target.contains("luta armada") || target.contains("frelimo") -> {
                qTopic.contains("luta armada") || qTopic.contains("nacionalismo") || qTopic.contains("libertação") ||
                qSub.contains("mueda") || qSub.contains("frelimo") || qSub.contains("mondlane") || qSub.contains("chai") || qSub.contains("brado africano") || qSub.contains("matchedje") ||
                qText.contains("frelimo") || qText.contains("mondlane") || qText.contains("mueda") || qText.contains("chai") || qText.contains("brado africano") || qText.contains("zonas libertadas")
            }
            target.contains("independência") || target.contains("contemporâneo") -> {
                qTopic.contains("independência") || qTopic.contains("pós-independência") ||
                qSub.contains("lusaka") || qSub.contains("machava") || qSub.contains("mbuzini") || qSub.contains("roma") || qSub.contains("nkomati") || qSub.contains("1990") ||
                qText.contains("lusaka") || qText.contains("machava") || qText.contains("samora") || qText.contains("mbuzini") || qText.contains("roma") || qText.contains("nkomati")
            }
            target.contains("áfrica") || target.contains("internacional") || target.contains("geral") -> {
                qTopic.contains("áfrica") || qTopic.contains("história geral") ||
                qSub.contains("bandung") || qSub.contains("oua") || qSub.contains("não-alinhamento") ||
                qText.contains("bandung") || qText.contains("oua") || qText.contains("apartheid") || qText.contains("linha da frente")
            }
            else -> false
        }
    }

    fun getQuestionsByTopic(topic: String): List<Question> {
        val matches = allQuestions.filter { matchesTopic(it, topic) }
        return if (matches.isNotEmpty()) matches else allQuestions.filter { it.topic.contains(topic, ignoreCase = true) }
    }

    /**
     * Retorna exatamente 40 questões para o Simulado de Exame de Admissão:
     * - 20 questões de História
     * - 20 questões de Português
     * - Distribuição equilibrada entre Fácil, Médio e Difícil
     */
    fun getSimuladoQuestions(count: Int = 40): List<Question> {
        val half = count / 2 // 20

        fun getBalancedSubset(subject: Subject, targetCount: Int): List<Question> {
            val officialPool = allQuestions.filter { it.subject == subject && it.questionType == QuestionType.OFICIAL }
            val pool = if (officialPool.size >= targetCount) officialPool else allQuestions.filter { it.subject == subject }
            val facil = pool.filter { it.difficulty == Difficulty.FACIL }.shuffled()
            val medio = pool.filter { it.difficulty == Difficulty.MEDIO }.shuffled()
            val dificil = pool.filter { it.difficulty == Difficulty.DIFICIL }.shuffled()

            // Proporção ideal para 20: 7 Fácil, 8 Médio, 5 Difícil
            val nFacil = (targetCount * 0.35).toInt().coerceAtLeast(1)
            val nMedio = (targetCount * 0.40).toInt().coerceAtLeast(1)
            val nDificil = (targetCount - nFacil - nMedio).coerceAtLeast(1)

            val result = mutableListOf<Question>()
            result.addAll(facil.take(nFacil))
            result.addAll(medio.take(nMedio))
            result.addAll(dificil.take(nDificil))

            // Se ainda faltar para completar targetCount, completa do pool restante
            if (result.size < targetCount) {
                val remaining = pool.filterNot { result.contains(it) }.shuffled()
                result.addAll(remaining.take(targetCount - result.size))
            }
            return result.take(targetCount)
        }

        val historiaSet = getBalancedSubset(Subject.HISTORIA, half)
        val portuguesSet = getBalancedSubset(Subject.PORTUGUES, count - half)

        return (historiaSet + portuguesSet).shuffled()
    }

    /**
     * Retorna exatamente 40 questões EXCLUSIVAS da disciplina selecionada para o Simulado Oficial:
     * - Disciplina única (40 questões de Português OU 40 questões de História)
     * - Distribuição equilibrada entre Fácil, Médio e Difícil
     */
    /**
     * Retorna exatamente 40 questões EXCLUSIVAS da disciplina selecionada para o Simulado Oficial:
     * - Disciplina única (40 questões de Português OU 40 questões de História)
     * - PRIORIDADE ABSOLUTA: Seleciona PRIMEIRO as questões OFICIAIS dos exames UEM
     * - Cada tentativa seleciona aleatoriamente diferentes questões oficiais para evitar repetições
     * - NÃO usa questões de aprendizagem no Simulado enquanto houver questões oficiais UEM disponíveis
     */
    fun getSimuladoQuestionsBySubject(subject: Subject, count: Int = 40): List<Question> {
        val officialPool = allQuestions.filter { 
            it.subject == subject && it.questionType == QuestionType.OFICIAL 
        }

        if (officialPool.size >= count) {
            // Seleciona 40 questões oficiais distintas da disciplina escolhida
            return officialPool.shuffled().take(count)
        }

        // Fallback defensivo apenas se o banco oficial de uma disciplina futura contiver menos de 40 questões
        val result = mutableListOf<Question>()
        result.addAll(officialPool.shuffled())

        val otherPool = allQuestions.filter { 
            it.subject == subject && it.questionType != QuestionType.OFICIAL 
        }.shuffled()
        result.addAll(otherPool.take(count - result.size))

        var fallbackIdx = 0
        while (result.size < count && allQuestions.any { it.subject == subject }) {
            val base = officialPool.getOrElse(fallbackIdx % officialPool.size.coerceAtLeast(1)) {
                allQuestions.first { it.subject == subject }
            }
            result.add(base.copy(id = "${base.id}_sim_${result.size}"))
            fallbackIdx++
        }

        return result.take(count).shuffled()
    }


    /**
     * Retorna exatamente count questões (15 para Teste Rápido ou 30 para Treino)
     * priorizando estritamente o tema selecionado, destacando questões oficiais UEM
     * e complementando pedagogicamente com questões de fixação.
     */
    fun getTopicTrainingQuestions(subject: Subject, topic: String, count: Int): List<Question> {
        val subjectPool = allQuestions.filter { it.subject == subject }
        val exactMatches = subjectPool.filter { it.topic.equals(topic, ignoreCase = true) }
        val pool = if (exactMatches.isNotEmpty()) {
            exactMatches
        } else {
            val matchingTopic = subjectPool.filter { matchesTopic(it, topic) }
            if (matchingTopic.isNotEmpty()) matchingTopic else subjectPool
        }

        // Separa questões oficiais das de aprendizagem para ordenação e transparência
        val officialInPool = pool.filter { it.questionType == QuestionType.OFICIAL }.shuffled()
        val learningInPool = pool.filter { it.questionType != QuestionType.OFICIAL }.shuffled()

        val list = mutableListOf<Question>()
        // Prioridade às questões oficiais dos exames UEM
        list.addAll(officialInPool)
        list.addAll(learningInPool)

        // Se o tema tiver menos perguntas únicas que o count solicitado (15 ou 30),
        // complementa repetindo itens do próprio tema com IDs sufixados,
        // preservando rigorosamente o tipo (OFICIAL vs APRENDIZAGEM) e a fonte autêntica
        var fallbackIndex = 0
        while (list.size < count && pool.isNotEmpty()) {
            val baseQ = pool[fallbackIndex % pool.size]
            list.add(baseQ.copy(id = "${baseQ.id}_rep_${list.size}"))
            fallbackIndex++
        }

        // Organiza pedagogicamente: começa com fáceis/médias e progride para difíceis
        val sortedAdaptively = list.take(count).sortedBy { q ->
            when (q.difficulty) {
                Difficulty.FACIL -> 0
                Difficulty.MEDIO -> 1
                Difficulty.DIFICIL -> 2
            }
        }

        return sortedAdaptively
    }

    fun getDailyChallengeQuestions(): List<Question> {
        return allQuestions.shuffled().take(10)
    }

    fun getGameQuestionLadder(): List<Question> {
        val facil = allQuestions.filter { it.difficulty == Difficulty.FACIL }.shuffled()
        val medio = allQuestions.filter { it.difficulty == Difficulty.MEDIO }.shuffled()
        val dificil = allQuestions.filter { it.difficulty == Difficulty.DIFICIL }.shuffled()

        val list = mutableListOf<Question>()
        list.addAll(facil.take(3))
        list.addAll(medio.take(4))
        list.addAll(dificil.take(3))

        if (list.size < 10) {
            val remain = allQuestions.filterNot { list.contains(it) }.shuffled()
            list.addAll(remain.take(10 - list.size))
        }
        return list
    }
}
