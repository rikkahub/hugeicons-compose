package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cylinder02: ImageVector
    get() {
        if (_cylinder02 != null) {
            return _cylinder02!!
        }
        _cylinder02 = ImageVector.Builder(
            name = "Cylinder02",
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
        moveTo(17f, 4f)
        curveTo(17f, 5.10457f, 14.7614f, 6f, 12f, 6f)
        curveTo(9.23858f, 6f, 7f, 5.10457f, 7f, 4f)
        curveTo(7f, 2.89543f, 9.23858f, 2f, 12f, 2f)
        curveTo(14.7614f, 2f, 17f, 2.89543f, 17f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 18f)
        curveTo(21f, 20.2091f, 16.9706f, 22f, 12f, 22f)
        curveTo(7.02944f, 22f, 3f, 20.2091f, 3f, 18f)
        curveTo(3f, 15.7909f, 7.02944f, 14f, 12f, 14f)
        curveTo(16.9706f, 14f, 21f, 15.7909f, 21f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 16.5f)
        lineTo(7f, 4f)
        moveTo(20.5f, 16.5f)
        lineTo(17f, 4f)
        }
        }.build()

        return _cylinder02!!
    }

private var _cylinder02: ImageVector? = null
