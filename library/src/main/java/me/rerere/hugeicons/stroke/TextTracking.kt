package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextTracking: ImageVector
    get() {
        if (_textTracking != null) {
            return _textTracking!!
        }
        _textTracking = ImageVector.Builder(
            name = "TextTracking",
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
        moveTo(22f, 19f)
        horizontalLineTo(2f)
        moveTo(22f, 19f)
        curveTo(22f, 18.4398f, 20.4046f, 17.3932f, 20f, 17f)
        moveTo(22f, 19f)
        curveTo(22f, 19.5602f, 20.4046f, 20.6068f, 20f, 21f)
        moveTo(2f, 19f)
        curveTo(2f, 18.4398f, 3.59544f, 17.3932f, 4f, 17f)
        moveTo(2f, 19f)
        curveTo(2f, 19.5602f, 3.59544f, 20.6068f, 4f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 14f)
        lineTo(20.0714f, 8.5f)
        moveTo(20.0714f, 8.5f)
        lineTo(18.3793f, 3.67442f)
        curveTo(18.3324f, 3.54046f, 18.3089f, 3.47349f, 18.2792f, 3.4166f)
        curveTo(18.1653f, 3.19858f, 17.9709f, 3.0495f, 17.7493f, 3.01024f)
        curveTo(17.6915f, 3f, 17.6277f, 3f, 17.5f, 3f)
        curveTo(17.3723f, 3f, 17.3085f, 3f, 17.2507f, 3.01024f)
        curveTo(17.0291f, 3.0495f, 16.8347f, 3.19858f, 16.7208f, 3.4166f)
        curveTo(16.6911f, 3.47349f, 16.6676f, 3.54046f, 16.6207f, 3.67442f)
        lineTo(14.9286f, 8.5f)
        moveTo(20.0714f, 8.5f)
        lineTo(14.9286f, 8.5f)
        moveTo(14.9286f, 8.5f)
        lineTo(13f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 3f)
        lineTo(5.62066f, 13.3256f)
        curveTo(5.66763f, 13.4595f, 5.69112f, 13.5265f, 5.72083f, 13.5834f)
        curveTo(5.83469f, 13.8014f, 6.02907f, 13.9505f, 6.25065f, 13.9898f)
        curveTo(6.30847f, 14f, 6.37231f, 14f, 6.5f, 14f)
        curveTo(6.62768f, 14f, 6.69153f, 14f, 6.74934f, 13.9898f)
        curveTo(6.97093f, 13.9505f, 7.16531f, 13.8014f, 7.27917f, 13.5834f)
        curveTo(7.30888f, 13.5265f, 7.33237f, 13.4595f, 7.37934f, 13.3256f)
        lineTo(11f, 3f)
        }
        }.build()

        return _textTracking!!
    }

private var _textTracking: ImageVector? = null
