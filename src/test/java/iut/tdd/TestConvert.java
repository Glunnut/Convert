package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		// Given
		String input = "0";
		String expected = "zéro";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_un () {
		// Given
		String input = "1";
		String expected = "un";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_deux () {
		// Given
		String input = "2";
		String expected = "deux";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_trois () {
		// Given
		String input = "3";
		String expected = "trois";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quatre () {
		// Given
		String input = "4";
		String expected = "quatre";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_cinq () {
		// Given
		String input = "5";
		String expected = "cinq";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_six () {
		// Given
		String input = "6";
		String expected = "six";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_sept () {
		// Given
		String input = "7";
		String expected = "sept";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_huit () {
		// Given
		String input = "8";
		String expected = "huit";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_neuf () {
		// Given
		String input = "9";
		String expected = "neuf";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_dix () {
		// Given
		String input = "10";
		String expected = "dix";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_vingt () {
		// Given
		String input = "20";
		String expected = "vingt";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_trente () {
		// Given
		String input = "30";
		String expected = "trente";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quarante() {
		// Given
		String input = "40";
		String expected = "quarante";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_cinquante() {
		// Given
		String input = "50";
		String expected = "cinquante";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_soixante() {
		// Given
		String input = "60";
		String expected = "soixante";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_soixante_dix() {
		// Given
		String input = "70";
		String expected = "soixante-dix";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quatre_vingt() {
		// Given
		String input = "80";
		String expected = "quatre-vingt";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quatre_vingt_dix() {
		// Given
		String input = "90";
		String expected = "quatre-vingt-dix";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_cent() {
		// Given
		String input = "100";
		String expected = "cent";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_deux_cent() {
		// Given
		String input = "200";
		String expected = "deux-cent";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_trois_cent() {
		// Given
		String input = "300";
		String expected = "trois-cent";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quatre_cent() {
		// Given
		String input = "400";
		String expected = "quatre-cent";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_cinq_cent() {
		// Given
		String input = "500";
		String expected = "cinq-cent";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_six_cent() {
		// Given
		String input = "600";
		String expected = "six-cent";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_sept_cent() {
		// Given
		String input = "700";
		String expected = "sept-cent";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_huit_cent() {
		// Given
		String input = "800";
		String expected = "huit-cent";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_neuf_cent() {
		// Given
		String input = "900";
		String expected = "neuf-cent";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
}
