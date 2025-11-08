package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hockey: ImageVector
    get() {
        if (_hockey != null) {
            return _hockey!!
        }
        _hockey = ImageVector.Builder(
            name = "Hockey",
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
        moveTo(11.8614f, 19.224f)
        lineTo(20.8481f, 3.72126f)
        curveTo(21.1689f, 3.16783f, 20.9654f, 2.47169f, 20.3905f, 2.15561f)
        curveTo(19.8259f, 1.8452f, 19.1047f, 2.01295f, 18.754f, 2.53628f)
        lineTo(8.61227f, 17.6689f)
        curveTo(8.23552f, 18.2311f, 7.46084f, 18.4113f, 6.85433f, 18.0778f)
        curveTo(6.04998f, 17.6356f, 6.17032f, 16.8476f, 6.44582f, 16.1473f)
        curveTo(6.70887f, 15.4787f, 6.42574f, 14.727f, 5.77639f, 14.37f)
        curveTo(4.91469f, 13.8963f, 4.03029f, 14.3288f, 3.57111f, 15.0861f)
        curveTo(2.25235f, 17.2611f, 3.35339f, 20.3548f, 5.48365f, 21.526f)
        curveTo(7.75091f, 22.7724f, 10.5962f, 21.4065f, 11.8614f, 19.224f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 7f)
        lineTo(18f, 8.5f)
        }
        }.build()

        return _hockey!!
    }

private var _hockey: ImageVector? = null
