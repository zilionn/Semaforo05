package view;

import java.util.concurrent.Semaphore;

import controller.ControllerTransacao;

public class Principal {

	public static void main(String[] args) {
		
		Semaphore mutex = new Semaphore(1);
		
		for (int i = 1; i <= 21; i++) {
			Thread requisicao = new ControllerTransacao(mutex, i);
			requisicao.start();
		}

	}

}