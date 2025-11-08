package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BloodPressure: ImageVector
    get() {
        if (_bloodPressure != null) {
            return _bloodPressure!!
        }
        _bloodPressure = ImageVector.Builder(
            name = "BloodPressure",
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
        moveTo(9f, 13f)
        horizontalLineTo(9.80031f)
        curveTo(10.4304f, 13f, 10.7454f, 13f, 10.9985f, 13.1493f)
        curveTo(11.2517f, 13.2987f, 11.3926f, 13.5677f, 11.6743f, 14.1056f)
        lineTo(13.1905f, 17f)
        lineTo(15.2857f, 11f)
        lineTo(16.8018f, 13.8944f)
        curveTo(17.0836f, 14.4323f, 17.2245f, 14.7013f, 17.4777f, 14.8507f)
        curveTo(17.7308f, 15f, 18.0458f, 15f, 18.6759f, 15f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 12f)
        curveTo(19.732f, 8.4154f, 16.7237f, 5.03871f, 14.5241f, 2.97222f)
        curveTo(13.1443f, 1.67593f, 11.04f, 1.67593f, 9.66019f, 2.97222f)
        curveTo(7.11961f, 5.35907f, 3.5f, 9.49387f, 3.5f, 13.678f)
        curveTo(3.5f, 17.7804f, 6.75366f, 22f, 12.0921f, 22f)
        curveTo(15.4851f, 22f, 18.0359f, 20.2955f, 19.4444f, 18f)
        }
        }.build()

        return _bloodPressure!!
    }

private var _bloodPressure: ImageVector? = null
