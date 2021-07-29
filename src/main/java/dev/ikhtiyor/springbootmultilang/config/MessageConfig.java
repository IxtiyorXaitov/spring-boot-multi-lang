package dev.ikhtiyor.springbootmultilang.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class MessageConfig {
    final
    MessageSource messageSource;

    @Autowired
    public MessageConfig(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getMessageByLanguage(String key) {
        return messageSource.getMessage(key, null, LocaleContextHolder.getLocale());
    }
}