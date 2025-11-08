package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.OpenSource: ImageVector
    get() {
        if (_openSource != null) {
            return _openSource!!
        }
        _openSource = ImageVector.Builder(
            name = "OpenSource",
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
        moveTo(12f, 8.5f)
        curveTo(9.79086f, 8.5f, 8f, 10.2909f, 8f, 12.5f)
        curveTo(8f, 13.8795f, 8.69837f, 15.096f, 9.76087f, 15.815f)
        lineTo(7.63587f, 21.5f)
        curveTo(4.2997f, 19.8793f, 2f, 16.4582f, 2f, 12.5f)
        curveTo(2f, 6.97715f, 6.47715f, 2.5f, 12f, 2.5f)
        curveTo(17.5228f, 2.5f, 22f, 6.97715f, 22f, 12.5f)
        curveTo(22f, 16.4582f, 19.7003f, 19.8793f, 16.3641f, 21.5f)
        lineTo(14.2391f, 15.815f)
        curveTo(15.3016f, 15.096f, 16f, 13.8795f, 16f, 12.5f)
        curveTo(16f, 10.2909f, 14.2091f, 8.5f, 12f, 8.5f)
        }
        }.build()

        return _openSource!!
    }

private var _openSource: ImageVector? = null
