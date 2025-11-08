package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = ImageVector.Builder(
            name = "Pin",
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
        moveTo(3f, 21f)
        lineTo(8f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.2585f, 18.8714f)
        curveTo(9.51516f, 18.0215f, 5.97844f, 14.4848f, 5.12853f, 10.7415f)
        curveTo(4.99399f, 10.1489f, 4.92672f, 9.85266f, 5.12161f, 9.37197f)
        curveTo(5.3165f, 8.89129f, 5.55457f, 8.74255f, 6.03071f, 8.44509f)
        curveTo(7.10705f, 7.77265f, 8.27254f, 7.55888f, 9.48209f, 7.66586f)
        curveTo(11.1793f, 7.81598f, 12.0279f, 7.89104f, 12.4512f, 7.67048f)
        curveTo(12.8746f, 7.44991f, 13.1622f, 6.93417f, 13.7376f, 5.90269f)
        lineTo(14.4664f, 4.59604f)
        curveTo(14.9465f, 3.73528f, 15.1866f, 3.3049f, 15.7513f, 3.10202f)
        curveTo(16.316f, 2.89913f, 16.6558f, 3.02199f, 17.3355f, 3.26771f)
        curveTo(18.9249f, 3.84236f, 20.1576f, 5.07505f, 20.7323f, 6.66449f)
        curveTo(20.978f, 7.34417f, 21.1009f, 7.68401f, 20.898f, 8.2487f)
        curveTo(20.6951f, 8.8134f, 20.2647f, 9.05346f, 19.4039f, 9.53358f)
        lineTo(18.0672f, 10.2792f)
        curveTo(17.0376f, 10.8534f, 16.5229f, 11.1406f, 16.3024f, 11.568f)
        curveTo(16.0819f, 11.9955f, 16.162f, 12.8256f, 16.3221f, 14.4859f)
        curveTo(16.4399f, 15.7068f, 16.2369f, 16.88f, 15.5555f, 17.9697f)
        curveTo(15.2577f, 18.4458f, 15.1088f, 18.6839f, 14.6283f, 18.8786f)
        curveTo(14.1477f, 19.0733f, 13.8513f, 19.006f, 13.2585f, 18.8714f)
        }
        }.build()

        return _pin!!
    }

private var _pin: ImageVector? = null
