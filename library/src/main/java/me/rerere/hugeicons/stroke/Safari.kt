package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Safari: ImageVector
    get() {
        if (_safari != null) {
            return _safari!!
        }
        _safari = ImageVector.Builder(
            name = "Safari",
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
        moveTo(13.7214f, 13.7214f)
        curveTo(14.1043f, 13.3385f, 14.3231f, 12.828f, 14.7607f, 11.807f)
        lineTo(16.3172f, 8.17504f)
        curveTo(16.4736f, 7.81011f, 16.5518f, 7.62764f, 16.4621f, 7.53789f)
        curveTo(16.3724f, 7.44815f, 16.1899f, 7.52635f, 15.825f, 7.68275f)
        lineTo(12.193f, 9.23929f)
        curveTo(11.172f, 9.67688f, 10.6615f, 9.89567f, 10.2786f, 10.2786f)
        moveTo(13.7214f, 13.7214f)
        curveTo(13.3385f, 14.1043f, 12.828f, 14.3231f, 11.807f, 14.7607f)
        lineTo(8.17504f, 16.3172f)
        curveTo(7.81011f, 16.4736f, 7.62764f, 16.5518f, 7.53789f, 16.4621f)
        curveTo(7.44815f, 16.3724f, 7.52635f, 16.1899f, 7.68275f, 15.825f)
        lineTo(9.23929f, 12.193f)
        curveTo(9.67688f, 11.172f, 9.89567f, 10.6615f, 10.2786f, 10.2786f)
        moveTo(13.7214f, 13.7214f)
        lineTo(10.2786f, 10.2786f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        lineTo(12f, 3.5f)
        moveTo(12f, 22f)
        lineTo(12f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        lineTo(20.5f, 12f)
        moveTo(2f, 12f)
        lineTo(3.5f, 12f)
        }
        }.build()

        return _safari!!
    }

private var _safari: ImageVector? = null
