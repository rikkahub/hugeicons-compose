package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShareLocation02: ImageVector
    get() {
        if (_shareLocation02 != null) {
            return _shareLocation02!!
        }
        _shareLocation02 = ImageVector.Builder(
            name = "ShareLocation02",
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
        moveTo(12f, 2f)
        curveTo(17.5237f, 2f, 22f, 6.47778f, 22f, 12f)
        curveTo(22f, 17.5222f, 17.5237f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 21.5f)
        curveTo(7.81163f, 21.0953f, 6.69532f, 20.5107f, 5.72302f, 19.7462f)
        moveTo(5.72302f, 4.25385f)
        curveTo(6.69532f, 3.50059f, 7.81163f, 2.90473f, 9f, 2.5f)
        moveTo(2f, 10.2461f)
        curveTo(2.21607f, 9.08813f, 2.66019f, 7.96386f, 3.29638f, 6.94078f)
        moveTo(2f, 13.7539f)
        curveTo(2.21607f, 14.9119f, 2.66019f, 16.0361f, 3.29638f, 17.0592f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9961f, 11.5f)
        horizontalLineTo(12.0024f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        curveTo(14.4353f, 7f, 16.5f, 9.01649f, 16.5f, 11.4629f)
        curveTo(16.5f, 13.9482f, 14.4017f, 15.6924f, 12.4635f, 16.8783f)
        curveTo(12.3223f, 16.9581f, 12.1625f, 17f, 12f, 17f)
        curveTo(11.8375f, 17f, 11.6777f, 16.9581f, 11.5365f, 16.8783f)
        curveTo(9.60195f, 15.6808f, 7.5f, 13.9568f, 7.5f, 11.4629f)
        curveTo(7.5f, 9.01649f, 9.56472f, 7f, 12f, 7f)
        }
        }.build()

        return _shareLocation02!!
    }

private var _shareLocation02: ImageVector? = null
