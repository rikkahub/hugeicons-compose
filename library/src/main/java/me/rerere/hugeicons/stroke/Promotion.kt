package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Promotion: ImageVector
    get() {
        if (_promotion != null) {
            return _promotion!!
        }
        _promotion = ImageVector.Builder(
            name = "Promotion",
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
        moveTo(14.9263f, 2.91103f)
        lineTo(8.27352f, 6.10452f)
        curveTo(7.76151f, 6.35029f, 7.21443f, 6.41187f, 6.65675f, 6.28693f)
        curveTo(6.29177f, 6.20517f, 6.10926f, 6.16429f, 5.9623f, 6.14751f)
        curveTo(4.13743f, 5.93912f, 3f, 7.38342f, 3f, 9.04427f)
        verticalLineTo(9.95573f)
        curveTo(3f, 11.6166f, 4.13743f, 13.0609f, 5.9623f, 12.8525f)
        curveTo(6.10926f, 12.8357f, 6.29178f, 12.7948f, 6.65675f, 12.7131f)
        curveTo(7.21443f, 12.5881f, 7.76151f, 12.6497f, 8.27352f, 12.8955f)
        lineTo(14.9263f, 16.089f)
        curveTo(16.4534f, 16.8221f, 17.217f, 17.1886f, 18.0684f, 16.9029f)
        curveTo(18.9197f, 16.6172f, 19.2119f, 16.0041f, 19.7964f, 14.778f)
        curveTo(21.4012f, 11.4112f, 21.4012f, 7.58885f, 19.7964f, 4.22196f)
        curveTo(19.2119f, 2.99586f, 18.9197f, 2.38281f, 18.0684f, 2.0971f)
        curveTo(17.217f, 1.8114f, 16.4534f, 2.17794f, 14.9263f, 2.91103f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.4581f, 20.7709f)
        lineTo(9.96674f, 22f)
        curveTo(6.60515f, 19.3339f, 7.01583f, 18.0625f, 7.01583f, 13f)
        horizontalLineTo(8.14966f)
        curveTo(8.60978f, 15.8609f, 9.69512f, 17.216f, 11.1927f, 18.197f)
        curveTo(12.1152f, 18.8012f, 12.3054f, 20.0725f, 11.4581f, 20.7709f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 12.5f)
        verticalLineTo(6.5f)
        }
        }.build()

        return _promotion!!
    }

private var _promotion: ImageVector? = null
