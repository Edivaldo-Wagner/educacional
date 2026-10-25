package com.example.data

import com.example.model.FigureDateItem
import com.example.model.ReviewQuestion
import com.example.model.StudyModule
import com.example.model.Subject

/**
 * Banco Central de Conteúdos Pedagógicos de Estudo da UEM.
 * 
 * Organização ampliada dos temas e subtemas de História de Moçambique e Geral,
 * construída com base nos cadernos oficiais de exames de admissão (2005-2025)
 * e nos programas curriculares do ensino secundário e pré-universitário moçambicano.
 */
object StudyContentBank {

    val historiaModules: List<StudyModule> = listOf(
        // =========================================================================
        // MÓDULO 1: COMUNIDADES PRIMITIVAS E POVOAMENTO BANTU
        // =========================================================================
        StudyModule(
            id = "H_MOD_1",
            subject = Subject.HISTORIA,
            title = "Povoamento Bantu e Comunidades Primitivas",
            subtitle = "Das comunidades caçadoras-recoletoras à expansão e sedentarização Bantu",
            topicTag = "Estados Pré-Coloniais",
            summary = """
                Antes das grandes vagas migratórias Bantu, o actual território moçambicano era habitado por comunidades nómadas de caçadores e recolectores pertencentes ao grupo linguístico e cultural Khoisan, vivendo em simbiose com o ecossistema e com instrumentos de pedra e madeira.
                
                A partir do I milénio antes da nossa era (e com maior intensidade entre os séculos II e V da nossa era), iniciou-se a Expansão Bantu, originária das regiões dos planaltos dos actuais Camarões e sudeste da Nigéria. Movendo-se por duas grandes rotas migratórias (a rota ocidental pela floresta equatorial e a rota oriental pelos grandes lagos africanos e costa do Índico), estes povos fixaram-se ao longo das férteis bacias fluviais e encostas planálticas de Moçambique.
                
                A chegada dos Bantu operou uma verdadeira revolução civilizacional na África Austral: introduziu o domínio da metalurgia do ferro, o cultivo agrícola sedentário (milho-miúdo, sorgo, inhame) e a pastorícia bovina e caprina. Esta revolução tecnológica gerou excedentes de produção alimentar, crescimento demográfico acelerado e a estruturação das primeiras comunidades aldeãs sedentárias assentes em laços de linhagem e parentesco consanguíneo (as aldeias 'Musha'), lançando os alicerces para a posterior diferenciação social e nascimento dos primeiros estados.
            """.trimIndent(),
            keyPoints = listOf(
                "Subtemas: 1. Origem e rotas da Expansão Bantu (núcleo Nigéria/Camarões); 2. Encontro com as populações autóctones Khoisan; 3. Revolução da Idade do Ferro e tecnologia de fundição; 4. Práticas agro-pastoris e sedentarização nas bacias dos rios Zambeze, Limpopo e Save; 5. Organização social gentilícia (linhagens, clãs e a aldeia 'Musha'); 6. Cosmovisão religiosa tradicional e o culto aos antepassados.",
                "A metalurgia do ferro aumentou radicalmente a capacidade de desbravar matas, permitindo o fabrico de enxadas, machados e pontas de flecha e lança.",
                "A organização social era matrilinear a norte do rio Zambeze (descendência e herança pela linha materna) e tendencialmente patrilinear a sul do Zambeze.",
                "O surgimento de excedentes agrícolas possibilitou a especialização de tarefas (oleiros, ferreiros, tecelões, curandeiros e chefes de linhagem)."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Origens da Expansão Bantu",
                    period = "c. 1000 a.C. - 300 d.C.",
                    description = "Migrações graduais de comunidades agropastoris e falantes de línguas do tronco Níger-Congo em direcção ao sul do continente."
                ),
                FigureDateItem(
                    title = "Fixação da Idade do Ferro em Moçambique",
                    period = "Séculos II a V d.C.",
                    description = "Primeiros vestígios arqueológicos de fornos de fundição de ferro e cerâmica do tipo Matola e Gokomere nas bacias fluviais moçambicanas."
                ),
                FigureDateItem(
                    title = "A Aldeia Musha e os Chefes Mwenye",
                    period = "Período Pré-Estatal",
                    description = "Unidade social básica gerida pelo ancião da linhagem fundadora, responsável pela mediação com os espíritos protectores da terra."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Qual foi o impacto directo da introdução da metalurgia do ferro no povoamento de Moçambique?",
                    answer = "A metalurgia do ferro forneceu instrumentos agrícolas eficazes (enxadas) e armas, gerando excedente de produção, rápido crescimento populacional e a passagem definitiva para o sedentarismo.",
                    keyConcept = "Revolução da Idade do Ferro e Agricultura"
                ),
                ReviewQuestion(
                    question = "Como se caracterizava a organização social das comunidades de linhagem (Musha)?",
                    answer = "Baseava-se em laços de parentesco comum, sob a autoridade moral e espiritual do chefe de linhagem mais velho, com posse colectiva da terra e divisão sexual do trabalho.",
                    keyConcept = "Comunidade Aldeã e Estrutura de Linhagem"
                )
            )
        ),

