package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowRight04: ImageVector
    get() {
        if (_arrowRight04 != null) {
            return _arrowRight04!!
        }
        _arrowRight04 = ImageVector.Builder(
            name = "ArrowRight04",
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
        moveTo(14f, 12f)
        lineTo(4f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5859f, 13.6026f)
        lineTo(17.6194f, 14.3639f)
        curveTo(16.0536f, 15.5974f, 15.2707f, 16.2141f, 14.6354f, 15.9328f)
        curveTo(14f, 15.6515f, 14f, 14.6881f, 14f, 12.7613f)
        lineTo(14f, 11.2387f)
        curveTo(14f, 9.31191f, 14f, 8.34853f, 14.6354f, 8.06721f)
        curveTo(15.2707f, 7.7859f, 16.0536f, 8.40264f, 17.6194f, 9.63612f)
        lineTo(18.5858f, 10.3974f)
        curveTo(19.5286f, 11.1401f, 20f, 11.5115f, 20f, 12f)
        curveTo(20f, 12.4885f, 19.5286f, 12.8599f, 18.5859f, 13.6026f)
        }
        }.build()

        return _arrowRight04!!
    }

private var _arrowRight04: ImageVector? = null
