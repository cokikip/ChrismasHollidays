package com.coki;
import java.util.stream.IntStream;
public class Chrismas {
	private int height;
	private StringBuilder builder;
	Chrismas(int height){
		this.height=height;
		builder = new StringBuilder();
	}
	public void print(){
		IntStream.range(0, height).forEach(this::buildRow);
		System.out.println(builder.toString());
		builder =new StringBuilder();
	}
	private void buildRow(int row){
		printSpaces(row,builder);
		printStars(row,builder);
		builder.append(System.lineSeparator());	}
	private void printSpaces(int row, StringBuilder builder2) {
		int spaces =height- (row+1);
		IntStream.range(0, spaces).forEach((i)->{
			builder.append(" ");
		});}
	private void printStars(int row, StringBuilder builder2) {
		int spaces = row*2-1;
		IntStream.range(0, spaces).forEach((i)->{
			builder2.append("*"); });
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrismas s=new Chrismas(7);
		s.print();
		s.print();
		s.print();
	}}
