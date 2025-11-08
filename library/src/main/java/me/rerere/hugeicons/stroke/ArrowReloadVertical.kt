package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowReloadVertical: ImageVector
    get() {
        if (_arrowReloadVertical != null) {
            return _arrowReloadVertical!!
        }
        _arrowReloadVertical = ImageVector.Builder(
            name = "ArrowReloadVertical",
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
        moveTo(5.5f, 3.5f)
        lineTo(5.5f, 14.5f)
        curveTo(5.5f, 18.2133f, 8.18503f, 21f, 12f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 20.5f)
        lineTo(18.5f, 9.5f)
        curveTo(18.5f, 5.78672f, 15.815f, 3f, 12f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 18f)
        curveTo(21f, 18f, 19.1588f, 20.5f, 18.5f, 20.5f)
        curveTo(17.8412f, 20.5f, 16f, 18f, 16f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 5.50022f)
        curveTo(8f, 5.50022f, 6.15878f, 3.00025f, 5.49998f, 3.00024f)
        curveTo(4.84118f, 3.00024f, 3f, 5.50024f, 3f, 5.50024f)
        }
        }.build()

        return _arrowReloadVertical!!
    }

private var _arrowReloadVertical: ImageVector? = null
