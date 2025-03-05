package today.opai.api.dataset;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoundingBox {
	Vec3Data min;
	Vec3Data max;
}
