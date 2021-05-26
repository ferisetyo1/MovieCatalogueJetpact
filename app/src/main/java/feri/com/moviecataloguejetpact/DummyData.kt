package feri.com.moviecataloguejetpact

import feri.com.moviecataloguejetpact.api.model.MovieModel
import feri.com.moviecataloguejetpact.api.model.MovieRespon
import feri.com.moviecataloguejetpact.api.model.TvModel
import feri.com.moviecataloguejetpact.api.model.TvRespon

object DummyData {
    fun getListMovie() = arrayListOf(
        FilmModel(
            "A Star Is Born",
            R.drawable.poster_a_start_is_born,
            "Seorang bintang musik country yang karirnya mulai memudar, Jackson Maine (Bradley Cooper) menemukan sebuah talenta yang sangat berbakat di dalam diri dari seorang musisi muda bernama Ally (Lady Gaga). Maine berhasil mengorbitkan Ally menjadi seorang bintang muda yang menjanjikan. Namun keduanya terlibat hubungan yang lebih jauh dari sekedar mentor dan anak didik. Seiring dengan meroketnya karir dari Ally dan dirinya, Maine mengalami dilema mengenai masalah ini.",
            "05/10/2018",
            "Bradley Cooper",
            120 + 16,
            2018,
            listOf("Bradley Cooper", "Lady Gaga", "Sam Emilot")
        ),
        FilmModel(
            "Alita: Battle Angel",
            R.drawable.poster_alita,
            "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "14/02/2019",
            "Robert Rodriguez",
            120 + 2,
            2019,
            listOf("Rosa Salazar", "Jenifer Connelly", "Mahershala Ali")
        ),
        FilmModel(
            "Aquaman",
            R.drawable.poster_aquaman,
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne",
            "02/11/2018",
            "James Wan",
            120 + 24,
            2018,
            listOf("Jason Momoa", "Amber Heard", "Paric Wilson")
        ),
        FilmModel(
            "Bohemian Rhapsody",
            R.drawable.poster_bohemian,
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "02/11/2018",
            "Bryan Singer",
            120 + 15,
            2018,
            listOf("Rami Malek", "Ben Hardy", "Gwilym Lee")
        ),
        FilmModel(
            "Cold Pursuit",
            R.drawable.poster_cold_persuit,
            "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
            "08/02/2019",
            "Hans Petter Moland",
            60 + 59,
            2019,
            listOf("Liam Neeson", "Laura Dern", "Emmy Rossum")
        ),
        FilmModel(
            "Creed",
            R.drawable.poster_creed,
            "The former World Heavyweight Champion Rocky Balboa serves as a trainer and mentor to Adonis Johnson, the son of his late friend and former rival Apollo Creed.",
            "25/11/2015",
            "Ryan Coogler",
            120 + 13,
            2015,
            listOf("Michael B. Jordan", "Sylvester Staallone")
        ),
        FilmModel(
            "Fantastic Beast: The Crimes Of Grindelwald",
            R.drawable.poster_crimes,
            "Gellert Grindelwald telah melarikan diri dari penjara dan telah mulai mengumpulkan pengikut ke tujuannya — meninggikan penyihir di atas semua makhluk non-magis. Satu-satunya yang bisa menghentikannya adalah penyihir yang pernah disebutnya sebagai sahabat terdekatnya, Albus Dumbledore. Namun, Dumbledore akan perlu mencari bantuan dari penyihir yang telah menggagalkan Grindelwald sebelumnya, mantan muridnya, Newt Scamander, yang setuju untuk membantu, tidak menyadari bahaya yang ada di depan. Garis-garis digambar saat cinta dan kesetiaan diuji, bahkan di antara teman-teman dan keluarga sejati, di dunia sihir yang semakin terbagi.",
            "16/11/2018",
            "David Yates",
            120,
            2018,
            listOf("Eddie Redmayne", "Katherine Waterston", "Alison Sudol")
        ),
        FilmModel(
            "Glass",
            R.drawable.poster_glass,
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            "18/01/2019",
            "M. Night Shyamalan",
            120 + 9,
            2019,
            listOf("James McAvoy", "Bruce Willis", "Anya Taylor-Joy")
        ),
        FilmModel(
            "How to Train Your Dragon : The Hidden World",
            R.drawable.poster_how_to_train,
            "Ketika Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless 'dari pasangan yang tak teruji dan sukar ditangkap membuat Night Fury menjauh. Ketika bahaya meningkat di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga dan pengendara harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka.",
            "09/01/2019",
            "Dean DeBlois",
            60 + 44,
            2019,
            listOf("Jay Baruchel", "America Ferrera", "F. Murray Abraham")
        ),
        FilmModel(
            "Avengers: Infinity War",
            R.drawable.poster_infinity_war,
            "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
            "27/04/2019",
            "Anthony Russo",
            120 + 29,
            2018,
            listOf("Robert Downey Jr.", "Chris Hemsworth", "Chris Evans")
        )
    )

