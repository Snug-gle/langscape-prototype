package io.langscape.domain.openai.service;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.openai.OpenAiAudioSpeechModel;
import org.springframework.ai.openai.OpenAiAudioTranscriptionModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.OpenAiEmbeddingModel;
import org.springframework.ai.openai.OpenAiImageModel;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpenAIService {

  private final OpenAiChatModel openAiChatModel;
  private final OpenAiEmbeddingModel openAiEmbeddingModel;
  private final OpenAiImageModel openAiImageModel;
  private final OpenAiAudioSpeechModel openAiAudioSpeechModel;
  private final OpenAiAudioTranscriptionModel openAiAudioTranscriptionModel;

}
