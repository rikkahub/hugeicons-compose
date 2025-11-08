package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BodyPartMuscle: ImageVector
    get() {
        if (_bodyPartMuscle != null) {
            return _bodyPartMuscle!!
        }
        _bodyPartMuscle = ImageVector.Builder(
            name = "BodyPartMuscle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.01792f, 20.3051f)
        curveTo(3.14656f, 21.9196f, 8.05942f, 23.1871f, 10.3797f, 20.1645f)
        curveTo(12.8894f, 21.3649f, 17.0289f, 20.9928f, 20.3991f, 19.1134f)
        curveTo(20.8678f, 18.8521f, 21.3112f, 18.5222f, 21.5827f, 18.0593f)
        curveTo(22.1957f, 17.0143f, 22.2102f, 15.5644f, 21.0919f, 13.4251f)
        curveTo(19.2274f, 8.77072f, 15.874f, 4.68513f, 14.5201f, 3.04212f)
        curveTo(14.2421f, 2.78865f, 12.4687f, 2.42868f, 11.3872f, 2.08279f)
        curveTo(10.9095f, 1.93477f, 10.02f, 1.83664f, 8.95612f, 3.23862f)
        curveTo(8.45176f, 3.90329f, 6.16059f, 5.5357f, 9.06767f, 6.63346f)
        curveTo(9.51805f, 6.74806f, 9.84912f, 6.95939f, 11.9038f, 6.58404f)
        curveTo(12.1714f, 6.53761f, 12.8395f, 6.58404f, 13.3103f, 7.41041f)
        lineTo(14.2936f, 8.81662f)
        curveTo(14.3851f, 8.94752f, 14.4445f, 9.09813f, 14.4627f, 9.25682f)
        curveTo(14.635f, 10.7557f, 14.6294f, 12.6323f, 15.4651f, 13.5826f)
        curveTo(14.1743f, 12.6492f, 10.8011f, 11.5406f, 8.2595f, 14.6951f)
        moveTo(2.00189f, 12.94f)
        curveTo(3.21009f, 11.791f, 6.71197f, 9.97592f, 10.4179f, 12.5216f)
        }
        }.build()

        return _bodyPartMuscle!!
    }

private var _bodyPartMuscle: ImageVector? = null
