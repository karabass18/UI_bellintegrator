package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HeadMenuPage {

    public HeadMenuPage checkLogoVisible() {
        step("Проверка видимости", () -> {
            $("#logo_BellIntegrator").shouldBe(Condition.visible);
        });
        return this;
    }

    public HeadMenuPage checkLogoLink(String value) {
        step("Проверка ссылки", () -> {
            String logoLink = $("#logo_BellIntegrator").$(".img-link").getAttribute("href");
            assertThat(logoLink).contains(value);
        });
        return this;
    }

    public HeadMenuPage checkVacanciesVisible() {
        step("Проверка видимости", () -> {
            $("#vacancies_head_link").shouldBe(Condition.visible);
        });
        return this;
    }

    public HeadMenuPage checkVacanciesClick() {
        step("Проверка действия по клику", () -> {
            $("#find_job_submenu").shouldBe(Condition.hidden);
            $("#vacancies_head_link").click();
            $("#find_job_submenu").shouldBe(Condition.visible);


            // assertThat(logoLink).contains(value);
        });
        return this;
    }

    public HeadMenuPage checkJobSubmenu() {
        step("Проверка чекбоксов", () -> {
            $("#filter_only_hot").shouldNotBe(Condition.checked);
            $("#filter_only_remote").shouldNotBe(Condition.checked);
        });
        return this;
    }

    public HeadMenuPage checkVK() {
        step("Проверка иконки VK", () -> {
            SelenideElement vkElement = $("#logo_BellIntegrator", 1)
                    .sibling(0).$("a");
            vkElement.$("img").shouldHave(attribute("alt", "ВКонтакте"));
            vkElement.shouldHave(attribute("href", "https://vk.com/bellintegratorcareer"));
        });
        return this;
    }

    public HeadMenuPage checkLinkedin() {
        step("Проверка иконки Linkedin", () -> {
            SelenideElement linkedinElement = $("#logo_BellIntegrator", 1).sibling(0).$("a",1);
            linkedinElement.$("img").shouldHave(attribute("alt", "LinkedIn "));
            linkedinElement.shouldHave(attribute("href", "https://www.linkedin.com/showcase/bell-integrator-rus/"));
        });
        return this;
    }

    public HeadMenuPage checkTelegram() {
        step("Проверка иконки Telegram", () -> {
            SelenideElement telegramElement = $("#logo_BellIntegrator", 1).sibling(0).$("a",2);
            telegramElement.$("img").shouldHave(attribute("alt", "Telegramm"));
            telegramElement.shouldHave(attribute("href", "https://t.me/bellintegrator_career"));
        });
        return this;
    }
}
