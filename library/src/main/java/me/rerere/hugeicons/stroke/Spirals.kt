package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Spirals: ImageVector
    get() {
        if (_spirals != null) {
            return _spirals!!
        }
        _spirals = ImageVector.Builder(
            name = "Spirals",
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
        moveTo(11.9532f, 2.00004f)
        curveTo(17.5019f, 2.00004f, 22f, 6.47719f, 22f, 12f)
        curveTo(22f, 17.5229f, 17.5019f, 22f, 11.9532f, 22f)
        curveTo(-0.631103f, 22f, -1.82658f, 4.01759f, 11.4985f, 5.00004f)
        curveTo(14.8499f, 5.24714f, 18.0289f, 8.41019f, 18.0289f, 12f)
        curveTo(18.0289f, 16.5f, 15.2348f, 18.5f, 11.4985f, 18.5f)
        curveTo(4.5f, 18.5f, 3.19042f, 8.46695f, 11.0021f, 9.00004f)
        curveTo(12.508f, 9.1028f, 14.0162f, 10.3432f, 14.0162f, 12f)
        curveTo(14.0162f, 13.9279f, 13f, 15f, 11.1211f, 15f)
        }
        }.build()

        return _spirals!!
    }

private var _spirals: ImageVector? = null
