package vocab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Languages {
	
	public HashMap <String, String> mapLang = new HashMap<String, String>();
	public HashMap <String, String> mapLangEnglish = new HashMap<String, String>();
	
	public Languages() {
		// TODO Auto-generated constructor stub
		mapLang.put("aa", "http://lexvo.org/id/iso639-3/aar");
		mapLang.put("ab", "http://lexvo.org/id/iso639-3/abk");
		mapLang.put("ae", "http://lexvo.org/id/iso639-3/ave");
		mapLang.put("af", "http://lexvo.org/id/iso639-3/afr");
		mapLang.put("ak", "http://lexvo.org/id/iso639-3/aka");
		mapLang.put("am", "http://lexvo.org/id/iso639-3/amh");
		mapLang.put("an", "http://lexvo.org/id/iso639-3/arg");
		mapLang.put("ar", "http://lexvo.org/id/iso639-3/ara");
		mapLang.put("as", "http://lexvo.org/id/iso639-3/asm");
		mapLang.put("av", "http://lexvo.org/id/iso639-3/ava");
		mapLang.put("ay", "http://lexvo.org/id/iso639-3/aym");
		mapLang.put("az", "http://lexvo.org/id/iso639-3/aze");
		mapLang.put("ba", "http://lexvo.org/id/iso639-3/bak");
		mapLang.put("be", "http://lexvo.org/id/iso639-3/bel");
		mapLang.put("bg", "http://lexvo.org/id/iso639-3/bul");
		mapLang.put("bi", "http://lexvo.org/id/iso639-3/bis");
		mapLang.put("bm", "http://lexvo.org/id/iso639-3/bam");
		mapLang.put("bn", "http://lexvo.org/id/iso639-3/ben");
		mapLang.put("bo", "http://lexvo.org/id/iso639-3/bod");
		mapLang.put("br", "http://lexvo.org/id/iso639-3/bre");
		mapLang.put("bs", "http://lexvo.org/id/iso639-3/bos");
		mapLang.put("ca", "http://lexvo.org/id/iso639-3/cat");
		mapLang.put("ce", "http://lexvo.org/id/iso639-3/che");
		mapLang.put("ch", "http://lexvo.org/id/iso639-3/cha");
		mapLang.put("co", "http://lexvo.org/id/iso639-3/cos");
		mapLang.put("cr", "http://lexvo.org/id/iso639-3/cre");
		mapLang.put("cs", "http://lexvo.org/id/iso639-3/ces");
		mapLang.put("cu", "http://lexvo.org/id/iso639-3/chu");
		mapLang.put("cv", "http://lexvo.org/id/iso639-3/chv");
		mapLang.put("cy", "http://lexvo.org/id/iso639-3/cym");
		mapLang.put("da", "http://lexvo.org/id/iso639-3/dan");
		mapLang.put("de", "http://lexvo.org/id/iso639-3/deu");
		mapLang.put("dv", "http://lexvo.org/id/iso639-3/div");
		mapLang.put("dz", "http://lexvo.org/id/iso639-3/dzo");
		mapLang.put("ee", "http://lexvo.org/id/iso639-3/ewe");
		mapLang.put("el", "http://lexvo.org/id/iso639-3/ell");
		mapLang.put("en", "http://lexvo.org/id/iso639-3/eng");
		mapLang.put("eo", "http://lexvo.org/id/iso639-3/epo");
		mapLang.put("es", "http://lexvo.org/id/iso639-3/spa");
		mapLang.put("et", "http://lexvo.org/id/iso639-3/est");
		mapLang.put("eu", "http://lexvo.org/id/iso639-3/eus");
		mapLang.put("fa", "http://lexvo.org/id/iso639-3/fas");
		mapLang.put("ff", "http://lexvo.org/id/iso639-3/ful");
		mapLang.put("fi", "http://lexvo.org/id/iso639-3/fin");
		mapLang.put("fj", "http://lexvo.org/id/iso639-3/fij");
		mapLang.put("fo", "http://lexvo.org/id/iso639-3/fao");
		mapLang.put("fr", "http://lexvo.org/id/iso639-3/fra");
		mapLang.put("fy", "http://lexvo.org/id/iso639-3/fry");
		mapLang.put("ga", "http://lexvo.org/id/iso639-3/gle");
		mapLang.put("gd", "http://lexvo.org/id/iso639-3/gla");
		mapLang.put("gl", "http://lexvo.org/id/iso639-3/glg");
		mapLang.put("gn", "http://lexvo.org/id/iso639-3/grn");
		mapLang.put("gu", "http://lexvo.org/id/iso639-3/guj");
		mapLang.put("gv", "http://lexvo.org/id/iso639-3/glv");
		mapLang.put("ha", "http://lexvo.org/id/iso639-3/hau");
		mapLang.put("he", "http://lexvo.org/id/iso639-3/heb");
		mapLang.put("hi", "http://lexvo.org/id/iso639-3/hin");
		mapLang.put("ho", "http://lexvo.org/id/iso639-3/hmo");
		mapLang.put("hr", "http://lexvo.org/id/iso639-3/hrv");
		mapLang.put("ht", "http://lexvo.org/id/iso639-3/hat");
		mapLang.put("hu", "http://lexvo.org/id/iso639-3/hun");
		mapLang.put("hy", "http://lexvo.org/id/iso639-3/hye");
		mapLang.put("hz", "http://lexvo.org/id/iso639-3/her");
		mapLang.put("ia", "http://lexvo.org/id/iso639-3/ina");
		mapLang.put("id", "http://lexvo.org/id/iso639-3/ind");
		mapLang.put("ie", "http://lexvo.org/id/iso639-3/ile");
		mapLang.put("ig", "http://lexvo.org/id/iso639-3/ibo");
		mapLang.put("ii", "http://lexvo.org/id/iso639-3/iii");
		mapLang.put("ik", "http://lexvo.org/id/iso639-3/ipk");
		mapLang.put("io", "http://lexvo.org/id/iso639-3/ido");
		mapLang.put("is", "http://lexvo.org/id/iso639-3/isl");
		mapLang.put("it", "http://lexvo.org/id/iso639-3/ita");
		mapLang.put("iu", "http://lexvo.org/id/iso639-3/iku");
		mapLang.put("ja", "http://lexvo.org/id/iso639-3/jpn");
		mapLang.put("jv", "http://lexvo.org/id/iso639-3/jav");
		mapLang.put("ka", "http://lexvo.org/id/iso639-3/kat");
		mapLang.put("kg", "http://lexvo.org/id/iso639-3/kon");
		mapLang.put("ki", "http://lexvo.org/id/iso639-3/kik");
		mapLang.put("kj", "http://lexvo.org/id/iso639-3/kua");
		mapLang.put("kk", "http://lexvo.org/id/iso639-3/kaz");
		mapLang.put("kl", "http://lexvo.org/id/iso639-3/kal");
		mapLang.put("km", "http://lexvo.org/id/iso639-3/khm");
		mapLang.put("kn", "http://lexvo.org/id/iso639-3/kan");
		mapLang.put("ko", "http://lexvo.org/id/iso639-3/kor");
		mapLang.put("kr", "http://lexvo.org/id/iso639-3/kau");
		mapLang.put("ks", "http://lexvo.org/id/iso639-3/kas");
		mapLang.put("ku", "http://lexvo.org/id/iso639-3/kur");
		mapLang.put("kv", "http://lexvo.org/id/iso639-3/kom");
		mapLang.put("kw", "http://lexvo.org/id/iso639-3/cor");
		mapLang.put("ky", "http://lexvo.org/id/iso639-3/kir");
		mapLang.put("la", "http://lexvo.org/id/iso639-3/lat");
		mapLang.put("lb", "http://lexvo.org/id/iso639-3/ltz");
		mapLang.put("lg", "http://lexvo.org/id/iso639-3/lug");
		mapLang.put("li", "http://lexvo.org/id/iso639-3/lim");
		mapLang.put("ln", "http://lexvo.org/id/iso639-3/lin");
		mapLang.put("lo", "http://lexvo.org/id/iso639-3/lao");
		mapLang.put("lt", "http://lexvo.org/id/iso639-3/lit");
		mapLang.put("lu", "http://lexvo.org/id/iso639-3/lub");
		mapLang.put("lv", "http://lexvo.org/id/iso639-3/lav");
		mapLang.put("mg", "http://lexvo.org/id/iso639-3/mlg");
		mapLang.put("mh", "http://lexvo.org/id/iso639-3/mah");
		mapLang.put("mi", "http://lexvo.org/id/iso639-3/mri");
		mapLang.put("mk", "http://lexvo.org/id/iso639-3/mkd");
		mapLang.put("ml", "http://lexvo.org/id/iso639-3/mal");
		mapLang.put("mn", "http://lexvo.org/id/iso639-3/mon");
		mapLang.put("mr", "http://lexvo.org/id/iso639-3/mar");
		mapLang.put("ms", "http://lexvo.org/id/iso639-3/msa");
		mapLang.put("mt", "http://lexvo.org/id/iso639-3/mlt");
		mapLang.put("my", "http://lexvo.org/id/iso639-3/mya");
		mapLang.put("na", "http://lexvo.org/id/iso639-3/nau");
		mapLang.put("nb", "http://lexvo.org/id/iso639-3/nob");
		mapLang.put("nd", "http://lexvo.org/id/iso639-3/nde");
		mapLang.put("ne", "http://lexvo.org/id/iso639-3/nep");
		mapLang.put("ng", "http://lexvo.org/id/iso639-3/ndo");
		mapLang.put("nl", "http://lexvo.org/id/iso639-3/nld");
		mapLang.put("nn", "http://lexvo.org/id/iso639-3/nno");
		mapLang.put("no", "http://lexvo.org/id/iso639-3/nor");
		mapLang.put("nr", "http://lexvo.org/id/iso639-3/nbl");
		mapLang.put("nv", "http://lexvo.org/id/iso639-3/nav");
		mapLang.put("ny", "http://lexvo.org/id/iso639-3/nya");
		mapLang.put("oc", "http://lexvo.org/id/iso639-3/oci");
		mapLang.put("oj", "http://lexvo.org/id/iso639-3/oji");
		mapLang.put("om", "http://lexvo.org/id/iso639-3/orm");
		mapLang.put("or", "http://lexvo.org/id/iso639-3/ori");
		mapLang.put("os", "http://lexvo.org/id/iso639-3/oss");
		mapLang.put("pa", "http://lexvo.org/id/iso639-3/pan");
		mapLang.put("pi", "http://lexvo.org/id/iso639-3/pli");
		mapLang.put("pl", "http://lexvo.org/id/iso639-3/pol");
		mapLang.put("ps", "http://lexvo.org/id/iso639-3/pus");
		mapLang.put("pt", "http://lexvo.org/id/iso639-3/por");
		mapLang.put("qu", "http://lexvo.org/id/iso639-3/que");
		mapLang.put("rm", "http://lexvo.org/id/iso639-3/roh");
		mapLang.put("rn", "http://lexvo.org/id/iso639-3/run");
		mapLang.put("ro", "http://lexvo.org/id/iso639-3/ron");
		mapLang.put("ru", "http://lexvo.org/id/iso639-3/rus");
		mapLang.put("rw", "http://lexvo.org/id/iso639-3/kin");
		mapLang.put("sa", "http://lexvo.org/id/iso639-3/san");
		mapLang.put("sc", "http://lexvo.org/id/iso639-3/srd");
		mapLang.put("sd", "http://lexvo.org/id/iso639-3/snd");
		mapLang.put("se", "http://lexvo.org/id/iso639-3/sme");
		mapLang.put("sg", "http://lexvo.org/id/iso639-3/sag");
		mapLang.put("sh", "http://lexvo.org/id/iso639-3/hbs");
		mapLang.put("si", "http://lexvo.org/id/iso639-3/sin");
		mapLang.put("sk", "http://lexvo.org/id/iso639-3/slk");
		mapLang.put("sl", "http://lexvo.org/id/iso639-3/slv");
		mapLang.put("sm", "http://lexvo.org/id/iso639-3/smo");
		mapLang.put("sn", "http://lexvo.org/id/iso639-3/sna");
		mapLang.put("so", "http://lexvo.org/id/iso639-3/som");
		mapLang.put("sq", "http://lexvo.org/id/iso639-3/sqi");
		mapLang.put("sr", "http://lexvo.org/id/iso639-3/srp");
		mapLang.put("ss", "http://lexvo.org/id/iso639-3/ssw");
		mapLang.put("st", "http://lexvo.org/id/iso639-3/sot");
		mapLang.put("su", "http://lexvo.org/id/iso639-3/sun");
		mapLang.put("sv", "http://lexvo.org/id/iso639-3/swe");
		mapLang.put("sw", "http://lexvo.org/id/iso639-3/swa");
		mapLang.put("ta", "http://lexvo.org/id/iso639-3/tam");
		mapLang.put("te", "http://lexvo.org/id/iso639-3/tel");
		mapLang.put("tg", "http://lexvo.org/id/iso639-3/tgk");
		mapLang.put("th", "http://lexvo.org/id/iso639-3/tha");
		mapLang.put("ti", "http://lexvo.org/id/iso639-3/tir");
		mapLang.put("tk", "http://lexvo.org/id/iso639-3/tuk");
		mapLang.put("tl", "http://lexvo.org/id/iso639-3/tgl");
		mapLang.put("tn", "http://lexvo.org/id/iso639-3/tsn");
		mapLang.put("to", "http://lexvo.org/id/iso639-3/ton");
		mapLang.put("tr", "http://lexvo.org/id/iso639-3/tur");
		mapLang.put("ts", "http://lexvo.org/id/iso639-3/tso");
		mapLang.put("tt", "http://lexvo.org/id/iso639-3/tat");
		mapLang.put("tw", "http://lexvo.org/id/iso639-3/twi");
		mapLang.put("ty", "http://lexvo.org/id/iso639-3/tah");
		mapLang.put("ug", "http://lexvo.org/id/iso639-3/uig");
		mapLang.put("uk", "http://lexvo.org/id/iso639-3/ukr");
		mapLang.put("ur", "http://lexvo.org/id/iso639-3/urd");
		mapLang.put("uz", "http://lexvo.org/id/iso639-3/uzb");
		mapLang.put("ve", "http://lexvo.org/id/iso639-3/ven");
		mapLang.put("vi", "http://lexvo.org/id/iso639-3/vie");
		mapLang.put("vo", "http://lexvo.org/id/iso639-3/vol");
		mapLang.put("wa", "http://lexvo.org/id/iso639-3/wln");
		mapLang.put("wo", "http://lexvo.org/id/iso639-3/wol");
		mapLang.put("xh", "http://lexvo.org/id/iso639-3/xho");
		mapLang.put("yi", "http://lexvo.org/id/iso639-3/yid");
		mapLang.put("yo", "http://lexvo.org/id/iso639-3/yor");
		mapLang.put("za", "http://lexvo.org/id/iso639-3/zha");
		mapLang.put("zh", "http://lexvo.org/id/iso639-3/zho");
		mapLang.put("zu", "http://lexvo.org/id/iso639-3/zul");
		
		
		mapLangEnglish.put("aa", "Afar");
		mapLangEnglish.put("ab", "Abkhaz");
		mapLangEnglish.put("ae", "Avestan");
		mapLangEnglish.put("af", "Afrikaans");
		mapLangEnglish.put("ak", "Akan");
		mapLangEnglish.put("am", "Amharic");
		mapLangEnglish.put("an", "Aragonese");
		mapLangEnglish.put("ar", "Arabic");
		mapLangEnglish.put("as", "Assamese");
		mapLangEnglish.put("av", "Avaric");
		mapLangEnglish.put("ay", "Aymara");
		mapLangEnglish.put("az", "Azerbaijani");
		mapLangEnglish.put("ba", "Bashkir");
		mapLangEnglish.put("be", "Belarusian");
		mapLangEnglish.put("bg", "Bulgarian");
		mapLangEnglish.put("bh", "Bihari");
		mapLangEnglish.put("bi", "Bislama");
		mapLangEnglish.put("bm", "Bambara");
		mapLangEnglish.put("bn", "Bengali");
		mapLangEnglish.put("bo", "Tibetan Standard");
		mapLangEnglish.put("br", "Breton");
		mapLangEnglish.put("bs", "Bosnian");
		mapLangEnglish.put("ca", "Catalan");
		mapLangEnglish.put("ce", "Chechen");
		mapLangEnglish.put("ch", "Chamorro");
		mapLangEnglish.put("co", "Corsican");
		mapLangEnglish.put("cr", "Cree");
		mapLangEnglish.put("cs", "Czech");
		mapLangEnglish.put("cu", "Old Church Slavonic");
		mapLangEnglish.put("cv", "Chuvash");
		mapLangEnglish.put("cy", "Welsh");
		mapLangEnglish.put("da", "Danish");
		mapLangEnglish.put("de", "German");
		mapLangEnglish.put("dv", "Divehi");
		mapLangEnglish.put("dz", "Dzongkha");
		mapLangEnglish.put("ee", "Ewe");
		mapLangEnglish.put("el", "Greek (modern)");
		mapLangEnglish.put("en", "English");
		mapLangEnglish.put("eo", "Esperanto");
		mapLangEnglish.put("es", "Spanish");
		mapLangEnglish.put("et", "Estonian");
		mapLangEnglish.put("eu", "Basque");
		mapLangEnglish.put("fa", "Persian (Farsi)");
		mapLangEnglish.put("ff", "Fula");
		mapLangEnglish.put("fi", "Finnish");
		mapLangEnglish.put("fj", "Fijian");
		mapLangEnglish.put("fo", "Faroese");
		mapLangEnglish.put("fr", "French");
		mapLangEnglish.put("fy", "Western Frisian");
		mapLangEnglish.put("ga", "Irish");
		mapLangEnglish.put("gd", "Scottish Gaelic");
		mapLangEnglish.put("gl", "Galician");
		mapLangEnglish.put("gn", "Guaraní");
		mapLangEnglish.put("gu", "Gujarati");
		mapLangEnglish.put("gv", "Manx");
		mapLangEnglish.put("ha", "Hausa");
		mapLangEnglish.put("he", "Hebrew (modern)");
		mapLangEnglish.put("hi", "Hindi");
		mapLangEnglish.put("ho", "Hiri Motu");
		mapLangEnglish.put("hr", "Croatian");
		mapLangEnglish.put("ht", "Haitian");
		mapLangEnglish.put("hu", "Hungarian");
		mapLangEnglish.put("hy", "Armenian");
		mapLangEnglish.put("hz", "Herero");
		mapLangEnglish.put("ia", "Interlingua");
		mapLangEnglish.put("id", "Indonesian");
		mapLangEnglish.put("ie", "Interlingue");
		mapLangEnglish.put("ig", "Igbo");
		mapLangEnglish.put("ii", "Nuosu");
		mapLangEnglish.put("ik", "Inupiaq");
		mapLangEnglish.put("io", "Ido");
		mapLangEnglish.put("is", "Icelandic");
		mapLangEnglish.put("it", "Italian");
		mapLangEnglish.put("iu", "Inuktitut");
		mapLangEnglish.put("ja", "Japanese");
		mapLangEnglish.put("jv", "Javanese");
		mapLangEnglish.put("ka", "Georgian");
		mapLangEnglish.put("kg", "Kongo");
		mapLangEnglish.put("ki", "Kikuyu");
		mapLangEnglish.put("kj", "Kwanyama");
		mapLangEnglish.put("kk", "Kazakh");
		mapLangEnglish.put("kl", "Kalaallisut");
		mapLangEnglish.put("km", "Khmer");
		mapLangEnglish.put("kn", "Kannada");
		mapLangEnglish.put("ko", "Korean");
		mapLangEnglish.put("kr", "Kanuri");
		mapLangEnglish.put("ks", "Kashmiri");
		mapLangEnglish.put("ku", "Kurdish");
		mapLangEnglish.put("kv", "Komi");
		mapLangEnglish.put("kw", "Cornish");
		mapLangEnglish.put("ky", "Kyrgyz");
		mapLangEnglish.put("la", "Latin");
		mapLangEnglish.put("lb", "Luxembourgish");
		mapLangEnglish.put("lg", "Ganda");
		mapLangEnglish.put("li", "Limburgish");
		mapLangEnglish.put("ln", "Lingala");
		mapLangEnglish.put("lo", "Lao");
		mapLangEnglish.put("lt", "Lithuanian");
		mapLangEnglish.put("lu", "Luba-Katanga");
		mapLangEnglish.put("lv", "Latvian");
		mapLangEnglish.put("mg", "Malagasy");
		mapLangEnglish.put("mh", "Marshallese");
		mapLangEnglish.put("mi", "Māori");
		mapLangEnglish.put("mk", "Macedonian");
		mapLangEnglish.put("ml", "Malayalam");
		mapLangEnglish.put("mn", "Mongolian");
		mapLangEnglish.put("mr", "Marathi (Marāṭhī)");
		mapLangEnglish.put("ms", "Malay");
		mapLangEnglish.put("mt", "Maltese");
		mapLangEnglish.put("my", "Burmese");
		mapLangEnglish.put("na", "Nauru");
		mapLangEnglish.put("nb", "Norwegian Bokmål");
		mapLangEnglish.put("nd", "Northern Ndebele");
		mapLangEnglish.put("ne", "Nepali");
		mapLangEnglish.put("ng", "Ndonga");
		mapLangEnglish.put("nl", "Dutch");
		mapLangEnglish.put("nn", "Norwegian Nynorsk");
		mapLangEnglish.put("no", "Norwegian");
		mapLangEnglish.put("nr", "Southern Ndebele");
		mapLangEnglish.put("nv", "Navajo");
		mapLangEnglish.put("ny", "Chichewa");
		mapLangEnglish.put("oc", "Occitan");
		mapLangEnglish.put("oj", "Ojibwe");
		mapLangEnglish.put("om", "Oromo");
		mapLangEnglish.put("or", "Oriya");
		mapLangEnglish.put("os", "Ossetian");
		mapLangEnglish.put("pa", "Panjabi");
		mapLangEnglish.put("pi", "Pāli");
		mapLangEnglish.put("pl", "Polish");
		mapLangEnglish.put("ps", "Pashto");
		mapLangEnglish.put("pt", "Portuguese");
		mapLangEnglish.put("qu", "Quechua");
		mapLangEnglish.put("rm", "Romansh");
		mapLangEnglish.put("rn", "Kirundi");
		mapLangEnglish.put("ro", "Romanian");
		mapLangEnglish.put("ru", "Russian");
		mapLangEnglish.put("rw", "Kinyarwanda");
		mapLangEnglish.put("sa", "Sanskrit (Saṁskṛta)");
		mapLangEnglish.put("sc", "Sardinian");
		mapLangEnglish.put("sd", "Sindhi");
		mapLangEnglish.put("se", "Northern Sami");
		mapLangEnglish.put("sg", "Sango");
		mapLangEnglish.put("si", "Sinhala");
		mapLangEnglish.put("sk", "Slovak");
		mapLangEnglish.put("sl", "Slovene");
		mapLangEnglish.put("sm", "Samoan");
		mapLangEnglish.put("sn", "Shona");
		mapLangEnglish.put("so", "Somali");
		mapLangEnglish.put("sq", "Albanian");
		mapLangEnglish.put("sr", "Serbian");
		mapLangEnglish.put("ss", "Swati");
		mapLangEnglish.put("st", "Southern Sotho");
		mapLangEnglish.put("su", "Sundanese");
		mapLangEnglish.put("sv", "Swedish");
		mapLangEnglish.put("sw", "Swahili");
		mapLangEnglish.put("ta", "Tamil");
		mapLangEnglish.put("te", "Telugu");
		mapLangEnglish.put("tg", "Tajik");
		mapLangEnglish.put("th", "Thai");
		mapLangEnglish.put("ti", "Tigrinya");
		mapLangEnglish.put("tk", "Turkmen");
		mapLangEnglish.put("tl", "Tagalog");
		mapLangEnglish.put("tn", "Tswana");
		mapLangEnglish.put("to", "Tonga (Tonga Islands)");
		mapLangEnglish.put("tr", "Turkish");
		mapLangEnglish.put("ts", "Tsonga");
		mapLangEnglish.put("tt", "Tatar");
		mapLangEnglish.put("tw", "Twi");
		mapLangEnglish.put("ty", "Tahitian");
		mapLangEnglish.put("ug", "Uyghur");
		mapLangEnglish.put("uk", "Ukrainian");
		mapLangEnglish.put("ur", "Urdu");
		mapLangEnglish.put("uz", "Uzbek");
		mapLangEnglish.put("ve", "Venda");
		mapLangEnglish.put("vi", "Vietnamese");
		mapLangEnglish.put("vo", "Volapük");
		mapLangEnglish.put("wa", "Walloon");
		mapLangEnglish.put("wo", "Wolof");
		mapLangEnglish.put("xh", "Xhosa");
		mapLangEnglish.put("yi", "Yiddish");
		mapLangEnglish.put("yo", "Yoruba");
		mapLangEnglish.put("za", "Zhuang");
		mapLangEnglish.put("zh", "Chinese");
		mapLangEnglish.put("zu", "Zulu");

	}

	public HashMap<String, String> getMapLang() {
		return mapLang;
	}
	
	public HashMap<String, String> getMapLangEnglish() {
		return mapLangEnglish;
	}
	
	public String getKey (String value){
		if(mapLang.containsValue(value)){
			Iterator<Entry<String, String>> it = mapLang.entrySet().iterator();
			boolean found = false;
			while (it.hasNext() && !found) {
				Map.Entry pairs = (Map.Entry)it.next();
//				System.out.println(pairs.getKey() + " = " + pairs.getValue());
			    if(value.contains(pairs.getValue().toString())){
			    	found = true;
			    	return pairs.getKey().toString();
			    }
			   	
			}
		}
		else{
			return null;
		}
		
		return null;
	}
}
