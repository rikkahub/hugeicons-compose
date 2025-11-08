package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Book01: ImageVector
    get() {
        if (_book01 != null) {
            return _book01!!
        }
        _book01 = ImageVector.Builder(
            name = "Book01",
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
        horizontalLineTo(18f)
        curveTo(19.1046f, 18f, 20f, 17.1046f, 20f, 16f)
        verticalLineTo(2f)
        curveTo(20f, 3.10457f, 19.1046f, 4f, 18f, 4f)
        lineTo(10f, 4f)
        curveTo(7.17157f, 4f, 5.75736f, 4f, 4.87868f, 4.87868f)
        curveTo(4f, 5.75736f, 4f, 7.17157f, 4f, 10f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 18f)
        curveTo(18.5f, 18f, 17.5f, 18.7628f, 17.5f, 20f)
        curveTo(17.5f, 21.2372f, 18.5f, 22f, 18.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 4f)
        verticalLineTo(8f)
        }
        }.build()

        return _book01!!
    }

private var _book01: ImageVector? = null
