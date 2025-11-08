package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Prawn: ImageVector
    get() {
        if (_prawn != null) {
            return _prawn!!
        }
        _prawn = ImageVector.Builder(
            name = "Prawn",
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
        moveTo(10.5f, 5f)
        curveTo(5.80558f, 5f, 2f, 8.80558f, 2f, 13.5f)
        curveTo(2f, 18.1944f, 5.80558f, 22f, 10.5f, 22f)
        curveTo(15.1944f, 22f, 19f, 18.1944f, 19f, 13.5f)
        curveTo(19f, 13.0306f, 18.6156f, 12.6411f, 18.1554f, 12.7339f)
        curveTo(16.2128f, 13.1256f, 14.75f, 14.842f, 14.75f, 16.9f)
        moveTo(10.5f, 5f)
        horizontalLineTo(17.3f)
        curveTo(18.2389f, 5f, 19.0218f, 5.77293f, 18.7902f, 6.6828f)
        curveTo(18.0413f, 9.62441f, 15.3747f, 11.8f, 12.2f, 11.8f)
        horizontalLineTo(10.5f)
        curveTo(9.09167f, 11.8f, 7.95f, 12.9417f, 7.95f, 14.35f)
        curveTo(7.95f, 15.7583f, 9.09167f, 16.9f, 10.5f, 16.9f)
        horizontalLineTo(14.75f)
        moveTo(10.5f, 5f)
        verticalLineTo(8.4f)
        moveTo(14.75f, 16.9f)
        verticalLineTo(17.75f)
        moveTo(5.4f, 20.3f)
        lineTo(8.8f, 16.9f)
        moveTo(3.275f, 9.25f)
        lineTo(7.95f, 13.075f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 8f)
        lineTo(13.491f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 2.00012f)
        horizontalLineTo(20.1608f)
        curveTo(21.321f, 2.00012f, 22.1912f, 3.0512f, 21.9637f, 4.17777f)
        curveTo(21.6689f, 5.63739f, 20.3433f, 6.67844f, 18.9189f, 7.00012f)
        }
        }.build()

        return _prawn!!
    }

private var _prawn: ImageVector? = null
