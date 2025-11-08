package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowHorizontal: ImageVector
    get() {
        if (_arrowHorizontal != null) {
            return _arrowHorizontal!!
        }
        _arrowHorizontal = ImageVector.Builder(
            name = "ArrowHorizontal",
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
        moveTo(5f, 9f)
        curveTo(4.39316f, 9.58984f, 2f, 11.1597f, 2f, 12f)
        curveTo(2f, 12.8403f, 4.39316f, 14.4102f, 5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 9f)
        curveTo(19.6068f, 9.58984f, 22f, 11.1597f, 22f, 12f)
        curveTo(22f, 12.8403f, 19.6068f, 14.4102f, 19f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.42285f, 11.9795f)
        horizontalLineTo(21.868f)
        }
        }.build()

        return _arrowHorizontal!!
    }

private var _arrowHorizontal: ImageVector? = null
