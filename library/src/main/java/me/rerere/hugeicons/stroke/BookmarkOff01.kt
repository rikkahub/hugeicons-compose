package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BookmarkOff01: ImageVector
    get() {
        if (_bookmarkOff01 != null) {
            return _bookmarkOff01!!
        }
        _bookmarkOff01 = ImageVector.Builder(
            name = "BookmarkOff01",
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
        moveTo(20f, 19.9429f)
        curveTo(19.9381f, 20.9761f, 19.7617f, 21.5725f, 19.259f, 21.8481f)
        curveTo(17.7592f, 22.6701f, 14.946f, 19.9276f, 13.61f, 19.1019f)
        curveTo(12.8352f, 18.623f, 12.4478f, 18.3836f, 12.0167f, 18.3836f)
        curveTo(11.5856f, 18.3836f, 11.1982f, 18.623f, 10.4234f, 19.1019f)
        curveTo(9.08741f, 19.9276f, 6.27421f, 22.6701f, 4.77446f, 21.8481f)
        curveTo(4f, 21.4236f, 4f, 20.2377f, 4f, 17.866f)
        verticalLineTo(9.35632f)
        curveTo(4f, 7.18055f, 4f, 5.63815f, 4.23168f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 16f)
        verticalLineTo(9.70753f)
        curveTo(20f, 6.07416f, 20f, 4.25748f, 18.8284f, 3.12874f)
        curveTo(17.6569f, 2f, 15.7712f, 2f, 12f, 2f)
        curveTo(9.39647f, 2f, 7.69163f, 2f, 6.5f, 2.37139f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 7f)
        lineTo(19.5f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }
        }.build()

        return _bookmarkOff01!!
    }

private var _bookmarkOff01: ImageVector? = null