    fun getListTVShow() = arrayListOf(
        FilmModel(
            "The Arrow",
            R.drawable.poster_arrow,
            "Panah adalah menceritakan kembali petualangan dari legendaris DC pahlawan Green Arrow",
            "10/10/2012",
            "Greg Berlanti",
            42,
            2012,
            listOf("Stephen Amell", "David Ramsey", "Emily Bet Rickards")
        ),
        FilmModel(
            "Doom Patrol",
            R.drawable.poster_doom_patrol,
            "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
            "15/02/2019",
            "Jeremy Carver",
            49,
            2019,
            listOf("Diana Guerrero", "April Bowlby", "Joivan Wade")
        ),
        FilmModel(
            "Dragon Ball",
            R.drawable.poster_dragon_ball,
            "Dahulu kala di pegunungan, seorang master pertempuran yang dikenal sebagai Gohan menemukan seorang bocah aneh yang ia beri nama Goku. Gohan membesarkannya dan melatih Goku dalam seni bela diri sampai dia mati. Bocah muda dan sangat kuat itu sendirian, tetapi mudah dikelola. Kemudian suatu hari, Goku bertemu dengan seorang gadis remaja bernama Bulma, yang pencariannya untuk bola naga membawanya ke rumah Goku. Bersama-sama, mereka berangkat untuk menemukan ketujuh bola naga dalam sebuah petualangan yang akan mengubah hidup Goku selamanya. Lihat bagaimana Goku bertemu teman-teman seumur hidupnya Bulma, Yamcha, Krillin, Master Roshi dan banyak lagi.",
            "26/02/1986",
            "Jeremy Carver",
            49,
            2019,
            listOf("Masako Nozawa", "Mayumi Tanaka", "Hiromi Tsuru")
        ),
        FilmModel(
            "Fairy Tail",
            R.drawable.poster_fairytail,
            "Dahulu kala di pegunungan, seorang master pertempuran yang dikenal sebagai Gohan menemukan seorang bocah aneh yang ia beri nama Goku. Gohan membesarkannya dan melatih Goku dalam seni bela diri sampai dia mati. Bocah muda dan sangat kuat itu sendirian, tetapi mudah dikelola. Kemudian suatu hari, Goku bertemu dengan seorang gadis remaja bernama Bulma, yang pencariannya untuk bola naga membawanya ke rumah Goku. Bersama-sama, mereka berangkat untuk menemukan ketujuh bola naga dalam sebuah petualangan yang akan mengubah hidup Goku selamanya. Lihat bagaimana Goku bertemu teman-teman seumur hidupnya Bulma, Yamcha, Krillin, Master Roshi dan banyak lagi.",
            "26/02/1986",
            "Jeremy Carver",
            25,
            1986,
            listOf("Masako Nozawa", "Mayumi Tanaka", "Hiromi Tsuru")
        ),
        FilmModel(
            "Family Guy",
            R.drawable.poster_family_guy,
            "Seri animasi animasi Freakin 'Sweet yang sakit, terpelintir, dan salah, menampilkan petualangan keluarga Griffin yang disfungsional. Peter yang kikuk dan Lois yang sudah lama menderita memiliki tiga anak. Stewie (bayi yang brilian tetapi sadis yang bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan merupakan gadis yang paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film ). Anggota terakhir keluarga itu adalah Brian - anjing yang bisa bicara dan lebih dari sekadar hewan peliharaan, ia menjaga Stewie, sementara menghirup Martinis dan memilah-milah masalah hidupnya sendiri.",
            "26/02/1999",
            "Seth MacFarlane",
            25,
            1986,
            listOf("Masako Nozawa", "Mayumi Tanaka", "Hiromi Tsuru")
        ),
        FilmModel(
            "The Flash",
            R.drawable.poster_flash,
            "When a bolt of lightening crashes through a police crime lab, a mix of electrically charged substances bathes chemist Barry Allen, transforming him into the fastest man alive--The Flash.",
            "20/09/1990",
            "Danny Bilson",
            45,
            1990,
            listOf("John Wesley Shipp", "Amanda Pays", "Alex Désert")
        ),
        FilmModel(
            "Game of Throne",
            R.drawable.poster_god,
            "Tujuh keluarga bangsawan berjuang untuk menguasai tanah mitos Westeros. Gesekan antara rumah-rumah mengarah ke perang skala penuh. Semua sementara kejahatan yang sangat kuno terbangun di utara terjauh. Di tengah-tengah perang, perintah militer yang diabaikan, Night's Watch, adalah yang berdiri di antara alam manusia dan kengerian es di luarnya.",
            "17/04/2011",
            "David Benioff",
            60,
            2011,
            listOf("Emilia Clarke", "Lena Headay", "Sophie Turner")
        ),
        FilmModel(
            "Gotham",
            R.drawable.poster_gotham,
            "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
            "22/09/2014",
            "Bruno Heller",
            43,
            2014,
            listOf("Ben McKenzie", "Donal Logue", "David Mazouz")
        ), FilmModel(
            "Grey's Anatomy",
            R.drawable.poster_grey_anatomy,
            "Ikuti kehidupan pribadi dan profesional sekelompok dokter di Rumah Sakit Gray Sloan Memorial di Seattle.",
            "27/03/2005",
            "Seth MacFarlane",
            43,
            2005,
            listOf("Ellen Pompeo", "Justin Chambers", "Candra Wilson")
        ),
        FilmModel(
            "Hanna",
            R.drawable.poster_hanna,
            "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
            "28/03/2019",
            "David Farr",
            25,
            1986,
            listOf("Esme Creed-Miles", "Mireille Enos", "Noah Tayor")
        )

    )

