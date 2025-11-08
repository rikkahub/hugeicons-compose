package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Developer: ImageVector
    get() {
        if (_developer != null) {
            return _developer!!
        }
        _developer = ImageVector.Builder(
            name = "Developer",
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
        moveTo(15.1754f, 22f)
        verticalLineTo(21.0117f)
        lineTo(15.1754f, 20.9908f)
        curveTo(15.1805f, 20.4457f, 15.6274f, 20.0051f, 16.1801f, 20f)
        lineTo(16.2551f, 19.9999f)
        curveTo(17.6867f, 19.9885f, 18.9166f, 18.9942f, 19.2087f, 17.612f)
        lineTo(19.2193f, 17.5601f)
        lineTo(19.7385f, 15f)
        lineTo(20.6798f, 14.5359f)
        curveTo(21.1836f, 14.2875f, 21.4354f, 14.1633f, 21.4899f, 13.9356f)
        curveTo(21.5444f, 13.7079f, 21.3755f, 13.4857f, 21.0376f, 13.0414f)
        lineTo(19.1301f, 10.5333f)
        curveTo(18.9403f, 10.2837f, 18.8454f, 10.1589f, 18.7945f, 10.0269f)
        curveTo(18.7437f, 9.89486f, 18.728f, 9.70775f, 18.6968f, 9.33353f)
        curveTo(18.3533f, 5.22708f, 14.8649f, 2f, 10.6123f, 2f)
        curveTo(6.13198f, 2f, 2.5f, 5.58172f, 2.5f, 10f)
        curveTo(2.5f, 12.7497f, 3.90669f, 15.1753f, 6.04911f, 16.6153f)
        moveTo(6.04911f, 16.6153f)
        verticalLineTo(22f)
        moveTo(6.04911f, 16.6153f)
        curveTo(6.66896f, 17.0319f, 7.3504f, 17.366f, 8.07717f, 17.6016f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 9f)
        lineTo(14.9199f, 9.79289f)
        curveTo(15.3066f, 10.1262f, 15.5f, 10.2929f, 15.5f, 10.5f)
        curveTo(15.5f, 10.7071f, 15.3066f, 10.8738f, 14.9199f, 11.2071f)
        lineTo(14f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 9f)
        lineTo(6.08009f, 9.79289f)
        curveTo(5.69337f, 10.1262f, 5.5f, 10.2929f, 5.5f, 10.5f)
        curveTo(5.5f, 10.7071f, 5.69336f, 10.8738f, 6.08009f, 11.2071f)
        lineTo(7f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 8f)
        lineTo(9.5f, 13f)
        }
        }.build()

        return _developer!!
    }

private var _developer: ImageVector? = null
