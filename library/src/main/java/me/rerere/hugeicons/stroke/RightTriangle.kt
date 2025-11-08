package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RightTriangle: ImageVector
    get() {
        if (_rightTriangle != null) {
            return _rightTriangle!!
        }
        _rightTriangle = ImageVector.Builder(
            name = "RightTriangle",
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
        moveTo(4f, 8f)
        verticalLineTo(6.48477f)
        curveTo(4f, 3.77748f, 4f, 2.42383f, 4.79089f, 2.07276f)
        curveTo(5.58178f, 1.72168f, 6.52338f, 2.65735f, 8.40659f, 4.5287f)
        lineTo(19.2835f, 15.3371f)
        curveTo(21.2721f, 17.3131f, 22.2664f, 18.3012f, 21.9383f, 19.1506f)
        curveTo(21.6102f, 20f, 20.2343f, 20f, 17.4825f, 20f)
        horizontalLineTo(16f)
        moveTo(13f, 22f)
        curveTo(13f, 21.0572f, 13f, 20.5858f, 12.7071f, 20.2929f)
        curveTo(12.4142f, 20f, 11.9428f, 20f, 11f, 20f)
        horizontalLineTo(6.60556f)
        curveTo(5.37729f, 20f, 4.76315f, 20f, 4.38158f, 19.6036f)
        curveTo(4f, 19.2072f, 4f, 18.5692f, 4f, 17.2932f)
        verticalLineTo(13f)
        curveTo(4f, 12.0572f, 4f, 11.5858f, 3.70711f, 11.2929f)
        curveTo(3.41421f, 11f, 2.94281f, 11f, 2f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 15f)
        horizontalLineTo(5f)
        curveTo(6.88562f, 15f, 7.82843f, 15f, 8.41421f, 15.5858f)
        curveTo(9f, 16.1716f, 9f, 17.1144f, 9f, 19f)
        verticalLineTo(20f)
        }
        }.build()

        return _rightTriangle!!
    }

private var _rightTriangle: ImageVector? = null
