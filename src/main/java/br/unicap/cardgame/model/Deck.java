package br.unicap.cardgame.model;

import br.unicap.cardgame.util.Utils;
import java.util.ArrayList;
import java.util.List;

public class Deck {

    public static List<Cards> cards = staticCards();

    public static List<Cards> randonCards() {

        List<Cards> randon = null;
//        randon.add(cards.get(Utils.getRandomNumber(0, cards.size())));
//        randon.add(cards.get(Utils.getRandomNumber(0, cards.size())));
//        randon.add(cards.get(Utils.getRandomNumber(0, cards.size())));

        return randon;
    }

    public static Cards randonCard() {
        return cards.get(Utils.getRandomNumber(0, cards.size()));
    }

    private static List<Cards> staticCards() {
//
////card 1
//        List<Answer> a1 = createPossibleAnswer("AR ATMOSFÉRICO", "REFRIGERANTE", "AÇO", "ÁGUA PURA");
//        Question q1 = new Question(0, "É EXEMPLO DE UMA MISTURA HOMOGÊNEA SÓLIDA:", a1, a1.get(2));
//        Subject s1 = new Subject(0, "Science", q1);
//        Card c1 = new Card(2, 1, 2, s1);
////card 2
//        List<Answer> a2 = createPossibleAnswer("LUZ", "CARGA ELÉTRICA", "PRÓTONS", "NÊUTRONS");
//        Question q2 = new Question(0, "CORRENTE ELÉTRICA É O MOVIMENTO ORDENADO DE:", a2, a2.get(1));
//        Subject s2 = new Subject(0, "Science", q2);
//        Card c2 = new Card(1, 2, 1, s2);
////card 3
//        List<Answer> a3 = createPossibleAnswer("UMA PILHA", "UMA TV", "UM RÁDIO", "UMA CALCULADORA");
//        Question q3 = new Question(0, "UM SISTEMA QUÍMICO CAPAZ DE PRODUZIR ENERGIA ELÉTRICA É:", a3, a3.get(0));
//        Subject s3 = new Subject(0, "Science", q3);
//        Card c3 = new Card(1, 2, 2, s3);
////card 4
//        List<Answer> a4 = createPossibleAnswer("LORDOSE", "GARIMPO", "CRIOSCOPIA", "OSMOSE");
//        Question q4 = new Question(0, "PASSAGEM DE ÁGUA POR UMA MEMBRANA SEMIPERMEÁVEL:", a4, a4.get(3));
//        Subject s4 = new Subject(0, "Science", q4);
//        Card c4 = new Card(1, 2, 2, s4);
////card 5
//        List<Answer> a5 = createPossibleAnswer("SUBLIMAÇÃO", "DESTILAÇÃO", "CONDENSAÇÃO", "EVAPORAÇÃO");
//        Question q5 = new Question(0, "A PASSAGEM DO ESTADO SÓLIDO DIRETAMENTE PARA O GASOSO É A:", a5, a5.get(0));
//        Subject s5 = new Subject(0, "Science", q5);
//        Card c5 = new Card(1, 2, 3, s5);
////card 6
//        List<Answer> a6 = createPossibleAnswer("500 MMHG", "600 mmHG", "760 mmHG", "1000 MMHG");
//        Question q6 = new Question(0, "A PRESSÃO ATMOSFÉRICA AO NÍVEL DO MAR É:", a6, a6.get(2));
//        Subject s6 = new Subject(0, "Science", q6);
//        Card c6 = new Card(1, 2, 1, s6);
////card 7
//        List<Answer> a7 = createPossibleAnswer("DILUIÇÃO", "DISSOLUÇÃO", "DISTRAÇÃO", "DISTORÇÃO");
//        Question q7 = new Question(0, "NO PREPARO DE UM REFRESCO A PARTIR DO SUCO CONCENTRADO, FAZEMOS UMA:", a7, a7.get(0));
//        Subject s7 = new Subject(0, "Science", q7);
//        Card c7 = new Card(1, 2, 1, s7);
////card 8
//        List<Answer> a8 = createPossibleAnswer("FERRO E ZINCO", "ZINCO E COBRE", "OURO E PRATA", "ESTANHO E COBRE");
//        Question q8 = new Question(0, "O BRONZE É UMA LIGA METÁLICA CONSTITUÍDA DE:", a8, a8.get(3));
//        Subject s8 = new Subject(0, "Science", q8);
//        Card c8 = new Card(1, 2, 2, s8);
////card 9
//        List<Answer> a9 = createPossibleAnswer("AR ATMOSFÉRICO", "REFRIGERANTE", "AÇO", "ÁGUA PURA");
//        Question q9 = new Question(0, "É EXEMPLO DE UMA MISTURA HOMOGÊNEA LÍQUIDA:", a9, a9.get(1));
//        Subject s9 = new Subject(0, "Science", q9);
//        Card c9 = new Card(2, 1, 2, s9);
////card 10
//        List<Answer> a10 = createPossibleAnswer("FERRO E ZINCO", "ZINCO E COBRE", "OURO E PRATA", "ESTANHO E COBRE");
//        Question q10 = new Question(0, "O LATÃO É UMA LIGA METÁLICA CONSTITUÍDA DE:", a10, a10.get(1));
//        Subject s10 = new Subject(0, "Science", q10);
//        Card c10 = new Card(2, 1, 3, s10);
////card 11
//        List<Answer> a11 = createPossibleAnswer("ZÊNITE", "EQUINÓCIO", "AZIMUTE", "PERIÉLIO");
//        Question q11 = new Question(0, "QUE NOME RECEBE O PONTO SOBRE A CABEÇA DE UM OBSERVADOR CELESTE?", a11, a11.get(0));
//        Subject s11 = new Subject(0, "Science", q11);
//        Card c11 = new Card(2, 1, 2, s11);
////card 12
//        List<Answer> a12 = createPossibleAnswer("ANO-LUZ", "QUILÔMETRO", "DISTÂNCIA-LUZ", "DIA-LUZ");
//        Question q12 = new Question(0, "DISTÂNCIA MÉDIA ENTRE A TERRA E O SOL, USADA COMO UNIDADE DE DISTÂNCIAS NA ASTRONOMIA:", a12, a12.get(1));
//        Subject s12 = new Subject(0, "Science", q12);
//        Card c12 = new Card(2, 1, 2, s12);
////card 13
//        List<Answer> a13 = createPossibleAnswer("LEI DE KEPLER", "LEI DE COULOMB", "LEI DE LENZ", "LEI DE FARADAY-NEUMANN");
//        Question q13 = new Question(0, "LEI FÍSICA QUE PERMITE DETERMINAR A FORÇA ELETROMOTRIZ INDUZIDA:", a13, a13.get(3));
//        Subject s13 = new Subject(0, "Science", q13);
//        Card c13 = new Card(2, 1, 1, s13);
////card 14
//        List<Answer> a14 = createPossibleAnswer("LEI DE KEPLER", "LEI DE COULOMB", "LEI DE LENZ", "LEI DE FARADAY-NEUMANN");
//        Question q14 = new Question(0, "LEI FÍSICA QUE PERMITE DETERMINAR O SENTIDO DA CORRENTE ELÉTRICA INDUZIDA:", a14, a14.get(2));
//        Subject s14 = new Subject(0, "Science", q14);
//        Card c14 = new Card(2, 2, 2, s14);
////card 15
//        List<Answer> a15 = createPossibleAnswer("FARAD", "OHM", "TESLA", "VOLT");
//        Question q15 = new Question(0, "QUAL A UNIDADE DE POTENCIAL ELÉTRICO NO SISTEMA INTERNACIONAL?", a15, a15.get(3));
//        Subject s15 = new Subject(0, "Science", q15);
//        Card c15 = new Card(2, 2, 2, s15);
////card 16
//        List<Answer> a16 = createPossibleAnswer("ISÓGONAS", "FERROMAGNÉTICAS", "DIAMAGNÉTICAS", "ISÓCLINAS");
//        Question q16 = new Question(0, "QUE SUBSTÂNCIAS, AO SEREM COLOCADAS NO NÚCLEO DE UM SOLENÓIDE, GERAM UM GRANDE AUMENTO NA INTENSIDADE DO CAMPO MAGNÉTICO?", a16, a16.get(1));
//        Subject s16 = new Subject(0, "Science", q16);
//        Card c16 = new Card(2, 2, 2, s16);
////card 17
//        List<Answer> a17 = createPossibleAnswer("PARAMAGNÉTICAS", "DIAMAGNÉTICAS", "ISÓGONAS", "ISÓCLINAS");
//        Question q17 = new Question(0, "QUE SUBSTÂNCIAS, AO SEREM COLOCADAS NO NÚCLEO DE UM SOLENÓIDE, QUASE NÃO INTERFEREM NO CAMPO MAGNÉTICO, GERANDO UM LEVE AUMENTO?", a17, a17.get(0));
//        Subject s17 = new Subject(0, "Science", q17);
//        Card c17 = new Card(2, 2, 2, s17);
////card 18
//        List<Answer> a18 = createPossibleAnswer("AGÔNICAS", "ISÓGONAS", "ISÓCLINAS", "DIAMAGNÉTICAS");
//        Question q18 = new Question(0, "QUE SUBSTÂNCIAS, AO SEREM COLOCADAS NO NÚCLEO DE UM SOLENÓIDE, ENFRAQUECEM O CAMPO MAGNÉTICO ORIGINADO PELO SOLENÓIDE?", a18, a18.get(3));
//        Subject s18 = new Subject(0, "Science", q18);
//        Card c18 = new Card(2, 2, 2, s18);
////card 19
//        List<Answer> a19 = createPossibleAnswer("AR ATMOSFÉRICO", "REFRIGERANTE", "AÇO", "ÁGUA PURA");
//        Question q19 = new Question(0, "É EXEMPLO DE UMA MISTURA HOMOGÊNEA GASOSA:", a19, a19.get(0));
//        Subject s19 = new Subject(0, "Science", q19);
//        Card c19 = new Card(2, 2, 2, s19);
////card 20
//        List<Answer> a20 = createPossibleAnswer("SUBLIMAÇÃO", "VAPORIZAÇÃO", "CONDENSAÇÃO", "FUSÃO");
//        Question q20 = new Question(0, "QUAL O NOME DADO À PASSAGEM DO ESTADO SÓLIDO PARA O ESTADO GASOSO?", a20, a20.get(0));
//        Subject s20 = new Subject(0, "Science", q20);
//        Card c20 = new Card(1, 2, 3, s20);
////card 21
//        List<Answer> a21 = createPossibleAnswer("NÊUTRON", "ELÉTRON", "PRÓTON", "ANGSTRÖM");
//        Question q21 = new Question(0, "COMO É CHAMADA A PARTÍCULA SUBATÔMICA DOTADA DE CARGA POSITIVA?", a21, a21.get(2));
//        Subject s21 = new Subject(0, "Science", q21);
//        Card c21 = new Card(1, 2, 3, s21);
////card 22
//        List<Answer> a22 = createPossibleAnswer("NÊUTRON", "ELÉTRON", "PRÓTON", "ANGSTRÖM");
//        Question q22 = new Question(0, "COMO É CHAMADA A PARTÍCULA SUBATÔMICA SEM CARGA?", a22, a22.get(0));
//        Subject s22 = new Subject(0, "Science", q22);
//        Card c22 = new Card(3, 3, 2, s22);
////card 23
//        List<Answer> a23 = createPossibleAnswer("NÊUTRON", "ELÉTRON", "PRÓTON", "ANGSTRÖM");
//        Question q23 = new Question(0, "COMO É CHAMADA A PARTÍCULA SUBATÔMICA DOTADA DE CARGA NEGATIVA?", a23, a23.get(1));
//        Subject s23 = new Subject(0, "Science", q23);
//        Card c23 = new Card(3, 2, 3, s23);
////card 24
//        List<Answer> a24 = createPossibleAnswer("CALCULISTAS", "FUNDAMENTAIS", "PONDERAIS", "GERAIS");
//        Question q24 = new Question(0, "QUE LEIS RELACIONAM AS MASSAS DAS SUBSTÂNCIAS EM UMA REAÇÃO QUÍMICA?", a24, a24.get(2));
//        Subject s24 = new Subject(0, "Science", q24);
//        Card c24 = new Card(2, 1, 3, s24);
////card 25
//        List<Answer> a25 = createPossibleAnswer("VENTILAÇÃO", "FILTRAÇÃO", "DESTILAÇÃO", "EVAPORAÇÃO");
//        Question q25 = new Question(0, "QUAL O NOME DA TÉCNICA DE SEPARAÇÃO UTILIZADA NAS SALINAS?", a25, a25.get(3));
//        Subject s25 = new Subject(0, "Science", q25);
//        Card c25 = new Card(2, 2, 3, s25);
////card 26
//        List<Answer> a26 = createPossibleAnswer("RAND", "TAKA", "LEMPIRA", "QUETZAL");
//        Question q26 = new Question(0, "QUAL A MOEDA OFICIAL DA ÁFRICA DO SUL?", a26, a26.get(0));
//        Subject s26 = new Subject(0, "Geography", q26);
//        Card c26 = new Card(1, 2, 2, s26);
////card 27
//        List<Answer> a27 = createPossibleAnswer("TOCANTINS", "SOLIMÕES", "PARANAPANEMA", "PARAGUAI");
//        Question q27 = new Question(0, "A BACIA PLATINA É FORMADA POR TRÊS RIOS PRINCIPAIS: O URUGUAI, O PARANÁ E O:", a27, a27.get(3));
//        Subject s27 = new Subject(0, "Geography", q27);
//        Card c27 = new Card(2, 2, 3, s27);
////card 28
//        List<Answer> a28 = createPossibleAnswer("MAMONA", "ÂMBAR", "PETRÓLEO", "CARVÃO MINERAL");
//        Question q28 = new Question(0, "SUBSTÂNCIA OLEOSA CONSTITUÍDA BASICAMENTE DA COMBINAÇÃO DE CARBONO E HIDROGÊNIO:", a28, a28.get(2));
//        Subject s28 = new Subject(0, "Geography", q28);
//        Card c28 = new Card(2, 3, 1, s28);
////card 29
//        List<Answer> a29 = createPossibleAnswer("DE STEELE", "DE MOHS", "DE RICHTER", "DE YELLOWSTONE");
//        Question q29 = new Question(0, "QUE ESCALA MEDE A INTENSIDADE DOS ABALOS SÍSMICOS?", a29, a29.get(2));
//        Subject s29 = new Subject(0, "Geography", q29);
//        Card c29 = new Card(1, 2, 2, s29);
////card 30
//        List<Answer> a30 = createPossibleAnswer("DE MOHS", "DE MORGAN", "DE WEGENER", "DE RICHTER");
//        Question q30 = new Question(0, "A DUREZA DOS MINERAIS PODE SER MEDIDA PELA ESCALA:", a30, a30.get(0));
//        Subject s30 = new Subject(0, "Geography", q30);
//        Card c30 = new Card(2, 3, 1, s30);
////card 31
//        List<Answer> a31 = createPossibleAnswer("BAFÔMETRO", "ANEMÔMETRO", "PLUVIÔMETRO", "HIDRÔMETRO");
//        Question q31 = new Question(0, "QUE APARELHO MEDE A QUANTIDADE DE CHUVAS DE UM LUGAR?", a31, a31.get(2));
//        Subject s31 = new Subject(0, "Geography", q31);
//        Card c31 = new Card(2, 2, 2, s31);
////card 32
//        List<Answer> a32 = createPossibleAnswer("NORTE", "CENTRO-OESTE", "NORDESTE", "SUL");
//        Question q32 = new Question(0, "EM QUE REGIÃO DO BRASIL HÁ OCORRÊNCIA DE FREQÜENTES GEADAS DURANTE O INVERNO?", a32, a32.get(3));
//        Subject s32 = new Subject(0, "Geography", q32);
//        Card c32 = new Card(2, 3, 2, s32);
////card 33
//        List<Answer> a33 = createPossibleAnswer("DO PAÍS BASCO", "DAS MALVINAS", "DO TIMOR LESTE", "DA FRANÇA");
//        Question q33 = new Question(0, "LOCALIZADOS ENTRE A ESPANHA E A FRANÇA, OS SEPARATISTAS LUTAM PELA INDEPENDÊNCIA:", a33, a33.get(0));
//        Subject s33 = new Subject(0, "Geography", q33);
//        Card c33 = new Card(3, 2, 2, s33);
////card 34
//        List<Answer> a34 = createPossibleAnswer("HIDROVIÁRIO", "RODOVIÁRIO", "FERROVIÁRIO", "AEROVIÁRIO");
//        Question q34 = new Question(0, "TIPO DE TRANSPORTE MAIS UTILIZADO NO DESLOCAMENTO DE CARGAS E PESSOAS NOS PAÍSES RICOS:", a34, a34.get(2));
//        Subject s34 = new Subject(0, "Geography", q34);
//        Card c34 = new Card(3, 2, 2, s34);
////card 35
//        List<Answer> a35 = createPossibleAnswer("LATERIZAÇÃO", "DESMORONAMENTO", "LIXIVIAÇÃO", "DESBARRANCAMENTO");
//        Question q35 = new Question(0, "PROCESSO PELO QUAL A ÁGUA 'LAVA' OS SAIS MINERAIS HIDROSSOLÚVEIS DO SOLO:", a35, a35.get(2));
//        Subject s35 = new Subject(0, "Geography", q35);
//        Card c35 = new Card(3, 2, 1, s35);
////card 36
//        List<Answer> a36 = createPossibleAnswer("BALANÇA DE MERCADO", "BALANÇA COMERCIAL", "BALANÇA FINANCEIRA", "BALANÇA DE TROCAS");
//        Question q36 = new Question(0, "A RELAÇÃO ENTRE EXPORTAÇÕES E IMPORTAÇÕES DE UM PAÍS RECEBE O NOME DE:", a36, a36.get(1));
//        Subject s36 = new Subject(0, "Geography", q36);
//        Card c36 = new Card(2, 1, 3, s36);
////card 37
//        List<Answer> a37 = createPossibleAnswer("CORRENTE DO GOLFO", "CORRENTE DO JAPÃO", "CORRENTE DE BENGUELA", "CORRENTE DA GROENLÂNDIA");
//        Question q37 = new Question(0, "CORRENTE MARÍTIMA QUENTE QUE IMPEDE O CONGELAMENTO DO MAR DO NORTE E SUAVIZA O INVERNO LOCAL:", a37, a37.get(0));
//        Subject s37 = new Subject(0, "Geography", q37);
//        Card c37 = new Card(2, 2, 3, s37);
////card 38
//        List<Answer> a38 = createPossibleAnswer("CONVECTIVA", "FRONTAL", "OROGRÁFICA", "INVERTIDA");
//        Question q38 = new Question(0, "QUE CHUVA RESULTA DO ENCONTRO DE DUAS MASSAS DE AR DIFERENTES (QUENTE E FRIA)?", a38, a38.get(1));
//        Subject s38 = new Subject(0, "Geography", q38);
//        Card c38 = new Card(2, 3, 3, s38);
////card 39
//        List<Answer> a39 = createPossibleAnswer("EQUATORIAL", "TROPICAL", "SEMI-ÁRIDO", "SUBTROPICAL");
//        Question q39 = new Question(0, "O TIPO CLIMÁTICO DOS 8% DO TERRITÓRIO NACIONAL ABAIXO DO TRÓPICO DE CAPRICÓRNIO É:", a39, a39.get(3));
//        Subject s39 = new Subject(0, "Geography", q39);
//        Card c39 = new Card(3, 1, 2, s39);
////card 40
//        List<Answer> a40 = createPossibleAnswer("TRANSUMÂNCIA", "ÊXODO RURAL", "NOMADISMO", "ÊXODO URBANO");
//        Question q40 = new Question(0, "DESLOCAMENTO CONSTANTE DE GRUPOS DE PESSOAS EM BUSCA DE ALIMENTOS E PASTAGENS:", a40, a40.get(2));
//        Subject s40 = new Subject(0, "Geography", q40);
//        Card c40 = new Card(2, 2, 2, s40);
////card 41
//        List<Answer> a41 = createPossibleAnswer("ESTADOS UNIDOS", "ALEMANHA", "ALBÂNIA", "INGLATERRA");
//        Question q41 = new Question(0, "PRIMEIRO PAÍS DO MUNDO A SE URBANIZAR, TENDO EM 1850 MAIS DE 50% DA POPULAÇÃO URBANA:", a41, a41.get(3));
//        Subject s41 = new Subject(0, "Geography", q41);
//        Card c41 = new Card(2, 3, 1, s41);
////card 42
//        List<Answer> a42 = createPossibleAnswer("ANÊMONAS", "CARNAÚBAS", "BABAÇUAIS", "MANGUES");
//        Question q42 = new Question(0, "VEGETAÇÃO TÍPICA DE AMBIENTES LITORÂNEOS BAIXOS:", a42, a42.get(3));
//        Subject s42 = new Subject(0, "Geography", q42);
//        Card c42 = new Card(1, 3, 2, s42);
////card 43
//        List<Answer> a43 = createPossibleAnswer("PAMPAS", "MATA ATLÂNTICA", "CERRADO", "CAATINGA");
//        Question q43 = new Question(0, "VEGETAÇÃO TÍPICA DA REGIÃO CENTRO-OESTE DO BRASIL:", a43, a43.get(2));
//        Subject s43 = new Subject(0, "Geography", q43);
//        Card c43 = new Card(2, 2, 3, s43);
////card 44
//        List<Answer> a44 = createPossibleAnswer("CERRADO", "TUNDRA", "CAATINGA", "FLORESTAS EQUATORIAIS");
//        Question q44 = new Question(0, "VEGETAÇÃO ENCONTRADA EM LOCAIS FRIOS:", a44, a44.get(1));
//        Subject s44 = new Subject(0, "Geography", q44);
//        Card c44 = new Card(2, 2, 2, s44);
////card 45
//        List<Answer> a45 = createPossibleAnswer("ESCRAVISMO", "COMUNISMO", "CAPITALISMO", "FEUDALISMO");
//        Question q45 = new Question(0, "NOVO MODO DE PRODUÇÃO SURGIDO NA IDADE MÉDIA:", a45, a45.get(3));
//        Subject s45 = new Subject(0, "Geography", q45);
//        Card c45 = new Card(2, 1, 3, s45);
////card 46
//        List<Answer> a46 = createPossibleAnswer("OZÔNIO", "METANO", "CLORÍDRICO", "CARBÔNICO");
//        Question q46 = new Question(0, "QUE GÁS DA ATMOSFERA FILTRA ATÉ 90% DOS RAIOS ULTRAVIOLETA?", a46, a46.get(0));
//        Subject s46 = new Subject(0, "Geography", q46);
//        Card c46 = new Card(1, 2, 1, s46);
////card 47
//        List<Answer> a47 = createPossibleAnswer("MONTANHAS ALTAS", "ÚLTIMAS MODERNAS", "CURVAS MODERNAS", "DOBRAMENTOS MODERNOS");
//        Question q47 = new Question(0, "NA ERA CENOZÓICA SOERGUERAM ALGUMAS CADEIAS DE MONTANHAS, QUE FICARAM CONHECIDAS COMO:", a47, a47.get(3));
//        Subject s47 = new Subject(0, "Geography", q47);
//        Card c47 = new Card(1, 3, 2, s47);
////card 48
//        List<Answer> a48 = createPossibleAnswer("PESO DOS GASES", "PRESSÃO DA TERRA", "PRESSÃO ATMOSFÉRICA", "PRESSÃO DO OZÔNIO");
//        Question q48 = new Question(0, "CORRESPONDE À FORÇA PROVOCADA PELO PESO DO AR:", a48, a48.get(2));
//        Subject s48 = new Subject(0, "Geography", q48);
//        Card c48 = new Card(1, 2, 3, s48);
////card 49
//        List<Answer> a49 = createPossibleAnswer("PRADARIAS", "TUNDRAS", "CONÍFERAS", "FLORESTAS");
//        Question q49 = new Question(0, "QUE VEGETAÇÃO RASTEIRA SE ENCONTRA NAS REGIÕES POLARES?", a49, a49.get(1));
//        Subject s49 = new Subject(0, "Geography", q49);
//        Card c49 = new Card(1, 2, 1, s49);
////card 50
//        List<Answer> a50 = createPossibleAnswer("PRATA", "URÂNIO", "COBRE", "MERCÚRIO");
//        Question q50 = new Question(0, "QUE METAL É UTILIZADO NOS GARIMPOS PARA SEPARAR O OURO DO CASCALHO?", a50, a50.get(3));
//        Subject s50 = new Subject(0, "Geography", q50);
//        Card c50 = new Card(1, 2, 3, s50);
////card 51
//        List<Answer> a51 = createPossibleAnswer("AMIENS", "POLTIER", "WATERLOO", "LYON");
//        Question q51 = new Question(0, "EM QUE BATALHA NAPOLEÃO FOI DEFINITIVAMENTE DERROTADO PELA INGLATERRA?", a51, a51.get(2));
//        Subject s51 = new Subject(0, "History", q51);
//        Card c51 = new Card(1, 2, 3, s51);
////card 52
//        List<Answer> a52 = createPossibleAnswer("DESCARTES", "PLATÃO", "MARQUÊS DE POMBAL", "MOLIÈRE");
//        Question q52 = new Question(0, "QUEM FOI O PRECURSOR DO ILUMINISMO?", a52, a52.get(0));
//        Subject s52 = new Subject(0, "History", q52);
//        Card c52 = new Card(1, 2, 3, s52);
////card 53
//        List<Answer> a53 = createPossibleAnswer("1832", "1830", "1821", "1819");
//        Question q53 = new Question(0, "ANO DA INDEPENDÊNCIA DO PERU:", a53, a53.get(2));
//        Subject s53 = new Subject(0, "History", q53);
//        Card c53 = new Card(1, 2, 3, s53);
////card 54
//        List<Answer> a54 = createPossibleAnswer("SOLANO LOPEZ", "AGUSTIN ITURBIDE", "SIMÓN BOLÍVAR", "ANGEL JIMENEZ");
//        Question q54 = new Question(0, "UM DOS PRINCIPAIS LÍDERES DA INDEPENDÊNCIA DAS COLÔNIAS NA AMÉRICA:", a54, a54.get(2));
//        Subject s54 = new Subject(0, "History", q54);
//        Card c54 = new Card(1, 2, 3, s54);
////card 55
//        List<Answer> a55 = createPossibleAnswer("ALSÁCIA E PARIS", "LYON E MARSELHA", "LORENA E LYON", "ALSÁCIA E LORENA");
//        Question q55 = new Question(0, "TERRITÓRIOS ANEXADOS PELA PRÚSSIA NA GUERRA FRANCO-PRUSSIANA:", a55, a55.get(3));
//        Subject s55 = new Subject(0, "History", q55);
//        Card c55 = new Card(1, 2, 3, s55);
////card 56
//        List<Answer> a56 = createPossibleAnswer("CARLOS MAZZINI", "CAVOUR", "REI VÍTOR JOSÉ II", "GIUSEPPE GARIBALDI");
//        Question q56 = new Question(0, "PRINCIPAL LÍDER DA UNIFICAÇÃO ITALIANA:", a56, a56.get(3));
//        Subject s56 = new Subject(0, "History", q56);
//        Card c56 = new Card(1, 2, 3, s56);
////card 57
//        List<Answer> a57 = createPossibleAnswer("BAKUNIN", "HITLER", "MUSSOLINI", "KARL MARX");
//        Question q57 = new Question(0, "AUTOR DA FRASE - PROLETÁRIOS DE TODOS OS PAÍSES, UNI-VOS!:", a57, a57.get(3));
//        Subject s57 = new Subject(0, "History", q57);
//        Card c57 = new Card(2, 3, 2, s57);
////card 58
//        List<Answer> a58 = createPossibleAnswer("MANIFESTO COMUNISTA", "O CAPITAL", "A DIALÉTICA", "O SOCIALISMO");
//        Question q58 = new Question(0, "PRINCIPAL LIVRO DE KARL MARX:", a58, a58.get(1));
//        Subject s58 = new Subject(0, "History", q58);
//        Card c58 = new Card(2, 3, 2, s58);
////card 59
//        List<Answer> a59 = createPossibleAnswer("1840", "1850", "1820", "1830");
//        Question q59 = new Question(0, "ANO DA INDEPENDÊNCIA DA COLÔMBIA:", a59, a59.get(3));
//        Subject s59 = new Subject(0, "History", q59);
//        Card c59 = new Card(2, 3, 2, s59);
////card 60
//        List<Answer> a60 = createPossibleAnswer("ROBERT OWEN", "KARL MARX", "SAINT SIMÓN", "CHARLES FOURIER");
//        Question q60 = new Question(0, "PRINCIPAL IDEALIZADOR DO SOCIALISMO CIENTÍFICO:", a60, a60.get(1));
//        Subject s60 = new Subject(0, "History", q60);
//        Card c60 = new Card(2, 3, 2, s60);
////card 61
//        List<Answer> a61 = createPossibleAnswer("1830", "1820", "1810", "1800");
//        Question q61 = new Question(0, "ANO DA INDEPENDÊNCIA DA VENEZUELA:", a61, a61.get(0));
//        Subject s61 = new Subject(0, "History", q61);
//        Card c61 = new Card(2, 3, 2, s61);
////card 62
//        List<Answer> a62 = createPossibleAnswer("CECÍLIA", "SANTA HELENA", "ELBA", "IBIZA");
//        Question q62 = new Question(0, "EM QUE ILHA MORREU NAPOLEÃO BONAPARTE?", a62, a62.get(1));
//        Subject s62 = new Subject(0, "History", q62);
//        Card c62 = new Card(2, 3, 2, s62);
////card 63
//        List<Answer> a63 = createPossibleAnswer("INGLATERRA", "RÚSSIA", "ESPANHA", "ÁUSTRIA");
//        Question q63 = new Question(0, "QUE PAÍS NÃO FEZ PARTE DA SEXTA COLIGAÇÃO CONTRA NAPOLEÃO BONAPARTE?", a63, a63.get(2));
//        Subject s63 = new Subject(0, "History", q63);
//        Card c63 = new Card(2, 3, 2, s63);
////card 64
//        List<Answer> a64 = createPossibleAnswer("18 DE TERMIDOR", "9 DE TERMIDOR", "18 DE BRUMÁRIO", "9 DE BRUMÁRIO");
//        Question q64 = new Question(0, "GOLPE DADO POR NAPOLEÃO BONAPARTE PARA FORMAR O CONSULADO:", a64, a64.get(2));
//        Subject s64 = new Subject(0, "History", q64);
//        Card c64 = new Card(2, 3, 2, s64);
////card 65
//        List<Answer> a65 = createPossibleAnswer("PAZ SILENCIOSA", "PERÍODO DO TERROR", "PAZ EXTREMA", "PAZ ARMADA");
//        Question q65 = new Question(0, "COMO FICOU CONHECIDO O PERÍODO ENTRE 1870 E 1914?", a65, a65.get(3));
//        Subject s65 = new Subject(0, "History", q65);
//        Card c65 = new Card(2, 3, 2, s65);
////card 66
//        List<Answer> a66 = createPossibleAnswer("THOMAS EDISON", "THOMAS JEFFERSON", "JOHN LOCKE", "BENJAMIN FRANKLIN");
//        Question q66 = new Question(0, "QUEM ELABOROU A DECLARAÇÃO DE INDEPENDÊNCIA DOS EUA?", a66, a66.get(1));
//        Subject s66 = new Subject(0, "History", q66);
//        Card c66 = new Card(2, 1, 2, s66);
////card 67
//        List<Answer> a67 = createPossibleAnswer("1777", "1786", "1771", "1776");
//        Question q67 = new Question(0, "QUAL O ANO DA DECLARAÇÃO DE INDEPENDÊNCIA DOS EUA?", a67, a67.get(3));
//        Subject s67 = new Subject(0, "History", q67);
//        Card c67 = new Card(2, 1, 2, s67);
////card 68
//        List<Answer> a68 = createPossibleAnswer("ESPANHA E FRANÇA", "FRANÇA E INGLATERRA", "ESPANHA  E INGLATERRA", "FRANÇA E PRÚSSIA");
//        Question q68 = new Question(0, "ENTRE QUE PAÍSES SE DESENVOLVEU A GUERRA DOS 7 ANOS?", a68, a68.get(1));
//        Subject s68 = new Subject(0, "History", q68);
//        Card c68 = new Card(2, 1, 2, s68);
////card 69
//        List<Answer> a69 = createPossibleAnswer("DIA X", "DIA FATAL", "DIA D", "DIA N");
//        Question q69 = new Question(0, "COMO FICOU CONHECIDO O DESEMBARQUE DAS TROPAS ALIADAS NA NORMANDIA?", a69, a69.get(2));
//        Subject s69 = new Subject(0, "History", q69);
//        Card c69 = new Card(2, 1, 2, s69);
////card 70
//        List<Answer> a70 = createPossibleAnswer("ENGELS", "HEGEL", "BAKUNIN", "PROUDHON");
//        Question q70 = new Question(0, "PRINCIPAL COLORABORADOR DE MARX EM SUAS OBRAS:", a70, a70.get(0));
//        Subject s70 = new Subject(0, "History", q70);
//        Card c70 = new Card(2, 1, 2, s70);
////card 71
//        List<Answer> a71 = createPossibleAnswer("1878", "1875", "1898", "1892");
//        Question q71 = new Question(0, "ANO DA INDEPENDÊNCIA DE PORTO RICO:", a71, a71.get(2));
//        Subject s71 = new Subject(0, "History", q71);
//        Card c71 = new Card(2, 1, 2, s71);
////card 72
//        List<Answer> a72 = createPossibleAnswer("SMALL", "BIG MAN", "DUCE", "FÜHRER");
//        Question q72 = new Question(0, "COMO HITLER ERA CONHECIDO?", a72, a72.get(3));
//        Subject s72 = new Subject(0, "History", q72);
//        Card c72 = new Card(2, 1, 2, s72);
////card 73
//        List<Answer> a73 = createPossibleAnswer("FÜHRER", "DUCE", "PAI DOS POBRES", "AMICI");
//        Question q73 = new Question(0, "COMO MUSSOLINI ERA CONHECIDO?", a73, a73.get(1));
//        Subject s73 = new Subject(0, "History", q73);
//        Card c73 = new Card(2, 1, 2, s73);
////card 74
//        List<Answer> a74 = createPossibleAnswer("HOOVER", "ROOSEVELT", "NIXON", "CARTER");
//        Question q74 = new Question(0, "QUE PRESIDENTE NORTE-AMERICANO REVOGOU A LEI SECA?", a74, a74.get(1));
//        Subject s74 = new Subject(0, "History", q74);
//        Card c74 = new Card(3, 2, 2, s74);
////card 75
//        List<Answer> a75 = createPossibleAnswer("PLANO MARSHALL", "PLANO DE METAS", "NEW DEAL", "NEW DOG");
//        Question q75 = new Question(0, "POLÍTICA IMPLANTADA POR ROOSEVELT PARA TIRAR OS EUA DA CRISE ECONÔMICA:", a75, a75.get(2));
//        Subject s75 = new Subject(0, "History", q75);
//        Card c75 = new Card(3, 2, 2, s75);
////card 76
//        List<Answer> a76 = createPossibleAnswer("25", "35", "30", "40");
//        Question q76 = new Question(0, "MEU PAI É 5 ANOS MAIS VELHO QUE MINHA MÃE, QUE TEM O TRIPLO DA MINHA IDADE. SE EU TENHO 10 ANOS, QUAL É A IDADE DO MEU PAI?", a76, a76.get(1));
//        Subject s76 = new Subject(0, "Math", q76);
//        Card c76 = new Card(3, 2, 2, s76);
////card 77
//        List<Answer> a77 = createPossibleAnswer("6", "8", "10", "12");
//        Question q77 = new Question(0, "UM CAMPEONATO FOI DISPUTADO POR 4 TIMES. SE TODOS JOGAM CONTRA TODOS DUAS VEZES, QUANTOS JOGOS FORAM NO TOTAL?", a77, a77.get(3));
//        Subject s77 = new Subject(0, "Math", q77);
//        Card c77 = new Card(3, 2, 2, s77);
////card 78
//        List<Answer> a78 = createPossibleAnswer("25", "50", "75", "100");
//        Question q78 = new Question(0, "NO CAMPEONATO BRASILEIRO, VITÓRIA VALE 3 PONTOS, EMPATE VALE 1 PONTO E DERROTA NÃO MARCA PONTO. QUANTOS PONTOS MARCARÍAMOS SE VENCÊSSEMOS TODOS OS 25 JOGOS", a78, a78.get(2));
//        Subject s78 = new Subject(0, "Math", q78);
//        Card c78 = new Card(3, 2, 2, s78);
////card 79
//        List<Answer> a79 = createPossibleAnswer("11", "10", "9", "8");
//        Question q79 = new Question(0, "EM UM CAMPEONATO, VITÓRIA VALE 3 PONTOS, EMPATE VALE 1 PONTO E DERROTA NÃO MARCA PONTO. QUANTOS PONTOS MARCARÍAMOS SE VENCÊSSEMOS 2 JOGOS E EMPATÁSSEMOS 5?", a79, a79.get(0));
//        Subject s79 = new Subject(0, "Math", q79);
//        Card c79 = new Card(3, 2, 2, s79);
////card 80
//        List<Answer> a80 = createPossibleAnswer("18", "17", "16", "15");
//        Question q80 = new Question(0, "EM UM CAMPEONATO, VITÓRIA VALE 3 PONTOS, EMPATE VALE 1 PONTO E DERROTA NÃO MARCA PONTO. QUANTOS PONTOS MARCARÍAMOS SE VENCÊSSEMOS 5 JOGOS E EMPATÁSSEMOS 2?", a80, a80.get(1));
//        Subject s80 = new Subject(0, "Math", q80);
//        Card c80 = new Card(3, 2, 2, s80);
////card 81
//        List<Answer> a81 = createPossibleAnswer("UMA VEZ", "DUAS VEZES", "TRÊS VEZES", "NENHUMA VEZ");
//        Question q81 = new Question(0, "MEU TIME JOGOU 3 VEZES. CADA VITÓRIA VALE 3 PONTOS, EMPATE VALE 1 PONTO E DERROTA NÃO MARCA PONTO. SE TEMOS 5 PONTOS, QUANTAS VEZES GANHAMOS?", a81, a81.get(0));
//        Subject s81 = new Subject(0, "Math", q81);
//        Card c81 = new Card(2, 1, 2, s81);
////card 82
//        List<Answer> a82 = createPossibleAnswer("25 ANOS", "26 ANOS", "28 ANOS", "30 ANOS");
//        Question q82 = new Question(0, "SOMANDO MINHA IDADE COM A DE MEU IRMÃO, OBTENHO 22 ANOS. QUANTO DARÁ A SOMA DE NOSSAS IDADES DAQUI A 3 ANOS?", a82, a82.get(2));
//        Subject s82 = new Subject(0, "Math", q82);
//        Card c82 = new Card(2, 1, 2, s82);
////card 83
//        List<Answer> a83 = createPossibleAnswer("135 REAIS", "140 REAIS", "145 REAIS", "150 REAIS");
//        Question q83 = new Question(0, "COMPREI UM PAR DE TÊNIS POR 125 REAIS E DOIS PARES DE MEIAS POR 10 REAIS CADA UM. SE GASTEI TUDO O QUE TINHA, QUANTO EU TINHA ANTES DAS COMPRAS?", a83, a83.get(2));
//        Subject s83 = new Subject(0, "Math", q83);
//        Card c83 = new Card(2, 1, 2, s83);
////card 84
//        List<Answer> a84 = createPossibleAnswer("14", "13", "12", "11");
//        Question q84 = new Question(0, "EU SOU 3 ANOS MAIS VELHO QUE MEU IRMÃO. SE A SOMA DA MINHA IDADE COM A DELE É 25, QUAL É A IDADE DE MEU IRMÃO?", a84, a84.get(3));
//        Subject s84 = new Subject(0, "Math", q84);
//        Card c84 = new Card(2, 1, 2, s84);
////card 85
//        List<Answer> a85 = createPossibleAnswer("60 REAIS", "30 REAIS", "120 REAIS", "100 REAIS");
//        Question q85 = new Question(0, "COM A MINHA MESADA CONSIGO COMPRAR 60 CANETAS. SE CADA CANETA CUSTA 50 CENTAVOS, QUAL É O VALOR DA MINHA MESADA?", a85, a85.get(1));
//        Subject s85 = new Subject(0, "Math", q85);
//        Card c85 = new Card(2, 1, 2, s85);
////card 86
//        List<Answer> a86 = createPossibleAnswer("21", "15", "5", "10");
//        Question q86 = new Question(0, "FIQUEI DOIS DIAS SEM COMER EM UMA SEMANA. SE FAÇO 3 REFEIÇÕES POR DIA, QUANTAS EU FIZ DURANTE ESSA SEMANA?", a86, a86.get(1));
//        Subject s86 = new Subject(0, "Math", q86);
//        Card c86 = new Card(2, 1, 2, s86);
////card 87
//        List<Answer> a87 = createPossibleAnswer("VINTE POR CENTO", "VIGÉSIMO", "UM VINTE AVOS", "VINTE");
//        Question q87 = new Question(0, "COMO SE LÊ 20%", a87, a87.get(0));
//        Subject s87 = new Subject(0, "Math", q87);
//        Card c87 = new Card(2, 1, 2, s87);
////card 88
//        List<Answer> a88 = createPossibleAnswer("TERCEIRO", "TRÊS", "TERÇO", "UM TERÇO");
//        Question q88 = new Question(0, "COMO SE LÊ 3º", a88, a88.get(0));
//        Subject s88 = new Subject(0, "Math", q88);
//        Card c88 = new Card(2, 1, 2, s88);
////card 89
//        List<Answer> a89 = createPossibleAnswer("QUINZE", "VIGÉSIMO", "TRIPLO", "TERÇO");
//        Question q89 = new Question(0, "É EXEMPLO DE NÚMERO FRACIONÁRIO:", a89, a89.get(3));
//        Subject s89 = new Subject(0, "Math", q89);
//        Card c89 = new Card(2, 1, 2, s89);
////card 90
//        List<Answer> a90 = createPossibleAnswer("QUÁDRUPLO", "MEIO", "TERÇO", "SEXTO");
//        Question q90 = new Question(0, "É EXEMPLO DE NÚMERO MULTIPLICATIVO:", a90, a90.get(0));
//        Subject s90 = new Subject(0, "Math", q90);
//        Card c90 = new Card(2, 1, 2, s90);
////card 91
//        List<Answer> a91 = createPossibleAnswer("SÉTIMO", "DOIS", "QUÁDRUPLO", "TERÇO");
//        Question q91 = new Question(0, "É EXEMPLO DE NÚMERO ORDINAL:", a91, a91.get(0));
//        Subject s91 = new Subject(0, "Math", q91);
//        Card c91 = new Card(1, 2, 3, s91);
////card 92
//        List<Answer> a92 = createPossibleAnswer("SEIS", "TRIPLO", "VIGÉSIMA", "QUARTO");
//        Question q92 = new Question(0, "É EXEMPLO DE NÚMERO CARDINAL:", a92, a92.get(0));
//        Subject s92 = new Subject(0, "Math", q92);
//        Card c92 = new Card(1, 2, 3, s92);
////card 93
//        List<Answer> a93 = createPossibleAnswer("32.5", "325", "3.25", "3025");
//        Question q93 = new Question(0, "QUAL O NÚMERO FORMADO POR 3 CENTENAS, 2 DEZENAS E 5 UNIDADES?", a93, a93.get(1));
//        Subject s93 = new Subject(0, "Math", q93);
//        Card c93 = new Card(1, 2, 3, s93);
////card 94
//        List<Answer> a94 = createPossibleAnswer("37", "36", "35", "34");
//        Question q94 = new Question(0, "MEU PAI E MINHA MÃE NASCERAM NO MESMO DIA E NO MESMO ANO. SE A SOMA DAS IDADES DELES É 74, QUAL É A IDADE DE CADA UM?", a94, a94.get(0));
//        Subject s94 = new Subject(0, "Math", q94);
//        Card c94 = new Card(1, 2, 3, s94);
////card 95
//        List<Answer> a95 = createPossibleAnswer("14", "7", "28", "1");
//        Question q95 = new Question(0, "QUANTOS CAFÉS DA MANHÃ EU TOMO EM DUAS SEMANAS?", a95, a95.get(0));
//        Subject s95 = new Subject(0, "Math", q95);
//        Card c95 = new Card(1, 2, 3, s95);
////card 96
//        List<Answer> a96 = createPossibleAnswer("50", "52", "54", "56");
//        Question q96 = new Question(0, "TINHA 64 FIGURINHAS. PERDI 26 PARA UM COLEGA, MAS GANHEI 18 DE OUTRO. COM QUANTAS FIGURINHAS FIQUEI?", a96, a96.get(3));
//        Subject s96 = new Subject(0, "Math", q96);
//        Card c96 = new Card(1, 2, 3, s96);
////card 97
//        List<Answer> a97 = createPossibleAnswer("2 HORAS", "3 HORAS", "4 HORAS", "5 HORAS");
//        Question q97 = new Question(0, "PRECISO PINTAR 20 FIGURAS. SE EM UMA HORA CONSIGO PINTAR 5, QUANTO TEMPO LEVAREI PARA PINTAR TODAS AS FIGURAS?", a97, a97.get(2));
//        Subject s97 = new Subject(0, "Math", q97);
//        Card c97 = new Card(3, 2, 1, s97);
////card 98
//        List<Answer> a98 = createPossibleAnswer("64", "16", "24", "32");
//        Question q98 = new Question(0, "UMA MULHER TEVE 8 FILHOS. SE CADA FILHO TAMBÉM TIVESSE 8 FILHOS, QUANTOS NETOS ESSA MULHER TERIA?", a98, a98.get(0));
//        Subject s98 = new Subject(0, "Math", q98);
//        Card c98 = new Card(3, 2, 1, s98);
////card 99
//        List<Answer> a99 = createPossibleAnswer("104 cm", "108 cm", "110 cm", "112 cm");
//        Question q99 = new Question(0, "DO NASCIMENTO ATÉ 5 ANOS, UMA CRIANÇA CRESCEU EM MÉDIA 12 cm POR ANO. SE ELA NASCEU COM 48 cm, QUAL É SUA ALTURA AOS 5 ANOS?", a99, a99.get(1));
//        Subject s99 = new Subject(0, "Math", q99);
//        Card c99 = new Card(3, 2, 1, s99);
////card 100
//        List<Answer> a100 = createPossibleAnswer("40", "50", "60", "70");
//        Question q100 = new Question(0, "UMA CRIANÇA NASCEU COM 50 cm. AOS SEIS ANOS ELA TINHA 120 cm. QUANTOS CENTÍMETROS ELA CRESCEU?", a100, a100.get(3));
//        Subject s100 = new Subject(0, "Math", q100);
//        Card c100 = new Card(3, 2, 1, s100);
////card 101
//        List<Answer> a101 = createPossibleAnswer("LOBO", "BANANA-MAÇÃ", "VELHICE", "TELEFONEMA");
//        Question q101 = new Question(0, "EM QUAL ALTERNATIVA O SUBSTANTIVO É COMUM, CONCRETO E SIMPLES?", a101, a101.get(0));
//        Subject s101 = new Subject(0, "Portuguese", q101);
//        Card c101 = new Card(3, 2, 1, s101);
////card 102
//        List<Answer> a102 = createPossibleAnswer("FOME E BRUXA", "SONO E BONDADE", "ONÇA E ÁRVORE", "ESPERANÇA E TELEFONE");
//        Question q102 = new Question(0, "QUAL ALTERNATIVA SÓ TEM SUBSTANTIVOS ABSTRATOS?", a102, a102.get(1));
//        Subject s102 = new Subject(0, "Portuguese", q102);
//        Card c102 = new Card(3, 2, 1, s102);
////card 103
//        List<Answer> a103 = createPossibleAnswer("XINGAR", "XORAR", "CHINGAR", "CHAMPU");
//        Question q103 = new Question(0, "EM QUAL ALTERNATIVA A PALAVRA ESTÁ ESCRITA CORRETAMENTE:", a103, a103.get(0));
//        Subject s103 = new Subject(0, "Portuguese", q103);
//        Card c103 = new Card(3, 2, 1, s103);
////card 104
//        List<Answer> a104 = createPossibleAnswer("POUCA", "GENTE", "MENINO", "RIU");
//        Question q104 = new Question(0, "QUAL O NÚCLEO DO SUJEITO EM - POUCA GENTE RIU DO MENINO?", a104, a104.get(1));
//        Subject s104 = new Subject(0, "Portuguese", q104);
//        Card c104 = new Card(3, 2, 1, s104);
////card 105
//        List<Answer> a105 = createPossibleAnswer("AS", "ÁRVORES", "DO", "QUINTAL");
//        Question q105 = new Question(0, "QUAL É O NÚCLEO DO SUJEITO EM - AS ÁVORES DO QUINTAL SÃO LINDAS?", a105, a105.get(1));
//        Subject s105 = new Subject(0, "Portuguese", q105);
//        Card c105 = new Card(3, 2, 1, s105);
////card 106
//        List<Answer> a106 = createPossibleAnswer("ROBINSON", " ROBINSON", "O NAVIO DE ROBINSON", "O");
//        Question q106 = new Question(0, "QUAL O SUJEITO EM - O NAVIO DE ROBINSON NAUFRAGOU?", a106, a106.get(2));
//        Subject s106 = new Subject(0, "Portuguese", q106);
//        Card c106 = new Card(3, 2, 1, s106);
////card 107
//        List<Answer> a107 = createPossibleAnswer("DUAS, NOITE", "PÕE, CÃIBRA", "PÕE, LEVOU", "VOGAIS, MÃE");
//        Question q107 = new Question(0, "EM QUAL ALTERNATIVA SÓ HÁ DITONGO NASAL?", a107, a107.get(1));
//        Subject s107 = new Subject(0, "Portuguese", q107);
//        Card c107 = new Card(3, 2, 1, s107);
////card 108
//        List<Answer> a108 = createPossibleAnswer("LOBO", "BANANA-MAÇÃ", "VELHICE", "TELEFONEMA");
//        Question q108 = new Question(0, "EM QUAL ALTERNATIVA O SUBSTANTIVO É COMUM, CONCRETO E COMPOSTO?", a108, a108.get(1));
//        Subject s108 = new Subject(0, "Portuguese", q108);
//        Card c108 = new Card(1, 2, 1, s108);
////card 109
//        List<Answer> a109 = createPossibleAnswer("FOME E BRUXA", "SONO E BONDADE", "ONÇA E ÁRVORE", "ESPERANÇA E TELEFONE");
//        Question q109 = new Question(0, "QUAL ALTERNATIVA SÓ TEM SUBSTANTIVOS CONCRETOS?", a109, a109.get(2));
//        Subject s109 = new Subject(0, "Portuguese", q109);
//        Card c109 = new Card(1, 2, 1, s109);
////card 110
//        List<Answer> a110 = createPossibleAnswer("CIDADÕES", "CIDADÃES", "CIDADÃOS", "CIDADAENS");
//        Question q110 = new Question(0, "O PLURAL DE CIDADÃO É:", a110, a110.get(2));
//        Subject s110 = new Subject(0, "Portuguese", q110);
//        Card c110 = new Card(1, 2, 1, s110);
////card 111
//        List<Answer> a111 = createPossibleAnswer("BOIS", "CÃES", "LOBOS", "CARNEIROS");
//        Question q111 = new Question(0, "MATILHA É COLETIVO DE:", a111, a111.get(1));
//        Subject s111 = new Subject(0, "Portuguese", q111);
//        Card c111 = new Card(1, 2, 1, s111);
////card 112
//        List<Answer> a112 = createPossibleAnswer("CISNES", "CASAS", "CÃES", "CAMELOS");
//        Question q112 = new Question(0, "CÁFILA É COLETIVO DE:", a112, a112.get(3));
//        Subject s112 = new Subject(0, "Portuguese", q112);
//        Card c112 = new Card(1, 2, 1, s112);
////card 113
//        List<Answer> a113 = createPossibleAnswer("HINÁRIO", "RAMALHETE", "PENCA", "RÉSTIA");
//        Question q113 = new Question(0, "QUAL O COLETIVO DE FLORES?", a113, a113.get(1));
//        Subject s113 = new Subject(0, "Portuguese", q113);
//        Card c113 = new Card(1, 2, 1, s113);
////card 114
//        List<Answer> a114 = createPossibleAnswer("VARA", "PENCA", "FEIXE", "RAMALHETE");
//        Question q114 = new Question(0, "QUAL O COLETIVO DE LENHAS?", a114, a114.get(2));
//        Subject s114 = new Subject(0, "Portuguese", q114);
//        Card c114 = new Card(1, 2, 1, s114);
////card 115
//        List<Answer> a115 = createPossibleAnswer("HÍFEN", "HIFENS", "ÂNCIA", "CINQÜENTA");
//        Question q115 = new Question(0, "QUAL O VOCÁBULO DE GRAFIA ERRADA?", a115, a115.get(2));
//        Subject s115 = new Subject(0, "Portuguese", q115);
//        Card c115 = new Card(1, 2, 1, s115);
////card 116
//        List<Answer> a116 = createPossibleAnswer("XAFARIZ", "FAXINA", "PUXAR", "XINGAR");
//        Question q116 = new Question(0, "NÃO SE ESCREVE COM X:", a116, a116.get(0));
//        Subject s116 = new Subject(0, "Portuguese", q116);
//        Card c116 = new Card(1, 2, 1, s116);
////card 117
//        List<Answer> a117 = createPossibleAnswer("ESSÊNSIA", "ECÊNSIA", "ESSÊNCIA", "ECÊNCIA");
//        Question q117 = new Question(0, "QUAL A FORMA CORRETA DE ESCREVER:", a117, a117.get(2));
//        Subject s117 = new Subject(0, "Portuguese", q117);
//        Card c117 = new Card(1, 2, 1, s117);
////card 118
//        List<Answer> a118 = createPossibleAnswer("5", "10", "50", "100");
//        Question q118 = new Question(0, "ENTRE OS ALGARISMOS ROMANOS, A LETRA V REPRESENTA QUE NÚMERO?", a118, a118.get(0));
//        Subject s118 = new Subject(0, "Portuguese", q118);
//        Card c118 = new Card(3, 3, 1, s118);
////card 119
//        List<Answer> a119 = createPossibleAnswer("TU", "VÓS", "NÓS", "EU");
//        Question q119 = new Question(0, "QUAL É A PRIMEIA PESSOA DO PLURAL?", a119, a119.get(2));
//        Subject s119 = new Subject(0, "Portuguese", q119);
//        Card c119 = new Card(3, 3, 1, s119);
////card 120
//        List<Answer> a120 = createPossibleAnswer("EU", "ELES", "NÓS", "TU");
//        Question q120 = new Question(0, "QUAL É A TERCEIRA PESSOA DO PLURAL?", a120, a120.get(1));
//        Subject s120 = new Subject(0, "Portuguese", q120);
//        Card c120 = new Card(3, 3, 1, s120);
////card 121
//        List<Answer> a121 = createPossibleAnswer("EU", "TU", "NÓS", "ELES");
//        Question q121 = new Question(0, "QUAL É A PRIMEIRA PESSOA DO SINGULAR?", a121, a121.get(0));
//        Subject s121 = new Subject(0, "Portuguese", q121);
//        Card c121 = new Card(3, 3, 1, s121);
////card 122
//        List<Answer> a122 = createPossibleAnswer("ANDEI", "FAÇO", "COMIA", "JOGAREI");
//        Question q122 = new Question(0, "QUAL VERBO SE ENCONTRA NO PRESENTE DO INDICATIVO?", a122, a122.get(1));
//        Subject s122 = new Subject(0, "Portuguese", q122);
//        Card c122 = new Card(3, 3, 1, s122);
////card 123
//        List<Answer> a123 = createPossibleAnswer("AR", "ER", "IR", "OR");
//        Question q123 = new Question(0, "OS VERBOS DA TERCEIRA CONJUGAÇÃO SÃO TERMINADOS EM:", a123, a123.get(2));
//        Subject s123 = new Subject(0, "Portuguese", q123);
//        Card c123 = new Card(3, 3, 1, s123);
////card 124
//        List<Answer> a124 = createPossibleAnswer("AR", "IR", "ER E OR", "AR E ER");
//        Question q124 = new Question(0, "OS VERBOS DA SEGUNDA CONJUGAÇÃO SÃO TERMINADOS EM:", a124, a124.get(2));
//        Subject s124 = new Subject(0, "Science", q124);
//        Card c124 = new Card(3, 3, 1, s124);
////card 125
//        List<Answer> a125 = createPossibleAnswer("DAR", "CANTAR", "GANHAR", "FALAR");
//        Question q125 = new Question(0, "QUAL DOS VERBOS A SEGUIR É IRREGULAR?", a125, a125.get(0));
//        Subject s125 = new Subject(0, "Portuguese", q125);
//        Card c125 = new Card(3, 3, 1, s125);
//
        List<Cards> all = null;
//
//        all.add(c1);
//        all.add(c2);
//        all.add(c3);
//        all.add(c4);
//        all.add(c5);
//        all.add(c6);
//        all.add(c7);
//        all.add(c8);
//        all.add(c9);
//        all.add(c10);
//        all.add(c11);
//        all.add(c12);
//        all.add(c13);
//        all.add(c14);
//        all.add(c15);
//        all.add(c16);
//        all.add(c17);
//        all.add(c18);
//        all.add(c19);
//        all.add(c20);
//        all.add(c21);
//        all.add(c22);
//        all.add(c23);
//        all.add(c24);
//        all.add(c25);
//        all.add(c26);
//        all.add(c27);
//        all.add(c28);
//        all.add(c29);
//        all.add(c30);
//        all.add(c31);
//        all.add(c32);
//        all.add(c33);
//        all.add(c34);
//        all.add(c35);
//        all.add(c36);
//        all.add(c37);
//        all.add(c38);
//        all.add(c39);
//        all.add(c40);
//        all.add(c41);
//        all.add(c42);
//        all.add(c43);
//        all.add(c44);
//        all.add(c45);
//        all.add(c46);
//        all.add(c47);
//        all.add(c48);
//        all.add(c49);
//        all.add(c50);
//        all.add(c51);
//        all.add(c52);
//        all.add(c53);
//        all.add(c54);
//        all.add(c55);
//        all.add(c56);
//        all.add(c57);
//        all.add(c58);
//        all.add(c59);
//        all.add(c60);
//        all.add(c61);
//        all.add(c62);
//        all.add(c63);
//        all.add(c64);
//        all.add(c65);
//        all.add(c66);
//        all.add(c67);
//        all.add(c68);
//        all.add(c69);
//        all.add(c70);
//        all.add(c71);
//        all.add(c72);
//        all.add(c73);
//        all.add(c74);
//        all.add(c75);
//        all.add(c76);
//        all.add(c77);
//        all.add(c78);
//        all.add(c79);
//        all.add(c80);
//        all.add(c81);
//        all.add(c82);
//        all.add(c83);
//        all.add(c84);
//        all.add(c85);
//        all.add(c86);
//        all.add(c87);
//        all.add(c88);
//        all.add(c89);
//        all.add(c90);
//        all.add(c91);
//        all.add(c92);
//        all.add(c93);
//        all.add(c94);
//        all.add(c95);
//        all.add(c96);
//        all.add(c97);
//        all.add(c98);
//        all.add(c99);
//        all.add(c100);
//        all.add(c101);
//        all.add(c102);
//        all.add(c103);
//        all.add(c104);
//        all.add(c105);
//        all.add(c106);
//        all.add(c107);
//        all.add(c108);
//        all.add(c109);
//        all.add(c110);
//        all.add(c111);
//        all.add(c112);
//        all.add(c113);
//        all.add(c114);
//        all.add(c115);
//        all.add(c116);
//        all.add(c117);
//        all.add(c118);
//        all.add(c119);
//        all.add(c120);
//        all.add(c121);
//        all.add(c122);
//        all.add(c123);
//        all.add(c124);
//        all.add(c125);
//       
//       
        return all;

    }

    private static List<Answers> createPossibleAnswer(String option1, String option2,
            String option3, String option4) {
        Answers answer = new Answers(0, option1);
        Answers answer1 = new Answers(1, option2);
        Answers answer2 = new Answers(2, option3);
        Answers answer3 = new Answers(3, option4);
        List<Answers> possibleAnswer = null;
        possibleAnswer.add(answer);
        possibleAnswer.add(answer1);
        possibleAnswer.add(answer2);
        possibleAnswer.add(answer3);
        return possibleAnswer;
    }

}