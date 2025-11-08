package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GlobalRefresh: ImageVector
    get() {
        if (_globalRefresh != null) {
            return _globalRefresh!!
        }
        _globalRefresh = ImageVector.Builder(
            name = "GlobalRefresh",
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
        moveTo(19.7423f, 17.4915f)
        lineTo(20.5917f, 17.9414f)
        curveTo(21.1874f, 18.257f, 21.4853f, 18.4148f, 21.762f, 18.2331f)
        curveTo(22.0386f, 18.0513f, 22.0173f, 17.7661f, 21.9747f, 17.1958f)
        curveTo(21.7298f, 13.9197f, 17.6728f, 11.6731f, 14.8672f, 13.8841f)
        moveTo(15.2558f, 17.4915f)
        lineTo(14.4065f, 17.0416f)
        curveTo(13.8112f, 16.7262f, 13.5135f, 16.5685f, 13.2365f, 16.7515f)
        curveTo(12.9595f, 16.9345f, 12.9822f, 17.2187f, 13.0275f, 17.7872f)
        curveTo(13.2864f, 21.0359f, 17.3202f, 23.3133f, 20.0565f, 21.1514f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.0107f, 22f)
        curveTo(5.95135f, 21.497f, 2f, 17.2229f, 2f, 12.0247f)
        curveTo(2f, 6.48823f, 6.48245f, 2f, 12.0118f, 2f)
        curveTo(17.308f, 2f, 21.6437f, 6.11759f, 22f, 11.33f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 5.69899f)
        curveTo(19.0653f, 5.76636f, 17.8681f, 6.12824f, 17.0379f, 7.20277f)
        curveTo(15.5385f, 9.14361f, 14.039f, 9.30556f, 13.0394f, 8.65861f)
        curveTo(11.5399f, 7.6882f, 12.8f, 6.11636f, 11.0401f, 5.26215f)
        curveTo(9.89313f, 4.70542f, 9.73321f, 3.19045f, 10.3716f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 11f)
        curveTo(2.7625f, 11.6621f, 3.83046f, 12.2682f, 5.08874f, 12.2682f)
        curveTo(7.68843f, 12.2682f, 8.20837f, 12.7649f, 8.20837f, 14.7518f)
        curveTo(8.20837f, 16.7387f, 8.20837f, 16.7387f, 8.72831f, 18.2288f)
        curveTo(9.06651f, 19.1981f, 9.18472f, 20.1674f, 8.5106f, 21f)
        }
        }.build()

        return _globalRefresh!!
    }

private var _globalRefresh: ImageVector? = null
