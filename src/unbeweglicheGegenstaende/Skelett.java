package unbeweglicheGegenstaende;

import grafischeGegenstaende.GrafischeGegenstaende;

public class Skelett extends GrafischeGegenstaende {
    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Skelett.
     * Der Konstruktor der Oberklasse GrafischeGegenstaende wird aufgerufen.
     *
     * @param positionX Position des Skeletts auf der X-Achse
     * @param positionY Position des Skeletts auf der Y-Achse
     */
    public Skelett(int positionX, int positionY) {
        super(positionX, positionY);
        grafischerGegenstand = "                                            /  _\n" +
                "                                        a/  )\\/ f\n" +
                "                                         )?\\/ ] ]\n" +
                "                                            )/ \\]\n" +
                "                                          _  )6 Q\n" +
                "                                           ?\\/ P]\n" +
                "                              _jQQQa         ?aa]6\n" +
                "                              ]QQQQQQ/     aa/ 4Q6]6\n" +
                "                            _6 4QQQQQ6       )??''a]6\n" +
                "                            jQQajQQQQQ/         )?4f ?a\n" +
                "                            QQQQQQQQQQf            46 )6\n" +
                "                            Q]QQQQQQQQ              )6 )4/\n" +
                "                            P]QQQQP?4Q               )6  4/\n" +
                "                             ]' 4Q'  Q                )6  4/\n" +
                "                             Q   ?f _Qf                )6  4/\n" +
                "                            )W6aJ )WQQf                  4/ 4/\n" +
                "                            _4?4f_ QP?]                   4/ 4\n" +
                "                            4a QQQQQ af                    ?a\n" +
                "                             ?f)\" ' ]P                      )gja/\n" +
                "  f                           4/]]_6Q                       )')?'\n" +
                "  \\                            QQQQQf           _             Qaa/\n" +
                "  ]                            )WQQ?            4/     _aaaaWWP??\n" +
                "  ]  ]                             _           4)4QQQQWP????'\n" +
                "  ]  ]                          )a?'/          ]PJW\n" +
                "   f ]  /                       _aaP'         JQf\n" +
                " \\ ] ]  f                          aQ /_    aaW?'\n" +
                " )/ 6 f /                       )??? /  _a?'  QQf\n" +
                "  )/)/4 '                      a??]QQ/Q?'/  f ?\n" +
                " _ ),\\]6/                )???_aaaa'QQ6  a' _'\n" +
                "  ?a']aP                J46/   _   QQQ j' _J /\n" +
                "    ?aP?_f           )\\jQ)W'_   ?46)WQ 6_a? _')\n" +
                "      _/Q/          )W7P)[f  \\    j QQ 4P  _f f\n" +
                "       6?6           ]g     / ???PQ/4Q/]f_y' j /\n" +
                "       )[)[          ]P(    )_    ]f]Qf]Q? _y'_'\n" +
                "        6 4/         ]f    )/ ??QQQf)Wf Q_yP  J\n" +
                "        )/ 4         Q'     )a     6 QQ QP'  j )\n" +
                "         6 )6        Q        ??4QQQ QQ ]f aQ' J\n" +
                "         )[ ]/      _Q      )\\     4/]Qf]QQP' _')\n" +
                "          4/ 4      ]f        ?aaaaQf]Qf ?Qf _P f/\n" +
                "          )6 )6     ]f       /  )?WQ' Qf  ]QQP _ '\n" +
                "           )6 ]/    Q        )6   ]P  )[   ?Q6aP_\n" +
                "            ]/ 4    Q        ' 46aQf    /    QQ6J\n" +
                "             4/)[  ]P        Ja  ]P  ]?Qf)'/ )4Q']\n" +
                "              \\ ]f ]f        _)\\aQf /'_ a_  \\  )\\'\n" +
                "                jf6Q          \\ QQ J _ ?')?/ /\n" +
                "                )f]P         _ 4Q'_  ' aj'\n" +
                "                ]']f          \\ f ) '  /'\n" +
                "                  4'           )       ?Q'\n" +
                "                                       _a/\n" +
                "                                        ?\n" +
                "                                        4?   _QQ6\n" +
                "                                        a/  aQQQQf\n" +
                "                                 aQQ6/    aj'jQQQf\n" +
                "                                 QQQQP4QQQQf]QQQP\n" +
                "                                 QQQQQ/46 jQ/QQP\n" +
                "                                 ?QQQQfjP??Q6]P\n" +
                "                                   ?QQ'QQ6QQ6j'jQ/ ]6\n" +
                "                                    )4/4Q/_QP( QQf  )L\n" +
                "                                   Q6 ??QP'P  ]Q? ]Q[?\n" +
                "                                af)WQf  )QQf  ]'  )P'_/\n" +
                "                               ]f_ ??Q   Q?QaaP  j6/_Qf\n" +
                "                               ] Qf  )\\ajf )WW   QQQQP\n" +
                "                               _ ?'a   4P          4Q6\n" +
                "                               Q6 jQf               QQ/\n" +
                "                               )WQQP'               ]Q6\n" +
                "                                QQf                 )WQ/\n" +
                "                               ]QQ                   4Q6\n" +
                "                               ]Qf                   )WQ\n" +
                "                               QQf                    4Qf\n" +
                "                               QQ                     ]QQ\n" +
                "                              ]QP                      QQf\n" +
                "                              ]Qf                      ]Q6\n" +
                "                              QQ'                       QQ/\n" +
                "                              QQ                        ]Qf\n" +
                "                             ]Qf                         QQ\n" +
                "                             jQf                         ]Qf\n" +
                "                             QQ                          )W6\n" +
                "                            _QP                           4Q/\n" +
                "                            ]Qf                           )Qf\n" +
                "                            jQ'                            4Q\n" +
                "                            QQ                             jQ/\n" +
                "                            Qf                            QQQ6\n" +
                "                           ]Q'                            4P QP\n" +
                "                           ]Q                            _/_a)'\n" +
                "                           jQ6a                           fQQ /\n" +
                "                          _QQQP                           Q\"']Q\n" +
                "                          QP ?_                           QQf]Q\n" +
                "                          )'jg]'                             4Q/\n" +
                "                          _/4P]                           )4Q 4f\n" +
                "                          Qf _Qf                            4 ]f\n" +
                "                          ]Q/??'                            ] ]6\n" +
                "                          ]P\\aj                             ]f)W\n" +
                "                          ]f)P                               f Q\n" +
                "                          ]f f                               Q Q/\n" +
                "                          ]f f                               4 ]f\n" +
                "                          ]f_f                               ]/]f\n" +
                "                          ]f]f                               ]f]f\n" +
                "                          ]f]f                                f Q\n" +
                "                          jf]'                                6 Q\n" +
                "                          Qf]                                 4 Q\n" +
                "                          Q ]                                 ] ]f\n" +
                "                          Q ]                                 ]f]f\n" +
                "                          Q ]                                  f]f\n" +
                "                          Q ]                                  f]Q\n" +
                "                          Q ]                                  4 Q\n" +
                "                          Q j                                  ] Q\n" +
                "                          Q Q                                  ]/Q/\n" +
                "                          Q Q                                   fQf\n" +
                "                          QfP                                   fWf\n" +
                "                          Qff                                   6]f\n" +
                "                          Qff                                  _P]Q/\n" +
                "                          Qff                                   QPQP\n" +
                "                          Qff                                 Q6 a/ /\n" +
                "                          Qff                                 ]Q\\Q Q\\/\n" +
                "                          Pf?/                                  QQfQ'?\n" +
                "                         4Q'Q_a                                   'aa_f\n" +
                "                        _  a QQ                                    ]J'\\\n" +
                "                        /4']a4'                                     )[_jJ'\n" +
                "                       _fjfQ?'                                        ) '?\n" +
                "                       _ a/\n" +
                "                       J]\\f\n" +
                "                     _ '_?\n" +
                "                     _P\\";
    }
}