    fun getListMovieRepo() = MovieRespon(
        page = 1,
        totalPages = 500,
        totalResults = 10000,
        results = arrayListOf(
            MovieModel(
                title = "Those Who Wish Me Dead",
                backdropPath = "/iDdpiUnCeXvBmrkBFpL6lKsZt33.jpg",
                id = 578701,
                overview = "A young boy finds himself pursued by two assassins in the Montana wilderness with a survival expert determined to protecting him - and a forest fire threatening to consume them all.",
                posterPath = "/xCEg6KowNISWvMh8GvPSxtdf9TO.jpg",
                releaseDate = "2021-05-05"
            ),
            MovieModel(
                title = "Mortal Kombat",
                backdropPath = "/6ELCZlTA5lGUops70hKdB83WJxH.jpg",
                id = 460465,
                overview = "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                posterPath = "/nkayOAUBUu4mMvyNf9iHSUiPjF1.jpg",
                releaseDate = "2021-04-07"
            ),
            MovieModel(
                title = "Tom Clancy's Without Remorse",
                backdropPath = "/fPGeS6jgdLovQAKunNHX8l0avCy.jpg",
                id = 567189,
                overview = "An elite Navy SEAL uncovers an international conspiracy while seeking justice for the murder of his pregnant wife.",
                posterPath = "/rEm96ib0sPiZBADNKBHKBv5bve9.jpg",
                releaseDate = "2021-04-29"
            ),
            MovieModel(
                title = "Godzilla vs. Kong",
                backdropPath = "/inJjDhCjfhh3RtrJWBmmDqeuSYC.jpg",
                id = 399566,
                overview = "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                posterPath = "/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                releaseDate = "2021-03-24"
            ),
            MovieModel(
                title = "Nobody",
                backdropPath = "/6zbKgwgaaCyyBXE4Sun4oWQfQmi.jpg",
                id = 615457,
                overview = "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \" nobody .\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
                posterPath = "/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg",
                releaseDate = "2021 - 03 - 26"
            ),
            MovieModel(
                title = "The Unholy",
                backdropPath = "/lkInRiMtLgl9u9xE0By5hqf66K8.jpg",
                id = 632357,
                overview = "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
                posterPath = "/b4gYVcl8pParX8AjkN90iQrWrWO.jpg",
                releaseDate = "2021-03-31"
            ),
            MovieModel(
                title = "Monster Pets: A Hotel Transylvania Short",
                backdropPath = "/c7dFSqZQYqNNJVpacpIGZe3gkLW.jpg",
                id = 813258,
                overview = "Drac tries out some new monster pets to help occupy Tinkles for playtime.",
                posterPath = "/dkokENeY5Ka30BFgWAqk14mbnGs.jpg",
                releaseDate = "2021-04-02"
            ),
            MovieModel(
                title = "22 vs. Earth",
                backdropPath = "/n2y7T8wJVjJ8yLhQXQgNCpsC3ga.jpg",
                id = 811367,
                overview = "Set before the events of ‘Soul’, 22 refuses to go to Earth, enlisting a gang of 5 new souls in attempt of rebellion. However, 22’s subversive plot leads to a surprising revelation about the meaning of life.",
                posterPath = "/32vLDKSzcCMh55zqqaSqqUA8naz.jpg",
                releaseDate = "2021-04-30"
            ),
            MovieModel(
                title = "Demon Slayer -Kimetsu no Yaiba- The Movie: Mugen Train",
                backdropPath = "/xPpXYnCWfjkt3zzE0dpCNME1pXF.jpg",
                id = 635302,
                overview = "Tanjirō Kamado, joined with Inosuke Hashibira, a boy raised by boars who wears a boar's head, and Zenitsu Agatsuma, a scared boy who reveals his true power when he sleeps, boards the Infinity Train on a new mission with the Fire Hashira, Kyōjurō Rengoku, to defeat a demon who has been tormenting the people and killing the demon slayers who oppose it!",
                posterPath = "/h8Rb9gBr48ODIwYUttZNYeMWeUU.jpg",
                releaseDate = "2020-10-16"
            ),
            MovieModel(
                title = "Zack Snyder's Justice League",
                backdropPath = "/pcDc2WJAYGJTTvRSEIpRZwM3Ola.jpg",
                id = 791373,
                overview = "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                posterPath = "/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg",
                releaseDate = "2021-03-18"
            ),
            MovieModel(
                title = "The Banishing",
                backdropPath = "/xrAaJAn3hqkInq5kE1AGJqIGXyT.jpg",
                id = 573680,
                overview = "In the 1930s, a young reverend and his family are forced to confront their worst fears when they discover their new home holds a horrifying secret.",
                posterPath = "/xD9mc8JCVXA8T8u4Od7qOUBuGH4.jpg",
                releaseDate = "2021-04-29"
            ),
            MovieModel(
                title = "Raya and the Last Dragon",
                backdropPath = "/7prYzufdIOy1KCTZKVWpjBFqqNr.jpg",
                id = 527774,
                overview = "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
                posterPath = "/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg",
                releaseDate = "2021-03-03"
            ),
            MovieModel(
                title = "Miraculous World: Shanghai – The Legend of Ladydragon",
                backdropPath = "/lHhc60NXYzswU4TvKSo45nY9Jzs.jpg",
                id = 726684,
                overview = "To join Adrien in Shanghai, Marinette is going to visit her uncle Wang who is celebrating his anniversary. But, as soon as she arrives in China, her purse gets stolen with Tikki inside, whom she needs to secretly transform into Ladybug! Without money and alone in the immense city, Marinette accepts the help of a young and resourceful girl, Fei. The two girls will ally and discover the existence of a new magical jewel, the Prodigious. Hawk Moth, also present in Shanghai, seeks to finding it since a long time...",
                posterPath = "/msI5a9TPnepx47JUb2vl88hb80R.jpg",
                releaseDate = "2021-04-04"
            ),
            MovieModel(
                title = "Vanquish",
                backdropPath = "/mYM8x2Atv4MaLulaV0KVJWI1Djv.jpg",
                id = 804435,
                overview = "Victoria is a young mother trying to put her dark past as a Russian drug courier behind her, but retired cop Damon forces Victoria to do his bidding by holding her daughter hostage. Now, Victoria must use guns, guts and a motorcycle to take out a series of violent gangsters—or she may never see her child again.",
                posterPath = "/1jkNM1NHyHsxiBBuOlOeqgmidM0.jpg",
                releaseDate = "2021-04-16"
            ),
            MovieModel(
                title = "The Marksman",
                backdropPath = "/5Zv5KmgZzdIvXz2KC3n0MyecSNL.jpg",
                id = 634528,
                overview = "Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.",
                posterPath = "/6vcDalR50RWa309vBH1NLmG2rjQ.jpg",
                releaseDate = "2021-01-15"
            ),
            MovieModel(
                title = "The Virtuoso",
                backdropPath = "/3Ef8PWUiP1ehO1ESEroxb736srR.jpg",
                id = 808023,
                overview = "A lonesome stranger with nerves of steel must track down and kill a rogue hitman to satisfy an outstanding debt. But the only information he's been given is a time and location where to find his quarry. No name. No description. Nothing.",
                posterPath = "/vXHzO26mJaOt4VO7ZFiM6No5ScT.jpg",
                releaseDate = "2021-04-30"
            ),
            MovieModel(
                title = "Seobok",
                backdropPath = "/yC4DRg5aGgNpkHpUDpLtBqzownS.jpg",
                id = 586047,
                overview = "A former intelligence agent gets involved with the first human clone, Seo Bok, who others seek, causing trouble.",
                posterPath = "/nxxuWC32Y6TULj4VnVwMPUFLIpK.jpg",
                releaseDate = "2021-04-12"
            ),
            MovieModel(
                title = "Maya the Bee: The Golden Orb",
                backdropPath = "/7HtvmsLrDeiAgDGa1W3m6senpfE.jpg",
                id = 681260,
                overview = "When Maya, a headstrong little bee, and her best friend Willi, rescue an ant princess they find themselves in the middle of an epic bug battle that will take them to strange new worlds and test their friendship to its limits.",
                posterPath = "/tMS2qcbhbkFpcwLnbUE9o9IK4HH.jpg",
                releaseDate = "2021-01-07"
            ),
            MovieModel(
                title = "Willy's Wonderland",
                backdropPath = "/jFINtstDUh0vHOGImpMAmLrPcXy.jpg",
                id = 643586,
                overview = "When his car breaks down, a quiet loner agrees to clean an abandoned family fun center in exchange for repairs. He soon finds himself waging war against possessed animatronic mascots while trapped inside Willy's Wonderland.",
                posterPath = "/keEnkeAvifw8NSEC4f6WsqeLJgF.jpg",
                releaseDate = "2021-02-12"
            ),
            MovieModel(
                title = "Army of the Dead",
                backdropPath = "/c0izdYdnTe4uMRifHgvTA85wPz0.jpg",
                id = 503736,
                overview = "Following a zombie outbreak in Las Vegas, a group of mercenaries take the ultimate gamble: venturing into the quarantine zone to pull off the greatest heist ever attempted.",
                posterPath = "/x3taBaWfRzw1NIKhEPpKPwKBAOC.jpg",
                releaseDate = "2021-05-14"
            )
        )
    )

