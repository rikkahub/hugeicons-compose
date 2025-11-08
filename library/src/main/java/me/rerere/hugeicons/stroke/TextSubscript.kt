package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) {
            return _textSubscript!!
        }
        _textSubscript = ImageVector.Builder(
            name = "TextSubscript",
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
        moveTo(12.5f, 21f)
        horizontalLineTo(6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 6f)
        curveTo(16.5f, 5.37191f, 16.5f, 5.05787f, 16.4194f, 4.78267f)
        curveTo(16.2518f, 4.21026f, 15.8066f, 3.71716f, 15.2541f, 3.49226f)
        curveTo(14.9886f, 3.38413f, 14.6885f, 3.35347f, 14.0884f, 3.29216f)
        curveTo(12.6695f, 3.14718f, 10.8874f, 3f, 9.5f, 3f)
        curveTo(8.11262f, 3f, 6.33047f, 3.14718f, 4.91161f, 3.29216f)
        curveTo(4.3115f, 3.35347f, 4.01144f, 3.38413f, 3.74586f, 3.49226f)
        curveTo(3.19344f, 3.71716f, 2.74816f, 4.21026f, 2.58057f, 4.78267f)
        curveTo(2.5f, 5.05787f, 2.5f, 5.37191f, 2.5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 3.34863f)
        lineTo(9.5f, 20.8486f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 21f)
        horizontalLineTo(19.5f)
        curveTo(19.0286f, 21f, 18.7929f, 21f, 18.6464f, 20.8566f)
        curveTo(18.5f, 20.7133f, 18.5f, 20.4825f, 18.5f, 20.021f)
        verticalLineTo(19.0766f)
        curveTo(18.5f, 18.2812f, 18.676f, 18.1253f, 19.5004f, 18.1094f)
        curveTo(20.2769f, 18.0944f, 20.7401f, 18.0388f, 21.0607f, 17.8333f)
        curveTo(21.5f, 17.5516f, 21.5f, 17.0983f, 21.5f, 16.1916f)
        curveTo(21.5f, 14.4594f, 18.5f, 15.1262f, 18.5f, 15.1262f)
        }
        }.build()

        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
