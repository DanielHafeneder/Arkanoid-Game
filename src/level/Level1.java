package level;

import gameView.GameView;
import unbeweglicheGegenstaende.Block;
import unbeweglicheGegenstaende.Hintergrund;
import unbeweglicheGegenstaende.Score;

import java.util.ArrayList;


public class Level1 extends Level {
    private String[] hintergrundArray;
    private GameView gameView;
    private String planet =
            "                                                                                     ..;===+.\\n\" +\n" +
                    "                \"                                                                .:=iiiiii=+=\\n\" +\n" +
                    "                \"                                                             .=i))=;::+)i=+,\\n\" +\n" +
                    "                \"                                                          ,=i);)I)))I):=i=;\\n\" +\n" +
                    "                \"                                                       .=i==))))ii)))I:i++\\n\" +\n" +
                    "                \"                                                     +)+))iiiiiiii))I=i+:'\\n\" +\n" +
                    "                \"                                .,:;;++++++;:,.       )iii+:::;iii))+i='\\n\" +\n" +
                    "                \"                             .:;++=iiiiiiiiii=++;.    =::,,,:::=i));=+'\\n\" +\n" +
                    "                \"                           ,;+==ii)))))))))))ii==+;,      ,,,:=i))+=:\\n\" +\n" +
                    "                \"                         ,;+=ii))))))IIIIII))))ii===;.    ,,:=i)=i+\\n\" +\n" +
                    "                \"                        ;+=ii)))IIIIITIIIIII))))iiii=+,   ,:=));=,\\n\" +\n" +
                    "                \"                      ,+=i))IIIIIITTTTTITIIIIII)))I)i=+,,:+i)=i+\\n\" +\n" +
                    "                \"                     ,+i))IIIIIITTTTTTTTTTTTI))IIII))i=::i))i='\\n\" +\n" +
                    "                \"                    ,=i))IIIIITLLTTTTTTTTTTIITTTTIII)+;+i)+i`\\n\" +\n" +
                    "                \"                    =i))IIITTLTLTTTTTTTTTIITTLLTTTII+:i)ii:'\\n\" +\n" +
                    "                \"                   +i))IITTTLLLTTTTTTTTTTTTLLLTTTT+:i)))=,\\n\" +\n" +
                    "                \"                   =))ITTTTTTTTTTTLTTTTTTLLLLLLTi:=)IIiii;\\n\" +\n" +
                    "                \"                  .i)IIITTTTTTTTLTTTITLLLLLLLT);=)I)))))i;\\n\" +\n" +
                    "                \"                  :))IIITTTTTLTTTTTTLLHLLLLL);=)II)IIIIi=:\\n\" +\n" +
                    "                \"                  :i)IIITTTTTTTTTLLLHLLHLL)+=)II)ITTTI)i=\\n\" +\n" +
                    "                \"                  .i)IIITTTTITTLLLHHLLLL);=)II)ITTTTII)i+\\n\" +\n" +
                    "                \"                  =i)IIIIIITTLLLLLLHLL=:i)II)TTTTTTIII)i'\\n\" +\n" +
                    "                \"                +i)i)))IITTLLLLLLLLT=:i)II)TTTTLTTIII)i;\\n\" +\n" +
                    "                \"              +ii)i:)IITTLLTLLLLT=;+i)I)ITTTTLTTTII))i;\\n\" +\n" +
                    "                \"             =;)i=:,=)ITTTTLTTI=:i))I)TTTLLLTTTTTII)i;\\n\" +\n" +
                    "                \"           +i)ii::,  +)IIITI+:+i)I))TTTTLLTTTTTII))=,\\n\" +\n" +
                    "                \"         :=;)i=:,,    ,i++::i))I)ITTTTTTTTTTIIII)=+'\\n\" +\n" +
                    "                \"       .+ii)i=::,,   ,,::=i)))iIITTTTTTTTIIIII)=+\\n\" +\n" +
                    "                \"      ,==)ii=;:,,,,:::=ii)i)iIIIITIIITIIII))i+:'\\n\" +\n" +
                    "                \"     +=:))i==;:::;=iii)+)=  `:i)))IIIII)ii+'\\n\" +\n" +
                    "                \"   .+=:))iiiiiiii)))+ii;\\n\" +\n" +
                    "                \"  .+=;))iiiiii)));ii+\\n\" +\n" +
                    "                \" .+=i:)))))))=+ii+\\n\" +\n" +
                    "                \".;==i+::::=)i=;\\n\" +\n" +
                    "                \",+==iiiiii+,\\n\" +\n" +
                    "                \"`+=+++;`"
                    + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

    private String raumschiff =
            "         ._,.\n" +
                    "           \"..-..pf.\n" +
                    "          -L   ..#'\n" +
                    "        .+_L  .\"]#\n" +
                    "        ,'j' .+.j`                 -'.__..,.,p.\n" +
                    "       _~ #..<..0.                 .J-.``..._f.\n" +
                    "      .7..#_.. _f.                .....-..,`4'\n" +
                    "      ;` ,#j.  T'      ..         ..J....,'.j`\n" +
                    "     .` ..\"^.,-0.,,,,yMMMMM,.    ,-.J...+`.j@\n" +
                    "    .'.`...' .yMMMMM0M@^=`\"\"g.. .'..J..\".'.jH\n" +
                    "    j' .'1`  q'^)@@#\"^\".`\"='BNg_...,]_)'...0-\n" +
                    "   .T ...I. j\"    .'..+,_.'3#MMM0MggCBf....F.\n" +
                    "   j/.+'.{..+       `^~'-^~~\"\"\"\"'\"\"\"?'\"``'1`\n" +
                    "   .... .y.}                  `.._-:`_...jf\n" +
                    "   g-.  .Lg'                 ..,..'-....,'.\n" +
                    "  .'.   .Y^                  .....',].._f\n" +
                    "  ......-f.                 .-,,.,.-:--&`\n" +
                    "                            .`...'..`_J`\n" +
                    "                            .~......'#'\n" +
                    "                            '..,,.,_]`     \n" +
                    "                            .L..`..``.  ";

