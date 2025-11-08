package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sine01: ImageVector
    get() {
        if (_sine01 != null) {
            return _sine01!!
        }
        _sine01 = ImageVector.Builder(
            name = "Sine01",
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
        moveTo(5.00148f, 14f)
        curveTo(5.00185f, 11.7778f, 4.81561f, 4f, 8.50178f, 4f)
        curveTo(10.4342f, 4f, 12.0007f, 7.58172f, 12.0007f, 12f)
        curveTo(12.0007f, 16.4183f, 13.5672f, 20f, 15.4996f, 20f)
        curveTo(19.1858f, 20f, 19f, 12.2222f, 19f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 12f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 12f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.9146f, 2.83333f)
        curveTo(20.7087f, 2.34784f, 20.1531f, 2f, 19.5f, 2f)
        curveTo(18.6716f, 2f, 18f, 2.55964f, 18f, 3.25f)
        curveTo(18f, 3.94036f, 18.6716f, 4.5f, 19.5f, 4.5f)
        curveTo(20.3284f, 4.5f, 21f, 5.05964f, 21f, 5.75f)
        curveTo(21f, 6.44036f, 20.3284f, 7f, 19.5f, 7f)
        curveTo(18.8469f, 7f, 18.2913f, 6.65216f, 18.0854f, 6.16667f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.54393f, 17f)
        curveTo(4.69124f, 17f, 4f, 17.6716f, 4f, 18.5f)
        verticalLineTo(20.5f)
        curveTo(4f, 21.3284f, 4.69124f, 22f, 5.54393f, 22f)
        moveTo(5.54393f, 17f)
        curveTo(6.21616f, 17f, 6.78805f, 17.4174f, 7f, 18f)
        moveTo(5.54393f, 17f)
        curveTo(4.87169f, 17f, 4.2998f, 17.4174f, 4.08785f, 18f)
        moveTo(5.54393f, 22f)
        curveTo(4.87169f, 22f, 4.2998f, 21.5826f, 4.08785f, 21f)
        moveTo(5.54393f, 22f)
        curveTo(6.21616f, 22f, 6.78805f, 21.5826f, 7f, 21f)
        }
        }.build()

        return _sine01!!
    }

private var _sine01: ImageVector? = null