    fun getListTVRepo() = TvRespon(
        page = 1,
        totalPages = 500,
        totalResults = 10000,
        results = arrayListOf(
            TvModel(
                backdropPath = "/ dYvIUzdh6TUv4IFRq8UBkX7bNNu.jpg",
                id = 120168,
                firstAirDate = "2021-03-24",
                overview = "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit.",
                posterPath = "/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg",
                name = "Who Killed Sara?"
            ),
            TvModel(
                backdropPath = "/9Jmd1OumCjaXDkpllbSGi2EpJvl.jpg",
                id = 60735,
                firstAirDate = "2014-10-07",
                overview = "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \" meta -human                \" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                posterPath = "/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg",
                name = "The Flash"
            ),
            TvModel(
                backdropPath = "/mZjZgY6ObiKtVuKVDrnS9VnuNlE.jpg",
                id = 71712,
                firstAirDate = "2017-09-25",
                overview = "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                posterPath = "/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                name = "The Good Doctor"
            ),
            TvModel(
                backdropPath = "/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                id = 88396,
                firstAirDate = "2021-03-19",
                overview = "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                posterPath = "/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                name = "The Falcon and the Winter Soldier"
            ),
            TvModel(
                backdropPath = "/6UH52Fmau8RPsMAbQbjwN3wJSCj.jpg",
                id = 95557,
                firstAirDate = "2021-03-26",
                overview = "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                posterPath = "/yDWJYRAwMNKbIYT8ZB33qy84uzO.jpg",
                name = "Invincible"
            ),
            TvModel(
                backdropPath = "/edmk8xjGBsYVIf4QtLY9WMaMcXZ.jpg",
                id = 1416,
                firstAirDate = "2005-03-27",
                overview = "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                posterPath = "/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                name = "Grey's Anatomy"
            ),
            TvModel(
                backdropPath = "/h48Dpb7ljv8WQvVdyFWVLz64h4G.jpg",
                id = 63174,
                firstAirDate = "2016-01-25",
                overview = "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                posterPath = "/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                name = "Lucifer"
            ),
            TvModel(
                backdropPath = "/nBrkOZyI75artyizuBFeya48KbO.jpg",
                id = 86831,
                firstAirDate = "2019-03-15",
                overview = "Terrifying creatures, wicked surprises and dark comedy converge in this NSFW anthology of animated stories presented by Tim Miller and David Fincher.",
                posterPath = "/asDqvkE66EegtKJJXIRhBJPxscr.jpg",
                name = "Love, Death & Robots"
            ),
            TvModel(
                backdropPath = "/qZtAf4Z1lazGQoYVXiHOrvLr5lI.jpg",
                id = 69050,
                firstAirDate = "2017-01-26",
                overview = "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                posterPath = "/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg",
                name = "Riverdale"
            ),
            TvModel(
                backdropPath = "/4YKkS95v9o9c0tBVA46xIn6M1tx.jpg",
                id = 93484,
                firstAirDate = "2021-05-07",
                overview = "As the world's first generation of superheroes (who received their powers in the 1930s) become the revered elder guard in the present, their superpowered children struggle to live up to the legendary feats of their parents.",
                posterPath = "/9yxep7oJdkj3Pla9TD9gKflRApY.jpg",
                name = "Jupiter's Legacy"
            ),
            TvModel(
                backdropPath = "/sjxtIUCWR74yPPcZFfTsToepfWm.jpg",
                id = 105971,
                firstAirDate = "2021-05-04",
                overview = "Follow the elite and experimental Clones of the Bad Batch as they find their way in a rapidly changing galaxy in the aftermath of the Clone Wars.",
                posterPath = "/uggL9jiDi0CCfoPIfU2X6BnMaFy.jpg",
                name = "The Bad Batch"
            ),
            TvModel(
                backdropPath = "/suopoADq0k8YZr4dQXcU6pToj6s.jpg",
                id = 1399,
                firstAirDate = "2011-04-17",
                overview = "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                posterPath = "/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                name = "Game of Thrones"
            ),
            TvModel(
                backdropPath = "/wkyzeBBKLhSg1Oqhky5yoiFF2hG.jpg",
                id = 79008,
                firstAirDate = "2018-04-22",
                overview = "The series dramatizes the life story of Mexican superstar singer Luis Miguel, who has captivated audiences in Latin America and beyond for decades.",
                posterPath = "/34FaY8qpjBAVysSfrJ1l7nrAQaD.jpg",
                name = "Luis Miguel: The Series"
            ),
            TvModel(
                backdropPath = "/pPKiIJEEcV0E1hpVcWRXyp73ZpX.jpg",
                id = 95057,
                firstAirDate = "2021-02-23",
                overview = "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.",
                posterPath = "/vlv1gn98GqMnKHLSh0dNciqGfBl.jpg",
                name = "Superman & Lois"
            ),
            TvModel(
                backdropPath = "/pnyT1foDmmXTsho2DfxN2ePI8ix.jpg",
                id = 80240,
                firstAirDate = "2018-06-12",
                overview = "After spending seventeen years in prison unfairly, a talented songwriter seeks revenge on the men who sank her and killed her family.",
                posterPath = "/fuVuDYrs8sxvEolnYr0wCSvtyTi.jpg",
                name = "The Queen of Flow"
            ),
            TvModel(
                backdropPath = "/hNiGqLsiD30C194lci7VYDmciHD.jpg",
                id = 69478,
                firstAirDate = "2017-04-26",
                overview = "Set in a dystopian future, a woman is forced to live as a concubine under a fundamentalist theocratic dictatorship. A TV adaptation of Margaret Atwood's novel.",
                posterPath = "/oIkxqt6ug5zT5ZSUUyc1Iqopf02.jpg",
                name = "The Handmaid's Tale"
            ),
            TvModel(
                backdropPath = "/uro2Khv7JxlzXtLb8tCIbRhkb9E.jpg",
                id = 1402,
                firstAirDate = "2010-10-31",
                overview = "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                posterPath = "/rqeYMLryjcawh2JeRpCVUDXYM5b.jpg",
                name = "The Walking Dead"
            ),
            TvModel(
                backdropPath = "/58PON1OrnBiX6CqEHgeWKVwrCn6.jpg",
                id = 62286,
                firstAirDate = "2015-08-23",
                overview = "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                posterPath = "/4UjiPdFKJGJYdxwRs2Rzg7EmWqr.jpg",
                name = "Fear the Walking Dead"
            ),
            TvModel(
                backdropPath = "/ogAoaYiqwkV7Qm2JFvUKMSihmIL.jpg",
                id = 93741,
                firstAirDate = "2020-09-18",
                overview = "Six teens attending an adventure camp on the opposite side of Isla Nublar must band together to survive when dinosaurs wreak havoc on the island.",
                posterPath = "/jWTDtbp2TnUGw1OJoDqq2O9IS0M.jpg",
                name = "Jurassic World: Camp Cretaceous"
            ),
            TvModel(
                backdropPath = "/fRYwdeNjMqC30EhofPx5PlDpdun.jpg",
                id = 79460,
                firstAirDate = "2018-10-25",
                overview = "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted.",
                posterPath = "/qTZIgXrBKURBK1KrsT7fe3qwtl9.jpg",
                name = "Legacies"
            )
        )
    )

