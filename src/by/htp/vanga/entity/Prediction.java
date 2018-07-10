package by.htp.vanga.entity;

public class Prediction {

	private String nameOfPrediction;
	private int id;

	public Prediction() {
		super();
	}

	public Prediction( int id, String nameOfPrediction) {
		super();
		this.id = id;
		this.nameOfPrediction = nameOfPrediction;
		
	}

	public Prediction(String nameOfPrediction) {
		this.nameOfPrediction = nameOfPrediction;

	}

	public String getNameOfPrediction() {
		return nameOfPrediction;
	}

	public void setTarget(String nameOfPrediction) {
		this.nameOfPrediction = nameOfPrediction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameOfPrediction == null) ? 0 : nameOfPrediction.hashCode());
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
		Prediction other = (Prediction) obj;
		if (nameOfPrediction == null) {
			if (other.nameOfPrediction != null)
				return false;
		} else if (!nameOfPrediction.equals(other.nameOfPrediction))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Your Prediction can be about: " + nameOfPrediction;
	}

}
