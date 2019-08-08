package languageAnalysis;

import java.util.Properties;

import edu.stanford.nlp.io.*;
import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.trees.*;
import edu.stanford.nlp.trees.TreeCoreAnnotations.*;
import edu.stanford.nlp.util.*;


public class WordClassifier {
	
	// TODO: integrate Stanford CoreNLP
	
	Properties props = new Properties();
	
	StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
	
	
}
