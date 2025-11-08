package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Kanban: ImageVector
    get() {
        if (_kanban != null) {
            return _kanban!!
        }
        _kanban = ImageVector.Builder(
            name = "Kanban",
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
        moveTo(12f, 21f)
        curveTo(15.7497f, 21f, 17.6246f, 21f, 18.9389f, 20.0451f)
        curveTo(19.3634f, 19.7367f, 19.7367f, 19.3634f, 20.0451f, 18.9389f)
        curveTo(21f, 17.6246f, 21f, 15.7497f, 21f, 12f)
        curveTo(21f, 8.25027f, 21f, 6.3754f, 20.0451f, 5.06107f)
        curveTo(19.7367f, 4.6366f, 19.3634f, 4.26331f, 18.9389f, 3.95491f)
        curveTo(17.6246f, 3f, 15.7497f, 3f, 12f, 3f)
        curveTo(8.25027f, 3f, 6.3754f, 3f, 5.06107f, 3.95491f)
        curveTo(4.6366f, 4.26331f, 4.26331f, 4.6366f, 3.95491f, 5.06107f)
        curveTo(3f, 6.3754f, 3f, 8.25027f, 3f, 12f)
        curveTo(3f, 15.7497f, 3f, 17.6246f, 3.95491f, 18.9389f)
        curveTo(4.26331f, 19.3634f, 4.6366f, 19.7367f, 5.06107f, 20.0451f)
        curveTo(6.3754f, 21f, 8.25027f, 21f, 12f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(11f)
        moveTo(17f, 7f)
        verticalLineTo(17f)
        moveTo(7f, 7f)
        verticalLineTo(14f)
        }
        }.build()

        return _kanban!!
    }

private var _kanban: ImageVector? = null
