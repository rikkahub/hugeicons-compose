package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LayoutTable02: ImageVector
    get() {
        if (_layoutTable02 != null) {
            return _layoutTable02!!
        }
        _layoutTable02 = ImageVector.Builder(
            name = "LayoutTable02",
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
        moveTo(20.1069f, 20.1088f)
        curveTo(18.7156f, 21.5001f, 16.4765f, 21.5001f, 11.9981f, 21.5001f)
        curveTo(7.51976f, 21.5001f, 5.28059f, 21.5001f, 3.88935f, 20.1088f)
        curveTo(2.49811f, 18.7176f, 2.49811f, 16.4784f, 2.49811f, 12.0001f)
        curveTo(2.49811f, 7.52172f, 2.49811f, 5.28255f, 3.88935f, 3.89131f)
        curveTo(5.28059f, 2.50006f, 7.51976f, 2.50006f, 11.9981f, 2.50006f)
        curveTo(16.4764f, 2.50006f, 18.7156f, 2.50006f, 20.1069f, 3.8913f)
        curveTo(21.4981f, 5.28255f, 21.4981f, 7.52172f, 21.4981f, 12.0001f)
        curveTo(21.4981f, 16.4784f, 21.4981f, 18.7176f, 20.1069f, 20.1088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.99811f, 21.5001f)
        lineTo(8.99811f, 2.50006f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.4981f, 8.00006f)
        lineTo(2.49811f, 8.00006f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.4981f, 16.0001f)
        horizontalLineTo(2.49811f)
        }
        }.build()

        return _layoutTable02!!
    }

private var _layoutTable02: ImageVector? = null
