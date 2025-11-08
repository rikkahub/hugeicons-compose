package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bebo: ImageVector
    get() {
        if (_bebo != null) {
            return _bebo!!
        }
        _bebo = ImageVector.Builder(
            name = "Bebo",
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
        moveTo(12f, 18f)
        curveTo(14.2091f, 18f, 16f, 16.2091f, 16f, 14f)
        curveTo(16f, 11.9f, 14.6758f, 10.5691f, 12.5661f, 10.1461f)
        curveTo(11.713f, 9.97507f, 11f, 9.29474f, 11f, 8.42476f)
        curveTo(11f, 7.11978f, 12.0676f, 6.03085f, 13.3523f, 6.26034f)
        curveTo(17.4783f, 6.99743f, 20f, 9.75593f, 20f, 14f)
        curveTo(20f, 18.4183f, 16.4183f, 22f, 12f, 22f)
        curveTo(7.58172f, 22f, 4f, 18.4183f, 4f, 14f)
        verticalLineTo(4f)
        curveTo(4f, 2.89543f, 4.89543f, 2f, 6f, 2f)
        curveTo(7.10457f, 2f, 8f, 2.89543f, 8f, 4f)
        verticalLineTo(14f)
        curveTo(8f, 16.2091f, 9.79086f, 18f, 12f, 18f)
        }
        }.build()

        return _bebo!!
    }

private var _bebo: ImageVector? = null
