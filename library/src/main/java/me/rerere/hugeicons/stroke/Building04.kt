package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Building04: ImageVector
    get() {
        if (_building04 != null) {
            return _building04!!
        }
        _building04 = ImageVector.Builder(
            name = "Building04",
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
        moveTo(11f, 2f)
        verticalLineTo(14f)
        curveTo(11f, 17.3093f, 10.3093f, 18f, 7f, 18f)
        horizontalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        lineTo(11f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 16f)
        lineTo(18.5f, 16f)
        moveTo(17.5f, 19f)
        lineTo(18.5f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 5f)
        verticalLineTo(22f)
        horizontalLineTo(4.279f)
        curveTo(3.03789f, 22f, 2.41734f, 22f, 2.13134f, 21.5746f)
        curveTo(1.84534f, 21.1492f, 2.05611f, 20.5397f, 2.47764f, 19.3207f)
        lineTo(7.78212f, 3.98107f)
        curveTo(8.11324f, 3.0235f, 8.27881f, 2.54472f, 8.65029f, 2.27236f)
        curveTo(9.02177f, 2f, 9.50923f, 2f, 10.4842f, 2f)
        horizontalLineTo(11.1272f)
        curveTo(12.4814f, 2f, 13.1586f, 2f, 13.5793f, 2.43934f)
        curveTo(14f, 2.87868f, 14f, 3.58579f, 14f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 10f)
        lineTo(17.7897f, 11.1843f)
        curveTo(19.8193f, 11.8185f, 20.8341f, 12.1357f, 21.4171f, 12.9286f)
        curveTo(22f, 13.7215f, 22f, 14.7847f, 22f, 16.9111f)
        verticalLineTo(20f)
        curveTo(22f, 20.9428f, 22f, 21.4142f, 21.7071f, 21.7071f)
        curveTo(21.4142f, 22f, 20.9428f, 22f, 20f, 22f)
        horizontalLineTo(14f)
        }
        }.build()

        return _building04!!
    }

private var _building04: ImageVector? = null
