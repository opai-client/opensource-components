package today.opai.api.dataset;

public class BoundingBox {
	Vec3Data min;
	Vec3Data max;

	public BoundingBox(Vec3Data min, Vec3Data max) {
		this.min = min;
		this.max = max;
	}

	public Vec3Data getMin() {
		return this.min;
	}

	public Vec3Data getMax() {
		return this.max;
	}
}
