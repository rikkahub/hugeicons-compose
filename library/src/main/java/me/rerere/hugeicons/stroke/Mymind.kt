package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mymind: ImageVector
    get() {
        if (_mymind != null) {
            return _mymind!!
        }
        _mymind = ImageVector.Builder(
            name = "Mymind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.4956f, 10.106f)
            curveTo(21.0362f, 15.5278f, 18.9292f, 20.7711f, 14.7894f, 21.8171f)
            curveTo(10.6497f, 22.8631f, 6.04495f, 19.3158f, 4.50438f, 13.894f)
            curveTo(2.96382f, 8.47215f, 5.07084f, 3.22891f, 9.21056f, 2.18289f)
            curveTo(13.3503f, 1.13686f, 17.9551f, 4.68416f, 19.4956f, 10.106f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.3187f, 15.9425f)
            lineTo(11.5f, 7f)
            lineTo(16.1503f, 14.774f)
            curveTo(16.4156f, 15.2176f, 16.5483f, 15.4394f, 16.484f, 15.653f)
            curveTo(16.4197f, 15.8667f, 16.1856f, 15.9817f, 15.7176f, 16.2119f)
            lineTo(14.8084f, 16.6589f)
            curveTo(14.2473f, 16.9348f, 13.9667f, 17.0728f, 13.735f, 16.9613f)
            curveTo(13.5033f, 16.8498f, 13.4417f, 16.5474f, 13.3187f, 15.9425f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.5f, 11f)
            arcTo(1f, 1f, 0f, true, false, 7.5f, 11f)
            arcTo(1f, 1f, 0f, true, false, 9.5f, 11f)
            close()
        }
        }.build()

        return _mymind!!
    }

private var _mymind: ImageVector? = null
