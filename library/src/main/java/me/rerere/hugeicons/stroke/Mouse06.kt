package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mouse06: ImageVector
    get() {
        if (_mouse06 != null) {
            return _mouse06!!
        }
        _mouse06 = ImageVector.Builder(
            name = "Mouse06",
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
        moveTo(22f, 6.16705f)
        curveTo(21.5974f, 6.96357f, 20.7056f, 7.23648f, 20.0082f, 6.77661f)
        lineTo(17.9036f, 5.38882f)
        curveTo(16.3163f, 4.34208f, 15.5226f, 3.81871f, 14.7447f, 4.05676f)
        curveTo(14.2697f, 4.20215f, 13.9138f, 4.59687f, 13.5f, 5.29516f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.33308f, 12.3211f)
        curveTo(1.56295f, 13.9784f, 2.15878f, 16.1103f, 3.80545f, 17.3297f)
        curveTo(4.41103f, 17.778f, 5.03988f, 18.2109f, 5.707f, 18.5977f)
        curveTo(6.37411f, 18.9846f, 7.06189f, 19.315f, 7.75129f, 19.6175f)
        curveTo(9.62623f, 20.44f, 11.7624f, 19.8922f, 12.8065f, 18.3938f)
        curveTo(13.53f, 17.3555f, 14.2534f, 16.2797f, 14.9104f, 15.137f)
        curveTo(15.5673f, 13.9943f, 16.1333f, 12.8273f, 16.6669f, 11.6789f)
        curveTo(17.437f, 10.0216f, 16.8413f, 7.88974f, 15.1945f, 6.67036f)
        curveTo(14.589f, 6.22198f, 13.9601f, 5.78906f, 13.293f, 5.40226f)
        curveTo(12.6259f, 5.01545f, 11.9381f, 4.68496f, 11.2487f, 4.38249f)
        curveTo(9.37386f, 3.55998f, 7.23754f, 4.10773f, 6.19347f, 5.60619f)
        curveTo(5.47f, 6.64449f, 4.74664f, 7.72033f, 4.08971f, 8.86302f)
        curveTo(3.43278f, 10.0057f, 2.86672f, 11.1728f, 2.33308f, 12.3211f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.6328f, 7.90234f)
        lineTo(10.6328f, 9.63439f)
        }
        }.build()

        return _mouse06!!
    }

private var _mouse06: ImageVector? = null
