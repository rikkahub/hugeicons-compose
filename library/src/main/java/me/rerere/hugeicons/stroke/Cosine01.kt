package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cosine01: ImageVector
    get() {
        if (_cosine01 != null) {
            return _cosine01!!
        }
        _cosine01 = ImageVector.Builder(
            name = "Cosine01",
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
        moveTo(22f, 20.7288f)
        curveTo(18f, 22.6651f, 16.5884f, 13.6549f, 16.3311f, 12.0453f)
        curveTo(15.4666f, 6.63802f, 14.1205f, 3f, 12f, 3f)
        curveTo(9.87955f, 3f, 8.53343f, 6.63802f, 7.66891f, 12.0453f)
        curveTo(7.41158f, 13.6549f, 6f, 22.6651f, 2f, 20.7288f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        horizontalLineTo(4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 12f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 12f)
        horizontalLineTo(13.5f)
        }
        }.build()

        return _cosine01!!
    }

private var _cosine01: ImageVector? = null
