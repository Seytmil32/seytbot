package fr.seytmil32.seytbot;

import javax.security.auth.login.LoginException;

import fr.seytmil32.seytbot.event.Listener;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Main {

	public static void main(String[] args) {
		try {
			JDA jda=new JDABuilder(AccountType.BOT).setToken("REPLACE IT WITH YOUR BOT TOKEN").buildAsync();
			jda.addEventListener(new Listener());
			System.out.println("bot connected");
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
