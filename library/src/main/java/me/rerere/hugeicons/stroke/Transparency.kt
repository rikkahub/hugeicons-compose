package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Transparency: ImageVector
    get() {
        if (_transparency != null) {
            return _transparency!!
        }
        _transparency = ImageVector.Builder(
            name = "Transparency",
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
        moveTo(16f, 9f)
        curveTo(16f, 12.866f, 12.866f, 16f, 9f, 16f)
        curveTo(5.13401f, 16f, 2f, 12.866f, 2f, 9f)
        curveTo(2f, 5.13401f, 5.13401f, 2f, 9f, 2f)
        curveTo(12.866f, 2f, 16f, 5.13401f, 16f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.02593f, 15.6067f)
        curveTo(8.00876f, 15.4067f, 8f, 15.2044f, 8f, 15f)
        curveTo(8f, 11.134f, 11.134f, 8f, 15f, 8f)
        curveTo(15.2867f, 8f, 15.5693f, 8.01723f, 15.8469f, 8.05071f)
        moveTo(18.9969f, 9.25251f)
        curveTo(20.8121f, 10.5172f, 22f, 12.6199f, 22f, 15f)
        curveTo(22f, 18.866f, 18.866f, 22f, 15f, 22f)
        curveTo(12.6199f, 22f, 10.5172f, 20.8121f, 9.25251f, 18.9969f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 2.5f)
        lineTo(15.5f, 11.5f)
        moveTo(2.5f, 6.5f)
        lineTo(11.5f, 15.5f)
        }
        }.build()

        return _transparency!!
    }

private var _transparency: ImageVector? = null
