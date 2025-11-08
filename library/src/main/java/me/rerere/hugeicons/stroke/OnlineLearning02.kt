package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.OnlineLearning02: ImageVector
    get() {
        if (_onlineLearning02 != null) {
            return _onlineLearning02!!
        }
        _onlineLearning02 = ImageVector.Builder(
            name = "OnlineLearning02",
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
        moveTo(20f, 22f)
        horizontalLineTo(6f)
        curveTo(4.89543f, 22f, 4f, 21.1046f, 4f, 20f)
        moveTo(4f, 20f)
        curveTo(4f, 18.8954f, 4.89543f, 18f, 6f, 18f)
        horizontalLineTo(20f)
        verticalLineTo(6f)
        curveTo(20f, 4.11438f, 20f, 3.17157f, 19.4142f, 2.58579f)
        curveTo(18.8284f, 2f, 17.8856f, 2f, 16f, 2f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 2f, 5.75736f, 2f, 4.87868f, 2.87868f)
        curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 18f)
        curveTo(19.5f, 18f, 18.5f, 18.7628f, 18.5f, 20f)
        curveTo(18.5f, 21.2372f, 19.5f, 22f, 19.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 8.44561f)
        curveTo(8f, 8.44561f, 9.5f, 7.00004f, 12.0045f, 7f)
        curveTo(14.5091f, 6.99996f, 16f, 8.44561f, 16f, 8.44561f)
        moveTo(14.5f, 11f)
        curveTo(14.5f, 11f, 13.5091f, 9.99742f, 12.0045f, 9.99742f)
        curveTo(10.5f, 9.99742f, 9.5f, 11f, 9.5f, 11f)
        moveTo(12f, 13f)
        horizontalLineTo(12.01f)
        }
        }.build()

        return _onlineLearning02!!
    }

private var _onlineLearning02: ImageVector? = null