    fun getDetailMovieRepo() = MovieModel(
        title = "Those Who Wish Me Dead",
        backdropPath = "/iDdpiUnCeXvBmrkBFpL6lKsZt33.jpg",
        genres = arrayListOf(
            MovieModel.GenresItem(name = "Thriller", id = 53),
            MovieModel.GenresItem(name = "Drama", id = 18),
            MovieModel.GenresItem(name = "Action", id = 28),
            MovieModel.GenresItem(name = "Mystery", id = 9648)
        ),
        id = 578701,
        overview = "A young boy finds himself pursued by two assassins in the Montana wilderness with a survival expert determined to protecting him - and a forest fire threatening to consume them all.",
        posterPath = "/xCEg6KowNISWvMh8GvPSxtdf9TO.jpg",
        releaseDate = "2021-05-05"
    )

    fun getDetailTvRepo() = TvModel(
        backdropPath = "/dYvIUzdh6TUv4IFRq8UBkX7bNNu.jpg",
        genres = arrayListOf(
            TvModel.GenresItem(name = "Drama", id = 18),
            TvModel.GenresItem(name = "Crime", id = 80),
            TvModel.GenresItem(name = "Mystery", id = 9648)
        ),
        id = 120168,
        firstAirDate = "2021-03-24",
        overview = "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit.",
        posterPath = "/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg",
        name = "Who Killed Sara?"
    )

