package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Crazy: ImageVector
    get() {
        if (_crazy != null) {
            return _crazy!!
        }
        _crazy = ImageVector.Builder(
            name = "Crazy",
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
        moveTo(10f, 10f)
        curveTo(10f, 10.5f, 9.32205f, 11f, 8.5f, 11f)
        curveTo(7.67795f, 11f, 7f, 10.5523f, 7f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 10f)
        curveTo(17f, 8.34315f, 16.3284f, 7f, 15.5f, 7f)
        curveTo(14.6716f, 7f, 14f, 8.34315f, 14f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.633f, 13.5f)
        curveTo(17.1164f, 14.1528f, 17.1867f, 15.1365f, 16.4482f, 15.8211f)
        curveTo(14.9899f, 17.173f, 13.148f, 15.7039f, 12.2062f, 15.6704f)
        curveTo(11.2635f, 15.637f, 10.7624f, 16.555f, 8.86254f, 16.9554f)
        curveTo(7.70902f, 17.1985f, 7f, 16.5f, 7f, 15.6704f)
        }
        }.build()

        return _crazy!!
    }

private var _crazy: ImageVector? = null
