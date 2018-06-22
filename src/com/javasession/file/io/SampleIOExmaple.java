package com.javasession.file.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class SampleIOExmaple {

	public static void main(String[] args) throws IOException, InterruptedException {

		final PipedInputStream pipedInputStream = new PipedInputStream();
		final PipedOutputStream pipedOutputStream = new PipedOutputStream();

		/* Connect pipe */
		pipedInputStream.connect(pipedOutputStream);

		Thread pipeWriter = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 65; i < 91; i++) {
					try {
						pipedOutputStream.write(i);
						Thread.sleep(500);
					}
					catch (IOException | InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread pipeReader = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 65; i < 91; i++) {
					try {
						System.out.print((char) pipedInputStream.read());
						Thread.sleep(5000);
					}
					catch (InterruptedException | IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		pipeWriter.start();
		pipeReader.start();
		
		pipeWriter.join();
		pipeReader.join();
		
		pipedOutputStream.close();
		pipedInputStream.close();
		
	}

}
