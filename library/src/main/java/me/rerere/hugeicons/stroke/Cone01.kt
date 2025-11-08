package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cone01: ImageVector
    get() {
        if (_cone01 != null) {
            return _cone01!!
        }
        _cone01 = ImageVector.Builder(
            name = "Cone01",
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
        moveTo(21f, 18f)
        curveTo(21f, 15.7909f, 16.9706f, 14f, 12f, 14f)
        curveTo(7.02944f, 14f, 3f, 15.7909f, 3f, 18f)
        curveTo(3f, 20.2091f, 7.02944f, 22f, 12f, 22f)
        curveTo(16.9706f, 22f, 21f, 20.2091f, 21f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 16.5f)
        lineTo(16.1561f, 7.39413f)
        curveTo(14.3427f, 3.79804f, 13.436f, 2f, 12f, 2f)
        curveTo(10.564f, 2f, 9.65732f, 3.79804f, 7.84393f, 7.39413f)
        lineTo(3.5f, 16.5f)
        }
        }.build()

        return _cone01!!
    }

private var _cone01: ImageVector? = null
