package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Comet01: ImageVector
    get() {
        if (_comet01 != null) {
            return _comet01!!
        }
        _comet01 = ImageVector.Builder(
            name = "Comet01",
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
        moveTo(4.05025f, 10.0498f)
        curveTo(1.31658f, 12.7835f, 1.31658f, 17.2156f, 4.05025f, 19.9493f)
        curveTo(6.78392f, 22.683f, 11.2161f, 22.683f, 13.9497f, 19.9493f)
        lineTo(17.899f, 16f)
        moveTo(12.1001f, 2f)
        lineTo(6.5f, 7.60006f)
        moveTo(22f, 11.899f)
        lineTo(20f, 13.899f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.1213f, 12.8787f)
        curveTo(12.2929f, 14.0503f, 12.2929f, 15.9497f, 11.1213f, 17.1213f)
        curveTo(9.94975f, 18.2929f, 8.05025f, 18.2929f, 6.87868f, 17.1213f)
        curveTo(5.70711f, 15.9497f, 5.70711f, 14.0503f, 6.87868f, 12.8787f)
        curveTo(8.05025f, 11.7071f, 9.94975f, 11.7071f, 11.1213f, 12.8787f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.87869f, 12.8795f)
        lineTo(13.9998f, 5.75787f)
        moveTo(17.7574f, 2f)
        lineTo(15.9998f, 3.75772f)
        moveTo(21.9998f, 6.24338f)
        lineTo(15.3637f, 12.8795f)
        }
        }.build()

        return _comet01!!
    }

private var _comet01: ImageVector? = null
