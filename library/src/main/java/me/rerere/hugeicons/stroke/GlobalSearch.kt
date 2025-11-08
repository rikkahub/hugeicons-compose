package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GlobalSearch: ImageVector
    get() {
        if (_globalSearch != null) {
            return _globalSearch!!
        }
        _globalSearch = ImageVector.Builder(
            name = "GlobalSearch",
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
        moveTo(22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.8988f, 19.9288f)
        lineTo(22f, 22f)
        moveTo(21.1083f, 17.0459f)
        curveTo(21.1083f, 19.2805f, 19.2932f, 21.0919f, 17.0541f, 21.0919f)
        curveTo(14.8151f, 21.0919f, 13f, 19.2805f, 13f, 17.0459f)
        curveTo(13f, 14.8114f, 14.8151f, 13f, 17.0541f, 13f)
        curveTo(19.2932f, 13f, 21.1083f, 14.8114f, 21.1083f, 17.0459f)
        }
        }.build()

        return _globalSearch!!
    }

private var _globalSearch: ImageVector? = null
