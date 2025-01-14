import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultaConversion consulta = new ConsultaConversion();

        boolean salir = false;

        String menu = """
                    *******************************************************
                    Sea bienvenido/a al Conversor de Moneda =]
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real brasileño
                    4) Real brasileño =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dólar
                    7) Otras conversiones
                    8) Salir
                    Elija una opción válida:
                    *******************************************************
                    """;

        String divisas = """
                
                1)   AED	 Dirham de los Emiratos Árabes Unidos
                2)   AFN	 Afgani afgano
                3)   ALL	 Lek albanés
                4)   AMD	 Dram armenio
                5)   ANG	 Florín antillano neerlandés
                6)   AOA     Kwanza angoleño
                7)   ARS	 Peso argentino
                8)   AUD	 Dólar australiano
                9)   AWG	 Florín arubeño
                10)  AZN	 Manat azerbaiyano
                11)  BAM	 Marco bosnioherzegovino
                12)  BBD	 Dólar de Barbados
                13)  BDT	 Taka bangladesí
                14)  BGN     Leva búlgara
                15)  BHD     Dinar bareiní
                16)  BIF     Franco burundés
                17)  BMD     Dólar bermudeño
                18)  BND     Dólar de Brunei
                19)  BOB     Boliviano
                20)  BRL     Real brasileño
                21)  BSD     Dólar bahameño
                22)  BTN     Ngultrum butanés
                23)  BWP     Pula (Botswana)
                24)  BYN     Rublo bielorruso
                25)  BZD     Dólar beliceño
                26)  CAD     Dólar canadiense
                27)  CDF     Franco congoleño
                28)  CHF     Franco suizo
                29)  CLP     Peso chileno
                30)  CNY	 Renminbi chino
                31)  COP     Peso colombiano
                32)  CRC	 Colón costarricense
                33)  CUP	 Peso cubano
                34)  CVE	 Escudo caboverdiano
                35)  CZK	 Corona checa
                36)  DJF	 Franco yibutiano
                37)  DKK	 Corona danesa
                38)  DOP     Peso dominicano
                39)  DZD	 Dinar argelino
                40)  EGP	 Libra egipcia
                41)  ERN     Nakfa eritreo
                42)  ETB	 Birr etíope
                43)  EUR	 EURO
                44)  FJD	 Dólar fiyiano
                45)  FKP     Libra malvinense
                46)  FOK	 Corona feroesa
                47)  GBP     Libra esterlina
                48)  GEL     Lari georgiano
                49)  GGP	 Libra de Guernsey
                50)  GHS	 Cedi de Ghana
                51)  GIP	 Libra gibraltareña
                52)  GMD	 Dalasi	gambiano
                53)  GNF	 Franco guineano
                54)  GTQ	 Quetzal guatemalteco
                55)  GYD	 Dólar guyanés
                56)  HKD	 Dólar de Hong Kong
                57)  HNL	 Lempira hondureño
                58)  HRK	 Kuna croata
                59)  HTG	 Gourde haitiano
                60)  HUF	 Forinto hungary
                61)  IDR	 Rupia indonesa
                62)  ILS	 Nuevo séquel israelí
                63)  IMP	 Libra manesa
                64)  INR	 Rupia india
                65)  IQD	 Dinar iraquí
                66)  IRR     Rial iraní
                67)  ISK	 Corona islandesa
                68)  JEP	 Libras de Jersey
                69)  JMD	 Dólar jamaiquino
                70)  JOD	 Dinar jordano
                71)  JPY	 Yen japonés
                72)  KES	 Chelín keniano
                73)  KGS	 Som kirguís
                74)  KHR	 Riel camboyano
                75)  KID	 Dólar kiribatiano
                76)  KMF	 Franco comorense
                77)  KRW	 Won surcoreano
                78)  KWD	 Dinar kuwaití
                79)  KYD	 Dólar de las Islas Caimán
                80)  KZT     Tenge kazajo
                81)  LAK	 Kip laosiano
                82)  LBP	 Libra libanesa
                83)  LKR	 Rupia de Sri Lanka
                84)  LRD	 Dólar liberiano
                85)  LSL	 Loti de Lesoto
                86)  LYD	 Dinar libio
                87)  MAD	 Dirham	marroquí
                88)  MDL	 Leu moldavo
                89)  MGA	 Ariary malgache (Madagascar)
                90)  MKD	 Denar macedonio
                91)  MMK	 Kyat birmano
                92)  MNT	 Tugrik mongol (Tögrög)
                93)  MOP	 Pataca	macaense
                94)  MRU	 Uguiya	mauritano
                95)  MUR	 Rupia de Mauricio
                96)  MVR	 Rupia de Maldivas
                97)  MWK	 Kwacha malauí
                98)  MXN     Peso mexicano
                99)  MYR	 Ringgit malayo
                100) MZN     Metical mozambiqueño
                101) NAD     Dólar namibio
                102) NGN     Naira nigeriano
                103) NIO     Córdoba nicaragüense
                104) NOK     Corona noruega
                105) NPR     Rupia nepalí
                106) NZD     Dólar neozelandés
                107) OMR     Rial omaní
                108) PAB     Balboa panameño
                109) PEN     Sol peruano
                110) PGK     Kina de Papua Nueva Guinea
                111) PHP     Peso filipino
                112) PKR     Rupia pakistaní
                113) PLN     Złoty	polaco
                114) PYG     Guaraní paraguayo
                115) QAR     Riyal catarí
                116) RON     Leu rumano
                117) RSD     Dinar	serbio
                118) RUB     Ruble ruso
                119) RWF     Franco ruandés
                120) SAR     Riyal	saudí
                121) SBD     Dólar de las Islas Salomon
                122) SCR     Rupia de Seychelles
                123) SDG     Libra sudanesa
                124) SEK     Corona sueca
                125) SGD     Dólar singapurense
                126) SHP     Libra de Santa Helena
                127) SLE     Leone	sierraleonés
                128) SOS     Chelín somalí
                129) SRD     Dólar surinamés
                130) SSP     Dólar surinamés
                131) STN     Dobra santotomense
                132) SYP     Libra siria
                133) SZL     Lilangeni swazi (Eswatini)
                134) THB     Baht tailandés
                135) TJS     Somoni tayiko
                136) TMT     Manat turcomano (Turkmenistan)
                137) TND     Dinar	tunecino
                138) TOP     Paʻanga tongano
                139) TRY     Lira turca
                140) TTD     Dolar trinitense (Trinidad and Tobago)
                141) TVD     Dólar tuvaluano (Tuvalu)
                142) TWD     Nuevo Dólar taiwanés
                143) TZS     Chelín tanzano
                144) UAH     Grivna (Ucrania)
                145) UGX     Chelín ugandés
                146) USD     DÓLAR ESTADOUNIDENSE
                147) UYU     Peso uruguayo
                148) UZS     Som uzbeko
                149) VES     Bolívar (Venezuela)
                150) VND     Đồng (Vietnam)
                151) VUV     Vatu (Vanuatu)
                152) WST     Tālā (Samoa)
                153) XAF     Franco CFA de África Central (CEMAC)
                154) XCD     Dólar del Caribe Oriental
                155) XDR     Derechos Especiales de Giro (FMI)
                156) XOF     Franco CFA de África Occidental (UEMOA)
                157) XPF     Franco CFP del Pacífico Central
                158) YER     Rial yemení
                159) ZAR     Rand sudafricano
                160) ZMW     Kwacha zambiano
                161) ZWL     Dólar	zimbabuense
                *******************************************************
                """;

        while (!salir) {

            System.out.print(menu);
            int opcion = Integer.parseInt(lectura.nextLine());
//            String unidadEntrada = " ";
//            String unidadSalida = " ";

            if (opcion >= 9 || opcion <= 0){
                System.out.println("Opcion invalida: " + opcion);
                salir = true;

            } else {
                if (opcion == 8){
                    System.out.println("Gracias por usar el conversor. ¡Regresa pronto!");
                    salir = true;
                } else {
                    switch (opcion) {
                        case 1:
                            ConvertirMoneda.convertir("USD","ARS", consulta, lectura);
                            break;
                        case 2:
                            ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                            break;
                        case 3:
                            ConvertirMoneda.convertir("USD","BRL", consulta, lectura);
                            break;
                        case 4:
                            ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                            break;
                        case 5:
                            ConvertirMoneda.convertir("USD", "COP", consulta, lectura);;
                            break;
                        case 6:
                            ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                            break;
                        case 7:
                            System.out.print("""
                                    *******************************************************
                                    Por favor elija su moneda base:
                                    """);
                            System.out.print(divisas);
                            int opcionMonedaBase = Integer.parseInt(new Scanner(System.in).nextLine());

                            String[] renglonesBase = divisas.split("\\R");
                            int indiceBase = opcionMonedaBase;
                            String renglonBase = renglonesBase[indiceBase];
                            String[] partes = renglonBase.trim().split("\\s+");
                            String divisaBase =  partes[1];
                            System.out.println("Código de divisa: " + divisaBase);

                            System.out.print("""
                                    *******************************************************
                                    Por favor elija su moneda de cambio:
                                    """);
                            System.out.print(divisas);
                            int opcionMonedaCambio = Integer.parseInt(new Scanner(System.in).nextLine());

                            String[] renglones = divisas.split("\\R");
                            int indiceCambio = opcionMonedaCambio;
                            String renglonCambio = renglones[indiceCambio];
                            String[] fragmentos = renglonCambio.trim().split("\\s+");
                            String divisaCambio =  fragmentos[1];
                            System.out.println("Código de divisa: " + divisaCambio);

                            ConvertirMoneda.convertir(divisaBase, divisaCambio, consulta, lectura);
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                }
            }
        }
    }
}
