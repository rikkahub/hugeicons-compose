package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = ImageVector.Builder(
            name = "Scroll",
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
        moveTo(11f, 6.00781f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 10f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 14f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 22f)
        curveTo(20.1046f, 22f, 21f, 21.1046f, 21f, 20f)
        verticalLineTo(8f)
        curveTo(21f, 5.17157f, 21f, 3.75736f, 20.1213f, 2.87868f)
        curveTo(19.2426f, 2f, 17.8284f, 2f, 15f, 2f)
        horizontalLineTo(13f)
        curveTo(10.1716f, 2f, 8.75736f, 2f, 7.87868f, 2.87868f)
        curveTo(7f, 3.75736f, 7f, 5.17157f, 7f, 8f)
        verticalLineTo(18f)
        moveTo(19f, 22f)
        curveTo(17.8954f, 22f, 17f, 21.1046f, 17f, 20f)
        curveTo(17f, 19.0572f, 17f, 18.5858f, 16.7071f, 18.2929f)
        curveTo(16.4142f, 18f, 15.9428f, 18f, 15f, 18f)
        horizontalLineTo(7f)
        moveTo(19f, 22f)
        horizontalLineTo(5f)
        curveTo(3.89543f, 22f, 3f, 21.1046f, 3f, 20f)
        curveTo(3f, 19.0572f, 3f, 18.5858f, 3.29289f, 18.2929f)
        curveTo(3.58579f, 18f, 4.05719f, 18f, 5f, 18f)
        horizontalLineTo(7f)
        }
        }.build()

        return _scroll!!
    }

private var _scroll: ImageVector? = null
