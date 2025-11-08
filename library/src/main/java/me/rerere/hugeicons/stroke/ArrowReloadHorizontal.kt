package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowReloadHorizontal: ImageVector
    get() {
        if (_arrowReloadHorizontal != null) {
            return _arrowReloadHorizontal!!
        }
        _arrowReloadHorizontal = ImageVector.Builder(
            name = "ArrowReloadHorizontal",
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
        moveTo(20.5f, 5.5f)
        horizontalLineTo(9.5f)
        curveTo(5.78672f, 5.5f, 3f, 8.18503f, 3f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 18.5f)
        horizontalLineTo(14.5f)
        curveTo(18.2133f, 18.5f, 21f, 15.815f, 21f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 3f)
        curveTo(18.5f, 3f, 21f, 4.84122f, 21f, 5.50002f)
        curveTo(21f, 6.15882f, 18.5f, 8f, 18.5f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.49998f, 16f)
        curveTo(5.49998f, 16f, 3.00001f, 17.8412f, 3f, 18.5f)
        curveTo(2.99999f, 19.1588f, 5.5f, 21f, 5.5f, 21f)
        }
        }.build()

        return _arrowReloadHorizontal!!
    }

private var _arrowReloadHorizontal: ImageVector? = null
