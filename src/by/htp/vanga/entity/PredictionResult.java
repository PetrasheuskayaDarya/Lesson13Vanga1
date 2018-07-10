package by.htp.vanga.entity;


public class PredictionResult {
	private Answer answer;
	private Prediction prediction;
	
	
	public PredictionResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PredictionResult(Answer answer, Prediction prediction) {
		super();
		this.answer = answer;
		this.prediction = prediction;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Prediction getPrediction() {
		return prediction;
	}

	public void setPrediction(Prediction prediction) {
		this.prediction = prediction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((prediction == null) ? 0 : prediction.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PredictionResult other = (PredictionResult) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (prediction == null) {
			if (other.prediction != null)
				return false;
		} else if (!prediction.equals(other.prediction))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PredictionResult [answer=" + answer + ", prediction=" + prediction + "]";
	}
	
	

}
