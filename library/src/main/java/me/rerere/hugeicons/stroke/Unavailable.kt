package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Unavailable: ImageVector
    get() {
        if (_unavailable != null) {
            return _unavailable!!
        }
        _unavailable = ImageVector.Builder(
            name = "Unavailable",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.25f, 5f)
        lineTo(19.25f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22.25f, 12f)
        curveTo(22.25f, 6.47715f, 17.7728f, 2f, 12.25f, 2f)
        curveTo(6.72715f, 2f, 2.25f, 6.47715f, 2.25f, 12f)
        curveTo(2.25f, 17.5228f, 6.72715f, 22f, 12.25f, 22f)
        curveTo(17.7728f, 22f, 22.25f, 17.5228f, 22.25f, 12f)
        }
        }.build()

        return _unavailable!!
    }

private var _unavailable: ImageVector? = null