    fun getSearchMovieRepo() = MovieRespon(
        page = 1,
        totalPages = 1,
        totalResults = 1,
        results = arrayListOf(
            MovieModel(
                title = "Those Who Wish Me Dead",
                backdropPath = "/iDdpiUnCeXvBmrkBFpL6lKsZt33.jpg",
                id = 578701,
                overview = "A young boy finds himself pursued by two assassins in the Montana wilderness with a survival expert determined to protecting him - and a forest fire threatening to consume them all.",
                posterPath = "/xCEg6KowNISWvMh8GvPSxtdf9TO.jpg",
                releaseDate = "2021-05-05"
            )
        )
    )

    fun getSearchTVRepo() = TvRespon(
        page = 1,
        totalPages = 1,
        totalResults = 1,
        results = arrayListOf(
            TvModel(
                backdropPath = "/ogAoaYiqwkV7Qm2JFvUKMSihmIL.jpg",
                id = 93741,
                firstAirDate = "2020-09-18",
                overview = "Six teens attending an adventure camp on the opposite side of Isla Nublar must band together to survive when dinosaurs wreak havoc on the island.",
                posterPath = "/jWTDtbp2TnUGw1OJoDqq2O9IS0M.jpg",
                name = "Jurassic World: Camp Cretaceous"
            ),
        )
    )
}