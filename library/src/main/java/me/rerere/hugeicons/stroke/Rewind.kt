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

val HugeIcons.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = ImageVector.Builder(
            name = "Rewind",
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
            moveTo(2.15512f, 12.9178f)
            curveTo(2.43749f, 13.6884f, 3.29078f, 14.3047f, 4.99737f, 15.5372f)
            curveTo(7.32449f, 17.218f, 8.48806f, 18.0583f, 9.46099f, 17.9969f)
            curveTo(10.204f, 17.9499f, 10.8946f, 17.6007f, 11.3699f, 17.0315f)
            curveTo(11.9922f, 16.2863f, 11.9922f, 14.8575f, 11.9922f, 12f)
            curveTo(11.9922f, 9.14246f, 11.9922f, 7.71369f, 11.3699f, 6.96846f)
            curveTo(10.8946f, 6.39933f, 10.204f, 6.0501f, 9.46099f, 6.00315f)
            curveTo(8.48806f, 5.94167f, 7.32449f, 6.78203f, 4.99737f, 8.46275f)
            curveTo(3.29078f, 9.6953f, 2.43749f, 10.3116f, 2.15512f, 11.0822f)
            curveTo(1.93788f, 11.675f, 1.93788f, 12.325f, 2.15512f, 12.9178f)
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
            moveTo(14.9974f, 15.5372f)
            curveTo(17.3245f, 17.218f, 18.4881f, 18.0583f, 19.461f, 17.9969f)
            curveTo(20.204f, 17.9499f, 20.8946f, 17.6007f, 21.3699f, 17.0315f)
            curveTo(21.9922f, 16.2863f, 21.9922f, 14.8575f, 21.9922f, 12f)
            curveTo(21.9922f, 9.14246f, 21.9922f, 7.71369f, 21.3699f, 6.96846f)
            curveTo(20.8946f, 6.39933f, 20.204f, 6.0501f, 19.461f, 6.00315f)
            curveTo(18.4881f, 5.94167f, 17.3245f, 6.78203f, 14.9974f, 8.46275f)
        }
        }.build()

        return _rewind!!
    }

private var _rewind: ImageVector? = null
