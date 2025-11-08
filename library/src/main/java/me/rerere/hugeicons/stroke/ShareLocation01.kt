package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShareLocation01: ImageVector
    get() {
        if (_shareLocation01 != null) {
            return _shareLocation01!!
        }
        _shareLocation01 = ImageVector.Builder(
            name = "ShareLocation01",
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
        moveTo(12.7185f, 16.2151f)
        curveTo(12.5258f, 16.3979f, 12.2682f, 16.5f, 12.0001f, 16.5f)
        curveTo(11.732f, 16.5f, 11.4744f, 16.3979f, 11.2817f, 16.2151f)
        curveTo(9.51674f, 14.5317f, 7.15154f, 12.6511f, 8.30498f, 9.92085f)
        curveTo(8.92863f, 8.44462f, 10.4257f, 7.5f, 12.0001f, 7.5f)
        curveTo(13.5745f, 7.5f, 15.0715f, 8.44462f, 15.6952f, 9.92085f)
        curveTo(16.8472f, 12.6477f, 14.4878f, 14.5375f, 12.7185f, 16.2151f)
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
        }.build()

        return _shareLocation01!!
    }

private var _shareLocation01: ImageVector? = null
