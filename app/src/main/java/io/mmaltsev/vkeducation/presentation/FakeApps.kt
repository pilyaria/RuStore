package io.mmaltsev.vkeducation.presentation.applist

import io.mmaltsev.vkeducation.domain.appdetails.AppDetails
import io.mmaltsev.vkeducation.domain.appdetails.Category

object FakeApps {
    val apps = listOf(
        // 1. Игра — как в примере карточки
        AppDetails(
            id = "1",
            name = "Гильдия Героев: Экшен ММО РПГ",
            developer = "VK Play",
            category = Category.GAME,
            ageRating = 12,
            size = 223.7f,
            iconUrl = "https://static.rustore.ru/imgproxy/APsbtHxkVa4MZ0DXjnIkSwFQ_KVIcqHK9o3gHY6pvOQ/preset:web_app_icon_62/plain/https://static.rustore.ru/apk/393868735/content/ICON/3f605e3e-f5b3-434c-af4d-77bc5f38820e.png@webp",
            screenshotUrlList = listOf(
                "https://static.rustore.ru/imgproxy/-y8kd-4B6MQ-1OKbAbnoAIMZAzvoMMG9dSiHMpFaTBc/preset:web_scr_lnd_335/plain/https://static.rustore.ru/apk/393868735/content/SCREENSHOT/dfd33017-e90d-4990-aa8c-6f159d546788.jpg@webp",
                "https://static.rustore.ru/imgproxy/dZCvNtRKKFpzOmGlTxLszUPmwi661IhXynYZGsJQvLw/preset:web_scr_lnd_335/plain/https://static.rustore.ru/apk/393868735/content/SCREENSHOT/60ec4cbc-dcf6-4e69-aa6f-cc2da7de1af6.jpg@webp",
                "https://static.rustore.ru/imgproxy/g5whSI1uNqaL2TUO7TFfM8M63vXpWXNCm2vlX4Ahvc4/preset:web_scr_lnd_335/plain/https://static.rustore.ru/apk/393868735/content/SCREENSHOT/c2dde8bc-c4ab-482a-80a5-2789149f598d.jpg@webp",
                "https://static.rustore.ru/imgproxy/TjeurtC7BczOVJt74XhjGYuQnG1l4rx6zpDqyMb00GY/preset:web_scr_lnd_335/plain/https://static.rustore.ru/apk/393868735/content/SCREENSHOT/08318f76-7a9c-43aa-b4a7-1aa878d00861.jpg@webp",
            ),
            description = """
                Легендарный рейд героев в фэнтези-РПГ.
                Соберите отряд, вступайте в гильдию, проходите подземелья и сражайтесь с боссами.
                Прокачивайте персонажей, собирайте редкий лут и участвуйте в PvP-битвах.
            """.trimIndent()
        ),

        // 2. СберБанк Онлайн
        AppDetails(
            id = "2",
            name = "СберБанк Онлайн",
            developer = "Сбербанк",
            category = Category.FINANCE,
            ageRating = 3,
            size = 120.5f,
            iconUrl = "https://static.rustore.ru/imgproxy/lQKIdJKRbtJBX0dxbZueqU-a5TEP_-_yKjFjWljOsaE/preset:web_app_icon_62/plain/https://static.rustore.ru/apk/462271/content/ICON/f1b3c68a-b734-48ce-b62f-490208d3fa0e.png@webp",
            screenshotUrlList = listOf(
                "https://static.rustore.ru/imgproxy/ypTHqgZWwVfB_9J9_ilN8bTOS-BJuAVMqebxFfoti8o/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/11/13/81/apk/462271/content/SCREENSHOT/deb75394-6fed-4b48-bc4d-75e25fc482b1.png@webp",
                "https://static.rustore.ru/imgproxy/TmuTAMVz7ipFtA6EPqY2owFJZ-pnQfVR9q7kHbxzu5Y/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/11/13/1d/apk/462271/content/SCREENSHOT/73436314-1c1b-4a5e-95e9-440427a01779.png@webp"
            ),
            description = "СберБанк Онлайн — удобный и безопасный мобильный банк для управления счетами, переводами и оплатой услуг."
        ),

        // 3. Яндекс Браузер
        AppDetails(
            id = "3",
            name = "Яндекс.Браузер",
            developer = "Яндекс",
            category = Category.APP,
            ageRating = 0,
            size = 180.0f,
            iconUrl = "https://static.rustore.ru/imgproxy/bZNt9jiZUOVXXOG0JdJQleTYIB2cFeE3MaWk7o897jE/preset:web_app_icon_160/plain/https://static.rustore.ru/2025/10/25/1e/apk/579007/content/ICON/939321c0-03f7-484d-9043-c0fb12736ef1.png@webp",
            screenshotUrlList = listOf(
                "https://static.rustore.ru/imgproxy/PFLM-GlJd_frNCL5vR_OJZZQhzdL3fvgdvIdpJrVq4A/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/10/25/6a/apk/579007/content/SCREENSHOT/b14e7901-1fcb-4045-94af-3464c359f224.jpg@webp",
                "https://static.rustore.ru/imgproxy/Au3P2Niy_5KX1We1FiE018ua2_ESFPF4ojmIq8hLrew/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/10/25/bc/apk/579007/content/SCREENSHOT/eb4422a7-36cf-4d11-a25a-456026f39cc7.jpg@webp",
                "https://static.rustore.ru/imgproxy/Fs5c_h_5CDN9x08e-7hwqtRjLp-SHCktgtEr54qUfEE/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/10/25/81/apk/579007/content/SCREENSHOT/1d9d8a7f-9d6d-4b53-9107-c379bbd1ce48.jpg@webp",
                "https://static.rustore.ru/imgproxy/wAYoW7mF9FERBTTrYt6bEodhDIRSa8WZIcgYfGk3oxU/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/10/25/b3/apk/579007/content/SCREENSHOT/816a1cc0-31aa-431f-a560-51aad66f7342.jpg@webp"
            ),
            description = "Быстрый и безопасный браузер с голосовым помощником Алисой, защитой от мошенников и умным поиском."
        ),

        // 4. Почта Mail.ru
        AppDetails(
            id = "4",
            name = "Почта Mail.ru",
            developer = "VK",
            category = Category.APP,
            ageRating = 0,
            size = 90.0f,
            iconUrl = "https://static.rustore.ru/imgproxy/drWzUtZKwIyfl_6AX_popwN6T70Q4LqrI-Sc8Ub6pIk/preset:web_app_icon_160/plain/https://static.rustore.ru/apk/332223/content/ICON/2426237c-0a8d-401b-8572-b07145bdc333.png@webp",
            screenshotUrlList = listOf(
                "https://static.rustore.ru/imgproxy/Rcc4tUHpVttJcIvSZs4HvLkNsUk-PsGidA2aNMwnWeo/preset:web_scr_prt_162/plain/https://static.rustore.ru/apk/332223/content/SCREENSHOT/9dce2b27-e8f4-4fb0-ba86-44094128069e.jpg@webp",
                "https://static.rustore.ru/imgproxy/ELH6ITztOY1cqyzPky8aDbiLn9J4TrfHjUpHExizA6w/preset:web_scr_prt_162/plain/https://static.rustore.ru/apk/332223/content/SCREENSHOT/80cb6c8c-7572-491c-b6b6-2f2dbcc551f7.jpg@webp",
                "https://static.rustore.ru/imgproxy/pvjcMLhZT7nZPp75Ly-uqLrUgznnBX6Quu8nlS4zpuE/preset:web_scr_prt_162/plain/https://static.rustore.ru/apk/332223/content/SCREENSHOT/ab6b2fad-dc0c-454f-afc1-77c7fbaf7387.jpg@webp",
                "https://static.rustore.ru/imgproxy/oIXZo_Fw3tKcaAgDU0Ref9BaUG3561pbwd16TIUsCe4/preset:web_scr_prt_162/plain/https://static.rustore.ru/apk/332223/content/SCREENSHOT/9011456c-c0ad-4999-a2fb-422bb5688c3a.jpg@webp"
            ),
            description = "Мобильная почта для любых ящиков: удобный интерфейс, быстрые уведомления и высокий уровень защиты."
        ),

        // 5. VK
        AppDetails(
            id = "5",
            name = "VK",
            developer = "VK",
            category = Category.SOCIAL,
            ageRating = 12,
            size = 150.3f,
            iconUrl = "https://static.rustore.ru/imgproxy/PTo8g-Giv9VHYo7_Rwxw_1wC07KtDM7eSJgAfMlv53s/preset:web_app_icon_160/plain/https://static.rustore.ru/3f3d7180-6eb9-45ad-8706-f467c6dcf82a@webp",
            screenshotUrlList = listOf(
                "https://static.rustore.ru/imgproxy/nK1CynAoI560bECi_b3VxG1FlZ5hEnaOD3ZA7lh0yZE/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/11/11/b5/apk/317631/content/SCREENSHOT/45e0d5dc-dd0e-4ea3-b7b4-3437640aaf5b.jpg@webp",
                "https://static.rustore.ru/imgproxy/OdFAuSZoGd_daCmA9s6fArnvoBM_0zbHA6z9xHQib0I/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/11/11/41/apk/317631/content/SCREENSHOT/bf2cd2df-df6c-4b0e-a8cb-94f23953a137.jpg@webp",
                "https://static.rustore.ru/imgproxy/7euaR-W0Qz1uVDPCgLlB38KIfN3iOaix-pM6rd6OJqo/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/11/11/ee/apk/317631/content/SCREENSHOT/d4b75c88-e2f4-4cc9-9da9-0fdcc63c3eba.jpg@webp",
                "https://static.rustore.ru/imgproxy/JJxE9yawKhiKzA5Dg9_ux3BfH5iEHV_4tDTj4uHdm78/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/11/11/37/apk/317631/content/SCREENSHOT/dfa9cf29-693e-4b4d-9902-a23f4186497c.jpg@webp"
            ),
            description = "Общение, музыка, видео, клипы, группы и сервисы — всё в одном приложении крупнейшей социальной сети."
        ),

        // 5. Яндекс Карты
        AppDetails(
            id = "6",
            name = "Яндекс Карты",
            developer = "Яндекс",
            category = Category.MAPS,
            ageRating = 0,
            size = 220.0f,
            iconUrl = "https://static.rustore.ru/imgproxy/kN8NuYdJ6YTyb8oR90TnHIesgx8g2OUJg0ktaqwkM84/preset:web_app_icon_160/plain/https://static.rustore.ru/apk/586431/content/ICON/a5f2fe7d-cd63-4f3f-a2f8-40d997c1d6f4.png@webp",
            screenshotUrlList = listOf(
                "https://static.rustore.ru/imgproxy/qchH4Z73TkdVAHpK7rMbtkwGuP0g7qRKSSt7lIO_Kzw/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/11/20/70/apk/586431/content/SCREENSHOT/37edc000-f85b-4271-9254-f3b8eeedf6fc.jpg@webp",
                "https://static.rustore.ru/imgproxy/lwByh3SeU0Ry1yerQwSmqIwSoXd0bW25G7Qha6MyAvg/preset:web_scr_prt_162/plain/https://static.rustore.ru/apk/586431/content/SCREENSHOT/1437ef6c-b2fb-461e-8402-976d14f5239c.png@webp",
                "https://static.rustore.ru/imgproxy/5u5FAi75SkXzTj9EuT0tbH_ScTmtKgz_baMxPlbESiI/preset:web_scr_prt_162/plain/https://static.rustore.ru/apk/586431/content/SCREENSHOT/63a03160-3450-4af1-8e8a-54c63109923f.png@webp",
                "https://static.rustore.ru/imgproxy/m9WtP4p-0F33rnN0EME_zv6Skm0SzuJC-pqiqz3KaVg/preset:web_scr_prt_162/plain/https://static.rustore.ru/apk/586431/content/SCREENSHOT/7212ac5e-25bf-4543-b472-83d981508e5e.png@webp"
            ),
            description = "Навигатор, пробки, маршруты, транспорт и организация поездок с подробными картами городов."
        ),

        // 6. Госуслуги
        AppDetails(
            id = "7",
            name = "Госуслуги",
            developer = "Минцифры России",
            category = Category.BUSINESS,
            ageRating = 12,
            size = 110.0f,
            iconUrl = "https://static.rustore.ru/imgproxy/Utk3uFgtJBykoMq9CxVpbrglbaRrRLbRjvl0WBGHBNk/preset:web_app_icon_160/plain/https://static.rustore.ru/apk/537791/content/ICON/11066006-80e6-4554-9160-49f84df2a4c0.png@webp",
            screenshotUrlList = listOf(
                "https://static.rustore.ru/imgproxy/ISSrYdwu348Ip49878E52ozKRYIstKALAVZag4-nxkc/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/11/25/ac/apk/537791/content/SCREENSHOT/a8b8dd05-fc73-4cbb-8ae5-7d9ea578db2f.png@webp",
                "https://static.rustore.ru/imgproxy/1fDCUgA0culNtavp0LbRNVKXwThh2myQLMnSyITuKjU/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/11/25/0d/apk/537791/content/SCREENSHOT/a22d257d-e361-48f3-b0db-04d42a12e88b.png@webp",
                "https://static.rustore.ru/imgproxy/YXRFMrbrKbm18xqTgjvhyX7o3eVFK7YGsl0R8MTKSpQ/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/11/25/25/apk/537791/content/SCREENSHOT/eca9e98f-b5ae-4a7e-b28a-85a1d1e3987b.png@webp",
                "https://static.rustore.ru/imgproxy/stMiZ-VPdq9XZvKZQBhR227-pCo1NQjblesNVyWtbUg/preset:web_scr_prt_162/plain/https://static.rustore.ru/2025/11/25/41/apk/537791/content/SCREENSHOT/da47acce-30a0-4c34-9e06-0f8ddb302380.png@webp"
            ),
            description = "Официальное приложение для получения государственных услуг: документы, записи, уведомления."
        )




    )
}