        // =========================================================================
        // MÓDULO 2: OS PRIMEIROS ESTADOS: ZIMBABUÉ, MUTAPA E MARAVE
        // =========================================================================
        StudyModule(
            id = "H_MOD_2",
            subject = Subject.HISTORIA,
            title = "Estados Pré-Coloniais: Mutapa, Marave e Zimbabué",
            subtitle = "Grandes amuralhados de pedra, dinastias régias e tributação sagrada",
            topicTag = "Estados Pré-Coloniais",
            summary = """
                A partir do século IX d.C., a crescente diferenciação social e o controlo do comércio de longa distância no planalto zimbabuano e no vale do Zambeze culminaram na formação dos primeiros estados dinásticos centralizados. O Grande Zimbabué (séculos XI a XV) destacou-se pela arquitectura monumental em pedra sem argamassa e pelo controlo da rota do ouro e marfim entre o interior e o oceano Índico.
                
                Com a saturação ambiental e declínio do Grande Zimbabué por volta de 1450, o príncipe guerreiro Nyatsimba Mutota migrou para o vale do Zambeze à procura de sal e pastagens, fundando a dinastia Mutapa (Império de Monomotapa). O poder do Mwenemutapa assentava na sua sacralidade divina (ele era o senhor sagrado das chuvas e da fertilidade), na cobrança do tributo obrigatório da 'Curva' (ou Kurva) imposto a vassalos e mercadores estrangeiros, e na vassalagem das comunidades camponesas. No entanto, as disputas dinásticas e a penetração militar portuguesa levaram à assinatura de tratados de vassalagem ruinosos (1607 com Gatsi Lucere e 1629 com Mavura).
                
                A norte do rio Zambeze desenvolveu-se a Confederação dos Estados Marave (séculos XVI a XIX), originária de migrações da bacia do Congo/Luba. Liderados pelos clãs Phiri (guerreiros e governantes) e Banda (sacerdotes e donos tradicionais da terra), os estados Marave estruturaram dinastias chefiadas por Undi, Karonga e Lundu, destacando-se na produção de tecidos de algodão ('machira'), comércio de marfim e no poderoso culto espiritual de Makewana.
            """.trimIndent(),
            keyPoints = listOf(
                "Subtemas: 1. A Tradição Zimbabuana e os amuralhados de pedra (sécs. XI-XV); 2. Fundação do Estado de Mutapa por Nyatsimba Mutota; 3. Estrutura política e corte do Mwenemutapa; 4. A economia do ouro e o tributo da 'Curva'; 5. Tratados de 1607 e 1629 e a intervenção mercantil portuguesa; 6. A Confederação Marave (clãs Phiri e Banda); 7. As dinastias de Undi, Karonga e Lundu; 8. O culto de Makewana e a religião tradicional Marave.",
                "O tributo da 'Curva' era uma taxa régia de soberania exigida pelo Mwenemutapa para autorizar mercadores e capitães a comerciar ouro e marfim em paz.",
                "Nos Estados Marave, o clã Phiri detinha o poder político militar, enquanto o clã Banda mantinha as funções mágico-religiosas ligadas ao culto das chuvas (santuário de Chifuka e profetisa Makewana).",
                "O declínio do Estado de Mutapa acentuou-se após o Tratado de 1629, em que Mavura se declarou vassalo do Rei de Portugal e autorizou a livre circulação de missionários e prazeiros."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Nyatsimba Mutota",
                    period = "c. 1430 - 1450",
                    description = "Líder e conquistador lendário que unificou o vale do Zambeze e recebeu o título honorífico de Mwenemutapa ('Senhor das Minas e Conquistador')."
                ),
                FigureDateItem(
                    title = "Tratados de 1607 e 1629",
                    period = "1607 / 1629",
                    description = "Acordos em que soberanos de Mutapa cederam minas de ouro e aceitaram vassalagem aos capitães portugueses em troca de apoio militar contra rivais internos."
                ),
                FigureDateItem(
                    title = "Undi e o Culto de Makewana",
                    period = "Séculos XVI a XVIII",
                    description = "Dinasta Marave que estabeleceu um império mercantil a norte do Zambeze, legitimado pelo santuário religioso de Makewana."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "O que representava a 'Curva' no Estado de Monomotapa perante os comerciantes estrangeiros?",
                    answer = "Era o tributo obrigatório pago anualmente ao Mwenemutapa em fazendas e tecidos como reconhecimento da sua soberania régia e permissão para minerar e transitar livremente.",
                    keyConcept = "Curva e Soberania Pré-Colonial"
                ),
                ReviewQuestion(
                    question = "Qual era a divisão funcional de papéis entre os clãs Phiri e Banda nos Estados Marave?",
                    answer = "Os Phiri exerciam o poder executivo, judicial e militar das chefias, enquanto os autóctones Banda retinham a autoridade sacerdotal da terra e mediação com as divindades das chuvas.",
                    keyConcept = "Dualismo Phiri-Banda e Religião Marave"
                )
            )
        ),

        // =========================================================================
        // MÓDULO 3: A PENETRAÇÃO MERCANTIL E AS TRÊS FASES DO COMÉRCIO
        // =========================================================================
        StudyModule(
            id = "H_MOD_3",
            subject = Subject.HISTORIA,
            title = "A Penetração Mercantil Estrangeira (Sécs. XVI - XIX)",
            subtitle = "Das redes costeiras afro-islâmicas ao comércio do ouro, marfim e escravos",
            topicTag = "Penetração Mercantil",
            summary = """
                A costa moçambicana esteve desde a Antiguidade integrada nos circuitos mundiais de trocas marítimas do Oceano Índico. Entre os séculos IX e XV, navegadores árabes, persas e mercadores suaílis estabeleceram entrepostos florescentes na Ilha de Moçambique, Angoche e Sofala, permutando tecidos, loiças e missangas por ouro e marfim do interior.
                
                Com a chegada de Vasco da Gama em 1498 e a tomada de Sofala em 1505 e Ilha de Moçambique em 1507, Portugal inaugurou o seu longo período de penetração mercantil em Moçambique, estruturado pela historiografia em três fases sucessivas:
                
                1. Fase do Ouro (séculos XVI a finais do XVII): Tentativa de controlo monopolista das minas de ouro do planalto zimbabuano e vale do Zambeze. Expedições militares (como a de Francisco Barreto em 1571) falharam militarmente, mas a penetração de feiras comerciais (Dambarare, Masapa, Luanze) subordinou os monarcas de Mutapa até à reacção vitoriosa dos guerreiros Rozvi de Changamire Dombo em 1693.
                
                2. Fase do Marfim (século XVIII): Esgotadas as reservas auríferas de superfície, o marfim das regiões central e norte tornou-se o artigo mais lucrativo. O comércio foi dominado pela Companhia dos Mazanes (mercadores indianos banianes / guzerates), que financiavam as expedições com panos finos e missangas.
                
                3. Fase dos Escravos (finais do séc. XVIII a finais do séc. XIX): Com a expansão das plantações açucareiras no Brasil e em Cuba e das ilhas de Reunião e Maurícias, Moçambique foi transformado num gigantesco entreposto de tráfico transatlântico de seres humanos. Este comércio desestruturou violentamente os tecidos demográficos, aldeias e linhagens de Moçambique, provocando guerras intestinas permanentes para captura de prisioneiros.
            """.trimIndent(),
            keyPoints = listOf(
                "Subtemas: 1. A presença afro-islâmica e a civilização suaíli do Índico; 2. A conquista mercantil portuguesa de Sofala (1505) e Ilha de Moçambique (1507); 3. A 1ª Fase do Comércio: Ciclo do Ouro e feiras mercantis do vale do Zambeze; 4. A resistência militar dos Rozvi de Changamire Dombo e expulsão portuguesa em 1693; 5. A 2ª Fase do Comércio: Ciclo do Marfim e a actuação da Companhia dos Mazanes; 6. A 3ª Fase do Comércio: O Tráfico Negreiro e suas consequências demográficas catastróficas.",
                "A expedição de Francisco Barreto (1571) teve como pretexto vingar o assassinato do missionário jesuíta Gonçalo da Silveira, mas o verdadeiro alvo eram as lendárias minas de ouro de Mutapa.",
                "A Companhia dos Mazanes, criada em 1686 por comerciantes goeses e guzerates, detinha o privilégio do comércio do marfim entre Diu e Moçambique.",
                "O tráfico de escravos atingiu o seu clímax mesmo após a proibição formal do comércio atlântico pela Grã-Bretanha, enriquecendo portos clandestinos em Angoche, Ibo e Quelimane."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Chegada de Vasco da Gama e Feitoria de Sofala",
                    period = "1498 / 1505",
                    description = "Início do domínio português das rotas marítimas e fundação da primeira fortaleza e feitoria comercial em Sofala."
                ),
                FigureDateItem(
                    title = "Changamire Dombo e a Batalha de Dambarare",
                    period = "1693",
                    description = "Líder Rozvi que expulsou os colonos portugueses das feiras do planalto zimbabuano, encerrando o ciclo do ouro."
                ),
                FigureDateItem(
                    title = "Apogeu do Tráfico de Escravos em Moçambique",
                    period = "1780 - 1850",
                    description = "Exportação maciça de centenas de milhares de cativos moçambicanos para as plantações do Brasil, Cuba e Oceano Índico."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Quais são as três fases da penetração mercantil europeia em Moçambique e que produtos dominaram cada ciclo?",
                    answer = "1ª Fase: Ciclo do Ouro (sécs. XVI-XVII); 2ª Fase: Ciclo do Marfim (séc. XVIII); 3ª Fase: Ciclo dos Escravos (finais do séc. XVIII ao séc. XIX).",
                    keyConcept = "Periodização Mercantil em Moçambique"
                ),
                ReviewQuestion(
                    question = "Qual foi o papel da Companhia dos Mazanes na economia moçambicana do século XVIII?",
                    answer = "Controlava o monopólio mercantil do marfim a partir da Ilha de Moçambique, fornecendo tecidos indianos de alta qualidade em troca de presas de elefante do interior.",
                    keyConcept = "Companhia dos Mazanes e Comércio de Marfim"
                )
            )
        ),

        // =========================================================================
        // MÓDULO 4: PRAZOS DA COROA E ESTADOS MILITARES DO ZAMBEZE
        // =========================================================================
        StudyModule(
            id = "H_MOD_4",
            subject = Subject.HISTORIA,
            title = "Prazos da Coroa e Estados Militares",
            subtitle = "Aringas, o exército Achikunda, o tributo Mussoco e os senhores da guerra",
            topicTag = "Penetração Mercantil",
            summary = """
                A partir do século XVII, mercadores, aventureiros e militares portugueses fixados ao longo do vale do rio Zambeze começaram a apossar-se de extensos territórios concedidos por chefes locais ou tomados pela força. Para tentar disciplinar estas possessões, a Coroa Portuguesa oficializou o Sistema dos Prazos da Coroa através de contratos enfitêuticos de três vidas.
                
                A legislação colonial determinava que a herança dos prazos era rigorosamente transmitida por via feminina (de mãe para filha, gerando a célebre figura das 'Donas dos Prazos'), sob a condição de se casarem com nobres de origem portuguesa. No entanto, na prática diária, estes prazos africanizaram-se completamente: os prazeiros adoptaram títulos consuetudinários e costumes locais, governando com total independência da coroa de Lisboa.
                
                O poderio real dos prazeiros assentava em dois pilares fundamentais:
                1. Os A-Chicunda (Achikunda): Exércitos permanentes formados por guerreiros escravizados e desestruturados das suas linhagens originárias, juramentados lealdade ao senhor do prazo. Viviam acampados em redutos fortificados de troncos e terra batida chamados 'Aringas'.
                2. O Tributo do Mussoco: Cobrança compulsória de tributo individual sobre cada camponês residente no prazo, pago em cereais, ouro ou marfim.
                
                No século XIX, o declínio dos prazos tradicionais e o florescimento do tráfico de escravos transformaram o vale do Zambeze num território de senhores da guerra e 'Estados Militares' (como o Estado Militar de Macanga, fundado pela família Cruz, e Massingir), que mantiveram poderosas milícias e desafiaram abertamente a autoridade colonial portuguesa até ao final do século XIX.
            """.trimIndent(),
            keyPoints = listOf(
                "Subtemas: 1. Origem histórica e jurídica dos Prazos da Coroa no vale do Zambeze; 2. O regime de três vidas e a sucessão matrilinear das 'Donas dos Prazos'; 3. A estrutura militar das Aringas fortificadas; 4. Os A-Chicunda: formação, identidade e papel militar; 5. O sistema de tributação tradicional do Mussoco; 6. A transição dos prazos para os Estados Militares do Zambeze (família Cruz em Macanga, Massingir e Gorongosa).",
                "O termo 'Achikunda' significava homens de confiança armada ou guerreiros da casa, que controlavam as povoações e cobravam tributos com mão de ferro.",
                "As Aringas eram cidadelas militares protegidas por cercas impenetráveis de estacas e canhões, servindo de bases estratégicas de combate e defesa.",
                "A dinastia dos Cruz (Joaquim da Cruz / Nhaude e António da Cruz / Bonga) dominou o Estado Militar de Macanga e derrotou várias expedições coloniais portuguesas enviadas pelo governador de Tete."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Criação do Regime Jurídico dos Prazos",
                    period = "1630 - 1650",
                    description = "Decretos reais de Lisboa que tentaram transformar terras conquistadas no Zambeze em feudos hereditários da Coroa."
                ),
                FigureDateItem(
                    title = "Nhaude e a Aringa de Macanga",
                    period = "1853",
                    description = "Joaquim José da Cruz fortifica a célebre Aringa de Macanga na confluência dos rios Zambeze e Luenha, fundando uma dinastia militar."
                ),
                FigureDateItem(
                    title = "Bonga (António Vicente da Cruz)",
                    period = "1867 - 1875",
                    description = "Comandante temido dos Chicunda que repeliu as maiores campanhas de artilharia enviadas pelo governo colonial contra Macanga."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Quem eram os Achikunda e qual a sua importância na sustentação dos Prazos do Zambeze?",
                    answer = "Eram exércitos privados de escravos guerreiros fiéis ao prazeiro, responsáveis pela segurança das aringas, captura de novos cativos e cobrança coerciva do tributo do mussoco.",
                    keyConcept = "Achikunda e Força Militar Prazeira"
                ),
                ReviewQuestion(
                    question = "Como funcionava o regime sucessório das 'Donas dos Prazos'?",
                    answer = "A Coroa determinava a transmissão obrigatória do prazo por via feminina ao longo de três vidas sucessivas, exigindo casamento com homens brancos, visando a fixação de linhagens leais à metrópole.",
                    keyConcept = "Donas dos Prazos e Sucessão Matrilinear"
                )
            )
        ),

        // =========================================================================
        // MÓDULO 5: O MFECANE E O ESTADO DE GAZA
        // =========================================================================
        StudyModule(
            id = "H_MOD_5",
            subject = Subject.HISTORIA,
            title = "O Mfecane e o Império/Estado de Gaza",
            subtitle = "Migrações Nguni, Sochangane, o exército Mabutho e Ngungunhane",
            topicTag = "Resistência Colonial",
            summary = """
                Nas primeiras décadas do século XIX, a região sudeste da África Austral (actual África do Sul) foi sacudida pelo fenómeno do Mfecane (ou Difaqane) — uma vaga turbulenta de guerras de unificação, secas prolongadas e transformações estatais impulsionadas pelo crescimento do Reino Zulu de Shaka. Como resultado dessas comoções, vários líderes militares dissidentes Nguni migraram para norte à frente dos seus povos e exércitos.
                
                Entre estes líderes destacou-se Sochangane (também conhecido por Manicusse), líder militar dos Ndwandwe, que atravessou os rios Incomáti e Limpopo e fundou, por volta de 1821, o monumental Império de Gaza. Estendendo-se no seu auge desde a baía de Maputo até ao rio Zambeze, o Estado de Gaza tornou-se a maior e mais temida potência política e militar de Moçambique no século XIX.
                
                A sociedade de Gaza organizava-se numa rígida hierarquia étnica e social:
                1. Os Nguni (ou Ba-Nguni): Aristocracia conquistadora minoritária que detinha os comandos dos exércitos e as decisões régias.
                2. Os Tsonga e Chopi (Ba-Tsonga e Ba-Tshopi): Populações assimiladas e submetidas, integradas compulsivamente nos regimentos.
                
                A máquina de guerra assentava no sistema dos 'Mabutho' — regimentos permanentes mobilizados por escalões etários, armados com lanças curtas de combate corpo-a-corpo (assegai) e grandes escudos ovais de pele bovina.
                
                Após a morte de Sochangane em 1858, o império foi dilacerado por uma sangrenta Guerra Civil de Sucessão entre os seus filhos Mawewe e Mzila (1858-1862). Mzila saiu vitorioso graças ao apoio bélico de caçadores e comerciantes europeus de Lourenço Marques. O seu filho e sucessor, Mudungazi — que adoptou o nome régio de Ngungunhane ao ascender ao trono em 1884 —, transferiu estrategicamente a capital imperial de Mossurize para Mandlakazi (em Gaza), onde teria de enfrentar a vaga invasora colonial portuguesa.
            """.trimIndent(),
            keyPoints = listOf(
                "Subtemas: 1. As causas e consequências regionais do Mfecane; 2. A marcha militar de Sochangane (Manicusse) e fundação de Gaza; 3. O sistema militar dos Mabutho e a técnica de combate Nguni; 4. A estratificação social entre Nguni e populações assimiladas (Tsonga e Chopi); 5. A Guerra Civil de Sucessão (1858-1862) entre Mawewe e Mzila; 6. A ascensão de Ngungunhane (1884) e a transferência da corte imperial para Mandlakazi.",
                "O Estado de Gaza cobrava tributo e exigia vassalagem militar de todas as populações vizinhas e até aos governadores portugueses das fortalezas de Lourenço Marques e Inhambane.",
                "O sistema Mabutho impedia os jovens de casar antes de prestarem prova de lealdade bélica nos campos de batalha sob comando régio.",
                "A mudança da capital de Mossurize para Mandlakazi em 1889 visou reaproximar o centro do poder imperial das férteis planícies e controlar a influência colonial na baía de Lourenço Marques."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Sochangane (Manicusse)",
                    period = "c. 1821 - 1858",
                    description = "Fundador e primeiro imperador de Gaza, estendendo o domínio Nguni por todo o sul e centro de Moçambique."
                ),
                FigureDateItem(
                    title = "Guerra Civil: Mawewe vs. Mzila",
                    period = "1858 - 1862",
                    description = "Conflito fraticida de sucessão que culminou na vitória de Mzila e na modernização das alianças comerciais do império."
                ),
                FigureDateItem(
                    title = "Ngungunhane (Rei de Gaza)",
                    period = "1884 - 1895",
                    description = "Último grande soberano de Gaza, cognominado 'O Leão de Gaza', que governou a partir de Mandlakazi até à invasão colonial."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "O que foi o Mfecane e qual a sua relação directa com a história de Moçambique?",
                    answer = "Foi a revolução militar e migratória iniciada na África do Sul no início do séc. XIX que forçou povos Nguni a migrarem para norte, originando a fundação do Estado de Gaza por Sochangane em território moçambicano.",
                    keyConcept = "Mfecane e Origem do Estado de Gaza"
                ),
                ReviewQuestion(
                    question = "Como estava estruturada a força militar de Gaza através do sistema dos Mabutho?",
                    answer = "Os jovens eram recrutados por classes etárias e treinados rigorosamente em regimentos permanentes de choque sob disciplina férrea, usando lanças de combate corpo-a-corpo e táticas envolventes.",
                    keyConcept = "Sistema de Regimentos Mabutho"
                )
            )
        ),

        // =========================================================================
        // MÓDULO 6: PARTILHA IMPERIALISTA E RESISTÊNCIA ANTICOLONIAL
        // =========================================================================
        StudyModule(
            id = "H_MOD_6",
            subject = Subject.HISTORIA,
            title = "A Partilha de África e a Resistência Anticolonial",
            subtitle = "Conferência de Berlim, Batalha de Marracuene, Chaimite e Báruè",
            topicTag = "Resistência Colonial",
            summary = """
                A Conferência de Berlim (1884-1885), convocada pelas potências imperialistas europeias, aboliu o velho direito histórico de simples descoberta e estabeleceu a regra imperativa da 'Ocupação Militar Efectiva': qualquer potência europeia que reivindicasse soberania sobre terras africanas era obrigada a demonstrar presença militar, administrativa e policial física no terreno.
                
                Portugal, confrontado com o famoso 'Mapa Cor-de-Rosa' (o plano de ligar Angola a Moçambique) e humilhado pelo Ultimatum Britânico de 1890, foi forçado a recuar nas suas ambições continentais pelo Tratado Anglo-Português de 1891. Para não perder Moçambique para a Grã-Bretanha ou Alemanha, Lisboa organizou as célebres 'Campanhas de Pacificação' — invasões militares sistemáticas de ocupação do território.
                
                A invasão colonial encontrou feroz resistência africana:
                1. A Resistência de Gaza: Em 1895, as tropas de ocupação comandadas por António Enes atacaram o Estado de Gaza. A 2 de Fevereiro de 1895 travou-se a histórica Batalha de Marracuene (Gwaza Muthini), onde os regimentos de Ngungunhane demonstraram heroísmo extraordinário. Seguiram-se os combates sangrentos de Magul e Coolela. Em Dezembro de 1895, Mouzinho de Albuquerque capturou Ngungunhane na aldeia sagrada de Chaimite. O general supremo Maguiguana Khosa prosseguiu a resistência até à sua morte em combate na Batalha de Macontene em 1897.
                2. A Revolta de Báruè (1917): Na província de Manica, a bárbara exigência de carregadores para a I Guerra Mundial desencadeou uma das maiores insurreições anticoloniais, liderada por Nongwe-Nongwe e Makombe, unindo diferentes povos através da religião espiritual de Mwari.
                3. A Resistência no Norte: O Sultanato de Angoche (com os sultões Farelay e Mussa Quanto) e os povos Yao de Mataca no Niassa lutaram até às primeiras décadas do século XX contra a dominação portuguesa.
            """.trimIndent(),
            keyPoints = listOf(
                "Subtemas: 1. A Conferência de Berlim (1884-1885) e o princípio da ocupação militar efectiva; 2. O Mapa Cor-de-Rosa e o Ultimatum Britânico de 1890; 3. O Tratado Anglo-Português de 1891 e as fronteiras moçambicanas; 4. As Campanhas de Ocupação Militar no Sul de Moçambique; 5. A Batalha de Marracuene (Gwaza Muthini, 2 de Fevereiro de 1895); 6. A queda de Mandlakazi e a captura de Ngungunhane em Chaimite (1895); 7. O combate de Macontene e o general Maguiguana Khosa (1897); 8. A grande Revolta de Báruè de 1917 e o papel de Nongwe-Nongwe; 9. A resistência armada em Angoche e no Niassa.",
                "A Batalha de Marracuene opôs os regimentos de Gaza, munidos de lanças e espingardas obsoletas, ao quadrado defensivo colonial português armado com fuzis de repetição Kropatschek e metralhadoras modernas.",
                "Ngungunhane foi deportado para os Açores (Ilha Terceira), onde faleceu no exílio em 1906, tornando-se símbolo perene de dignidade e soberania nacional.",
                "A Revolta de Báruè de 1917 foi marcante por unir povos de línguas diferentes numa frente comum pan-étnica contra o recrutamento colonial forçado."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Batalha de Marracuene (Gwaza Muthini)",
                    period = "2 de Fevereiro de 1895",
                    description = "Confronto épico entre o exército régio de Gaza e as forças coloniais chefiadas pelo major Caldas Xavier."
                ),
                FigureDateItem(
                    title = "Prisão de Ngungunhane em Chaimite",
                    period = "28 de Dezembro de 1895",
                    description = "Mouzinho de Albuquerque surpreende o imperador desarmado no reduto religioso sagrado dos seus antepassados."
                ),
                FigureDateItem(
                    title = "A Grande Revolta de Báruè",
                    period = "1917",
                    description = "Insurreição coordenada que libertou temporariamente postos coloniais no vale do Zambeze contra o chibalo militar."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Como é que o princípio da 'Ocupação Efectiva' de Berlim (1885) precipitou as guerras de ocupação em Moçambique?",
                    answer = "A exigência internacional forçou Portugal a mobilizar exércitos para conquistar militarmente o interior sob pena de ver os seus territórios cedidos a potências rivais como a Grã-Bretanha e a Alemanha.",
                    keyConcept = "Ocupação Efectiva e Partilha Imperialista"
                ),
                ReviewQuestion(
                    question = "Qual foi a causa imediata que despoletou a Revolta de Báruè em 1917?",
                    answer = "O recrutamento forçado e desumano de milhares de camponeses africanos para trabalharem como carregadores militares na campanha de Moçambique durante a Primeira Guerra Mundial.",
                    keyConcept = "Causas da Revolta de Báruè de 1917"
                )
            )
        ),

        // =========================================================================
        // MÓDULO 7: O SISTEMA COLONIAL PORTUGUÊS (1890-1960)
        // =========================================================================
        StudyModule(
            id = "H_MOD_7",
            subject = Subject.HISTORIA,
            title = "O Sistema Colonial e a Exploração da Força de Trabalho",
            subtitle = "Companhias Majestáticas, Chibalo, o WENELA e o Acto Colonial de 1930",
            topicTag = "Sistema Colonial",
            summary = """
                Após derrotar as resistências armadas, Portugal viu-se incapaz financeiramente de explorar e administrar directamente todo o território de Moçambique. Para contornar a fraqueza do capitalismo metropolitano, o território foi administrativamente retalhado em três modelos distintos de dominação:
                
                1. O Regime das Companhias Majestáticas e Concessionárias: A norte do rio Save, vastas províncias foram arrendadas a corporações de capital predominantemente britânico e francês dotadas de poderes soberanos de Estado (moeda, polícia, justiça e cobrança de impostos). Destacaram-se a Companhia de Moçambique (Manica e Sofala, 1891-1942), a Companhia do Niassa (Cabo Delgado e Niassa, 1891-1929) e a Companhia da Zambézia (concessionária de plantações de chá, copra e cana-de-açúcar).
                2. A Administração Directa no Sul: A sul do Save, o Estado colonial português administrou directamente o território, orientando a sua economia para os serviços portuários e ferroviários e, fundamentalmente, para o fornecimento de mão-de-obra migratória barata para a África do Sul.
                3. O Trabalho Migratório e a WENELA: Milhares de moçambicanos foram canalizados para as minas de ouro do Rand sul-africano através da agência WENELA, sob as Convenções de 1909 e 1928, que garantiam à administração colonial portuguesa o recebimento de taxas aduaneiras e o famoso 'pagamento diferido' liquidado em ouro ao preço oficial.
                
                O Regulamento do Trabalho dos Indígenas de 1899 consagrou a obrigação moral e legal de trabalhar, institucionalizando o 'Chibalo' — o trabalho forçado não remunerado ou miseravelmente pago em obras públicas e machambas coloniais.
                
                Com a instauração da ditadura do Estado Novo de Salazar em Portugal, promulgou-se o Acto Colonial de 1930, que subordinou rigorosamente a economia ultramarina aos interesses industriais de Lisboa. Foi imposto o cultivo obrigatório do algodão e do arroz: os camponeses eram forçados a produzir matérias-primas nas suas terras férteis em prejuízo das culturas alimentares de subsistência, o que provocou fomes cíclicas desastrosas. Paralelamente, o Estatuto dos Indígenas consolidou a segregação racial e jurídica da população, mantendo mais de 99% dos moçambicanos privados de direitos civis básicos.
            """.trimIndent(),
            keyPoints = listOf(
                "Subtemas: 1. A divisão político-económica de Moçambique pós-1890; 2. As Companhias Majestáticas (Moçambique e Niassa) e Concessionárias (Zambézia); 3. O Regulamento do Trabalho Indígena de 1899 e o Chibalo; 4. O sistema de trabalho migratório para a África do Sul (WENELA e Convenções de 1909/1928); 5. O Acto Colonial de 1930 e a política nacionalista do Estado Novo; 6. As culturas obrigatórias do algodão e arroz e as fomes camponesas; 7. O Estatuto dos Indígenas e a política de 'Assimilação'.",
                "As Companhias Majestáticas possuíam direitos soberanos delegados pela Coroa, exercendo poderes quase feudais sobre milhões de camponeses através do imposto de palhota.",
                "O acordo do Pagamento Diferido estipulava que metade dos salários dos mineiros moçambicanos era retida e paga no regresso através de ouro entregue ao Banco de Portugal.",
                "A Assimilação exigia requisitos praticamente inatingíveis (domínio perfeito do português, renda elevada, certidão católica e hábitos europeus), servindo como fachada civilizatória para perpetuar a discriminação colonial."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Regulamento do Trabalho dos Indígenas",
                    period = "1899",
                    description = "Diploma de António Enes que legalizou a servidão por trabalho forçado (Chibalo) em Moçambique."
                ),
                FigureDateItem(
                    title = "Promulgação do Acto Colonial",
                    period = "1930",
                    description = "Legislação de Salazar que impôs o exclusivo colonial e a centralização administrativa autoritária das colónias."
                ),
                FigureDateItem(
                    title = "Convenção Luso-Sul-Africana (WENELA)",
                    period = "1928",
                    description = "Tratado que institucionalizou o contingente obrigatório de até 100.000 mineiros moçambicanos para as minas do Rand."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Qual era a diferença jurídica fundamental entre uma Companhia Majestática e uma Companhia Concessionária?",
                    answer = "A Companhia Majestática detinha poderes soberanos de Estado (moeda própria, polícia, justiça e tributação), enquanto a Concessionária recebia apenas direitos de exploração económica e agrícola do solo.",
                    keyConcept = "Companhias Majestáticas vs. Concessionárias"
                ),
                ReviewQuestion(
                    question = "Quais foram as graves repercussões sociais das culturas obrigatórias do algodão sobre os camponeses moçambicanos?",
                    answer = "Retiraram a mão-de-obra e as melhores terras da produção de alimentos básicos, originando desnutrição, fomes severas e um estado de extrema miséria nas zonas rurais.",
                    keyConcept = "Impacto Social das Culturas Obrigatórias"
                )
            )
        ),

        // =========================================================================
        // MÓDULO 8: DO PROTO-NACIONALISMO À LUTA DE LIBERTAÇÃO NACIONAL
        // =========================================================================
        StudyModule(
            id = "H_MOD_8",
            subject = Subject.HISTORIA,
            title = "Nacionalismo e a Luta de Libertação (1900-1975)",
            subtitle = "O Brado Africano, Massacre de Mueda, FRELIMO, Mondlane e Samora Machel",
            topicTag = "Luta Armada e FRELIMO",
            summary = """
                O despertar do sentimento nacional moçambicano iniciou-se nos centros urbanos nas primeiras décadas do século XX através do chamado 'Proto-Nacionalismo'. Intelectuais, funcionários e jornalistas africanos fundaram agremiações como o Grémio Africano de Lourenço Marques (1908) e jornais pioneiros como 'O Africano' e 'O Brado Africano' (fundados pelos irmãos José e João Albasini e Estácio Dias), denunciando o racismo colonial, a prepotência dos administradores e a violência do chibalo.
                
                Nas décadas de 1940 e 1950, a luta expandiu-se para associações culturais (NESAM - Núcleo de Estudantes Secundários Africanos de Moçambique, onde militou Eduardo Mondlane), sindicatos clandestinos e manifestações laborais severamente reprimidas, culminando no Massacre do Porto de Lourenço Marques (1956) e no trágico Massacre de Mueda (16 de Junho de 1960), quando a tropa colonial fuzilou dezenas de camponeses pacíficos em Cabo Delgado.
                
                O Massacre de Mueda convenceu os nacionalistas de que a via pacífica de negociação estava definitivamente esgotada. A 25 de Junho de 1962, em Dar-es-Salaam (Tanzânia), os três movimentos no exílio — a UDENAMO, a MANU e a UNAMI — fundiram-se sob o patrocínio de Julius Nyerere para dar nascimento à Frente de Libertação de Moçambique (FRELIMO), elegendo o Dr. Eduardo Chivambo Mondlane como primeiro presidente.
                
                A 25 de Setembro de 1964 teve início a Luta Armada de Libertação Nacional com o primeiro ataque ao posto colonial de Chai em Cabo Delgado. A FRELIMO organizou as 'Zonas Libertadas' no norte do país, desenvolvendo as primeiras escolas populares, postos de saúde gratuitos e cooperativas agrícolas de poder popular.
                
                Apesar de violentas crises internas, do assassinato de Eduardo Mondlane pela PIDE a 3 de Fevereiro de 1969 e da gigantesca ofensiva colonial da Operação Nó Górdio em 1970, a liderança firme de Samora Moisés Machel conduziu os guerrilheiros à vitória militar e diplomática. Com o golpe democrático dos cravos a 25 de Abril de 1974 em Portugal e a assinatura dos Acordos de Lusaka a 7 de Setembro de 1974 (Dia da Vitória), Moçambique estabeleceu o Governo de Transição que culminou na Proclamação da Independência Nacional a 25 de Junho de 1975.
            """.trimIndent(),
            keyPoints = listOf(
                "Subtemas: 1. O Proto-Nacionalismo urbano: O Grémio Africano e os jornais 'O Africano' e 'O Brado Africano' (irmãos Albasini); 2. A formação da consciência juvenil e o NESAM; 3. O Massacre de Mueda (16 de Junho de 1960) como catalisador da via armada; 4. A criação da FRELIMO a 25 de Junho de 1962 em Dar-es-Salaam (UDENAMO, MANU, UNAMI); 5. O Dr. Eduardo Mondlane e o pensamento de Unidade Nacional; 6. O início da Luta Armada em Chai (25 de Setembro de 1964); 7. O modelo das Zonas Libertadas e o Destacamento Feminino com Josina Machel; 8. O assassinato de Mondlane (1969) e a ascensão de Samora Machel; 9. Os Acordos de Lusaka (7 de Setembro de 1974) e o Governo de Transição.",
                "O Dr. Eduardo Chivambo Mondlane é reverenciado como o 'Arquitecto da Unidade Nacional' por ter unificado diferentes grupos regionais e étnicos num único movimento nacionalista coeso.",
                "O Destacamento Feminino da FRELIMO, criado em 1967 e impulsionado por Josina Machel, foi pioneiro na emancipação da mulher africana nos teatros operacionais de combate e protecção social.",
                "Os Acordos de Lusaka consagraram o reconhecimento irrevogável da FRELIMO como único e legítimo representante do povo moçambicano."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Massacre de Mueda",
                    period = "16 de Junho de 1960",
                    description = "Fuzilamento em massa de líderes e camponeses do planalto de Cabo Delgado que reivindicavam pacificamente a liberdade e salários justos."
                ),
                FigureDateItem(
                    title = "Fundação da FRELIMO em Dar-es-Salaam",
                    period = "25 de Junho de 1962",
                    description = "Congresso constitutivo presidido pelo Dr. Eduardo Mondlane que unificou os movimentos nacionalistas moçambicanos."
                ),
                FigureDateItem(
                    title = "Acordos de Lusaka (Dia da Vitória)",
                    period = "7 de Setembro de 1974",
                    description = "Assinatura do cessar-fogo oficial entre a FRELIMO e o Estado português, pondo fim a 10 anos de guerra colonial."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Quais foram os três movimentos nacionalistas precursores que se uniram para fundar a FRELIMO em 1962?",
                    answer = "A UDENAMO (União Democrática Nacional de Moçambique), a MANU (Mozambique African National Union) e a UNAMI (União Nacional Africana de Moçambique Independente).",
                    keyConcept = "Origem e Fundação da FRELIMO"
                ),
                ReviewQuestion(
                    question = "O que representavam na prática as 'Zonas Libertadas' administradas pela FRELIMO durante a luta armada?",
                    answer = "Eram territórios livres onde se erradicou a exploração colonial e se implementaram os primeiros serviços públicos populares: escolas, hospitais de campanha, machambas colectivas e democracia participativa.",
                    keyConcept = "Estrutura das Zonas Libertadas"
                )
            )
        ),

        // =========================================================================
        // MÓDULO 9: A INDEPENDÊNCIA E MOÇAMBIQUE PÓS-COLONIAL (1975-HOJE)
        // =========================================================================
        StudyModule(
            id = "H_MOD_9",
            subject = Subject.HISTORIA,
            title = "Independência Nacional e Moçambique Contemporâneo",
            subtitle = "Da Proclamação da República Popular em 1975 à Constituição de 1990 e Roma 1992",
            topicTag = "Independência Nacional",
            summary = """
                À meia-noite de 25 de Junho de 1975, no Estádio da Machava em Lourenço Marques (actual Maputo), Samora Moisés Machel proclamou solenemente a Independência Total e Completa de Moçambique, nascendo a República Popular de Moçambique sob a Constituição de 1975.
                
                O novo Estado adoptou a linha política e económica socialista do marxismo-leninismo (consagrada no III Congresso da FRELIMO em 1977): nacionalizou a terra, a educação, a saúde, a justiça e as habitações coloniais abandonadas, lançando campanhas históricas de alfabetização e vacinação em massa e estruturando as Aldeias Comunais.
                
                No entanto, a jovem nação deparou-se com imensos desafios internos e agressões externas. Moçambique assumiu com coragem o apoio incondicional aos movimentos de libertação da Zimbabué (ZANU) e da África do Sul (ANC), aplicando as sanções económicas da ONU contra o regime racista de Ian Smith na Rodésia do Sul. Em retaliação, os regimes minoritários vizinhos promoveram agressões bélicas e financiaram o surgimento da RENAMO, despoletando a dolorosa Guerra Civil dos 16 Anos (1976-1992).
                
                Para tentar conter o conflito e estancar a asfixia económica, Samora Machel assinou com Pretória o polémico Acordo de Nkomati em 1984 (pacto de não-agressão). A 19 de Outubro de 1986, o país sofreu um golpe profundo com a trágica morte de Samora Machel num acidente de aviação provocado em Mbuzini, na África do Sul, assumindo Joaquim Alberto Chissano a presidência da República.
                
                Face às transformações geopolíticas mundiais (queda do Bloco Socialista) e à busca desesperada pela paz, Moçambique aprovou a histórica Constituição de Novembro de 1990, que introduziu a democracia multipartidária, o Estado de Direito, as liberdades civis fundamentais e a economia de mercado. Este passo abriu caminho à assinatura do Acordo Geral de Paz de Roma a 4 de Outubro de 1992 entre Joaquim Chissano e Afonso Dhlakama, culminando na realização bem-sucedida das Primeiras Eleições Gerais Multipartidárias de 1994.
            """.trimIndent(),
            keyPoints = listOf(
                "Subtemas: 1. A proclamação solene da Independência a 25 de Junho de 1975 no Estádio da Machava; 2. As nacionalizações fundamentais e a Constituição de 1975; 3. A opção socialista do III Congresso (1977) e as Aldeias Comunais; 4. A solidariedade com os povos da África Austral e o confronto com a Rodésia e o Apartheid; 5. A Guerra Civil dos 16 Anos e o sofrimento das populações; 6. O Acordo de Nkomati de 1984; 7. A tragédia de Mbuzini (1986) e a liderança de Joaquim Chissano; 8. A Constituição de 1990 e a consagração do multipartidarismo; 9. O Acordo Geral de Paz de Roma (4 de Outubro de 1992); 10. As Primeiras Eleições Gerais Multipartidárias de 1994.",
                "A Constituição de 1975 concentrava o poder político sob a direcção do partido único, enquanto a Constituição de 1990 consagrou a separação de poderes, pluralismo político e garantias judiciais.",
                "O Acordo de Nkomati (1984) acordava que Moçambique deixaria de apoiar militarmente as bases do ANC em troca de a África do Sul cessar o suporte logístico e militar à RENAMO.",
                "O Acordo Geral de Paz de Roma, mediado pela Comunidade de Santo Egídio, é celebrado anualmente como o Dia da Paz e Reconciliação Nacional a 4 de Outubro."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Proclamação da Independência Nacional",
                    period = "25 de Junho de 1975",
                    description = "Samora Moisés Machel anuncia o fim formal de quase cinco séculos de colonialismo e o nascimento da República Popular."
                ),
                FigureDateItem(
                    title = "Tragédia de Mbuzini",
                    period = "19 de Outubro de 1986",
                    description = "Despenhamento do avião presidencial Tupolev do Marechal Samora Machel em território sul-africano."
                ),
                FigureDateItem(
                    title = "Acordo Geral de Paz de Roma",
                    period = "4 de Outubro de 1992",
                    description = "Assinatura do tratado de paz definitivo entre o Presidente Joaquim Chissano e o líder da RENAMO Afonso Dhlakama."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Quais foram as transformações políticas e económicas fundamentais consagradas pela Constituição de 1990 em Moçambique?",
                    answer = "A transição do regime de partido único para a democracia multipartidária, a consagração do Estado de Direito democrático, protecção dos direitos humanos e a adopção do modelo económico de mercado.",
                    keyConcept = "Constituição de 1990 e Abertura Democrática"
                ),
                ReviewQuestion(
                    question = "Qual foi o principal objectivo do Acordo de Nkomati assinado em 1984 entre Moçambique e a África do Sul?",
                    answer = "Um compromisso mútuo de não-agressão e boa vizinhança, em que Moçambique proibia operações do ANC no seu território e a África do Sul comprometia-se a terminar com o armamento e apoio logístico à RENAMO.",
                    keyConcept = "Acordo de Nkomati de 1984"
                )
            )
        ),

        // =========================================================================
        // MÓDULO 10: HISTÓRIA DE ÁFRICA E CENÁRIO MUNDIAL NOS EXAMES UEM
        // =========================================================================
        StudyModule(
            id = "H_MOD_10",
            subject = Subject.HISTORIA,
            title = "História de África e o Cenário Internacional",
            subtitle = "Conferência de Bandung, Descolonização, a OUA e a Luta contra o Apartheid",
            topicTag = "Independência Nacional",
            summary = """
                Nos cadernos de exames de admissão da Universidade Eduardo Mondlane (UEM), os tópicos de História de Moçambique são frequentemente contextualizados na dinâmica mais ampla da História de África e das relações internacionais contemporâneas:
                
                1. A Conferência de Bandung (1955) e o Movimento dos Não-Alinhados: Reunidos na Indonésia, 29 líderes de países africanos e asiáticos recém-independentes condenaram unanimemente o colonialismo e o imperialismo, proclamando os princípios de coexistência pacífica e soberania nacional e lançando as bases para a diplomacia dos Países Não-Alinhados perante os blocos da Guerra Fria (EUA e URSS).
                
                2. As Vagas de Descolonização Africana: O ano de 1960 ficou consagrado como o 'Ano de África', quando 17 nações conquistaram a independência política, principalmente no espaço francófono e anglófono. Ao contrário das colónias portuguesas (que precisaram de recorrer à guerra de libertação prolongada devido à intransigência fascista), muitas colónias britânicas e francesas negociaram transições políticas constitucionais.
                
                3. A Fundação da Organização da Unidade Africana (OUA): A 25 de Maio de 1963, 32 chefes de Estado e de Governo reuniram-se em Adis Abeba (Etiópia) para fundar a OUA (actual União Africana - UA), com o objectivo primordial de defender a soberania dos países membros, erradicar todas as formas de colonialismo de África e coordenar a libertação dos territórios sob jugo colonial e minoritário através do Comité de Libertação com sede em Dar-es-Salaam.
                
                4. A Linha da Frente e o Combate ao Apartheid: Na África Austral, Moçambique assumiu um papel proeminente ao lado da Zâmbia, Tanzânia, Angola e Botswana na criação da aliança dos 'Países da Linha da Frente'. Esta coligação prestou apoio militar, diplomático e logístico fundamental ao ANC e à SWAPO até à queda do regime racista do Apartheid e à libertação histórica de Nelson Mandela nos anos 1990.
            """.trimIndent(),
            keyPoints = listOf(
                "Subtemas: 1. A Conferência de Bandung (1955) e a emancipação afro-asiática; 2. O Movimento dos Não-Alinhados e a recusa da bipolaridade da Guerra Fria; 3. O 'Ano de África' (1960) e os processos diferenciados de independência no continente; 4. A criação da Organização da Unidade Africana (OUA) a 25 de Maio de 1963 em Adis Abeba; 5. O Comité de Libertação de África e o apoio às colónias portuguesas; 6. A coligação dos Países da Linha da Frente e a erradicação do Apartheid na África do Sul.",
                "A Conferência de Bandung conferiu aos povos colonizados o suporte moral e diplomático global para reivindicarem o direito inalienável à autodeterminação.",
                "O Comité de Libertação da OUA funcionou em Dar-es-Salaam fornecendo fundos materiais, armas e facilitação de vistos para os combatentes da FRELIMO, MPLA e PAIGC.",
                "O sacrifício económico e humano de Moçambique no apoio à libertação do Zimbabwe e da África do Sul custou milhares de vidas civis em bombardeamentos do exército rodesiano e sul-africano."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Conferência de Bandung (Indonésia)",
                    period = "18 a 24 de Abril de 1955",
                    description = "Cimeira histórica afro-asiática que marcou a entrada vigorosa do Terceiro Mundo no palco da política internacional."
                ),
                FigureDateItem(
                    title = "Fundação da OUA em Adis Abeba",
                    period = "25 de Maio de 1963",
                    description = "Criação da Organização da Unidade Africana, instituindo o Dia da África celebrado a 25 de Maio."
                ),
                FigureDateItem(
                    title = "Os Países da Linha da Frente",
                    period = "1975 - 1994",
                    description = "Aliança política e estratégica de chefes de Estado liderada por Nyerere, Samora Machel e Kaunda contra o regime do Apartheid."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Qual foi a relevância histórica da Conferência de Bandung de 1955 para os movimentos de libertação nacional em África?",
                    answer = "Legitimou e internacionalizou a luta contra o colonialismo, proclamou o direito dos povos à autodeterminação e incentivou os nacionalistas a organizarem-se em frentes de libertação soberanas.",
                    keyConcept = "Bandung e Anti-Imperialismo"
                ),
                ReviewQuestion(
                    question = "Que papel desempenhou o Comité de Libertação da OUA para a luta armada em Moçambique?",
                    answer = "Canalizou financiamento internacional, forneceu apoio diplomático e militar e coordenou a solidariedade dos Estados africanos independentes à guerrilha da FRELIMO.",
                    keyConcept = "Comité de Libertação da OUA"
                )
            )
        )
    )

    val portuguesModules: List<StudyModule> = listOf(
        StudyModule(
            id = "P_MOD_1",
            subject = Subject.PORTUGUES,
            title = "Concordância Verbal e Nominal",
            subtitle = "Casos gerais, verbos impessoais (haver/fazer) e sujeitos compostos",
            topicTag = "Concordância Verbal",
            summary = "A concordância é a harmonia de flexão gramatical entre palavras relacionadas. Na concordância verbal, o verbo concorda em número e pessoa com o sujeito. Nos exames de admissão ao ensino superior, há ênfase primordial aos casos especiais: o verbo 'haver' com sentido de existir/ocorrer é impessoal (permanece rigorosamente no singular), bem como o verbo 'fazer' indicando tempo decorrido ou clima ('Faz três anos que estudo'). Em sujeitos compostos pospostos, o verbo pode concordar com o núcleo mais próximo ou ir para o plural.",
            keyPoints = listOf(
                "O verbo HAVER impessoal não admite plural: 'Havia muitas dúvidas' (NUNCA: 'Haviam muitas dúvidas').",
                "O verbo FAZER indicando tempo cronológico é impessoal: 'Faz duas semanas' e não 'Fazem duas semanas'.",
                "Com o pronome apassivador 'SE', o verbo concorda com o sujeito paciente: 'Alugam-se quartos' / 'Vende-se casa'.",
                "Com expressões partitivas ('a maioria de', 'grande parte de'), a concordância pode ser com o coletivo ou com o especificador."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Regra de Ouro do 'Haver'",
                    period = "Verbo Impessoal",
                    description = "Substitua mentalmente por 'existir'. Se couber 'existiam', o verbo haver continua no singular 'havia'."
                ),
                FigureDateItem(
                    title = "Partícula Apassivadora vs Índice",
                    period = "Sintaxe da Partícula SE",
                    description = "Verbo transitivo direto + SE = voz passiva (concorda com o sujeito). Verbo transitivo indireto + SE = índice de indeterminação (fica no singular)."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Por que a frase 'Haviam dez candidatos na sala' está incorreta segundo a norma padrão?",
                    answer = "Porque o verbo haver no sentido de existir é impessoal e não possui sujeito com quem concordar, devendo permanecer na 3ª pessoa do singular ('Havia dez candidatos').",
                    keyConcept = "Impessoalidade do verbo haver"
                ),
                ReviewQuestion(
                    question = "Como fica a concordância na oração: 'Vende-se / Vendem-se livros usados'?",
                    answer = "'Vendem-se livros usados', pois 'livros usados' é sujeito paciente na voz passiva sintética, obrigando o verbo a flexionar-se no plural.",
                    keyConcept = "Voz passiva sintética"
                )
            )
        ),
        StudyModule(
            id = "P_MOD_2",
            subject = Subject.PORTUGUES,
            title = "Regência Verbal, Nominal e Crase",
            subtitle = "Transitividade, preposições obrigatórias e regras de uso da crase",
            topicTag = "Regência Verbal e Crase",
            summary = "A regência trata da relação de dependência entre o termo regente (verbo ou nome) e o termo regido (complemento com ou sem preposição). Verbos fundamentais em exames de admissão ao ensino superior incluem: 'aspirar' (desejar exige preposição 'a', respirar não exige preposição), 'assistir' (ver/presenciar exige preposição 'a'), 'visar' (almejar exige 'a'), 'obedecer' (exige preposição 'a') e 'preferir' (exige 'a', rejeitando a expressão 'do que'). A crase é a fusão da preposição 'a' com o artigo feminino 'a', ocorrendo estritamente antes de palavras femininas regidas por termos que pedem 'a'.",
            keyPoints = listOf(
                "Assistir a um exame/aula exige 'a' (Ex: O aluno assistiu à aula magna).",
                "Preferir exige 'a' e nunca 'do que': 'Prefiro estudar a jogar'.",
                "Não ocorre crase antes de verbos, palavras masculinas, pronomes pessoais ou pronomes de tratamento (salvo senhora/senhorita).",
                "Antes de nomes de cidades ou lugares, aplica-se o teste: 'Se vou a e volto da, crase no a; se vou a e volto de, crase pra quê?'"
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Crase Proibida",
                    period = "Regra de Exclusão",
                    description = "Nunca use acento grave antes de verbos (a partir, a discutir) ou diante de substantivos masculinos (a pé, a cavalo)."
                ),
                FigureDateItem(
                    title = "Diferença entre Visar e Aspirar",
                    period = "Semântica dos Regentes",
                    description = "Visar à aprovação (almejar = VTI). Visar o passaporte (carimbar = VTD). Aspirar ao curso de medicina (desejar = VTI)."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Qual é a regência padrão do verbo 'obedecer'?",
                    answer = "O verbo obedecer é transitivo indireto e exige a preposição 'a': 'O candidato obedece às normas da universidade' (com crase diante de 'normas').",
                    keyConcept = "Regência de obedecer/desobedecer"
                ),
                ReviewQuestion(
                    question = "Por que não existe crase na frase: 'Ele começou a estudar às 8h' antes do verbo estudar?",
                    answer = "Porque não existe artigo definido diante de formas verbais no infinitivo, logo não há fusão preposição + artigo.",
                    keyConcept = "Ausência de crase antes de verbo"
                )
            )
        ),
        StudyModule(
            id = "P_MOD_3",
            subject = Subject.PORTUGUES,
            title = "Figuras de Estilo e Semântica",
            subtitle = "Metáfora, metonímia, eufemismo, antítese e relações de sentido",
            topicTag = "Figuras de Estilo",
            summary = "As figuras de estilo são recursos expressivos que enriquecem o texto literário e a comunicação quotidiana. Nos exames de admissão ao ensino superior, o domínio dessas figuras é frequentemente cobrado na interpretação de textos literários moçambicanos. Destacam-se a Metáfora (comparação implícita de qualidades), a Metonímia (troca de termos com relação de contiguidade, como autor pela obra ou continente pelo conteúdo), a Antítese (aproximação de ideias opostas), a Hipérbole (exagero intencional) e o Eufemismo (suavização de realidades duras).",
            keyPoints = listOf(
                "Metáfora: 'A juventude moçambicana é a semente do futuro' (sem conectivo de comparação).",
                "Metonímia: 'Li Mia Couto de uma só vez' (substitui os livros pelo autor).",
                "Eufemismo: Suaviza expressões desfavoráveis ou fúnebres ('Ele descansou em paz').",
                "Parônimos vs Homônimos: Parônimos têm formas parecidas ('descrição/discrição'), homônimos têm som ou grafia iguais ('sessão/seção')."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "Antítese vs Paradoxo",
                    period = "Figuras de Pensamento",
                    description = "A antítese opõe ideias contrárias compatíveis (dia/noite). O paradoxo une termos inconciliáveis que desafiam a lógica ('dor que desatina sem doer')."
                ),
                FigureDateItem(
                    title = "Prosopopeia / Personificação",
                    period = "Atribuição Animada",
                    description = "Atribuir sentimentos, voz ou acções humanas a seres inanimados ou animais ('O vento chorava pelas machambas')."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Identifique a figura de estilo: 'Comprei duas cabeças de gado na província de Gaza'.",
                    answer = "Metonímia (mais especificamente sinédoque, a parte pelo todo: 'cabeças' representando o boi por inteiro).",
                    keyConcept = "Metonímia da parte pelo todo"
                ),
                ReviewQuestion(
                    question = "Diferencie termos sinónimos de termos antónimos com exemplos do contexto escolar.",
                    answer = "Sinónimos possuem sentidos semelhantes (exame/prova, perseverança/dedicação). Antónimos possuem sentidos opostos (aprovação/reprovação, fácil/difícil).",
                    keyConcept = "Semântica lexical"
                )
            )
        ),
        StudyModule(
            id = "P_MOD_4",
            subject = Subject.PORTUGUES,
            title = "Literatura Moçambicana e Seus Autores",
            subtitle = "Da poesia da negritude à prosa contemporânea premiada",
            topicTag = "Literatura Moçambicana",
            summary = "A literatura moçambicana de expressão portuguesa reflecte a evolução histórica, cultural e linguística do país. Divide-se em fases essenciais: a fase pré-nacionalista (com pioneiros como Rui de Noronha), a poesia de combate e reivindicação da negritude nos anos 40 e 50 (liderada pela voz profunda de Noémia de Sousa em 'Sangue Negro' e José Craveirinha em 'Xigubo' e 'Karingana ua Karingana'), a literatura de denúncia colonial (com Luís Bernardo Honwana em 'Nós Matámos o Cão-Tinhoso') e a prosa contemporânea pós-independência (com Mia Couto e Paulina Chiziane, ambos laureados com o Prémio Camões).",
            keyPoints = listOf(
                "José Craveirinha foi o primeiro escritor africano a ser galardoado com o Prémio Camões em 1991.",
                "Noémia de Sousa é considerada a mãe da poesia moçambicana moderna, afirmando a identidade e sofrimento negro.",
                "'Nós Matámos o Cão-Tinhoso' (1964) de Honwana é um marco do conto, utilizando a metáfora do cão doente para expor o racismo e crueldade do colonialismo.",
                "Paulina Chiziane foi a primeira mulher africana a receber o Prémio Camões em 2021, destacando-se com 'Niketche: Uma História de Poligamia'.",
                "Mia Couto recria a língua portuguesa mesclando provérbios, neologismos líricos e sabedoria tradicional bantu."
            ),
            figuresAndDates = listOf(
                FigureDateItem(
                    title = "José Craveirinha",
                    period = "1922 - 2003",
                    description = "Poeta-maior de Moçambique, autor de 'Xigubo', 'Karingana ua Karingana' e Prémio Camões 1991."
                ),
                FigureDateItem(
                    title = "Noémia de Sousa",
                    period = "1926 - 2002",
                    description = "Voz da poesia de resistência e negritude na revista 'Mensagem' e autora da antologia 'Sangue Negro'."
                ),
                FigureDateItem(
                    title = "Mia Couto",
                    period = "1955 - Presente",
                    description = "Autor de 'Terra Sonâmbula', 'Vozes Anoitecidas' e 'O Outro Pé da Sereia', mestre em prosa poética."
                ),
                FigureDateItem(
                    title = "Paulina Chiziane",
                    period = "1955 - Presente",
                    description = "Romancista pioneira, autora de 'Balada de Amor ao Vento' e 'Niketche', Prémio Camões 2021."
                )
            ),
            reviewQuestions = listOf(
                ReviewQuestion(
                    question = "Qual é a relevância do conto 'Nós Matámos o Cão-Tinhoso' de Luís Bernardo Honwana?",
                    answer = "Usa a imagem alegórica de um cão velho e sarnento para denunciar a desumanização gerada pelo sistema colonial racista e a cumplicidade das diferentes classes sociais.",
                    keyConcept = "Alegoria literária anticolonial"
                ),
                ReviewQuestion(
                    question = "O que caracteriza a linguagem literária de Mia Couto em obras como 'Terra Sonâmbula'?",
                    answer = "A criação inovadora de neologismos, a transgressão poética das regras gramaticais e a incorporação da oralidade e cosmovisão bantu moçambicana.",
                    keyConcept = "Estilística e neologismos de Mia Couto"
                )
            )
        )
    )

    fun getModuleById(id: String): StudyModule? {
        return (historiaModules + portuguesModules).firstOrNull { it.id == id }
    }
}
