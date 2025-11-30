package homeWork;

import java.util.Scanner;

public class VulkanikAdadanQachish {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int enerji = 100;
        int bal = 0;

        // --- GİRİŞ HEKAYƏSİ ---
        System.out.println("\uD83C\uDF05 Səhər günəşi doğur və sən özünü naməlum adada tapırsan...");
        System.out.println("\uD83C\uDF0B Yer titrəyir... Vulkan püskürməyə hazırlaşır!");
        System.out.println("Adadan qaçmaq üçün 4 təhlükəli zonanı keçməlisən!\n");

        System.out.print("Adınızı daxil edin: ");
        String name = input.nextLine();
        System.out.println("Xoş gəldin " + name + "! Macəra başlasın!\n");

        // -------------------------
        // 🌋 ZONA 1 – Riyaziyyat sualı
        // -------------------------
        System.out.println("🌋 ZONA 1: Riyaziyyat Kanyonu");
        System.out.println("Kanyon uçmaq üzrədir! Düzgün cavab ver və keç!\n");

        System.out.print("Sual: 15 + 27 = ?  Cavab: ");
        int cavab1 = input.nextInt();

        if (cavab1 == 42) {
            System.out.println("✔️ Düzgün cavab! Birinci zonadan keçdin!");
            bal += 10;
        } else {
            System.out.println("❌ Yanlış cavab! Qayalar yıxıldı və enerjin azaldı!");
            enerji -= 20;
        }

        System.out.println("Enerji: " + enerji + " | Bal: " + bal + "\n");

        if (enerji <= 0) {
            System.out.println("💀 Enerjin bitdi... Vulkan səni uddu!");
            return;
        }

        // -------------------------
        // ⛏️ ZONA 2 – Qaranlıq Mağara
        // -------------------------
        System.out.println("⛏️ ZONA 2: Qaranlıq Mağara");
        System.out.println("Mağara qaranlıqdır. 5 addım atmalısan.\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". addımı atırsan...");
            if (i == 3) {
                System.out.println("⚠️ Tələ! Enerjin 10 azaldı!");
                enerji -= 10;
            }
        }

        bal += 10;
        System.out.println("Mağaranı keçdin!");
        System.out.println("Enerji: " + enerji + " | Bal: " + bal + "\n");

        if (enerji <= 0) {
            System.out.println("💀 Enerjin bitdi... Qaranlıq səni uddu.");
            return;
        }

        // -------------------------
        // 🌉 ZONA 3 – Qırıq Körpü
        // -------------------------
        System.out.println("🌉 ZONA 3: Qırıq Körpü");
        System.out.println("Sol (L) və ya Sağ (R) yol seç!\n");

        System.out.print("Seçimin (L/R): ");
        char yol = input.next().charAt(0);

        if (yol == 'L' || yol == 'l') {
            System.out.println("✔️ Sol yol daha təhlükəsiz idi! Keçdin!");
            bal += 10;
        } else if (yol == 'R' || yol == 'r') {
            System.out.println("❌ Sağ yol qırıq idi! Enerjin 25 azaldı!");
            enerji -= 25;
        } else {
            System.out.println("Yanlış seçim! Ayağın sürüşdü! Enerjin -20");
            enerji -= 20;
        }

        System.out.println("Enerji: " + enerji + " | Bal: " + bal + "\n");

        if (enerji <= 0) {
            System.out.println("💀 Körpüdən düşdün... Sonun gəldi.");
            return;
        }

        // -------------------------
        // 🔥 ZONA 4 – Vulkan Qapıları
        // -------------------------
        System.out.println("🔥 ZONA 4: Vulkan Qapıları");
        System.out.println("Doğru qapını seçməlisən. (1, 2 və ya 3)\n");

        int qapi;
        boolean qurtuldun = false;

        do {
            System.out.print("Qapı seç (1-2-3): ");
            qapi = input.nextInt();

            switch (qapi) {
                case 2:
                    System.out.println("✔️ Düzgün qapı! Vulkanın içindən sağ çıxdın!");
                    bal += 20;
                    qurtuldun = true;
                    break;

                case 1:
                case 3:
                    System.out.println("❌ Yanlış qapı! Qaynar hava səni yandırdı. Enerji -15");
                    enerji -= 15;
                    break;

                default:
                    System.out.println("Belə qapı yoxdur! Yenidən yoxla.");
            }

            if (enerji <= 0) {
                System.out.println("💀 Enerjin tükəndi... Vulkan səni uddu.");
                return;
            }

        } while (!qurtuldun);

        // -------------------------
        // 🏁 SONLUQ
        // -------------------------
        System.out.println("\n🏁 Qurtuldun " + name + "! Helikopter səni apardı!");
        System.out.println("Yekun enerji: " + enerji);
        System.out.println("Yekun bal: " + bal);

        if (bal >= 40) {
            System.out.println("🏆 MÖHTƏŞƏM QAÇIŞ! Adadan əla performansla çıxdın!");
        } else if (bal >= 20) {
            System.out.println("⚠️ Zəif amma sağ qaldın. Şanslısan demək...");
        } else {
            System.out.println("💀 Çətinliklə sağ qaldın. Bir az da geciksəydin bitmişdin.");
        }
    }
}
