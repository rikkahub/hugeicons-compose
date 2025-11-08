package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Flag03: ImageVector
    get() {
        if (_flag03 != null) {
            return _flag03!!
        }
        _flag03 = ImageVector.Builder(
            name = "Flag03",
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
        moveTo(15.8785f, 3f)
        lineTo(10.2827f, 3f)
        curveTo(7.32099f, 3f, 5.84015f, 3f, 4.92007f, 3.87868f)
        curveTo(4f, 4.75736f, 4f, 6.17157f, 4f, 9f)
        lineTo(4.10619f, 15f)
        lineTo(15.8785f, 15f)
        curveTo(18.1016f, 15f, 19.2131f, 15f, 19.6847f, 14.4255f)
        curveTo(19.8152f, 14.2666f, 19.9108f, 14.0841f, 19.9656f, 13.889f)
        curveTo(20.1639f, 13.184f, 19.497f, 12.3348f, 18.1631f, 10.6364f)
        lineTo(18.1631f, 10.6364f)
        curveTo(17.6083f, 9.92985f, 17.3309f, 9.57659f, 17.2814f, 9.1751f)
        curveTo(17.2671f, 9.05877f, 17.2671f, 8.94123f, 17.2814f, 8.8249f)
        curveTo(17.3309f, 8.42341f, 17.6083f, 8.07015f, 18.1631f, 7.36364f)
        lineTo(18.1631f, 7.36364f)
        curveTo(19.497f, 5.66521f, 20.1639f, 4.816f, 19.9656f, 4.11098f)
        curveTo(19.9108f, 3.91591f, 19.8152f, 3.73342f, 19.6847f, 3.57447f)
        curveTo(19.2131f, 3f, 18.1016f, 3f, 15.8785f, 3f)
        lineTo(15.8785f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 21f)
        lineTo(4f, 8f)
        }
        }.build()

        return _flag03!!
    }

private var _flag03: ImageVector? = null
