package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LeftTriangle: ImageVector
    get() {
        if (_leftTriangle != null) {
            return _leftTriangle!!
        }
        _leftTriangle = ImageVector.Builder(
            name = "LeftTriangle",
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
        moveTo(11f, 20f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 8f)
        verticalLineTo(6.48477f)
        curveTo(20f, 3.77749f, 20f, 2.42383f, 19.2091f, 2.07276f)
        curveTo(18.4182f, 1.72168f, 17.4766f, 2.65735f, 15.5934f, 4.5287f)
        lineTo(4.71649f, 15.3371f)
        curveTo(2.7279f, 17.3131f, 1.73361f, 18.3012f, 2.06169f, 19.1506f)
        curveTo(2.38977f, 20f, 3.76568f, 20f, 6.51751f, 20f)
        horizontalLineTo(8f)
        moveTo(11f, 20f)
        horizontalLineTo(17.3944f)
        curveTo(18.6227f, 20f, 19.2368f, 20f, 19.6184f, 19.6036f)
        curveTo(20f, 19.2072f, 20f, 18.5692f, 20f, 17.2932f)
        verticalLineTo(13f)
        curveTo(20f, 12.0572f, 20f, 11.5858f, 20.2929f, 11.2929f)
        curveTo(20.5858f, 11f, 21.0572f, 11f, 22f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 15f)
        horizontalLineTo(19f)
        curveTo(17.1144f, 15f, 16.1716f, 15f, 15.5858f, 15.5858f)
        curveTo(15f, 16.1716f, 15f, 17.1144f, 15f, 19f)
        verticalLineTo(20f)
        }
        }.build()

        return _leftTriangle!!
    }

private var _leftTriangle: ImageVector? = null
