public class SpeechHistogram {
    int[] counts;
    int[] groupCounts;
    Speech speech;

    SpeechHistogram(Speech speech) {
        counts = new Speech[26];
        groupCounts = new Speech[5];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }
        for (int i = 0; i < groupCounts.length; i++) {
            groupCounts[i] = 0;
        }
    }

    void calculateHistogram() {
        for (int i = 0; i < 26; i++) {
            if (speech.getFirstCharOfWord(idx) == (char)('a'+i)) {
                counts[i]++;
            }
        }
        for (int i = 0; i < 5; i++) {
            groupCounts[0] += counts[i];
        }
        for (int i = 5; i < 10; i++) {
            groupCounts[1] += counts[i];
        }
        for (int i = 10; i < 15; i++) {
            groupCounts[2] += counts[i];
        }
        for (int i = 15; i < 20; i++) {
            groupCounts[3] += counts[i];
        }
        for (int i = 20; i < 25; i++) {
            groupCounts[4] += counts[i];
        }
    }

    void print() {
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c: (%d)\n", a+i, SpeechHistogram.counts[i]);
        }
        System.out.printf("'a'-'e': (%d)", groupCounts[0]);
        for (int i=0; i<groupCounts[0]; i++) {
            System.out.print("*");
        }
        System.out.printf("'f'-'j': (%d)", groupCounts[1]);
        for (int i = 0; i < groupCounts[1]; i++) {
            System.out.print("*");
        }
        System.out.printf("'k'-'o': (%d)", groupCounts[2]);
        for (int i = 0; i < groupCounts[2]; i++) {
            System.out.print("*");
        }
        System.out.printf("'p'-'t': (%d)", groupCounts[3]);
        for (int i = 0; i < groupCounts[3]; i++) {
            System.out.print("*");
        }
        System.out.printf("'u'-'y': (%d)", groupCounts[4]);
        for (int i = 0; i < groupCounts[4]; i++) {
            System.out.print("*");
        }


    }
}
