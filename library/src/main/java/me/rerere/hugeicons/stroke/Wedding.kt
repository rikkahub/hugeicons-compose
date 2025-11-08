package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wedding: ImageVector
    get() {
        if (_wedding != null) {
            return _wedding!!
        }
        _wedding = ImageVector.Builder(
            name = "Wedding",
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
        moveTo(12f, 9f)
        curveTo(12f, 9f, 16f, 7.14706f, 16f, 4.13889f)
        curveTo(16f, 2.95761f, 15.1579f, 2f, 14f, 2f)
        curveTo(13.0526f, 2f, 12.4211f, 2.41176f, 12f, 3.23529f)
        curveTo(11.5789f, 2.41176f, 10.9474f, 2f, 10f, 2f)
        curveTo(8.84211f, 2f, 8f, 2.95761f, 8f, 4.13889f)
        curveTo(8f, 7.14706f, 12f, 9f, 12f, 9f)
        }
        }.build()

        return _wedding!!
    }

private var _wedding: ImageVector? = null
