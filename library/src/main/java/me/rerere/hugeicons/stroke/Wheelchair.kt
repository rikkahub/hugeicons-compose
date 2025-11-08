package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = ImageVector.Builder(
            name = "Wheelchair",
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
        moveTo(12f, 16f)
        curveTo(12f, 18.7614f, 9.76142f, 21f, 7f, 21f)
        curveTo(4.23858f, 21f, 2f, 18.7614f, 2f, 16f)
        curveTo(2f, 13.2386f, 4.23858f, 11f, 7f, 11f)
        curveTo(9.76142f, 11f, 12f, 13.2386f, 12f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 19.5f)
        curveTo(18f, 20.3284f, 17.3284f, 21f, 16.5f, 21f)
        curveTo(15.6716f, 21f, 15f, 20.3284f, 15f, 19.5f)
        curveTo(15f, 18.6716f, 15.6716f, 18f, 16.5f, 18f)
        curveTo(17.3284f, 18f, 18f, 18.6716f, 18f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.00801f, 16f)
        lineTo(6.99902f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 11f)
        lineTo(5.3721f, 5.97683f)
        curveTo(5.2273f, 4.81842f, 5.1549f, 4.23921f, 4.85048f, 3.82169f)
        curveTo(4.67889f, 3.58637f, 4.45799f, 3.39136f, 4.2032f, 3.25029f)
        curveTo(3.75115f, 3f, 3.16743f, 3f, 2f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 7f)
        horizontalLineTo(11.5f)
        curveTo(13.857f, 7f, 15.0355f, 7f, 15.7678f, 7.73223f)
        curveTo(16.5f, 8.46447f, 16.5f, 9.64298f, 16.5f, 12f)
        verticalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        horizontalLineTo(16.0241f)
        curveTo(16.909f, 14f, 17.3515f, 14f, 17.7374f, 14.1887f)
        curveTo(17.8297f, 14.2339f, 17.9188f, 14.2867f, 18.0039f, 14.3468f)
        curveTo(18.3597f, 14.5978f, 18.6052f, 15.0057f, 19.096f, 15.8214f)
        curveTo(19.489f, 16.4745f, 19.6855f, 16.8011f, 19.9799f, 16.9279f)
        curveTo(20.0491f, 16.9578f, 20.1212f, 16.9789f, 20.1947f, 16.9911f)
        curveTo(20.5071f, 17.0428f, 20.8239f, 16.8673f, 21.4576f, 16.5163f)
        lineTo(22f, 16.2158f)
        }
        }.build()

        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