    private String mond =
            "                                                                                                                                                  .--------------.\n" +
                    "                                                                                                                                                                                     .---'  o        .    `---.\n" +
                    "                                                                                                                                                                                  .-'    .    O  .         .   `-.\n" +
                    "                                                                                                                                                                               .-'     @@@@@@       .             `-.\n" +
                    "                                                                                                                                                                             .'@@   @@@@@@@@@@@       @@@@@@@   .    `.\n" +
                    "                                                                                                                                                                           .'@@@  @@@@@@@@@@@@@@     @@@@@@@@@         `.\n" +
                    "                                                                                                                                                                          /@@@  o @@@@@@@@@@@@@@     @@@@@@@@@     O     \\\n" +
                    "                                                                                                                                                                         /        @@@@@@@@@@@@@@  @   @@@@@@@@@ @@     .  \\\n" +
                    "                                                                                                                                                                        /@  o      @@@@@@@@@@@   .  @@  @@@@@@@@@@@     @@ \\\n" +
                    "                                                                                                                                                                       /@@@      .   @@@@@@ o       @  @@@@@@@@@@@@@ o @@@@ \\\n" +
                    "                                                                                                                                                                      /@@@@@                  @ .      @@@@@@@@@@@@@@  @@@@@ \\\n" +
                    "                                                                                                                                                                      |@@@@@    O    `.-./  .        .  @@@@@@@@@@@@@   @@@  |\n" +
                    "                                                                                                                                                                     / @@@@@        --`-'       o        @@@@@@@@@@@ @@@    . \\\n" +
                    "                                                                                                                                                                     |@ @@@@ .  @  @    `    @            @@      . @@@@@@    |\n" +
                    "                                                                                                                                                                     |   @@                         o    @@   .     @@@@@@    |\n" +
                    "                                                                                                                                                                     |  .     @   @ @       o              @@   o   @@@@@@.   |\n" +
                    "                                                                                                                                                                     \\     @    @       @       .-.       @@@@       @@@      /\n" +
                    "                                                                                                                                                                      |  @    @  @              `-'     . @@@@     .    .    |\n" +
                    "                                                                                                                                                                      \\ .  o       @  @@@@  .              @@  .           . /\n" +
                    "                                                                                                                                                                       \\      @@@    @@@@@@       .                   o     /\n" +
                    "                                                                                                                                                                        \\    @@@@@   @@\\@@    /        O          .        /\n" +
                    "                                                                                                                                                                         \\ o  @@@       \\ \\  /  __        .   .     .--.  /\n" +
                    "                                                                                                                                                                          \\      .     . \\.-.---                   `--'  /\n" +
                    "                                                                                                                                                                           `.             `-'      .                   .'\n" +
                    "                                                                                                                                                                             `.    o     / | `           O     .     .'\n" +
                    "                                                                                                                                                                               `-.      /  |        o             .-'\n" +
                    "                                                                                                                                                                                 `-.          .         .     .-'\n" +
                    "                                                                                                                                                                                     `---.        .       .---'\n" +
                    "                                                                                                                                                                                         `--------------'";

    /**
     * Initialisiert ein neu angelegtes Objekt der Klasse Level1.
     * Der Konstruktor der Oberklasse Level wird aufgerufen.
     *
     * @param gameView  Die Ausgabeverarbeitung des Spiels
     * @param ZEILEN    Anzahl der Zeilen des Spiels
     * @param SPALTEN   Anzahl der Spalten des Spiels
     * @param score     Der aktuelle Score den der Spieler erreicht hat
     * @param highscore Der aktuelle höchste Score der im Spiel erreicht wurde
     * @param leben     Anzahl der Leben die man im Level besitzen soll
     */
    public Level1(GameView gameView, int ZEILEN, int SPALTEN, Score score, Score highscore, int leben) {
        super(gameView, ZEILEN, SPALTEN, score, highscore, leben);
        blockListe = new ArrayList<>();
        hintergrundArray = new String[]{planet, raumschiff, mond};
        this.hintergrund = new Hintergrund(100, 80, hintergrundArray);
        this.gameView = gameView;
        this.gameView.stopAllSounds();
        this.gameView.playSound("RetroPlatforming.wav", true);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void aufbauLevel() {
        for (int i = 0; i <= 55; i += 11) {
            for (int j = 0; j < 400; j += 25) {
                if (i == 0) {
                    blockListe.add(new Block(50 + i, 20 + j, 10, 24, "$|", 3));
                } else if (i == 11) {
                    blockListe.add(new Block(50 + i, 20 + j, 10, 24, "**", 1));
                } else if (i == 22) {
                    blockListe.add(new Block(50 + i, 20 + j, 10, 24, "--", 1));
                } else if (i == 33) {
                    blockListe.add(new Block(50 + i, 20 + j, 10, 24, "//", 1));
                } else if (i == 44) {
                    blockListe.add(new Block(50 + i, 20 + j, 10, 24, "XX", 1));
                } else if (i == 55) {
                    blockListe.add(new Block(50 + i, 20 + j, 10, 24, "YY", 1));
                }

            }
        }
    }
}
