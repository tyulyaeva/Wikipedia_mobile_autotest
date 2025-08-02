# Проект по автоматизации mobile тестов для приложения [Wikipedia](https://ru.wikipedia.org/)
<p align="center"><a href="https://ru.wikipedia.org/"><img src="media/logo/WikiLogo.png" align="center" width="500" height="300" alt="Wiki"/></a></p>  

> Википедия - общедоступная многоязычная универсальная интернет-энциклопедия со свободным контентом, реализованная на принципах вики.

# 🧾 Содержание:

- <a href="#tools">Технологии и инструменты</a>
- <a href="#checking">Тестовые сценарии, реализованные в автоматизированных тест-кейсах</a>
- <a href="#jenkins">Сборка в Jenkins</a>
- <a href="#console">Запуск тестов (Из терминала)</a>
- <a href="#allureReport">Allure-отчет</a>
- <a href="#allure">Интеграция с Allure TestOps</a>
- <a href="#jira">Интеграция с Jira</a>
- <a href="#teleg"> Уведомление в Telegram о результатах выполнения автоматизированных тестов</a>
- <a href="#movie">Видеопример прохождения тестов Browserstack</a>


<a id="tools"></a>

## 🔨 Технологии и инструменты:

| Java                                                                                                    | IntelliJ  <br>  Idea                                                                                               | GitHub                                                                                                     | JUnit 5                                                                                                          | Gradle                                                                                                    | Allure <br> Report                                                                                                        | Appium                                                                                                   | Browserstack                                                                                                                   | Jenkins                                                                                                         | Jira                                                                                                                                  | Telegram                                                                                                         |                                                                                            Allure <br> TestOps |
|:--------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="media/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  | <a href="https://github.com/allure-framework"><img src="media/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://appium.io//"><img src="media/logo/Appium.svg" width="50" height="50" alt="Appium"/></a> | <a href="https://www.browserstack.com/"><img src="media/logo/Browserstack.svg" width="50" height="50" alt="Browserstack"/></a> | <a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://www.atlassian.com/software/jira/"><img src="media/logo/Jira.svg" width="50" height="50" alt="Jira" title="Jira"/></a> | <a href="https://web.telegram.org/"><img src="media/logo/Telegram.svg" width="50" height="50" alt="Telegram"/></a> | <a href="https://qameta.io/"><img src="media/logo/Allure_TO.svg" width="50" height="50" alt="Allure_TO"/></a> |

<a id="checking"></a>

---

## :clipboard: Тестовые сценарии

### Для локального запуска
- Тест-кейс №1: Проверка получения результата поиска

### Для удаленного запуска
- Тест-кейс №1: Проверка получения результата поиска
- Тест-кейс №2: Проверка открытия статьи
- Тест-кейс №3: Проверка наличия раздела 'In the News' на главной странице
- Тест-кейс №4: Проверка добавления языка 'Deutsch' в настройках

---

- Тесты в данном проекте написаны на языке <code>Java</code> с использованием фреймворка для тестирования [Selenide](https://selenide.org/), c применением паттерна Page Object.
- Сборщик - <code>Gradle</code>.
- <code>JUnit 5</code> задействован в качестве фреймворка модульного тестирования.
- При прогоне тестов для запуска используется [Android Studio](https://developer.android.com/), [Browserstack](https://www.browserstack.com/), драйвер Appium.
- В отчетах Allure для каждого теста (запускаемого удаленно) прикреплено видео прохождения теста.

---

<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Wikipedia_mobile_autotest/)

<p align="center">
<img src="media/screens/jenkins_main.png" alt="Jenkins Page" width="1000" height="500">
</p>

---

<a id="console"></a>
## :rocket: Команды для запуска

### Локальный запуск (через эмулятор)

```bash
gradle clean local_test -Dhost=local_test
```

> Для запуска локальных тестов требуются следующие установленные программы на компьютере: Appium Server, Appium и Android Studio
<p align="center">  
<img title="AppiumService" src="media/screens/appium_server.png" width="1000">  
</p> 
Пример запуска Appium сервера, с созданием локального порта.

### Удаленный запуск (через browserstack)

```bash
gradle clean browserstack_test -Dhost=browserstack_test
```

---

<a id="allureReport"></a>
## <img alt="Allure" height="25" src="media/logo/Allure.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://jenkins.autotests.cloud/job/Wikipedia_mobile_autotest/22/allure/">Allure Report</a>

## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screens/allure_main.png" width="1000">  
</p>  

## 📄 Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="media/screens/allure_suits.png" width="1000">   
</p>

---

<a id="allure"></a>
## <img alt="Allure_TO" height="25" src="media/logo/Allure_TO.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/4848/dashboards">Allure TestOps</a>

## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screens/allure_to_boards.png" width="1000">  
</p>  
На *Dashboard* в <code>Allure TestOps</code> видна статистика количества тестов: сколько из них добавлены и проходятся вручную, сколько автоматизированы. Новые тесты, а так же результаты прогона приходят по интеграции при каждом запуске сборки.


## 📄 Пример тест-кейса

<p align="center">  
<img title="Allure Tests" src="media/screens/allure_to_manual.png" width="1000">  
</p>

---

<a id="jira"></a>

## <img src="media/logo/Jira.svg" width="25" height="25"/> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1481)

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>, в тикете отображается, какие тест-кейсы были написаны в рамках задачи и результат их прогона.
### Задача в Jira

<p align="center">
<img src="media/screens/Jira_main.png" alt="TestOps launch" width="800" height="550">
</p>

#### Содержание задачи

- Тест-кейсы из Allure TestOps
- Результат прогона тестов в Allure TestOps

---

<a id="teleg"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"/> Уведомления в Telegram чат с ботом

### Уведомление через чат бот

<p align="center">
<img src="media/screens/tlg_bot.png" alt="Telegram" width="400" height="800">
</p>


#### Содержание уведомления в Telegram

- Окружение
- Комментарий
- Длительность прохождения тестов
- Общее количество сценариев
- Процент прохождения тестов
- Ссылка на Allure отчет

---

<a id="movie"></a>
## <img alt="Browserstack" height="25" src="media/logo/Browserstack.svg" width="25"/></a> Видеопример выполнения теста c Browserstack


<p align="center">
<img title="Browserstack Video" src="media/screens/brows.gif" width="350" height="750"  alt="video">   
</p>
